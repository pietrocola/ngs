package view.content;

import java.awt.BorderLayout;
import java.awt.Dialog;
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
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class DialogInserimentoCertificatoView extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JLabel labelConferma;
	JButton btnInserisci;
	private JLabel labelErrore;

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
		setResizable(false);
		setTitle("Inserimento data scadenza certificato");
		setIconImage(Toolkit.getDefaultToolkit().getImage(DialogInserimentoCertificatoView.class.getResource("/view/img/cuore 1.png")));
		//setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
		
		//setVisible(true);
		//setModal(true);
		setBounds(100, 100, 400, 205);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblDataScadenza = new JLabel("data scadenza");
			lblDataScadenza.setBounds(38, 43, 94, 14);
			contentPanel.add(lblDataScadenza);
		}
		{
			labelConferma = new JLabel("");
			labelConferma.setBounds(174, 129, 204, 14);
			contentPanel.add(labelConferma);
		}
		{
			labelErrore = new JLabel("");
			labelErrore.setBounds(174, 129, 191, 14);
			contentPanel.add(labelErrore);
		}
		{
			textField = new JTextField();
			textField.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					labelErrore.setText("");
				}
			});
			/*
			textField.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					labelConferma.setText("");
				}
			});
			*/
			textField.setBounds(174, 40, 107, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			btnInserisci = new JButton("inserisci");
			btnInserisci.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String d=textField.getText();
					if(d.length()==0)
						Message.confirmLabel("Inserire la data", false, labelErrore);
					else{
						SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy");
						Date dataScadenza = null;
						try {
							dataScadenza = sdf.parse(d);
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						Boolean aux=ErogaAbbonamentoHandler.getInstance().associaCertificatoMedicoCliente(dataScadenza, codFisc);
						if(aux==true){
							
							Message.confirmLabel("Certificato inserito", true, labelConferma); // non funzionaaa
							btnInserisci.setEnabled(false);
							textField.setEnabled(false);
						}
						
						}
					}
			});
			btnInserisci.setBounds(174, 85, 89, 23);
			contentPanel.add(btnInserisci);
		}


	}
}
