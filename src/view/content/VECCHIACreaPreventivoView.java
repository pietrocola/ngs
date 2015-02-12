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
import ngs.persistentmodel.ScontoFisso;

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
import javax.swing.ImageIcon;


public class VECCHIACreaPreventivoView extends JPanel{
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
	private JLabel riepilogoAbb;
	private JLabel riepilogoPolitica;
	JPanel panel;
	private JLabel lblNoAbbonamenti;
	private JLabel lblNoCategorie;
	private JLabel lblInfoAbbSelezionato;
	private JLabel lblNoPolitiche;
	private JLabel lblInfoPoliticaSelezionata;
	private JButton btnCalcolaPrezzo_1;
	private JButton btnSalvaPreventivo;
	private JLabel lblPrezzo;
	private JLabel lblConfermaPreventivo;
	private JLabel lblFrecciaAbb;
	private JLabel lblFrecciaPolitica;
	private JScrollPane scrollPane_3;
	private JList list_3;

	
	/**
	 * Create the panel.
	 */
	public VECCHIACreaPreventivoView() {
		
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
			lblAbbonamenti = new JLabel("ABBONAMENTI ");
			lblAbbonamenti.setBounds(21, 33, 114, 14);
			panel.add(lblAbbonamenti);
		}
		{
			lblNoAbbonamenti = new JLabel("");
			lblNoAbbonamenti.setBounds(21, 61, 284, 14);
			panel.add(lblNoAbbonamenti);
		}
		{
			lblNoCategorie = new JLabel("");
			lblNoCategorie.setBounds(372, 61, 199, 14);
			panel.add(lblNoCategorie);
		}
		{
			lblNoPolitiche = new JLabel("");
			lblNoPolitiche.setBounds(611, 61, 513, 14);
			panel.add(lblNoPolitiche);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(21, 101, 284, 107);
			panel.add(scrollPane);
			{
				ArrayList<DescrizioneAbbonamento> elencoAbb=ConfAbbCorsiHandler.getInstance().getDescrizioniAbbonamenti();
				DefaultListModel defList = new DefaultListModel();
				for(DescrizioneAbbonamento dc: elencoAbb){
					defList.addElement(dc);
				}
				
				list = new JList(defList);
				
				list.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						JList list_2=new JList();
						if(!list_2.isFocusable())
						{
						lblPrezzo.setText("");
						lblConfermaPreventivo.setText("");
						btnSalvaPreventivo.setEnabled(false);
						btnCalcolaPrezzo_1.setEnabled(true);
						}
						else{
							btnSalvaPreventivo.setEnabled(false);
							lblPrezzo.setText("");
							lblConfermaPreventivo.setText("");
						}
					}
				});
				
				//list.setVisible(true);
				//scrollPane.setViewportView(list);
				list.setEnabled(true);
				if(elencoAbb.size()==0){
					Message.confirmLabel("non sono presenti abbonamenti", false, lblNoAbbonamenti);
					list.setEnabled(false);
				}else{
					scrollPane.setViewportView(list);
					ascoltatoreInfoAbbonamentoSelezionato();
				}
				
				
				
				
					//ascoltatoreStampaLabelAbbonamento();
					//ascoltatoreListAbb(elencoAbb);
				
				
			}
		}
		{
			lblCategoria = new JLabel("CATEGORIE CLIENTI");
			lblCategoria.setBounds(372, 33, 114, 14);
			panel.add(lblCategoria);
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(372, 101, 114, 107);
			panel.add(scrollPane_1);
			{
				ArrayList<CategoriaCliente> elencoCat=ConfAbbCorsiHandler.getInstance().getCategorieClienti();
				DefaultListModel defList = new DefaultListModel();
				for(CategoriaCliente ec: elencoCat)
				{
					defList.addElement(ec);
				}
				
				
				list_1 = new JList(defList);				
				//list_1.setEnabled(false);		
				//ascoltatoreStampaPoliticheSconto();
				//scrollPane_1.setViewportView(list_1);
				
				list_1.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						lblPrezzo.setText("");
						lblConfermaPreventivo.setText("");
						btnSalvaPreventivo.setEnabled(false);
						btnCalcolaPrezzo_1.setEnabled(false);
						lblInfoPoliticaSelezionata.setText("");
						lblFrecciaPolitica.setVisible(false);
						lblInfoPoliticaSelezionata.setBorder(null);
						//System.out.println("focus");
						
						//list_2.setSelectionBackground(new Color(250,250,250));
						
						
						  //list_2.clearSelection();
						  
						
						//list_2.setEnabled(false);
						
						
					}
				});
				
				if(elencoCat.size()==0){
					
					Message.confirmLabel("non sono presenti categorie", false, lblNoCategorie);
					list_1.setEnabled(false);
				}
				else{
					scrollPane_1.setViewportView(list_1);
					ascoltatoreCategoriaClienteSelezionata();
				}
			}
		}
		{
			lblPoliticaSconto = new JLabel("POLITICHE SCONTO");
			lblPoliticaSconto.setBounds(611, 33, 149, 14);
			panel.add(lblPoliticaSconto);
		}
		
		{
			/*
			 * Scroll pane dove andrà aggiunta la lista PoliticheSconto
			 */
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(611, 101, 241, 107);
			panel.add(scrollPane_2);
			{
				/*
				 * Lista Politiche sconto stampata dall'ascoltatore di categoria cliente
				 */
			}
			
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
			lblInfoAbbSelezionato = new JLabel("");
			lblInfoAbbSelezionato.setIcon(null);
			lblInfoAbbSelezionato.setFont(new Font("Tahoma", Font.ITALIC, 14));
			lblInfoAbbSelezionato.setBounds(21, 279, 284, 14);
			panel.add(lblInfoAbbSelezionato);
		}
		{
			lblNoPolitiche = new JLabel("");
			lblNoPolitiche.setBounds(611, 61, 400, 14);
			panel.add(lblNoPolitiche);
		}
		{
			lblInfoPoliticaSelezionata = new JLabel("");
			lblInfoPoliticaSelezionata.setFont(new Font("Tahoma", Font.ITALIC, 14));
			lblInfoPoliticaSelezionata.setBounds(611, 279, 241, 14);
			panel.add(lblInfoPoliticaSelezionata);
		}
		{
			btnCalcolaPrezzo_1 = new JButton("calcola prezzo");
			ascoltatoreCalcolaPrezzo();
			btnCalcolaPrezzo_1.setBounds(911, 101, 131, 23);
			panel.add(btnCalcolaPrezzo_1);
			btnCalcolaPrezzo_1.setEnabled(false);
		}
		{
			btnSalvaPreventivo = new JButton("salva preventivo");
			//ascoltatoreSalvaPreventivo();
			btnSalvaPreventivo.setBounds(911, 157, 131, 23);
			panel.add(btnSalvaPreventivo);
			btnSalvaPreventivo.setEnabled(false);
		}
		{
			lblPrezzo = new JLabel("");
			lblPrezzo.setBounds(1088, 106, 46, 14);
			panel.add(lblPrezzo);
		}
		{
			lblConfermaPreventivo = new JLabel("");
			lblConfermaPreventivo.setBounds(1088, 161, 250, 14);
			panel.add(lblConfermaPreventivo);
		}
		{
			lblFrecciaAbb = new JLabel("");
			lblFrecciaAbb.setIcon(new ImageIcon(VECCHIACreaPreventivoView.class.getResource("/view/img/freccia.png")));
			lblFrecciaAbb.setBounds(139, 238, 46, 14);
			lblFrecciaAbb.setVisible(false);
			panel.add(lblFrecciaAbb);
		}
		{
			lblFrecciaPolitica = new JLabel("");
			lblFrecciaPolitica.setIcon(new ImageIcon(VECCHIACreaPreventivoView.class.getResource("/view/img/freccia.png")));
			lblFrecciaPolitica.setBounds(707, 238, 46, 14);
			lblFrecciaPolitica.setVisible(false);
			panel.add(lblFrecciaPolitica);
		}
		{
			scrollPane_3 = new JScrollPane();
			scrollPane_3.setBounds(372, 265, 114, 90);
			panel.add(scrollPane_3);
			{
				
				CategoriaCliente catCliente=(CategoriaCliente) list_1.getSelectedValue();
				HashSet<Integer> elencoNumeroMesi=ConfAbbCorsiHandler.getInstance().getNumeroMesi(catCliente);
				DefaultListModel defList = new DefaultListModel();
				for(Integer num: elencoNumeroMesi)
				{
					defList.addElement(num);
				}
				
				list_3 = new JList(defList);
				ascoltatoreNumeroMesiSelezionato();
				scrollPane_3.setViewportView(list_3);
			}
		}
		

		add(mainScroll);
		
		
}	
		
	private void ascoltatoreNumeroMesiSelezionato() {
		list_3.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {

				{
					cat=(CategoriaCliente) list_1.getSelectedValue();
					int numMesi=(int) list_3.getSelectedValue();
					//cat=new CategoriaCliente();
					//cat.setNomeCat("over 60");						
					 ArrayList<PoliticaScontoAbbonamento> elencoPolitiche=ConfAbbCorsiHandler.getInstance().getPoliticheSconto(cat,numMesi);
					// if(elencoPolitiche.size()!=0)
					 //{
						 DefaultListModel defList = new DefaultListModel();
						 for(PoliticaScontoAbbonamento psa: elencoPolitiche)
						 {
							defList.addElement(psa);
						 }
										
						 
						 list_2 = new JList(defList);
						 //scrollPane_2.setViewportView(list_2);
						 
						 
						 list_2.addFocusListener(new FocusAdapter() {
								@Override
								public void focusGained(FocusEvent arg0) {
									lblPrezzo.setText("");
									lblConfermaPreventivo.setText("");
									btnSalvaPreventivo.setEnabled(false);
									btnCalcolaPrezzo_1.setEnabled(true);
									list_2.setSelectionBackground(new Color(184,207,229));
									
								}
							});
						
						 
						 if(elencoPolitiche.size()==0){
							 list_2=new JList();
							
							 list_2.setEnabled(false);
							
							 scrollPane_2.setViewportView(list_2);
							Message.confirmLabel("nessuna politica di sconto per la categoria cliente selezionata", false, lblNoPolitiche);
						}
						else{
							lblNoPolitiche.setText("");
							// list_2.setSelectionBackground(new Color(250,250,250));
						 //list_2 = new JList(defList);
						//ascoltatoreCalcolaPrezzo();
						//ascoltatoreStampaLabelPolitica()
							
						
							
						      //ascoltatoreInfoPoliticaSelezionataFocusGained(); 
					
						      //ascoltatoreInfoPoliticaSelezionataValueChanged();
						
						//list_2.setEnabled(false);								
						scrollPane_2.setViewportView(list_2);
						}
					 }
				
			}
		});
		
	}

	/*
	private void ascoltatoreSalvaPreventivo() {
		btnSalvaPreventivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DescrizioneAbbonamento descAbb=(DescrizioneAbbonamento) list.getSelectedValue();
				PoliticaScontoAbbonamento politicaSconto=(PoliticaScontoAbbonamento) list_2.getSelectedValue();
				int numMesi=ConfAbbCorsiHandler.getInstance().getNumeroMesi(politicaSconto);
			    //System.out.println(numMesi);
				float prezzo=ConfAbbCorsiHandler.getInstance().calcolaPrezzoAbbonamento(descAbb, politicaSconto,true);
				String p=Float.toString(prezzo);
				if(ConfAbbCorsiHandler.getInstance().verificaPreventivo(descAbb, politicaSconto)==true)
				{
					String riepilogo="Confermare il salvataggio del preventivo?\n   ABBONAMENTO: "+descAbb+
									 "\n   CATEGORIA CLIENTE: "+politicaSconto.getCategoriaCliente()+
									 "\n   POLITICA SCONTO: "+politicaSconto+"\n   NUMERO MESI: "+numMesi+"\n   PREZZO: "+prezzo+" €\n\n";
					int risposta=Message.questionConfirmMessage("CONFERMA",riepilogo);
					if(risposta==JOptionPane.YES_OPTION) 
					{
						boolean aux=ConfAbbCorsiHandler.getInstance().creaPreventivoAbbonamento(descAbb, politicaSconto, prezzo);
						if(aux)
						{
							Message.confirmLabel("Preventivo salvato", true, lblConfermaPreventivo);
						}
						else
						{
							//Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
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
*/

	private void ascoltatoreCalcolaPrezzo() {
		btnCalcolaPrezzo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblPrezzo.setText("Totale: Calcolo in corso...");
				DescrizioneAbbonamento descAbb=(DescrizioneAbbonamento) list.getSelectedValue();
				
				//PoliticaScontoAbbonamento politicaSconto=(PoliticaScontoAbbonamento) list_2.getSelectedValue();
				PoliticaScontoAbbonamento politicaSconto=null;
			
				
				if(descAbb==null ){ // rimetter  oppure politicaSconto==null
					Message.errorMessage("ERRORE", "selezionare tutti i parametri necessari per il calcolo");
				}
				else{
					float prezzo=ConfAbbCorsiHandler.getInstance().calcolaPrezzoAbbonamento(descAbb, politicaSconto,true);
					String p=Float.toString(prezzo);
					lblPrezzo.setText(p+" €");
					btnSalvaPreventivo.setEnabled(true);
				}
			}
		});
		
	}


	private void ascoltatoreCategoriaClienteSelezionata() {
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) 
			{
				{							
					//queste due righe dovrebbero far parte di un pattern. per esempio: mediator
					//btnSalvaPreventivo.setEnabled(false);
					//lblPrezzo.setText("");
					
					/*
					cat=(CategoriaCliente) list_1.getSelectedValue();
					
					{

						//cat=new CategoriaCliente();
						//cat.setNomeCat("over 60");						
						 ArrayList<PoliticaScontoAbbonamento> elencoPolitiche=ConfAbbCorsiHandler.getInstance().getPoliticheSconto(cat,12);
						// if(elencoPolitiche.size()!=0)
						 //{
							 DefaultListModel defList = new DefaultListModel();
							 for(PoliticaScontoAbbonamento psa: elencoPolitiche)
							 {
								defList.addElement(psa);
							 }
											
							 
							 list_2 = new JList(defList);
							 //scrollPane_2.setViewportView(list_2);
							 
							 
							 list_2.addFocusListener(new FocusAdapter() {
									@Override
									public void focusGained(FocusEvent arg0) {
										lblPrezzo.setText("");
										lblConfermaPreventivo.setText("");
										btnSalvaPreventivo.setEnabled(false);
										btnCalcolaPrezzo_1.setEnabled(true);
										list_2.setSelectionBackground(new Color(184,207,229));
										
									}
								});
							
							 
							 if(elencoPolitiche.size()==0){
								 list_2=new JList();
								
								 list_2.setEnabled(false);
								
								 scrollPane_2.setViewportView(list_2);
								Message.confirmLabel("nessuna politica di sconto per la categoria cliente selezionata", false, lblNoPolitiche);
							}
							else{
								lblNoPolitiche.setText("");
								// list_2.setSelectionBackground(new Color(250,250,250));
							 //list_2 = new JList(defList);
							//ascoltatoreCalcolaPrezzo();
							//ascoltatoreStampaLabelPolitica()
								
							
								
							      ascoltatoreInfoPoliticaSelezionataFocusGained(); 
						
							      ascoltatoreInfoPoliticaSelezionataValueChanged();
							
							//list_2.setEnabled(false);								
							scrollPane_2.setViewportView(list_2);
							}
						 }
					*/
						 /*
						 else
						 {
							 list_2 = new JList();
							 list_2.setEnabled(false);	
							 scrollPane_2.setViewportView(list_2);
							 Message.errorMessage("ERRORE", "Nessuna politica sconto presente per questa categoria");							 
						 }
						 */
					
					//CategoriaCliente catCliente=(CategoriaCliente) list_1.getSelectedValue();
					cat=(CategoriaCliente) list_1.getSelectedValue();
					
					HashSet<Integer> elencoNumeroMesi=ConfAbbCorsiHandler.getInstance().getNumeroMesi(cat);
					DefaultListModel defList = new DefaultListModel();
					for(Integer num: elencoNumeroMesi)
					{
						defList.addElement(num);
					}
					
					list_3 = new JList(defList);
					scrollPane_3.setViewportView(list_3);
					
					
					}					
				}

		  private void ascoltatoreInfoPoliticaSelezionataFocusGained() {
					
				 list_2.addFocusListener(new FocusAdapter() {
						@Override
						public void focusGained(FocusEvent arg0) {
								int y = 160;
								PoliticaScontoAbbonamento politicaSconto=(PoliticaScontoAbbonamento) list_2.getSelectedValue();
								
								String scon="";
								
								if(politicaSconto instanceof ScontoPercentuale)
								    scon="<html> NOME POLITICA SCONTO: "+politicaSconto.getNomePolitica()+"<br /><br />"+
											" CATEGORIA CLIENTE: "+politicaSconto.getCategoriaCliente()+"<br /><br />"+
											" NUMERO MESI: "+((ScontoPercentuale) politicaSconto).getNumeroMesi()+"<br /><br />"+
											" SCONTO : "+((ScontoPercentuale) politicaSconto).getScontoPercentuale()+"%";
								
								if(politicaSconto instanceof ScontoFisso)
									scon="<html> NOME POLITICA SCONTO: "+politicaSconto.getNomePolitica()+"<br /><br />"+
											" CATEGORIA CLIENTE: "+politicaSconto.getCategoriaCliente()+"<br /><br />"+
											" NUMERO MESI: "+((ScontoFisso) politicaSconto).getNumeroMesi()+"<br /><br />"+
											" SCONTO : "+((ScontoFisso) politicaSconto).getScontoFisso()+" €";
								
								lblInfoPoliticaSelezionata.setText(scon);
								lblInfoPoliticaSelezionata.setBounds(611, 279, 241, y);
								lblInfoPoliticaSelezionata.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
								btnCalcolaPrezzo_1.setEnabled(true);
								lblFrecciaPolitica.setVisible(true);
							}	
					
						});
						
					}
			
			
			
	private void ascoltatoreInfoPoliticaSelezionataValueChanged() {
    	 		
		 list_2.addListSelectionListener(new ListSelectionListener() {
				@Override
				public void valueChanged(ListSelectionEvent e) {
						int y = 160;
						PoliticaScontoAbbonamento politicaSconto=(PoliticaScontoAbbonamento) list_2.getSelectedValue();
						//System.out.println("ciao");
						
						String scon="";
						
						if(politicaSconto instanceof ScontoPercentuale)
						    scon="<html> NOME POLITICA SCONTO: "+politicaSconto.getNomePolitica()+"<br /><br />"+
									" CATEGORIA CLIENTE: "+politicaSconto.getCategoriaCliente()+"<br /><br />"+
									" NUMERO MESI: "+((ScontoPercentuale) politicaSconto).getNumeroMesi()+"<br /><br />"+
									" SCONTO : "+((ScontoPercentuale) politicaSconto).getScontoPercentuale()+"%";
						
						if(politicaSconto instanceof ScontoFisso)
							scon="<html> NOME POLITICA SCONTO: "+politicaSconto.getNomePolitica()+"<br /><br />"+
									" CATEGORIA CLIENTE: "+politicaSconto.getCategoriaCliente()+"<br /><br />"+
									" NUMERO MESI: "+((ScontoFisso) politicaSconto).getNumeroMesi()+"<br /><br />"+
									" SCONTO : "+((ScontoFisso) politicaSconto).getScontoFisso()+" €";
						
						
						lblInfoPoliticaSelezionata.setText(scon);
						lblInfoPoliticaSelezionata.setBounds(611, 279, 241, y);
						lblInfoPoliticaSelezionata.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
						btnCalcolaPrezzo_1.setEnabled(true);
						lblFrecciaPolitica.setVisible(true);
					}			
				});
				
			}									
			
		});
		
	}


	private void ascoltatoreInfoAbbonamentoSelezionato() {
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int y = 120;
				DescrizioneAbbonamento descAbb=(DescrizioneAbbonamento) list.getSelectedValue();
				descAbb=ConfAbbCorsiHandler.getInstance().getDescrizioneAbbonamento(descAbb.toString());
				String abb="<html> NOME ABBONAMENTO: "+descAbb.getNomeAbbonamento()+"<br /><br />"+
							" PREZZO BASE MENSILE: "+descAbb.getPrezzoBaseMensile()+" €<br /><br />";
							//"Corsi: "+descAbb.getElencoCorsi()+"\n"+"Sale pesi: "+riepilogoAbb.setText(abb)+"\n";
													
				if(descAbb.getElencoCorsi().isEmpty())
				{
					abb=abb+"CORSI: Non sono presenti corsi <br /><br />";
					y=y+40;
				}
				else
				{
					//System.out.println(descAbb.getElencoCorsi().getClass());
					abb=abb+" CORSI:<br />";
					PersistentSet c = (PersistentSet)descAbb.getElencoCorsi();
					Iterator<DescrizioneCorso> iter =  c.iterator();
					while(iter.hasNext())
					 {								
						DescrizioneCorso dc = iter.next();
						abb=abb+" -"+dc.getNomeCorso()+"<br />";
						y=y+30;
					 }
				}
				
				if(descAbb.getElencoSalePesi().isEmpty())
				{
					abb=abb+"<br /> SALE PESI: Non sono presenti sale pesi <br /><br />";
					y=y+30;
				}
				else
				{
					//System.out.println(descAbb.getElencoCorsi().getClass());
					abb=abb+"<br /> SALE PESI:<br />";
					PersistentSet c = (PersistentSet)descAbb.getElencoSalePesi();
					Iterator<SalaPesi> iter =  c.iterator();
					while(iter.hasNext())
					 {								
						SalaPesi dc = iter.next();
						abb=abb+" -"+dc.getNomeSala()+"<br />";
						y=y+30;
					 }
				}			
				lblInfoAbbSelezionato.setText(abb);
				lblInfoAbbSelezionato.setBounds(21, 279, 284, y);
				lblInfoAbbSelezionato.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));	
				lblFrecciaAbb.setVisible(true);
				//btnCalcolaPrezzo_1.setBounds(21, 290+y+30, 131, 23);
				//lblPrezzo.setBounds(210, 294+y+30, 46, 14);
				//btnSalvaPreventivo.setBounds(21, 341+y+30, 131, 23);
				//lblConfermaPreventivo.setBounds(198, 345+y+30, 400, 14);
				
			}
		});		
	
		
	}
}
