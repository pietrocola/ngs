package view.content;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.factory.PoliticaScontoAbbonamentoStrategyFactory;
import ngs.model.M_PreventivoAbbonamento;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.DescrizioneAbbonamento;
import ngs.persistentmodel.DescrizioneCorso;
import ngs.persistentmodel.PoliticaScontoAbbonamento;
import ngs.persistentmodel.SalaPesi;
import ngs.persistentmodel.ScontoFisso;
import ngs.persistentmodel.ScontoPercentuale;

import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import view.utility.Message;
import view.utility.decorator.Pannello;
import view.utility.mediator.*;
import view.utility.observer.LabelPrezzoAbbonamento;

import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.util.Observable;
import java.awt.Font;

import javax.swing.ImageIcon;

import org.hibernate.collection.internal.PersistentSet;

import javax.swing.SwingConstants;

public class CreaPreventivoView extends Pannello{
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;	
	private JScrollPane scrollPane_2;
	


	Mediator med;
	private JLabel lblAbbonamenti;
	private JLabel lblCategoriaCliente;
	private JLabel lblNumeroMesi;
	
	
	private JLabel lblInfoAbbSelezionato;
	
	
	BtnPrezzo btnprezzo;
	BtnSalva btnsalva; 
	ListAbbonamenti listAbbonamenti;
	ListCatCliente listCatCliente;
	ListNumMesi listNumMesi;
	LabelConferma labelConferma;
	//LabelPrezzo labelPrezzo;
	LabelFrecciaAbb labelFrecciaAbb;
	LabelNoAbbonamento lblNoAbbonamento;
	LabelNoCategorieClienti lblNoCategorie;
	RadioButtonProCliente rdbtnProCliente;
	RadioButtonProCentro rdbtnProCentro;
	private JLabel lblNoPoliticheSconto;
	
	private LabelPrezzoAbbonamento labelPrezzoAbbonamento;
	private JLabel lblPolitiche;
	private JLabel lblFrecciaPolitiche;
	
	public CreaPreventivoView(Boolean aux){
		
	}
	
	
	
