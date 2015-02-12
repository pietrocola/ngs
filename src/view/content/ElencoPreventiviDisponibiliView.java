package view.content;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.controller.ErogaAbbonamentoHandler;
import ngs.persistentmodel.CategoriaCliente;
import view.utility.Message;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class ElencoPreventiviDisponibiliView extends JPanel {
	private JComboBox comboBox;
	private JLabel lblCategoriaCliente;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public ElencoPreventiviDisponibiliView() {
		setLayout(null);
		{
			comboBox = new JComboBox();
			ascoltatoreElencoCategorieClienti();
			comboBox.setBounds(214, 49, 110, 20);
			add(comboBox);
		}
		{
			lblCategoriaCliente = new JLabel("categoria cliente");
			lblCategoriaCliente.setBounds(36, 52, 117, 14);
			add(lblCategoriaCliente);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(36, 125, 544, 123);
			add(scrollPane);
			{
				
				DefaultTableModel dati=new DefaultTableModel();
				dati.addRow(new String[]{"ciao","ciao","ciao"});
				
				table = new JTable(new DefaultTableModel(
					new Object[][] {
						{"hjhj", "hgh", null},
					},
					new String[] {
						"ABBONAMENTO", "NUMERO MESI", "PREZZO"
					}
				));
				table.setModel(new DefaultTableModel(
					new Object[][] {
					},
					new String[] {
						"ABBONAMENTO", "NUMERO MESI", "PREZZO"
					}
				));
				table.getColumnModel().getColumn(0).setPreferredWidth(110);
				table.getColumnModel().getColumn(0).setMinWidth(110);
				table.getColumnModel().getColumn(1).setPreferredWidth(110);
				table.getColumnModel().getColumn(1).setMinWidth(110);
				table.getColumnModel().getColumn(2).setPreferredWidth(110);
				table.getColumnModel().getColumn(2).setMinWidth(110);
				
				scrollPane.setViewportView(table);
			}
		}

	}

	
	
	
	
	
	private void ascoltatoreElencoCategorieClienti() {
		comboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				System.out.println("ciao");
				//label.setText("");
				ArrayList<CategoriaCliente> cc=ErogaAbbonamentoHandler.getInstance().getCategorieClienti();
				//System.out.println(cc.get(0).getNomeCat());
				if(cc.size()==0){
					comboBox.setEnabled(false);
					Message.errorMessage("ERRORE", "Nessuna categoria cliente presente");
					//btnSalva.setEnabled(false);
				}
				else{
					DefaultComboBoxModel dcbm=new DefaultComboBoxModel();
					for(CategoriaCliente cat:cc){
						dcbm.addElement(cat.getNomeCat());
						comboBox.setModel(dcbm);
					}
						
				}
			}
			
			
		});
			
	}	
}
