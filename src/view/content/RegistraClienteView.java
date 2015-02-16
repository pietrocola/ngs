package view.content;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.utility.Message;
import ngs.controller.ConfAbbCorsiHandler;
import ngs.controller.ErogaAbbonamentoHandler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JSeparator;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

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
			labelVerificaCF = new JLabel("");
			labelVerificaCF.setBounds(380, 119, 228, 17);
			add(labelVerificaCF);
		}
		{
			textField = new JTextField();
			textField.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					labelVerificaCF.setText("");
					textField_1.setEnabled(false);
					textField_2.setEnabled(false);
					textField_3.setEnabled(false);
					textField_4.setEnabled(false);
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					btnRegistra.setEnabled(false);
					labelConfermaRegistrazione.setText("");
				}
			});
			textField.setBounds(198, 72, 118, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			btnVerificaSePresente = new JButton("verifica se presente");
			ascoltatoreVerificaSeClientePresente();
			btnVerificaSePresente.setBounds(380, 70, 156, 23);
			add(btnVerificaSePresente);
		}
		{
			lblNome = new JLabel("nome");
			lblNome.setBounds(48, 174, 66, 14);
			add(lblNome);
		}
		{
			textField_1 = new JTextField();
			textField_1.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					labelConfermaRegistrazione.setText("");
				}
			});
			textField_1.setEnabled(false);
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
			textField_2.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					labelConfermaRegistrazione.setText("");
				}
			});
			textField_2.setEnabled(false);
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
			textField_3.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					labelConfermaRegistrazione.setText("");
				}
			});
			textField_3.setEnabled(false);
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
			textField_4.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					labelConfermaRegistrazione.setText("");
				}
			});
			textField_4.setEnabled(false);
			textField_4.setBounds(198, 325, 118, 20);
			add(textField_4);
			textField_4.setColumns(10);
		}
		{
			btnRegistra = new JButton("registra");
			btnRegistra.setEnabled(false);
			ascoltatoreRegistraCliente();
			btnRegistra.setBounds(198, 377, 89, 23);
			add(btnRegistra);
		}

		{
			labelConfermaRegistrazione = new JLabel("");
			labelConfermaRegistrazione.setBounds(332, 381, 400, 17);
			add(labelConfermaRegistrazione);
		}

	}

	private void ascoltatoreRegistraCliente() {
		btnRegistra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String codiceFiscale=textField.getText();
				String nome=textField_1.getText();
				String cognome=textField_2.getText();
				String telefono=textField_3.getText();
				String email=textField_4.getText();
				if(codiceFiscale.trim().length()==0 || nome.trim().length()==0 || cognome.trim().length()==0 || telefono.trim().length()==0 || email.trim().length()==0)
					Message.errorMessage("ERRORE", "Inserire tutti i campi");
				else{
					
					String riepilogo="Confermare la registrazione del cliente?\n   CODICE FISCALE: "+codiceFiscale+"\n   NOME: "+nome+"\n   COGNOME: "+cognome+"\n   TELEFONO: "+telefono+"\n   EMAIL: "+email+"\n\n";
					int risposta = Message.questionConfirmMessage("CONFERMA", riepilogo);
					if(risposta==JOptionPane.YES_OPTION) 
					{
						//float prezzoAbb=Float.parseFloat(prezzo);
						if(ErogaAbbonamentoHandler.getInstance().registraCliente(nome, cognome, codiceFiscale, telefono, email)==true)
						{									
							Message.confirmLabel("Cliente registrato", true, labelConfermaRegistrazione);
							labelVerificaCF.setText("");								   
						}
						else{}
							//Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
							
					}
					else if(risposta==JOptionPane.NO_OPTION){}	
					
				
				}
			}
		});
		
	}

	private void ascoltatoreVerificaSeClientePresente() {
		btnVerificaSePresente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codiceFiscale=textField.getText();
				if(codiceFiscale.trim().length()==0)
					Message.errorMessage("ERRORE", "Inserire il codice fiscale");
				else{
					Boolean aux=ErogaAbbonamentoHandler.getInstance().verificaSeDatiClientePresenti(codiceFiscale);
					if(aux==true){
						Message.confirmLabel("Cliente non registrato", true, labelVerificaCF);
						textField_1.setEnabled(true);
						textField_2.setEnabled(true);
						textField_3.setEnabled(true);
						textField_4.setEnabled(true);
						btnRegistra.setEnabled(true);
					}
					else{
						Message.confirmLabel("Cliente già registrato", false, labelVerificaCF);
						textField_1.setEnabled(false);
						textField_2.setEnabled(false);
						textField_3.setEnabled(false);
						textField_4.setEnabled(false);
						btnRegistra.setEnabled(false);
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						textField_4.setText("");
						labelConfermaRegistrazione.setText("");
					}
				}
			}
		});
		
	}
}
