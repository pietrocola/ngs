package view.content;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ImpostaPoliticaScontoPercentualeView extends JPanel {
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblNomePolitcaSconto;
	private JTextField textField;
	private JLabel lblScontoMese;
	private JTextField textField_1;
	private JLabel lblScontoMesi;
	private JTextField textField_2;
	private JLabel lblScontoMesi_1;
	private JTextField textField_3;
	private JLabel lblScontoMesi_2;
	private JTextField textField_4;
	private JButton btnSalva;

	/**
	 * Create the panel.
	 */
	public ImpostaPoliticaScontoPercentualeView() {
		setLayout(null);
		setSize(800, 600);
		{
			lblNewLabel = new JLabel("categoria cliente");
			lblNewLabel.setBounds(40, 55, 101, 14);
			add(lblNewLabel);
		}
		{
			comboBox = new JComboBox();
			comboBox.setBounds(189, 52, 108, 20);
			add(comboBox);
		}
		{
			lblNomePolitcaSconto = new JLabel("nome politca sconto");
			lblNomePolitcaSconto.setBounds(40, 117, 139, 14);
			add(lblNomePolitcaSconto);
		}
		{
			textField = new JTextField();
			textField.setBounds(189, 114, 108, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			lblScontoMese = new JLabel("sconto 1 mese (%)");
			lblScontoMese.setBounds(40, 170, 108, 14);
			add(lblScontoMese);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(189, 167, 58, 20);
			add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblScontoMesi = new JLabel("sconto 3 mesi (%)");
			lblScontoMesi.setBounds(40, 220, 101, 14);
			add(lblScontoMesi);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(189, 217, 58, 20);
			add(textField_2);
			textField_2.setColumns(10);
		}
		{
			lblScontoMesi_1 = new JLabel("sconto 6 mesi (%)");
			lblScontoMesi_1.setBounds(40, 270, 101, 14);
			add(lblScontoMesi_1);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(189, 267, 58, 20);
			add(textField_3);
			textField_3.setColumns(10);
		}
		{
			lblScontoMesi_2 = new JLabel("sconto 12 mesi (%)");
			lblScontoMesi_2.setBounds(40, 320, 101, 14);
			add(lblScontoMesi_2);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(189, 317, 58, 20);
			add(textField_4);
			textField_4.setColumns(10);
		}
		{
			btnSalva = new JButton("salva");
			btnSalva.setBounds(189, 367, 89, 23);
			add(btnSalva);
		}

	}
}