	/**
	 * Create the panel.
	 */
	public CreaPreventivoView() {
		
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x=(screen.width);
	    int y=(screen.height);
	    setPreferredSize(new Dimension(x,y));
		
		//PATTERN OBSERVER
		//M_PreventivoAbbonamento prevAbb=new M_PreventivoAbbonamento();
		M_PreventivoAbbonamento.getInstance().addInPublisher(PoliticaScontoAbbonamentoStrategyFactory.getInstance());
	    
	    med = new CreaPreventivoMediator();
		
		setLayout(null);
		
		{
			lblNoAbbonamento = new LabelNoAbbonamento(med, "");
			lblNoAbbonamento.setVerticalAlignment(SwingConstants.TOP);
			lblNoAbbonamento.setBounds(29, 70, 249, 14);
			add(lblNoAbbonamento);
		}
		{
			lblNoCategorie = new LabelNoCategorieClienti(med, "");
			lblNoCategorie.setVerticalAlignment(SwingConstants.TOP);
			lblNoCategorie.setBounds(364, 70, 194, 14);
			add(lblNoCategorie);
		}
		{
			lblNoPoliticheSconto = new LabelNoPoliticheSconto(med, "");
			lblNoPoliticheSconto.setVerticalAlignment(SwingConstants.TOP);
			lblNoPoliticheSconto.setBounds(621, 76, 460, 23);
			add(lblNoPoliticheSconto);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(29, 110, 249, 123);
			add(scrollPane);
			{
				ArrayList<DescrizioneAbbonamento> elencoAbb=ConfAbbCorsiHandler.getInstance().getDescrizioniAbbonamenti();
				DefaultListModel defList = new DefaultListModel();
				for(DescrizioneAbbonamento dc: elencoAbb){
					defList.addElement(dc);
				}
				listAbbonamenti = new ListAbbonamenti(med, defList);
				if(elencoAbb.size()==0){
					listAbbonamenti.invia(CostantMediator.LISTA_ABBONAMENTI_VUOTA);
				}else{
					
					listAbbonamenti.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {						
							//APPLICO MEDIATOR
						listAbbonamenti.invia(CostantMediator.FOCUS_LISTA_ABBONAMENTI);
						labelPrezzoAbbonamento.setText("");// no mediator 
						
					}
					});
					scrollPane.setViewportView(listAbbonamenti);
					ascoltatoreInfoAbbonamentoSelezionato();
				}
			}
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(364, 110, 167, 123);
			add(scrollPane_1);
			{
				ArrayList<CategoriaCliente> elencoCat=ConfAbbCorsiHandler.getInstance().getCategorieClienti();
				DefaultListModel defList = new DefaultListModel();
				for(CategoriaCliente ec: elencoCat)
				{
					defList.addElement(ec);
				}
				listCatCliente = new ListCatCliente(med, defList);
				listCatCliente.setEnabled(false); // disabilitata al caricamento
				if(elencoCat.size()==0)
					listCatCliente.invia(CostantMediator.LISTA_CATEGORIE_VUOTA);
				else{
					listCatCliente.addFocusListener(new FocusAdapter() {
						@Override
						public void focusGained(FocusEvent arg0) {
							
							//CategoriaCliente cat=(CategoriaCliente) listCatCliente.getSelectedValue();
							//ArrayList<PoliticaScontoAbbonamento> elencoPolitiche=ConfAbbCorsiHandler.getInstance().getPoliticheSconto(cat);
							
							//if(elencoPolitiche.size()==0)
								//listCatCliente.invia(CostantMediator.NO_POLITICHE_SCONTO);
							
							listCatCliente.invia(CostantMediator.FOCUS_LISTA_CATEGORIA);
							labelPrezzoAbbonamento.setText(""); // no mediator 
							lblPolitiche.setText("");//no mediator
							lblFrecciaPolitiche.setVisible(false);//no mediator
							listNumMesi.removeSelectionInterval(0, 1000); // no mediator
							/*
							lblInfoPoliticaSelezionata.setText("");
							lblFrecciaPolitica.setVisible(false);
							lblInfoPoliticaSelezionata.setBorder(null);
							 */
							}
					});
					ascoltatoreCategoriaClienteSelezionata();				
					scrollPane_1.setViewportView(listCatCliente);
				}
			}
		}
		{
			

		
			
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(621, 110, 167, 123);
			add(scrollPane_2);
			{
				rdbtnProCliente = new RadioButtonProCliente(med, "pro cliente");
				rdbtnProCliente.setEnabled(false);
				rdbtnProCliente.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						rdbtnProCliente.invia(CostantMediator.FOCUS_RADIO);
						labelPrezzoAbbonamento.setText(""); // no mediator 
					}
				});
				rdbtnProCliente.setBounds(914, 110, 109, 23);
				add(rdbtnProCliente);
			
				rdbtnProCentro = new RadioButtonProCentro(med, "pro centro");
				rdbtnProCentro.setEnabled(false);
				rdbtnProCentro.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent e) {
						rdbtnProCentro.invia(CostantMediator.FOCUS_RADIO);
						labelPrezzoAbbonamento.setText(""); // no mediator 
					}
				});
				rdbtnProCentro.setBounds(1025, 110, 109, 23);
				add(rdbtnProCentro);
				
				ButtonGroup group = new ButtonGroup();
				group.add(rdbtnProCliente);
				group.add(rdbtnProCentro);
			}
			{				
				btnprezzo = new BtnPrezzo(med, "calcola prezzo");
				btnprezzo.setEnabled(false);
				ascoltatoreCalcolaPrezzo();
				btnprezzo.setBounds(914, 156, 134, 23);
				add(btnprezzo);				
			}
			{
				//labelPrezzo = new LabelPrezzo(med,"");
				//labelPrezzo.setBounds(994, 160, 67, 14);
				//add(labelPrezzo);
			}
			{
				labelPrezzoAbbonamento = new LabelPrezzoAbbonamento();
				labelPrezzoAbbonamento.setText("");
				labelPrezzoAbbonamento.addInPublisher(PoliticaScontoAbbonamentoStrategyFactory.getInstance());

				labelPrezzoAbbonamento.setBounds(1086, 160, 67, 14);
				add(labelPrezzoAbbonamento);
			}
			{
				btnsalva = new BtnSalva(med,"salva preventivo");
				btnsalva.setEnabled(false);
				ascoltatoreSalvaPreventivo();
				btnsalva.setBounds(914, 201, 134, 23);
				add(btnsalva);				
			}
			{				
				labelConferma = new LabelConferma(med, "");
				labelConferma.setBounds(1086, 206, 204, 14);
				add(labelConferma);
			}
			
		}
		{
			lblAbbonamenti = new JLabel("ABBONAMENTI");
			lblAbbonamenti.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblAbbonamenti.setBounds(29, 45, 134, 14);
			add(lblAbbonamenti);
		}
		{
			lblCategoriaCliente = new JLabel("CATEGORIA CLIENTE");
			lblCategoriaCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblCategoriaCliente.setBounds(364, 45, 167, 14);
			add(lblCategoriaCliente);
		}
		{
			lblNumeroMesi = new JLabel("NUMERO MESI");
			lblNumeroMesi.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNumeroMesi.setBounds(621, 45, 109, 14);
			add(lblNumeroMesi);
		}
		{			
			labelFrecciaAbb = new LabelFrecciaAbb(med, "");
			labelFrecciaAbb.setVisible(false);
			labelFrecciaAbb.setIcon(new ImageIcon(CreaPreventivoView.class.getResource("/view/img/freccia.png")));
			labelFrecciaAbb.setBounds(136, 264, 46, 14);
			add(labelFrecciaAbb);
		}
		{
			lblInfoAbbSelezionato = new JLabel("");
			lblInfoAbbSelezionato.setVerticalAlignment(SwingConstants.TOP);
			//lblInfoAbbSelezionato.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblInfoAbbSelezionato.setBounds(29, 312, 249, 14);
			add(lblInfoAbbSelezionato);
		}
		{
			lblPolitiche = new JLabel("");
			lblPolitiche.setVerticalAlignment(SwingConstants.TOP);
			lblPolitiche.setBounds(621, 312, 215, 192);
			add(lblPolitiche);
		}
		{
			lblFrecciaPolitiche = new JLabel("");
			lblFrecciaPolitiche.setVisible(false);
			lblFrecciaPolitiche.setIcon(new ImageIcon(CreaPreventivoView.class.getResource("/view/img/freccia.png")));
			lblFrecciaPolitiche.setBounds(687, 264, 40, 21);
			add(lblFrecciaPolitiche);
		}


		

	}

	
	
	
	
	private void ascoltatoreSalvaPreventivo() {
		btnsalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				
				
				DescrizioneAbbonamento descAbb= (DescrizioneAbbonamento) listAbbonamenti.getSelectedValue();
				CategoriaCliente catCliente= (CategoriaCliente) listCatCliente.getSelectedValue();
				int numMesi=(int) listNumMesi.getSelectedValue();
				
				//String p=labelPrezzo.getText();
				//String p=labelPrezzoAbbonamento.getText();
				//String p1 = p.substring(0,p.length()-1);
				//float prezzo=Float.parseFloat(p1);
				
				float prezzo=M_PreventivoAbbonamento.getInstance().getPrezzo(); // prezzo ricavato con observer

				
				if(ConfAbbCorsiHandler.getInstance().verificaPreventivo(descAbb, catCliente, numMesi)==true)
				{
					String riepilogo="Confermare il salvataggio del preventivo?\n   ABBONAMENTO: "+descAbb+
							 "\n   CATEGORIA CLIENTE: "+catCliente.getNomeCat()+
							 "\n   NUMERO MESI: "+numMesi+"\n   PREZZO: "+prezzo+" €\n\n";
					int risposta=Message.questionConfirmMessage("CONFERMA",riepilogo);
					if(risposta==JOptionPane.YES_OPTION) 
					{
						Boolean aux=ConfAbbCorsiHandler.getInstance().creaPreventivoAbbonamento(descAbb, catCliente, numMesi, prezzo);
						if(aux)
						{
							btnsalva.invia(CostantMediator.SALVA);
						}
						else
						{
							//Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
						}
					}
				}
				else
				{
					btnsalva.invia(CostantMediator.PREVENTIVO_PRESENTE);
					//Message.errorMessage("ERRORE", "Preventivo già presente");
				}
						
			}
		});
		
	}





	private void ascoltatoreCalcolaPrezzo() {
		btnprezzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				
				
				DescrizioneAbbonamento descAbb= (DescrizioneAbbonamento) listAbbonamenti.getSelectedValue();
				CategoriaCliente cat=(CategoriaCliente) listCatCliente.getSelectedValue();
				int numMesi=(int) listNumMesi.getSelectedValue();
				

					Boolean proContro=null;
					if(rdbtnProCliente.isSelected()==false && rdbtnProCentro.isSelected()==false)
						Message.errorMessage("ERRORE", "Scegliere una strategia pro/contro");
					else{
						if(rdbtnProCliente.isSelected())
							proContro=true;
						if(rdbtnProCentro.isSelected())
							proContro=false;
					
				   
					ArrayList<PoliticaScontoAbbonamento> elencoPoliticheSconto= ConfAbbCorsiHandler.getInstance().getPoliticheSconto(cat, numMesi);
				

					//PoliticaScontoAbbonamentoStrategyFactory psasf = new PoliticaScontoAbbonamentoStrategyFactory();
					//labelPrezzoAbbonamento.inizializza(PoliticaScontoAbbonamentoStrategyFactory.getInstance());
					
					//PATTERN OBSERVER
					//M_PreventivoAbbonamento prevAbb=new M_PreventivoAbbonamento();
					//M_PreventivoAbbonamento.getInstance().inizializza(PoliticaScontoAbbonamentoStrategyFactory.getInstance());
					
					float prezzo=ConfAbbCorsiHandler.getInstance().calcolaPrezzoAbbonamento(descAbb, elencoPoliticheSconto, proContro);
					String p=Float.toString(prezzo);
				
				
					btnprezzo.invia(CostantMediator.CALCOLA);  //abilita salva preventivo con il pulsanet calcola prezzo
					

					
					//labelPrezzo.setText(p+" €");
					}
				}
			
		});
		
	}





	private void ascoltatoreCategoriaClienteSelezionata() {
		listCatCliente.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				
				//listCatCliente.invia(CostantMediator.AZZERA_LABEL_POLITICHE);
				
				CategoriaCliente catCliente=(CategoriaCliente) listCatCliente.getSelectedValue();
				HashSet<Integer> elencoNumeroMesi=ConfAbbCorsiHandler.getInstance().getNumeroMesi(catCliente);
				DefaultListModel defList = new DefaultListModel();
				for(Integer num: elencoNumeroMesi)
				{
					defList.addElement(num);
				}
				
				listNumMesi = new ListNumMesi(med,defList);
				
				if(elencoNumeroMesi.size()==0)
					listCatCliente.invia(CostantMediator.NO_POLITICHE_SCONTO);
				else
					listCatCliente.invia(CostantMediator.AZZERA_LABEL_POLITICHE);
				
				listNumMesi.addFocusListener(new FocusAdapter() {
						@Override
						public void focusGained(FocusEvent arg0) {	
							listNumMesi.invia(CostantMediator.FOCUS_LISTA_MESI);
							labelPrezzoAbbonamento.setText(""); // no mediator 

							
							}
					});
				ascoltatoreNumeroMesiSelezionato();
				scrollPane_2.setViewportView(listNumMesi);
				

			}
		});
		
	}
	
	
	
	
	
	
	
	
	
	
	
	private void ascoltatoreNumeroMesiSelezionato() {
		listNumMesi.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {

				{
					CategoriaCliente cat=(CategoriaCliente) listCatCliente.getSelectedValue();
					int numMesi=(int) listNumMesi.getSelectedValue();
					//cat=new CategoriaCliente();
					//cat.setNomeCat("over 60");						
					 ArrayList<PoliticaScontoAbbonamento> elencoPolitiche=ConfAbbCorsiHandler.getInstance().getPoliticheSconto(cat,numMesi);
					
					 lblFrecciaPolitiche.setVisible(true);
					
					 String politiche="";
					 
					 
					 
					 for(PoliticaScontoAbbonamento psa: elencoPolitiche){
						 if(psa instanceof ScontoPercentuale){
							
							 politiche=politiche+"<html> NOME POLITICA SCONTO: &nbsp;<br />"+((ScontoPercentuale) psa).getNomePolitica()+"<br />"+
										"&nbsp;&nbsp;&nbsp;&nbsp;-Numero Mesi:&nbsp;&nbsp; <font color=\"#19BFE8\">"+((ScontoPercentuale) psa).getNumeroMesi()+"</font><br />"+
										"&nbsp;&nbsp;&nbsp;&nbsp;-Sconto Percentuale:&nbsp;&nbsp; "+((ScontoPercentuale) psa).getScontoPercentuale()+" %<br /><br /><br />";

						 }	
					     if(psa instanceof ScontoFisso){
							 politiche=politiche+"<html> NOME POLITICA SCONTO:&nbsp;<br />"+((ScontoFisso) psa).getNomePolitica()+"<br />"+
										"&nbsp;&nbsp;&nbsp;&nbsp;-Numero Mesi: &nbsp;&nbsp;<font color=\"#19BFE8\">"+((ScontoFisso) psa).getNumeroMesi()+"</font><br />"+
										"&nbsp;&nbsp;&nbsp;&nbsp;-Sconto Fisso:&nbsp;&nbsp; "+((ScontoFisso) psa).getScontoFisso()+" €<br /><br /><br />";
				
					     }
					 }
					 
					 lblPolitiche.setText(politiche);
					 
					 
					 // if(elencoPolitiche.size()!=0)
					 //{
						 DefaultListModel defList = new DefaultListModel();
						 for(PoliticaScontoAbbonamento psa: elencoPolitiche)
						 {
							defList.addElement(psa);
						 }
										
				 }
				
			}
		});
		
	}
	
	
	
	
	private void ascoltatoreInfoAbbonamentoSelezionato() {
		listAbbonamenti.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				int y = 120;
				DescrizioneAbbonamento descAbb=(DescrizioneAbbonamento) listAbbonamenti.getSelectedValue();
				//descAbb=ConfAbbCorsiHandler.getInstance().getDescrizioneAbbonamento(descAbb.toString());
				String abb="<html> NOME ABBONAMENTO: "+descAbb.getNomeAbbonamento()+"<br /><br />"+
							" PREZZO BASE MENSILE: "+descAbb.getPrezzoBaseMensile()+" €<br /><br />";
							//"Corsi: "+descAbb.getElencoCorsi()+"\n"+"Sale pesi: "+riepilogoAbb.setText(abb)+"\n";
													
				if(descAbb.getElencoCorsi().isEmpty())
				{
					abb=abb+"CORSI: Non sono presenti corsi <br />";
					y=y+20;
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
						abb=abb+"&nbsp;&nbsp;&nbsp;&nbsp;-"+dc.getNomeCorso()+"<br />";
						y=y+30;
					 }
				}
				
				if(descAbb.getElencoSalePesi().isEmpty())
				{
					abb=abb+"<br /> SALE PESI: Non sono presenti sale pesi <br /><br />";
					y=y+20;
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
						abb=abb+" &nbsp;&nbsp;&nbsp;&nbsp;-"+dc.getNomeSala()+"<br />";
						y=y+30;
					 }
				}			
				lblInfoAbbSelezionato.setText(abb);
				lblInfoAbbSelezionato.setBounds(29, 312, 249, y);
				lblInfoAbbSelezionato.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));	
				listAbbonamenti.invia(CostantMediator.FOCUS_LISTA_ABBONAMENTI);
				
				//listAbbonamenti.invia(CostantMediator.FOCUS_LISTA_ABBONAMENTI, lblFrecciaAbb.getNome());
				//lblFrecciaAbb.setVisible(true);
				//btnCalcolaPrezzo_1.setBounds(21, 290+y+30, 131, 23);
				//lblPrezzo.setBounds(210, 294+y+30, 46, 14);
				//btnSalvaPreventivo.setBounds(21, 341+y+30, 131, 23);
				//lblConfermaPreventivo.setBounds(198, 345+y+30, 400, 14);
				
			}
		});		
		
		
	}





	@Override
	public Pannello draw() {
		return new CreaPreventivoView();
	}





	@Override
	public Pannello drawEmpty() {
		return new CreaPreventivoView(true);
	}
}
