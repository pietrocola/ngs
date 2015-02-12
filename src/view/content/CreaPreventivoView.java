package view.content;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JList;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.DescrizioneAbbonamento;
import ngs.persistentmodel.PoliticaScontoAbbonamento;

import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import view.utility.Message;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CreaPreventivoView extends JPanel {
	private JScrollPane scrollPane;
	private JList list;
	private JScrollPane scrollPane_1;
	private JList list_1;
	private JScrollPane scrollPane_2;
	private JList list_2;
	private JRadioButton rdbtnProCliente;
	private JRadioButton rdbtnProCentro;
	private JButton btnCalcolaPrezzo;
	private JLabel labelPrezzo;
	private JButton btnSalvaPreventivo;
	private JLabel labelConferma;

	/**
	 * Create the panel.
	 */
	public CreaPreventivoView() {
		setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(30, 64, 166, 123);
			add(scrollPane);
			{
				ArrayList<DescrizioneAbbonamento> elencoAbb=ConfAbbCorsiHandler.getInstance().getDescrizioniAbbonamenti();
				DefaultListModel defList = new DefaultListModel();
				for(DescrizioneAbbonamento dc: elencoAbb){
					defList.addElement(dc);
				}
				list = new JList(defList);
				scrollPane.setViewportView(list);
			}
		}
		{
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(233, 64, 120, 123);
			add(scrollPane_1);
			{
				ArrayList<CategoriaCliente> elencoCat=ConfAbbCorsiHandler.getInstance().getCategorieClienti();
				DefaultListModel defList = new DefaultListModel();
				for(CategoriaCliente ec: elencoCat)
				{
					defList.addElement(ec);
				}
				list_1 = new JList(defList);
				ascoltatoreCategoriaClienteSelezionata();
				scrollPane_1.setViewportView(list_1);
			}
		}
		{
			scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(387, 64, 53, 123);
			add(scrollPane_2);
			{
				rdbtnProCliente = new JRadioButton("pro cliente");
				rdbtnProCliente.setBounds(500, 62, 109, 23);
				add(rdbtnProCliente);
			}
			{
				rdbtnProCentro = new JRadioButton("pro centro");
				rdbtnProCentro.setBounds(611, 62, 109, 23);
				add(rdbtnProCentro);
			}
			{
				btnCalcolaPrezzo = new JButton("calcola prezzo");
				ascoltatoreCalcolaPrezzo();
				btnCalcolaPrezzo.setBounds(500, 106, 134, 23);
				add(btnCalcolaPrezzo);
			}
			{
				labelPrezzo = new JLabel("");
				labelPrezzo.setBounds(671, 110, 46, 14);
				add(labelPrezzo);
			}
			{
				btnSalvaPreventivo = new JButton("salva preventivo");
				ascoltatoreSalvaPreventivo();
				btnSalvaPreventivo.setBounds(500, 153, 134, 23);
				add(btnSalvaPreventivo);
			}
			{
				labelConferma = new JLabel("");
				labelConferma.setBounds(674, 157, 204, 14);
				add(labelConferma);
			}
			{

			}
		}

	}

	
	
	
	
	private void ascoltatoreSalvaPreventivo() {
		btnSalvaPreventivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DescrizioneAbbonamento descAbb= (DescrizioneAbbonamento) list.getSelectedValue();
				CategoriaCliente catCliente= (CategoriaCliente) list_1.getSelectedValue();
				int numMesi=(int) list_2.getSelectedValue();
				String p=labelPrezzo.getText();
				float prezzo=Float.parseFloat(p);
				
				Boolean aux=ConfAbbCorsiHandler.getInstance().creaPreventivoAbbonamento(descAbb, catCliente, numMesi, prezzo);
				
				if(aux==true)
					Message.confirmLabel("Preventivo salvato", true, labelConferma);
			}
		});
		
	}





	private void ascoltatoreCalcolaPrezzo() {
		btnCalcolaPrezzo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DescrizioneAbbonamento descAbb= (DescrizioneAbbonamento) list.getSelectedValue();
				CategoriaCliente cat=(CategoriaCliente) list_1.getSelectedValue();
				int numMesi=(int) list_2.getSelectedValue();
				
				Boolean proContro=null;
				if(rdbtnProCliente.isSelected())
					proContro=true;
				if(rdbtnProCentro.isSelected())
					proContro=false;
				
				ArrayList<PoliticaScontoAbbonamento> elencoPoliticheSconto= ConfAbbCorsiHandler.getInstance().getPoliticheSconto(cat, numMesi);
				float prezzo=ConfAbbCorsiHandler.getInstance().calcolaPrezzoAbbonamento(descAbb, elencoPoliticheSconto, proContro);
				String p=Float.toString(prezzo);
				labelPrezzo.setText(p);
			}
		});
		
	}





	private void ascoltatoreCategoriaClienteSelezionata() {
		list_1.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				CategoriaCliente catCliente=(CategoriaCliente) list_1.getSelectedValue();
				HashSet<Integer> elencoNumeroMesi=ConfAbbCorsiHandler.getInstance().getNumeroMesi(catCliente);
				DefaultListModel defList = new DefaultListModel();
				for(Integer num: elencoNumeroMesi)
				{
					defList.addElement(num);
				}
				
				list_2 = new JList(defList);
				ascoltatoreNumeroMesiSelezionato();
				scrollPane_2.setViewportView(list_2);
				

			}
		});
		
	}
	
	
	
	
	
	
	
	
	
	
	
	private void ascoltatoreNumeroMesiSelezionato() {
		list_2.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {

				{
					CategoriaCliente cat=(CategoriaCliente) list_1.getSelectedValue();
					int numMesi=(int) list_2.getSelectedValue();
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
}
