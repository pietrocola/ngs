package view.content;
//commento prova
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.orm.PersistentException;

import ngs.controller.ConfAbbCorsiHandler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class ImpostaTipologiaCorso extends JPanel {
	private JLabel lblNomeTipologia;
	private JTextField textField;
	private JButton btnSalva;

	/**
	 * Create the panel.
	 */
	public ImpostaTipologiaCorso() {
		setLayout(null);
		{
			lblNomeTipologia = new JLabel("nome tipologia");
			lblNomeTipologia.setBounds(40, 53, 97, 14);
			add(lblNomeTipologia);
		}
		{
			textField = new JTextField();
			textField.setBounds(163, 50, 126, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			btnSalva = new JButton("salva");
			btnSalva.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nomeTip = textField.getText();
					try {
						
						
						
						ConfAbbCorsiHandler.getInstance().verificaNomeTipologiaCorso(textField.getText());
						
						
						
					} catch (PersistentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			btnSalva.setBounds(163, 96, 89, 23);
			add(btnSalva);
		}

	}
}
/*
if(ConfAbbCorsiHandler.getInstance().verificaNomeTipologiaCorso(textField.getText())==false)
{
	label.setText("errore");
}
else{}
*/