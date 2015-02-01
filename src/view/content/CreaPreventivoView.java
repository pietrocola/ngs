package view.content;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;



import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.swing.ScrollPaneConstants;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.model.strategy.IPoliticaScontoAbbonamentoStrategy;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.DescrizioneAbbonamento;
import ngs.persistentmodel.DescrizioneCorso;
import ngs.persistentmodel.PoliticaScontoAbbonamento;
import ngs.persistentmodel.SalaPesi;
import ngs.persistentmodel.ScontoPercentuale;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.border.Border;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.border.LineBorder;

import org.hibernate.collection.internal.PersistentSet;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Set;

import view.utility.Message;

import java.awt.Color;
import java.awt.Font;


public class CreaPreventivoView extends JPanel{
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblAbbonamenti;
	private JScrollPane scrollPane_1;
	private JLabel lblCategoria;
	private JList list_1;
	private JLabel lblPoliticaSconto;
	private JScrollPane scrollPane_2;
	private JList list_2;
	
	private static CategoriaCliente cat;
	private JButton btnCalcolaPrezzo;
	private JLabel lblPrezzo;
	private JButton btnSalvaPreventivo;
	private JLabel riepilogoAbb;
	private JLabel riepilogoPolitica;
	JPanel panel;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	public CreaPreventivoView() {
		
		setLayout(new BorderLayout(0, 0));
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width);
        int y = (screen.height);
        
        /**
         * panel di dimensioni dello schermo che andrà nello Scroll pane principale dichiarato dopo la compilazione del panel
         */
		panel=new JPanel();
		panel.setPreferredSize(new Dimension(x,y));
		panel.setBorder(null);
		panel.setLayout(null);
		{
			lblAbbonamenti = new JLabel("ABBONAMENTI");
			lblAbbonamenti.setBounds(21, 33, 114, 14);
			panel.add(lblAbbonamenti);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(21, 76, 149, 107);
			panel.add(scrollPane);
			{
				ArrayList<DescrizioneAbbonamento> elencoAbb=ConfAbbCorsiHandler.getInstance().getDescrizioniAbbonamenti();
				DefaultListModel defList = new DefaultListModel();
				for(DescrizioneAbbonamento dc: elencoAbb){
					defList.addElement(dc);
				}
				list = new JList(defList);
				ascoltatoreStampaLabelAbbonamento();
				ascoltatoreListAbb(elencoAbb);
				scrollPane.setViewportView(list);
			}
		}
		{
			lblCategoria = new JLabel("CATEGORIE CLIENTI");
			lblCategoria.setBounds(196, 33, 114, 14);
			panel.add(lblCategoria);
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(196, 76, 149, 107);
			panel.add(scrollPane_1);
			{
				ArrayList<CategoriaCliente> elencoCat=ConfAbbCorsiHandler.getInstance().getCategorieClienti();
				DefaultListModel defList = new DefaultListModel();
				for(CategoriaCliente ec: elencoCat)
				{
					defList.addElement(ec);
				}
				
				list_1 = new JList(defList);				
				list_1.setEnabled(false);		
				ascoltatoreStampaPoliticheSconto();
				scrollPane_1.setViewportView(list_1);
			}
		}
		{
			lblPoliticaSconto = new JLabel("POLITICHE SCONTO");
			lblPoliticaSconto.setBounds(372, 33, 149, 14);
			panel.add(lblPoliticaSconto);
		}
		
