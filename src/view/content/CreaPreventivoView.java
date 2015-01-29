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
import ngs.persistentmodel.DescrizioneAbbonamento;


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
				ArrayList<DescrizioneAbbonamento> elencoAbb=ConfAbbCorsiHandler.getInstance().getAbbonamenti();
				DefaultListModel defList = new DefaultListModel();
				for(DescrizioneAbbonamento dc: elencoAbb){
					defList.addElement(dc.getNomeAbbonamento());
				}
				list = new JList(defList);
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
				DefaultListModel defList = new DefaultListModel();
				for(int i=1; i<11; i++)
				{
					defList.addElement("stringa"+i);
				}
				
				list_1 = new JList(defList);
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
				DefaultListModel defList = new DefaultListModel();
				for(int i=1; i<51; i++)
				{
					defList.addElement("stringa stringa stringa stringa stringa "+i);
				}
				
				list_2 = new JList(defList);
				scrollPane_2.setViewportView(list_2);
			}
		}
		
		
		

	}
}
