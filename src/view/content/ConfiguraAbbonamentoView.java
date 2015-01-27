package view.content;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JPanel;
import javax.swing.JCheckBox;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.persistentmodel.DescrizioneCorso;
import ngs.persistentmodel.SalaPesi;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import view.utility.Message;

import java.awt.Font;

public class ConfiguraAbbonamentoView extends JPanel {
	//private JCheckBox chckbxNewCheckBox;
	private JLabel lblNomeAbb;
	private JTextField textFieldNomeAbb;
	private JLabel lblPrezzoAbb;
	private JTextField textFieldPrezzoAbb;
	private JLabel lblTitoloCorsi;
	private JLabel lblNoCorsi;
	private JLabel lblNoSale;
	private JLabel lblTitoloSale;	
	
	static int aux=105;
	static int aux1;
	static ArrayList<DescrizioneCorso> arrayCorsi=new ArrayList<DescrizioneCorso>();
	static ArrayList<JCheckBox> acbc=new ArrayList<JCheckBox>();
	static ArrayList<SalaPesi> arraySalePesi=new ArrayList<SalaPesi>();
	static ArrayList<JCheckBox> acbsp=new ArrayList<JCheckBox>();
	private JButton btnSalva;
	private JLabel lblConfermaAbb;

	/**
	 * Create the panel.
	 */
	public ConfiguraAbbonamentoView() {
		setLayout(null);
		{
			lblNomeAbb = new JLabel("nome abbonamento");
			lblNomeAbb.setBounds(40, 55, 133, 14);
			add(lblNomeAbb);
		}
		{
			textFieldNomeAbb = new JTextField();
			textFieldNomeAbb.setBounds(193, 52, 155, 20);
			add(textFieldNomeAbb);
			textFieldNomeAbb.setColumns(10);
		}
		{
			lblTitoloCorsi=new JLabel("CORSI DISPONIBILI:");
			lblTitoloCorsi.setBounds(40, 105, 133, 14);
			add(lblTitoloCorsi);
		}
		{
			stampaCorsi();
		}		
		{
			aux=aux+50;
			lblTitoloSale=new JLabel("SALE PESI DISPONIBILI:");
			lblTitoloSale.setBounds(40, aux, 133, 14);
			add(lblTitoloSale);
		}
		{
			stampaSalePesi();
		}		
		{

			aux=aux+50;
			lblPrezzoAbb = new JLabel("prezzo base mensile");
			lblPrezzoAbb.setBounds(40, aux, 133, 14);
			add(lblPrezzoAbb);
		}
		{
			textFieldPrezzoAbb = new JTextField();
			textFieldPrezzoAbb.setBounds(193, aux-2, 86, 20);
			add(textFieldPrezzoAbb);
			textFieldPrezzoAbb.setColumns(10);
		}
		{
			btnSalva = new JButton("salva");
			ascoltatoreSalvaAbbonamento();
			aux=aux+50;
			btnSalva.setBounds(193, aux, 89, 23);
			if(arraySalePesi.size()==0 && arrayCorsi.size()==0)
				btnSalva.setEnabled(false);
			add(btnSalva);
		}
		{
			aux=aux+50;
			lblConfermaAbb = new JLabel("");
			lblConfermaAbb.setBounds(193, aux, 400, 14);
			lblConfermaAbb.setFont(new Font("Tahoma", Font.BOLD, 15));
			add(lblConfermaAbb);
		}
				
		aux=105;
		//arrayCorsi.clear();
		//acbc.clear();
		//arraySalePesi.clear();
		//acbsp.clear();
	}
	
	public void stampaCorsi()
	{
		//ArrayList<DescrizioneCorso> arrayCorsi=new ArrayList<DescrizioneCorso>();
		if(ConfAbbCorsiHandler.getInstance().getDescrizioniCorsi()==null)
			{
				Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riusita");
			}
		else
		{
			arrayCorsi=ConfAbbCorsiHandler.getInstance().getDescrizioniCorsi();
			for(DescrizioneCorso dc:arrayCorsi)
				System.out.println("corso da db:"+dc.getNomeCorso());
			
			//int i=0;
			//int aux;
			//ArrayList<JCheckBox> acb=new ArrayList<JCheckBox>();
			
			if(arrayCorsi.size()!=0)
			{
				acbc.clear();
				for(int j=0; j<arrayCorsi.size();j++){
					String nome= arrayCorsi.get(j).getNomeCorso();
					//System.out.println(nome);
					acbc.add(new JCheckBox(nome));					
					//System.out.println(acbc.get(j).getLabel());
					aux=aux+50;
					acbc.get(j).setBounds(100, aux, 400, 23);
					System.out.println("corso da label:"+acbc.get(j).getLabel());
					//i=i+50;
					add(acbc.get(j));
				}
			}
			else
			{
				aux=aux+50;
				lblNoCorsi=new JLabel();
	            Message.confirmLabel("non sono presenti corsi", false, lblNoCorsi);
				lblNoCorsi.setBounds(100, aux, 400, 14);
				lblNoCorsi.setFont(new Font("Tahoma", Font.BOLD, 15));
				add(lblNoCorsi);
			}
		}
		
		/* funziona anche questo
		for(DescrizioneCorso dc: arrayCorsi){
			String nome= dc.getNomeCorso();
			chckbxNewCheckBox = new JCheckBox(nome);
			aux=100+i;
			chckbxNewCheckBox.setBounds(35, aux, 97, 23);
			add(chckbxNewCheckBox);
			//acb.add(chckbxNewCheckBox);
			i=i+50;
			//chckbxNewCheckBox=null;
		}	
		*/	
	}
	