		{
			/*
			 * Scroll pane dove andrà aggiunta la lista PoliticheSconto
			 */
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(372, 76, 149, 107);
			panel.add(scrollPane_2);
			{
				/*
				 * Lista Politiche sconto stampata dall'ascoltatore
				 */
			}
			
		}
		{
			lblPrezzo = new JLabel("");
			lblPrezzo.setBounds(559, 76, 149, 23);
			panel.add(lblPrezzo);
		}
		{
			btnSalvaPreventivo = new JButton("Salva preventivo");
			ascoltatoreSalvaPreventivo();
			btnSalvaPreventivo.setEnabled(false);
			btnSalvaPreventivo.setBounds(559, 160, 149, 23);
			panel.add(btnSalvaPreventivo);
		}
		{
			riepilogoAbb = new JLabel("");
			riepilogoAbb.setBounds(21, 194, 149, 33);
			panel.add(riepilogoAbb);
		}
		{
			riepilogoPolitica = new JLabel("");
			riepilogoPolitica.setBounds(372, 194, 46, 14);
			panel.add(riepilogoPolitica);
		}
		JScrollPane mainScroll = new JScrollPane(); 
		mainScroll.setViewportView(panel);
		{
			lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(559, 194, 338, 33);
			panel.add(lblNewLabel);
		}
		add(mainScroll);
		
		
}	
		
	
	public void ascoltatoreCalcolaPrezzo(){
		list_2.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				lblPrezzo.setText("Totale: Calcolo in corso...");
				DescrizioneAbbonamento descAbb=(DescrizioneAbbonamento) list.getSelectedValue();
				PoliticaScontoAbbonamento politicaSconto=(PoliticaScontoAbbonamento) list_2.getSelectedValue();
				float prezzo=ConfAbbCorsiHandler.getInstance().calcolaPrezzoAbbonamento(descAbb, politicaSconto);
				String p=Float.toString(prezzo);
				lblPrezzo.setText("Totale: "+p+" €");
				btnSalvaPreventivo.setEnabled(true);
			}
		});
	}
	
	
	
	public void ascoltatoreSalvaPreventivo(){
		btnSalvaPreventivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DescrizioneAbbonamento descAbb=(DescrizioneAbbonamento) list.getSelectedValue();
				PoliticaScontoAbbonamento politicaSconto=(PoliticaScontoAbbonamento) list_2.getSelectedValue();
				float prezzo=ConfAbbCorsiHandler.getInstance().calcolaPrezzoAbbonamento(descAbb, politicaSconto);
				String p=Float.toString(prezzo);
				if(!ConfAbbCorsiHandler.getInstance().verificaPreventivo(descAbb, politicaSconto))
				{
					String riepilogo="Confermare il salvataggio del preventivo?\n   ABBONAMENTO: "+descAbb+
									 "\n   CLIENTE: "+politicaSconto.getCategoriaCliente()+
									 "\n   POLITICA: "+politicaSconto+"\n\n";
					int risposta=Message.questionConfirmMessage("CONFERMA",riepilogo);
					if(risposta==JOptionPane.YES_OPTION) 
					{
						boolean aux=ConfAbbCorsiHandler.getInstance().creaPreventivoAbbonamento(descAbb, politicaSconto, prezzo);
						if(aux)
						{
							Message.confirmLabel("Preventivo salvato", true, lblNewLabel);
						}
						else
						{
							Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
						}
					}
				}
				else
				{
					Message.errorMessage("ERRORE", "Preventivo già presente");
				}
				
			}
		});
	}
	
	public void ascoltatoreListAbb(ArrayList<DescrizioneAbbonamento> elencoAbb)
	{
		list.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				if(elencoAbb.size()!=0)
				{
					btnSalvaPreventivo.setEnabled(false);
					lblPrezzo.setText("");
					list_1.setEnabled(true);					
				}
				else
				{
					Message.errorMessage("ERRORE", "Non sono presenti abbonamenti");
					list.setEnabled(false);
				}
				
			}
		});
	}
	
	public void ascoltatoreStampaPoliticheSconto()
	{
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				{							
					//queste due righe dovrebbero far parte di un pattern. per esempio: mediator
					btnSalvaPreventivo.setEnabled(false);
					lblPrezzo.setText("");
					
					cat=(CategoriaCliente) list_1.getSelectedValue();
					
					{

						//cat=new CategoriaCliente();
						//cat.setNomeCat("over 60");						
						 ArrayList<PoliticaScontoAbbonamento> elencoPolitiche=ConfAbbCorsiHandler.getInstance().getPoliticheSconto(cat);
						 if(elencoPolitiche.size()!=0)
						 {
							 DefaultListModel defList = new DefaultListModel();
							 for(PoliticaScontoAbbonamento psa: elencoPolitiche)
							 {
								defList.addElement(psa);
							 }
											
							list_2 = new JList(defList);
							ascoltatoreCalcolaPrezzo();
							ascoltatoreStampaLabelPolitica();
							//list_2.setEnabled(false);								
							scrollPane_2.setViewportView(list_2);
						 }
						 else
						 {
							 list_2 = new JList();
							 list_2.setEnabled(false);	
							 scrollPane_2.setViewportView(list_2);
							 Message.errorMessage("ERRORE", "Nessuna politica sconto presente per questa categoria");							 
						 }
						 
					}					
				}									
			}
		});
	}
	
	protected void ascoltatoreStampaLabelPolitica() 
	{
		list_2.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int y = 160;
				PoliticaScontoAbbonamento politicaSconto=(PoliticaScontoAbbonamento) list_2.getSelectedValue();
				
				String scon="<html>Politica sconto: "+politicaSconto.getNomePolitica()+"<br /><br />"+
							"Categoria: "+politicaSconto.getCategoriaCliente()+"<br /><br />"+
							"# mesi: "+((ScontoPercentuale) politicaSconto).getNumeroMesi()+"<br /><br />"+
							"Sconto(%): "+((ScontoPercentuale) politicaSconto).getScontoPercentuale();
				riepilogoPolitica.setText(scon);
				riepilogoPolitica.setBounds(372, 194, 149, y);
				riepilogoPolitica.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));	
			}			
		});
		
	}


	public void ascoltatoreStampaLabelAbbonamento()
	{
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int y = 120;
				DescrizioneAbbonamento descAbb=(DescrizioneAbbonamento) list.getSelectedValue();
				descAbb=ConfAbbCorsiHandler.getInstance().getDescrizioneAbbonamento(descAbb.toString());
				String abb="<html>Abbonamento: "+descAbb.getNomeAbbonamento()+"<br /><br />"+
							"Prezzo: "+descAbb.getPrezzoBaseMensile()+" €<br /><br />";
							//"Corsi: "+descAbb.getElencoCorsi()+"\n"+"Sale pesi: "+riepilogoAbb.setText(abb)+"\n";
													
				if(descAbb.getElencoCorsi().isEmpty())
				{
					abb=abb+"Corsi:<br />Non sono presenti corsi <br /><br />";
					y=y+40;
				}
				else
				{
					//System.out.println(descAbb.getElencoCorsi().getClass());
					abb=abb+"Corsi:<br />";
					PersistentSet c = (PersistentSet)descAbb.getElencoCorsi();
					Iterator<DescrizioneCorso> iter =  c.iterator();
					while(iter.hasNext())
					 {								
						DescrizioneCorso dc = iter.next();
						abb=abb+"-"+dc.getNomeCorso()+"<br />";
						y=y+30;
					 }
				}
				
				if(descAbb.getElencoSalePesi().isEmpty())
				{
					abb=abb+"<br />Sale pesi:<br />Non sono presenti sale pesi <br /><br />";
					y=y+40;
				}
				else
				{
					//System.out.println(descAbb.getElencoCorsi().getClass());
					abb=abb+"<br />Sale pesi:<br />";
					PersistentSet c = (PersistentSet)descAbb.getElencoSalePesi();
					Iterator<SalaPesi> iter =  c.iterator();
					while(iter.hasNext())
					 {								
						SalaPesi dc = iter.next();
						abb=abb+"-"+dc.getNomeSala()+"<br />";
						y=y+30;
					 }
				}			
				riepilogoAbb.setText(abb);
				riepilogoAbb.setBounds(21, 194, 149, y);
				riepilogoAbb.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));			
			}
		});
	}
	
}
