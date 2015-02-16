package view.content;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JPanel;
import javax.swing.JCheckBox;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.persistentmodel.DescrizioneCorso;
import ngs.persistentmodel.SalaPesi;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.Scrollable;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import view.utility.Message;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import java.awt.BorderLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ConfiguraAbbonamentoView extends JPanel{
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
	public ConfiguraAbbonamentoView(JFrame frame) {
		
		//panel che andrà nella scrollPane
		JPanel panel = new JPanel();
		panel.setLayout(null);	
		
		
						
		{
			lblNomeAbb = new JLabel("nome abbonamento");
			lblNomeAbb.setBounds(40, 55, 133, 14);
			panel.add(lblNomeAbb);
		}
		{
			textFieldNomeAbb = new JTextField();
			textFieldNomeAbb.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					lblConfermaAbb.setText("");
				}
			});
			textFieldNomeAbb.setBounds(193, 52, 155, 20);
			panel.add(textFieldNomeAbb);
			textFieldNomeAbb.setColumns(10);
		}
		{
			lblTitoloCorsi=new JLabel("CORSI DISPONIBILI:");
			lblTitoloCorsi.setBounds(40, 105, 133, 14);
			panel.add(lblTitoloCorsi);
		}
		{
			
			stampaCorsi(panel);
		}		
		{
			aux=aux+50;
			lblTitoloSale=new JLabel("SALE PESI DISPONIBILI:");
			lblTitoloSale.setBounds(40, aux, 133, 14);
			panel.add(lblTitoloSale);
		}
		{
			stampaSalePesi(panel);
		}		
		{

			aux=aux+50;
			lblPrezzoAbb = new JLabel("prezzo base mensile (\u20AC)");
			lblPrezzoAbb.setBounds(40, aux, 143, 14);
			panel.add(lblPrezzoAbb);
		}
		{
			textFieldPrezzoAbb = new JTextField();
			textFieldPrezzoAbb.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					lblConfermaAbb.setText("");
				}
			});
			textFieldPrezzoAbb.setBounds(193, aux-2, 86, 20);
			panel.add(textFieldPrezzoAbb);
			textFieldPrezzoAbb.setColumns(10);
		}
		{
			btnSalva = new JButton("salva");
			ascoltatoreSalvaAbbonamento();
			aux=aux+50;
			btnSalva.setBounds(193, aux, 89, 23);
			if(arraySalePesi.size()==0 && arrayCorsi.size()==0)
				btnSalva.setEnabled(false);
			panel.add(btnSalva);
		}
		{
			//aux=aux+50;
			lblConfermaAbb = new JLabel("");
			lblConfermaAbb.setBounds(321, aux+4, 400, 14);
			lblConfermaAbb.setFont(new Font("Tahoma", Font.BOLD, 15));
			panel.add(lblConfermaAbb);
		}
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-WIDTH);
        int y = (screen.height-HEIGHT);
		//System.out.println(x+"x"+y);
		panel.setPreferredSize(new Dimension(x,y));
		
		aux=105;
		setLayout(new BorderLayout(0, 0));
		
		//panel.revalidate();
		//panel.repaint();
		
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(panel);
		add(scroll);		//aggiunge la scrollPane nel pannello principale
		
		//arrayCorsi.clear();
		//acbc.clear();
		//arraySalePesi.clear();
		//acbsp.clear();
	}
	
	public void stampaCorsi(JPanel panel)
	{
		//
		//ArrayList<DescrizioneCorso> arrayCorsi=new ArrayList<DescrizioneCorso>();		
			arrayCorsi=ConfAbbCorsiHandler.getInstance().getDescrizioniCorsi();
			
			//for(DescrizioneCorso dc:arrayCorsi)
				//System.out.println("corso da db:"+dc.getNomeCorso());
			
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
					//System.out.println("corso da label:"+acbc.get(j).getLabel());
					//i=i+50;
					panel.add(acbc.get(j));
					
					acbc.get(j).addFocusListener(new FocusAdapter() {
						@Override
						public void focusGained(FocusEvent e) {
							lblConfermaAbb.setText("");
						}
					});
					
				}
			}
			else
			{
				//aux=aux+50;
				lblNoCorsi=new JLabel();
	            Message.confirmLabel("non sono presenti corsi", false, lblNoCorsi);
				lblNoCorsi.setBounds(180, aux, 400, 13);
				lblNoCorsi.setFont(new Font("Tahoma", Font.BOLD, 15));
				panel.add(lblNoCorsi);
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
	
	
	public void stampaSalePesi(JPanel  panel)
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
					acbsp.get(j).setBounds(100, aux, 400, 23);					
					//i=i+50;
					panel.add(acbsp.get(j));
				}
			}
			else
			{
				//aux=aux+50;
				lblNoSale=new JLabel();
                Message.confirmLabel("non sono presenti sale pesi", false, lblNoSale);
                lblNoSale.setBounds(200, aux, 400, 13);
    			lblNoSale.setFont(new Font("Tahoma", Font.BOLD, 15));
    			panel.add(lblNoSale);
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
						//System.out.println(arrayCorsi.get(i).getNomeCorso());
					}
				}
				Set<SalaPesi> elencoSalePesiSelezionate= new HashSet<SalaPesi>();
				for(int i=0;i<acbsp.size();i++)
				{
					if(acbsp.get(i).isSelected()){
						elencoSalePesiSelezionate.add(arraySalePesi.get(i));
						//System.out.println(arraySalePesi.get(i).getNomeSala());
					}
				}
				
				if(nomeAbb.trim().length()==0 || prezzo.trim().length()==0 || (elencoSalePesiSelezionate.size()==0 && elencoCorsiSelezionati.size()==0))
					Message.errorMessage("ERRORE", "Compilare tutti i campi");
				else{
					boolean aux=ConfAbbCorsiHandler.getInstance().verificaNomeDescrizioneAbbonamento(nomeAbb);
					if(aux==true)
					{
						String nomiCorsi="";
						for(DescrizioneCorso dc:elencoCorsiSelezionati){
							nomiCorsi=nomiCorsi+dc.getNomeCorso()+"  ";
						}
						if(nomiCorsi.length()==0) nomiCorsi="nessun corso selezionato";
						String nomiSale="";
						for(SalaPesi sp:elencoSalePesiSelezionate){
							nomiSale=nomiSale+sp.getNomeSala()+"  ";
						}
						if(nomiSale.length()==0) nomiSale="nessuna sala selezionata";	
						String riepilogo="Confermare la creazione dell'abbonamento?\n   NOME: "+nomeAbb+"\n   CORSI: "+nomiCorsi+"\n   SALE PESI: "+nomiSale+"\n   PREZZO BASE MENSILE: "+prezzo+"€\n\n";
						int risposta = Message.questionConfirmMessage("CONFERMA", riepilogo);
						if(risposta==JOptionPane.YES_OPTION) 
						{
							float prezzoAbb=Float.parseFloat(prezzo);
							if(ConfAbbCorsiHandler.getInstance().configuraAbbonamento(nomeAbb,prezzoAbb,elencoCorsiSelezionati,elencoSalePesiSelezionate)==true)
							{									
								Message.confirmLabel("ABBONAMENTO INSERITO CORRETTAMENTE", true, lblConfermaAbb);
																   
							}
							else{}
								//Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
								
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
