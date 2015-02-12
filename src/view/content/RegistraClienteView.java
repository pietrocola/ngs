package view.content;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.utility.Message;
import ngs.controller.ErogaAbbonamentoHandler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistraClienteView extends JPanel {
	private JLabel lblCodiceFiscale;
	private JTextField textField;
	private JButton btnVerificaSePresente;
	private JLabel lblNome;
	private JTextField textField_1;
	private JLabel lblCognome;
	private JTextField textField_2;
	private JLabel lblTelefono;
	private JTextField textField_3;
	private JLabel lblEmail;
	private JTextField textField_4;
	private JButton btnRegistra;
	private JLabel labelVerificaCF;
	private JLabel labelConfermaRegistrazione;

	/**
	 * Create the panel.
	 */
	public RegistraClienteView() {
		setLayout(null);
		{
			lblCodiceFiscale = new JLabel("codice fiscale");
			lblCodiceFiscale.setBounds(48, 75, 118, 14);
			add(lblCodiceFiscale);
		}
		{
			textField = new JTextField();
			textField.setBounds(198, 72, 118, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			btnVerificaSePresente = new JButton("verifica se presente");
			ascoltatoreVerificaSeClientePresente();
			btnVerificaSePresente.setBounds(380, 71, 156, 23);
			add(btnVerificaSePresente);
		}
		{
			lblNome = new JLabel("nome");
			lblNome.setBounds(48, 174, 66, 14);
			add(lblNome);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(198, 171, 118, 20);
			add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblCognome = new JLabel("cognome");
			lblCognome.setBounds(48, 227, 66, 14);
			add(lblCognome);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(198, 224, 118, 20);
			add(textField_2);
			textField_2.setColumns(10);
		}
		{
			lblTelefono = new JLabel("telefono");
			lblTelefono.setBounds(48, 275, 66, 14);
			add(lblTelefono);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(198, 272, 118, 20);
			add(textField_3);
			textField_3.setColumns(10);
		}
		{
			lblEmail = new JLabel("email");
			lblEmail.setBounds(48, 328, 66, 14);
			add(lblEmail);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(198, 325, 118, 20);
			add(textField_4);
			textField_4.setColumns(10);
		}
		{
			btnRegistra = new JButton("registra");
			ascoltatoreRegistraCliente();
			btnRegistra.setBounds(198, 377, 89, 23);
			add(btnRegistra);
		}
		{
			labelVerificaCF = new JLabel("");
			labelVerificaCF.setBounds(380, 119, 228, 14);
			add(labelVerificaCF);
		}
		{
			labelConfermaRegistrazione = new JLabel("");
			labelConfermaRegistrazione.setBounds(332, 381, 400, 14);
			add(labelConfermaRegistrazione);
		}

	}

	private void ascoltatoreRegistraCliente() {
		btnRegistra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codiceFiscale=textField.getText();
				String nome=textField_1.getText();
				String cognome=textField_2.getText();
				String tel=textField_3.getText();
				int telefono=Integer.parseInt(tel);
				String email=textField_4.getText();
				Boolean aux= ErogaAbbonamentoHandler.getInstance().registraCliente(nome, cognome, codiceFiscale, telefono, email);
				if(aux==true)
					Message.confirmLabel("Cliente registrato", true, labelConfermaRegistrazione);
				else{
				}
			}
		});
		
	}

	private void ascoltatoreVerificaSeClientePresente() {
		btnVerificaSePresente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codiceFiscale=textField.getText();
				Boolean aux=ErogaAbbonamentoHandler.getInstance().verificaSeDatiClientePresenti(codiceFiscale);
				if(aux==true)
					Message.confirmLabel("Cliente non registrato", true, labelVerificaCF);
				else
					Message.confirmLabel("Cliente già registrato", false, labelVerificaCF);
			}
		});
		
	}
}