	public void stampaSalePesi()
	{
		{			
			//ArrayList<SalaPesi> arraySalePesi=new ArrayList<SalaPesi>();
			arraySalePesi=ConfAbbCorsiHandler.getInstance().getSalePesi();
			//int i=50;
			//ArrayList<JCheckBox> acb=new ArrayList<JCheckBox>();
			if(arraySalePesi.size()!=0)
			{
				for(int j=0; j<arraySalePesi.size();j++)
				{
					String nome= arraySalePesi.get(j).getNomeSala();
					//System.out.println(nome);
					acbsp.add(new JCheckBox(nome));
					aux=aux+50;
					acbsp.get(j).setBounds(100, aux, 97, 23);					
					//i=i+50;
					add(acbsp.get(j));
				}
			}
			else
			{
				aux=aux+50;
				lblNoSale=new JLabel();
                Message.confirmLabel("non sono presenti sale pesi", false, lblNoSale);
                lblNoSale.setBounds(100, aux, 400, 14);
    			lblNoSale.setFont(new Font("Tahoma", Font.BOLD, 15));
    			add(lblNoSale);
			}

		}		
	}
	
	public void ascoltatoreSalvaAbbonamento()
	{
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nomeAbb=textFieldNomeAbb.getText();
				String prezzo=textFieldPrezzoAbb.getText();
				Set<DescrizioneCorso> elencoCorsiSelezionati= new HashSet<DescrizioneCorso>();
				for(int i=0;i<acbc.size();i++)
				{
					
					if(acbc.get(i).isSelected()==true){
						elencoCorsiSelezionati.add(arrayCorsi.get(i));
						System.out.println(arrayCorsi.get(i).getNomeCorso());
					}
				}
				Set<SalaPesi> elencoSalePesiSelezionate= new HashSet<SalaPesi>();
				for(int i=0;i<acbsp.size();i++)
				{
					if(acbsp.get(i).isSelected()){
						elencoSalePesiSelezionate.add(arraySalePesi.get(i));
						System.out.println(arraySalePesi.get(i).getNomeSala());
					}
				}
				
				if(nomeAbb.length()==0 || prezzo.length()==0 || (elencoSalePesiSelezionate.size()==0 && elencoCorsiSelezionati.size()==0))
					Message.errorMessage("ERRORE", "Compilare tutti i campi");
				else{
					boolean aux=ConfAbbCorsiHandler.getInstance().verificaNomeDescrizioneAbbonamento(nomeAbb);
					if(aux==true)
					{
						String nomiCorsi="";
						for(DescrizioneCorso dc:elencoCorsiSelezionati){
							nomiCorsi=nomiCorsi+dc.getNomeCorso()+", ";
						}
						String nomiSale="";
						for(SalaPesi sp:elencoSalePesiSelezionate){
							nomiSale=nomiSale+sp.getNomeSala()+", ";
						}
							
						String riepilogo="Confermare la creazione dell'abbonamento?\n   NOME: "+nomeAbb+"\n   CORSI: "+nomiCorsi+"\n   SALE PESI: "+nomiSale+"\n PREZZO BASE MENSILE: "+prezzo+"\n\n";
						int risposta = Message.questionConfirmMessage("CONFERMA", riepilogo);
						if(risposta==JOptionPane.YES_OPTION) 
						{
							float prezzoAbb=Float.parseFloat(prezzo);
							if(ConfAbbCorsiHandler.getInstance().configuraAbbonamento(nomeAbb,prezzoAbb,elencoCorsiSelezionati,elencoSalePesiSelezionate)==true)
							{									
								Message.confirmLabel("ABBONAMENTO INSERITO CORRETTAMENTE", true, lblConfermaAbb);
																   
							}
							else
								Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
								
						}
						else if(risposta==JOptionPane.NO_OPTION){}							
					}
					else
					{
						Message.errorMessage("ERRORE", "Il nome dell'abbonamento scelto è già stato inserito");
					}
					
					
				
				}	
			}
		});
	}
}
