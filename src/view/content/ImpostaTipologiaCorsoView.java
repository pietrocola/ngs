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
			btnSalva.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String nomeTip = textField.getText();
					if(nomeTip.length()==0) JOptionPane.showMessageDialog(null,"Inserire una tipologia","ERRORE",JOptionPane.ERROR_MESSAGE,new ImageIcon(ImpostaTipologiaCorsoView.class.getResource("/view/img/errore.png")));
					else{
					try {
						label.setText("");
						boolean aux;
						aux=ConfAbbCorsiHandler.getInstance().verificaNomeTipologiaCorso(textField.getText());
						if(aux==true)
						{
							String riepilogo="Confermare la creazione della tipologia corso?\n   NOME TIPOLOGIA: "+textField.getText()+"\n\n";
							int risposta=JOptionPane.showConfirmDialog(null,riepilogo,"CONFERMA",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
							if(risposta==JOptionPane.YES_OPTION) {
								if(ConfAbbCorsiHandler.getInstance().impostaTipologiaCorso(nomeTip)==true)
									label.setText("TIPOLOGIA INSERITA CORRETTAMENTE");
							else
								JOptionPane.showMessageDialog(null,"Connessione al database non riuscita","ERRORE",JOptionPane.ERROR_MESSAGE,new ImageIcon(ImpostaTipologiaCorsoView.class.getResource("/view/img/errore.png")));
							}
						}
						else
						{
							//System.out.println("errore");
							JOptionPane.showMessageDialog(null,"La tipologia scelta è già stata inserita","ERRORE",JOptionPane.ERROR_MESSAGE,new ImageIcon(ImpostaTipologiaCorsoView.class.getResource("/view/img/errore.png")));
						}
						
						
					} catch (PersistentException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					}
				}
			});
			btnSalva.setBounds(193, 100, 89, 23);
			add(btnSalva);
		}
		{
			label = new JLabel("");
			label.setFont(new Font("Tahoma", Font.BOLD, 15));
			label.setForeground(new Color(0, 128, 0));
			label.setBounds(193, 153, 421, 14);
			add(label);
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