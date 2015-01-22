package view.utility;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import view.content.ImpostaTipologiaCorsoView;

public class Message {
	
	public Message(){}	
	
	/*
	 * TITOLO: ERRORE
	 */
	public static void errorMessage(String titolo ,String messaggio)
	{																																			
		JOptionPane.showMessageDialog(null,messaggio,titolo,JOptionPane.ERROR_MESSAGE,new ImageIcon(ImpostaTipologiaCorsoView.class.getResource("/view/img/statusDialog/small/erroreBox.png")));
	}
	
	/*
	 * TITOLO: ERRORE CONNESSIONE
	 */
	public static void noConnectionDBMessage(String titolo, String messaggio)
	{
		JOptionPane.showMessageDialog(null,messaggio,titolo,JOptionPane.ERROR_MESSAGE,new ImageIcon(ImpostaTipologiaCorsoView.class.getResource("/view/img/statusDialog/small/transito.png")));
	}
	
	/*
	 * TITOLO: CONFERMA
	 */
	public static int questionConfirmMessage(String titolo, String messaggio)
	{
		return JOptionPane.showConfirmDialog(null,messaggio,titolo,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,new ImageIcon(ImpostaTipologiaCorsoView.class.getResource("/view/img/statusDialog/small/domanda.png")));
	}
	
	
	
	/*
	 * messaggio in label
	 * @param messaggio stringa
	 * @tipoMessaggio bool: true, messaggio verde : false, messaggio rosso
	 */
	public static void confirmLabel(String messaggio, boolean tipoMessaggio, JLabel label)
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
	
}
