package view.content;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.orm.PersistentException;

import view.utility.Message;
import ngs.controller.ConfAbbCorsiHandler;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.border.LineBorder;

import java.awt.Font;

import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ImpostaTipologiaCorsoView extends JPanel {
	private JLabel lblNomeTipologia;
	private JTextField textField;
	private JButton btnSalva;
	private JLabel label;
	private JOptionPane optionPane;

	/**
	 * Create the panel.
	 */
	public ImpostaTipologiaCorsoView() {
		setForeground(Color.GREEN);
		setLayout(null);
		{
			lblNomeTipologia = new JLabel("nome tipologia");
			lblNomeTipologia.setBounds(40, 55, 97, 14);
			add(lblNomeTipologia);
		}
		{
			textField = new JTextField();
			textField.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					label.setText("");
				}
			});
			textField.setBounds(193, 52, 126, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			btnSalva = new JButton("salva");
			ascoltatoreInserisciTipologia();
			btnSalva.setBounds(193, 100, 89, 23);
			add(btnSalva);
		}
		{
			label = new JLabel("");
			label.setFont(new Font("Tahoma", Font.BOLD, 15));
			label.setBounds(325, 104, 421, 14);
			add(label);
		}
		
	}

	public void ascoltatoreInserisciTipologia()
	{
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeTip = textField.getText();
				if(nomeTip.trim().length()==0) Message.errorMessage("ERRORE", "Inserire una tipologia");
				else{
					try {
							label.setText("");
							boolean aux;
							aux=ConfAbbCorsiHandler.getInstance().verificaNomeTipologiaCorso(textField.getText());
							if(aux==true)
							{
								String riepilogo="Confermare la creazione della tipologia corso?\n   NOME TIPOLOGIA: "+textField.getText()+"\n\n";
								int risposta=Message.questionConfirmMessage("CONFERMA",riepilogo);
								if(risposta==JOptionPane.YES_OPTION) 
								{
									if(ConfAbbCorsiHandler.getInstance().impostaTipologiaCorso(nomeTip)==true)
										Message.confirmLabel("TIPOLOGIA INSERITA CORRETTAMENTE",true,label);
									else
									{
										//Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");										
									}
										
								}
							}
							else
							{
								//System.out.println("errore");
								Message.errorMessage("ERRORE","La tipologia scelta è già stata inserita");
								
							}						
					} catch (PersistentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
	}
}

