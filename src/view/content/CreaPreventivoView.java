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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.DescrizioneAbbonamento;
import ngs.persistentmodel.DescrizioneCorso;
import ngs.persistentmodel.PoliticaScontoAbbonamento;
import ngs.persistentmodel.SalaPesi;

import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import view.utility.Message;
import view.utility.decorator.Pannello;
import view.utility.mediator.Bottone;
import view.utility.mediator.ConcreteMediator;
import view.utility.mediator.CostantMediator;
import view.utility.mediator.Label;
import view.utility.mediator.Lista;
import view.utility.mediator.Mediator;

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
	private JRadioButton rdbtnProCliente;
	private JRadioButton rdbtnProCentro;
		
	private Bottone btnPrezzo;
	private Bottone btnSalva;
	private Label labelPrezzo;
	private Label labelConferma;
	private Lista listAbbonamenti;
	private Lista listCatCliente;
	private Lista listNumMesi;
	
	Mediator mediatore;
	private JLabel lblAbbonamenti;
	private JLabel lblCategoriaCliente;
	private JLabel lblNumeroMesi;
	private Label lblFrecciaAbb;
	private Label lblInfoAbbSelezionato;
	private Label lblNoAbbonamenti;
	/**
	 * Create the panel.
	 */
	public CreaPreventivoView() {
		
	    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x=(screen.width);
	    int y=(screen.height);
	    setPreferredSize(new Dimension(x,y));
		
		mediatore = new ConcreteMediator();
		
		setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(29, 93, 249, 123);
			add(scrollPane);
			{
				ArrayList<DescrizioneAbbonamento> elencoAbb=ConfAbbCorsiHandler.getInstance().getDescrizioniAbbonamenti();
				DefaultListModel defList = new DefaultListModel();
				for(DescrizioneAbbonamento dc: elencoAbb){
					defList.addElement(dc);
				}
				

				
				listAbbonamenti = new Lista(mediatore, defList,"listAbbonamenti");
				listAbbonamenti.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {						
							//APPLICO MEDIATOR
							listAbbonamenti.invia(CostantMediator.FOCUS_LISTA_ABBONAMENTI, labelPrezzo.getNome());
							listAbbonamenti.invia(CostantMediator.FOCUS_LISTA_ABBONAMENTI, labelConferma.getNome());
							listAbbonamenti.invia(CostantMediator.FOCUS_LISTA_ABBONAMENTI, btnSalva.getNome());
							listAbbonamenti.invia(CostantMediator.FOCUS_LISTA_ABBONAMENTI, btnPrezzo.getNome());
							
					}
				});
				scrollPane.setViewportView(listAbbonamenti);
				ascoltatoreInfoAbbonamentoSelezionato();
			}
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(319, 93, 140, 123);
			add(scrollPane_1);
			{
				ArrayList<CategoriaCliente> elencoCat=ConfAbbCorsiHandler.getInstance().getCategorieClienti();
				DefaultListModel defList = new DefaultListModel();
				for(CategoriaCliente ec: elencoCat)
				{
					defList.addElement(ec);
				}
				listCatCliente = new Lista(mediatore, defList,"listCatCliente");
				listCatCliente.addFocusListener(new FocusAdapter() {
					@Override
					public void focusGained(FocusEvent arg0) {
						listCatCliente.invia(CostantMediator.FOCUS_LISTA_CATEGORIA, labelPrezzo.getNome());
						listCatCliente.invia(CostantMediator.FOCUS_LISTA_CATEGORIA, labelConferma.getNome());
						listCatCliente.invia(CostantMediator.FOCUS_LISTA_CATEGORIA, btnSalva.getNome());
						listCatCliente.invia(CostantMediator.FOCUS_LISTA_CATEGORIA, btnPrezzo.getNome());
						listCatCliente.invia(CostantMediator.FOCUS_LISTA_CATEGORIA, listNumMesi.getNome());
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
		{
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(531, 93, 120, 123);
			add(scrollPane_2);
			{
				rdbtnProCliente = new JRadioButton("pro cliente");
				rdbtnProCliente.setBounds(736, 93, 109, 23);
				add(rdbtnProCliente);
			
				rdbtnProCentro = new JRadioButton("pro centro");
				rdbtnProCentro.setBounds(847, 93, 109, 23);
				add(rdbtnProCentro);
				
				ButtonGroup group = new ButtonGroup();
				
				group.add(rdbtnProCliente);
				group.add(rdbtnProCentro);
			}
			{
				btnPrezzo = new Bottone(mediatore,"calcola prezzo","btnPrezzo");
				btnPrezzo.setEnabled(false);
				ascoltatoreCalcolaPrezzo();
				btnPrezzo.setBounds(736, 139, 134, 23);
				add(btnPrezzo);
			}
			{
				labelPrezzo = new Label(mediatore,"","labelPrezzo");
				labelPrezzo.setBounds(908, 139, 67, 14);
				add(labelPrezzo);
			}
			{
				btnSalva = new Bottone(mediatore,"salva preventivo","btnSalva");
				btnSalva.setEnabled(false);
				ascoltatoreSalvaPreventivo();
				btnSalva.setBounds(736, 184, 134, 23);
				add(btnSalva);
			}
			{
				
				labelConferma = new Label(mediatore, "","labelConferma");
				labelConferma.setBounds(908, 193, 204, 14);
				add(labelConferma);
			}
			//mediatore.stampaArray();
		}
		{
			lblAbbonamenti = new JLabel("ABBONAMENTI");
			lblAbbonamenti.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblAbbonamenti.setBounds(29, 45, 134, 14);
			add(lblAbbonamenti);
		}
		{
			lblCategoriaCliente = new JLabel("CATEGORIA CLIENTE");
			lblCategoriaCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblCategoriaCliente.setBounds(319, 45, 120, 14);
			add(lblCategoriaCliente);
		}
		{
			lblNumeroMesi = new JLabel("NUMERO MESI");
			lblNumeroMesi.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNumeroMesi.setBounds(531, 45, 109, 14);
			add(lblNumeroMesi);
		}
		{
			lblFrecciaAbb = new Label(mediatore, "", "lblFrecciaAbb");
			lblFrecciaAbb.setVisible(false);
			lblFrecciaAbb.setIcon(new ImageIcon(CreaPreventivoView.class.getResource("/view/img/freccia.png")));
			lblFrecciaAbb.setBounds(136, 264, 46, 14);
			add(lblFrecciaAbb);
		}
		{
			lblInfoAbbSelezionato = new Label(mediatore, "", "lblInfoAbbSelezionato");
			lblInfoAbbSelezionato.setVerticalAlignment(SwingConstants.TOP);
			//lblInfoAbbSelezionato.setFont(new Font("Tahoma", Font.PLAIN, 11));
			lblInfoAbbSelezionato.setBounds(29, 312, 249, 14);
			add(lblInfoAbbSelezionato);
		}
		{
			lblNoAbbonamenti = new Label(mediatore, "", "lblInfoAbbSelezionato");
			lblNoAbbonamenti.setBounds(29, 70, 249, 14);
			add(lblNoAbbonamenti);
		}

	}

	
	
	
	
	private void ascoltatoreSalvaPreventivo() {
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DescrizioneAbbonamento descAbb= (DescrizioneAbbonamento) listAbbonamenti.getSelectedValue();
				CategoriaCliente catCliente= (CategoriaCliente) listCatCliente.getSelectedValue();
				int numMesi=(int) listNumMesi.getSelectedValue();
				String p=labelPrezzo.getText();
				float prezzo=Float.parseFloat(p);
				
				Boolean aux=ConfAbbCorsiHandler.getInstance().creaPreventivoAbbonamento(descAbb, catCliente, numMesi, prezzo);
				
				if(aux==true)
					btnSalva.invia(CostantMediator.SALVA, labelConferma.getNome());
					//Message.confirmLabel("Preventivo salvato", true, labelConferma);
					
			}
		});
		
	}





	private void ascoltatoreCalcolaPrezzo() {
		btnPrezzo.addActionListener(new ActionListener() {
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
				float prezzo=ConfAbbCorsiHandler.getInstance().calcolaPrezzoAbbonamento(descAbb, elencoPoliticheSconto, proContro);
				String p=Float.toString(prezzo);
				
				
				btnPrezzo.invia(CostantMediator.CALCOLA, btnSalva.getNome());  //abilita salva preventivo con il pulsanet calcola prezzo
				labelPrezzo.setText(p);
				
				}
			}
		});
		
	}





	private void ascoltatoreCategoriaClienteSelezionata() {
		listCatCliente.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				CategoriaCliente catCliente=(CategoriaCliente) listCatCliente.getSelectedValue();
				HashSet<Integer> elencoNumeroMesi=ConfAbbCorsiHandler.getInstance().getNumeroMesi(catCliente);
				DefaultListModel defList = new DefaultListModel();
				for(Integer num: elencoNumeroMesi)
				{
					defList.addElement(num);
				}
				
				listNumMesi = new Lista(mediatore,defList,"listNumMesi");
				listNumMesi.addFocusListener(new FocusAdapter() {
						@Override
						public void focusGained(FocusEvent arg0) {							
							listNumMesi.invia(CostantMediator.FOCUS_LISTA_MESI, labelPrezzo.getNome());
							listNumMesi.invia(CostantMediator.FOCUS_LISTA_MESI, labelConferma.getNome());
							listNumMesi.invia(CostantMediator.FOCUS_LISTA_MESI, btnSalva.getNome());
							listNumMesi.invia(CostantMediator.FOCUS_LISTA_MESI, btnPrezzo.getNome());
							listNumMesi.invia(CostantMediator.FOCUS_LISTA_MESI, listNumMesi.getNome());
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
				descAbb=ConfAbbCorsiHandler.getInstance().getDescrizioneAbbonamento(descAbb.toString());
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
						abb=abb+" -"+dc.getNomeCorso()+"<br />";
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
						abb=abb+" -"+dc.getNomeSala()+"<br />";
						y=y+30;
					 }
				}			
				lblInfoAbbSelezionato.setText(abb);
				lblInfoAbbSelezionato.setBounds(29, 312, 249, y);
				lblInfoAbbSelezionato.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));	
				listAbbonamenti.invia(CostantMediator.FOCUS_LISTA_ABBONAMENTI, lblFrecciaAbb.getNome());
				//lblFrecciaAbb.setVisible(true);
				//btnCalcolaPrezzo_1.setBounds(21, 290+y+30, 131, 23);
				//lblPrezzo.setBounds(210, 294+y+30, 46, 14);
				//btnSalvaPreventivo.setBounds(21, 341+y+30, 131, 23);
				//lblConfermaPreventivo.setBounds(198, 345+y+30, 400, 14);
				
			}
		});		
		
		
	}





	@Override
	public JPanel draw() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
