package view.content;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.utility.Message;
import ngs.controller.ConfAbbCorsiHandler;
import ngs.controller.ErogaAbbonamentoHandler;
import ngs.model.Adapter.ClientePensionatoAdapter;
import ngs.model.Adapter.ClienteUniversitarioAdapter;
import ngs.model.strategy.IPoliticaScontoAbbonamentoStrategy;
import ngs.persistentmodel.CategoriaCliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;

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
			lblRisultatoVerifica.setBounds(333, 113, 400, 82);
			add(lblRisultatoVerifica);
		}
		{
			ascoltatoreListaCategorieClienti();
		}

	}


	
	private void ascoltatoreListaCategorieClienti() 
	{
		
	}

	private void ascoltatoreBottoneVerifica() {
		btnVerifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String codice=textField.getText().toString();
				String conferma="";
				conferma=ErogaAbbonamentoHandler.getInstance().verificaCategoriaCliente(codice);
				lblRisultatoVerifica.setText(conferma);
				/*if(conferma==null)
					Message.confirmLabel(Object.class.getClass().getName(), true, lblRisultatoVerifica);
				else
					Message.confirmLabel("il tizio mente", false, lblRisultatoVerifica);
					*/
			}
		});
		
	}
}
