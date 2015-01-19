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

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.SwingConstants;

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
			label.setBounds(193, 153, 421, 14);
			add(label);
		}
		
	}
	
	public void errorMessage(String titolo, String messaggio)
	{																																			
		JOptionPane.showMessageDialog(null,messaggio,titolo,JOptionPane.ERROR_MESSAGE,new ImageIcon(ImpostaTipologiaCorsoView.class.getResource("/view/img/statusDialog/small/erroreBox.png")));
	}
	
	public void noConnectionDBMessage(String titolo, String messaggio)
	{
		JOptionPane.showMessageDialog(null,messaggio,titolo,JOptionPane.ERROR_MESSAGE,new ImageIcon(ImpostaTipologiaCorsoView.class.getResource("/view/img/statusDialog/small/transito.png")));
	}
	
	public int questionConfirmMessage(String titolo, String messaggio)
	{
		return JOptionPane.showConfirmDialog(null,messaggio,titolo,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,new ImageIcon(ImpostaTipologiaCorsoView.class.getResource("/view/img/statusDialog/small/domanda.png")));
	}
	
	/*
	 * messaggio in label
	 * @param messaggio stringa
	 * @tipoMessaggio bool: true, messaggio verde : false, messaggio rosso
	 */
	public void confirmLabel(String messaggio, boolean tipoMessaggio)
	{
		label.setText(messaggio);
		if(tipoMessaggio)
			{
				label.setForeground(new Color(0, 153, 0));
			}
			else 
			{
				label.setForeground(Color.RED);
			}		
	}
	
	public void inviaTipologiaCorso(String nomeTip) throws PersistentException
	{
		if(ConfAbbCorsiHandler.getInstance().impostaTipologiaCorso(nomeTip)==true)
			confirmLabel("TIPOLOGIA INSERITA CORRETTAMENTE",true);
		else
			noConnectionDBMessage("Errore connessione", "Connessione al database non riuscita");
	}
	
	public boolean checkExistNomeTipologiaCorso() throws PersistentException
	{
		return ConfAbbCorsiHandler.getInstance().verificaNomeTipologiaCorso(textField.getText());
	}
	
	public void ascoltatoreInserisciTipologia()
	{
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nomeTip = textField.getText();
				if(nomeTip.length()==0) errorMessage("ERRORE", "Inserire una tipologia");
				else{
					try {
							label.setText("");
							boolean aux;
							aux=checkExistNomeTipologiaCorso();
							if(aux==true)
							{
								String riepilogo="Confermare la creazione della tipologia corso?\n   NOME TIPOLOGIA: "+textField.getText()+"\n\n";
								int risposta=questionConfirmMessage("CONFERMA",riepilogo);
								if(risposta==JOptionPane.YES_OPTION) 
								{
									inviaTipologiaCorso(nomeTip);
								}
							}
							else
							{
								//System.out.println("errore");
								errorMessage("ERRORE","La tipologia scelta � gi� stata inserita");
								
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

