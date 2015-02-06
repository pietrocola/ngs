package view.content;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.utility.Message;
import ngs.controller.ErogaAbbonamentoHandler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VerificaCategoriaClienteView extends JPanel {
	private JLabel lblMatricola;
	private JTextField textField;
	private JButton btnVerifica;
	private JLabel lblRisultatoVerifica;

	/**
	 * Create the panel.
	 */
	public VerificaCategoriaClienteView() {
		setLayout(null);
		{
			lblMatricola = new JLabel("matricola");
			lblMatricola.setBounds(40, 55, 68, 14);
			add(lblMatricola);
		}
		{
			textField = new JTextField();
			textField.setBounds(185, 55, 109, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			btnVerifica = new JButton("verifica");
			ascoltatoreBottoneVerifica();
			btnVerifica.setBounds(185, 107, 89, 23);
			add(btnVerifica);
		}
		{
			lblRisultatoVerifica = new JLabel("");
			lblRisultatoVerifica.setBounds(333, 113, 400, 14);
			add(lblRisultatoVerifica);
		}

	}

	
	
	
	private void ascoltatoreBottoneVerifica() {
		btnVerifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codice=textField.getText();
				Boolean aux=ErogaAbbonamentoHandler.getInstance().verificaCategoriaCliente(codice);
				if(aux==true)
					Message.confirmLabel("Verifica ok", true, lblRisultatoVerifica);
				else
					Message.confirmLabel("il tizio mente", false, lblRisultatoVerifica);
			}
		});
		
	}
}
