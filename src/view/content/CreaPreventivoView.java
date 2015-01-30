package view.content;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.ScrollPaneConstants;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.model.strategy.IPoliticaScontoAbbonamentoStrategy;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.DescrizioneAbbonamento;
import ngs.persistentmodel.PoliticaScontoAbbonamento;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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

	/**
	 * Create the panel.
	 */
	public CreaPreventivoView() {
		setLayout(null);
		{
			lblAbbonamenti = new JLabel("ABBONAMENTI");
			lblAbbonamenti.setBounds(21, 33, 114, 14);
			add(lblAbbonamenti);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(21, 76, 149, 200);
			add(scrollPane);
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
						list_1.setEnabled(true);
					}
				});
				scrollPane.setViewportView(list);
			}
		}
		{
			lblCategoria = new JLabel("CATEGORIE CLIENTI");
			lblCategoria.setBounds(196, 33, 114, 14);
			add(lblCategoria);
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(196, 76, 149, 200);
			add(scrollPane_1);
			{
				ArrayList<CategoriaCliente> elencoCat=ConfAbbCorsiHandler.getInstance().getCategorieClienti();
				DefaultListModel defList = new DefaultListModel();
				for(CategoriaCliente ec: elencoCat){
					defList.addElement(ec);
				}
				
				list_1 = new JList(defList);				
				/*list_1.addListSelectionListener(new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						{
							//System.out.println(list_1.getSelectedValue().getClass());
							cat=(CategoriaCliente) list_1.getSelectedValue();
							
							scrollPane_2 = new JScrollPane();
							scrollPane_2.setBounds(372, 76, 149, 200);
							add(scrollPane_2);
							{

								//cat=new CategoriaCliente();
								//cat.setNomeCat("univ");
								
								 ArrayList<PoliticaScontoAbbonamento> elencoPolitiche=ConfAbbCorsiHandler.getInstance().getPoliticheSconto(cat);
								 DefaultListModel defList = new DefaultListModel();
								 for(PoliticaScontoAbbonamento psa: elencoPolitiche){
									defList.addElement(psa.getNomePolitica());
								 }
																
								
								list_2 = new JList(defList);
								//list_2.setEnabled(false);
								scrollPane_2.setViewportView(list_2);
							}
							
						}
					}
				});*/
				list_1.setEnabled(false);				
				scrollPane_1.setViewportView(list_1);
			}
		}
		{
			lblPoliticaSconto = new JLabel("POLITICHE SCONTO");
			lblPoliticaSconto.setBounds(372, 33, 149, 14);
			add(lblPoliticaSconto);
		}
		
		{
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(372, 76, 149, 200);
			add(scrollPane_2);
			{

				cat=new CategoriaCliente();
				cat.setNomeCat("over 60");
				
				 ArrayList<PoliticaScontoAbbonamento> elencoPolitiche=ConfAbbCorsiHandler.getInstance().getPoliticheSconto(cat);
				 DefaultListModel defList = new DefaultListModel();
				 for(PoliticaScontoAbbonamento psa: elencoPolitiche){
					defList.addElement(psa);
				 }
				
				
				
				
				list_2 = new JList(defList);
				//list_2.setEnabled(false);
				scrollPane_2.setViewportView(list_2);
			}
			
		}
		{
			btnCalcolaPrezzo = new JButton("Calcola prezzo");
			ascoltatoreCalcolaPrezzo();
			btnCalcolaPrezzo.setBounds(21, 339, 124, 23);
			add(btnCalcolaPrezzo);
		}
		{
			lblPrezzo = new JLabel("");
			lblPrezzo.setBounds(208, 343, 46, 14);
			add(lblPrezzo);
		}
		{
			btnSalvaPreventivo = new JButton("Salva preventivo");
			ascoltatoreSalvaPreventivo();
			btnSalvaPreventivo.setEnabled(false);
			btnSalvaPreventivo.setBounds(21, 410, 149, 23);
			add(btnSalvaPreventivo);
		}
		
		
		

	}
	
	
	
	public void ascoltatoreCalcolaPrezzo(){
		btnCalcolaPrezzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DescrizioneAbbonamento descAbb=(DescrizioneAbbonamento) list.getSelectedValue();
				PoliticaScontoAbbonamento politicaSconto=(PoliticaScontoAbbonamento) list_2.getSelectedValue();
				float prezzo=ConfAbbCorsiHandler.getInstance().calcolaPrezzoAbbonamento(descAbb, politicaSconto);
				String p=Float.toString(prezzo);
				lblPrezzo.setText(p+"€");
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
				boolean aux=ConfAbbCorsiHandler.getInstance().creaPreventivoAbbonamento(descAbb, politicaSconto, prezzo);
				//mettere controlli aux
			}
		});
	}
	
	
	
}
