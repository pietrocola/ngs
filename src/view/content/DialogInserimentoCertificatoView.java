package view.content;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import view.utility.Message;
import ngs.controller.ErogaAbbonamentoHandler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DialogInserimentoCertificatoView extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel labelConferma;

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		try {
			DialogInserimentoCertificatoView dialog = new DialogInserimentoCertificatoView();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
*/
	/**
	 * Create the dialog.
	 * @param applicationModal 
	 */
	public DialogInserimentoCertificatoView(String codFisc) {
		setVisible(true);
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDataScadenza = new JLabel("data scadenza");
			lblDataScadenza.setBounds(67, 72, 94, 14);
			contentPanel.add(lblDataScadenza);
		}
		{
			labelConferma = new JLabel("");
			labelConferma.setBounds(220, 186, 204, 14);
			contentPanel.add(labelConferma);
		}
		{
			textField = new JTextField();
			textField.setBounds(220, 69, 107, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JButton btnInserisci = new JButton("inserisci");
			btnInserisci.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String d=textField.getText();
					SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy");
					Date dataScadenza = null;
					try {
						dataScadenza = sdf.parse(d);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Boolean aux=ErogaAbbonamentoHandler.getInstance().associaCertificatoMedicoCliente(dataScadenza, codFisc);
					if(aux==true)
						Message.confirmLabel("Certificato inserito", true, labelConferma);
				}
			});
			btnInserisci.setBounds(220, 125, 89, 23);
			contentPanel.add(btnInserisci);
		}

	}





}
