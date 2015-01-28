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


public class VisualizzaTotaliView extends JPanel{
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblAbbonamenti;
	private JScrollPane scrollPane_1;
	private JLabel lblCategoria;
	private JList list_1;
	private JLabel lblPoliticaSconto;
	private JScrollPane scrollPane_2;
	private JList list_2;
	private JScrollPane scrollPane_3;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public VisualizzaTotaliView() {
		setLayout(null);
		{
			lblAbbonamenti = new JLabel("Abbonamenti");
			lblAbbonamenti.setBounds(38, 33, 114, 14);
			add(lblAbbonamenti);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(21, 76, 149, 200);
			add(scrollPane);
			{
				DefaultListModel defList = new DefaultListModel();
				for(int i=1; i<101; i++)
				{
					defList.addElement("stringa"+i);
				}
				
				list = new JList(defList);
				scrollPane.setViewportView(list);
			}
		}
		{
			lblCategoria = new JLabel("Categoria");
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
			lblPoliticaSconto = new JLabel("Politica Sconto");
			lblPoliticaSconto.setBounds(369, 33, 96, 14);
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
					defList.addElement("stringa"+i);
				}
				
				list_2 = new JList(defList);
				scrollPane_2.setViewportView(list_2);
			}
		}
		{
			scrollPane_3 = new JScrollPane();
			scrollPane_3.setBounds(86, 291, 49, 45);
			add(scrollPane_3);
			{
				panel = new JPanel();
				scrollPane_3.setViewportView(panel);
				panel.setLayout(null);
			}
		}
		
		
		

	}
}
