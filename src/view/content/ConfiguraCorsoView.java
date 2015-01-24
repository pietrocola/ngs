package view.content;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JTextField;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.persistentmodel.TipologiaCorsoDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Color;
import javax.swing.JDialog;
import java.awt.Window.Type;
import java.awt.Font;

import view.utility.Message;

public class ConfiguraCorsoView extends JPanel {
	private JLabel lblNomeCorso;
	private JLabel lblTipologia;
	private JComboBox comboBox;
	private JLabel lblPrenotazione;
	private JComboBox comboBox_1;
	private JButton btnSalva;
	private JTextField textField;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public ConfiguraCorsoView() {
		setLayout(null);
		{
			lblNomeCorso = new JLabel("nome corso");
			lblNomeCorso.setBounds(40, 55, 89, 14);
			add(lblNomeCorso);
		}
		{
			lblTipologia = new JLabel("tipologia");
			lblTipologia.setBounds(40, 99, 78, 14);
			add(lblTipologia);
		}
		{
			comboBox = new JComboBox();
			ascoltatoreGetTipologie();
			comboBox.setBounds(193, 96, 102, 20);
			
			add(comboBox);
		}
		{
			lblPrenotazione = new JLabel("prenotazione");
			lblPrenotazione.setBounds(40, 139, 89, 14);
			add(lblPrenotazione);
		}
		{
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(193, 136, 52, 20);
			comboBox_1.addItem("si");
			comboBox_1.addItem("no");
			add(comboBox_1);
		}
		{
			btnSalva = new JButton("salva");
			ascoltatoreSalvaCorso();
			btnSalva.setBounds(193, 181, 89, 23);
			add(btnSalva);
		}
		{
			textField = new JTextField();
			textField.setBounds(193, 52, 86, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			label = new JLabel("");
			label.setFont(new Font("Tahoma", Font.BOLD, 15));
			label.setForeground(new Color(0, 128, 0));
			label.setBounds(193, 242, 338, 14);
			add(label);
		}
		
		
	}
	
	private void ascoltatoreSalvaCorso() 
	{
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				label.setText("");
				String nomeCorso=textField.getText();
				String nomeTipologia=(String) comboBox.getSelectedItem();
				Boolean aux;
				String prenotazione=(String) comboBox_1.getSelectedItem();
			    if(prenotazione=="si") aux=true; else aux=false;
			     
			    if(nomeCorso.length()==0 || comboBox.getItemCount()==0)
			    	Message.errorMessage("ERRORE", "Compilare tutti i campi");
			    else
			    {
			    
				    boolean aux1;
					aux1=ConfAbbCorsiHandler.getInstance().verificaNomeDescrizioneCorso(nomeCorso);
					
					if(aux1==true)
					{
						String riepilogo="Confermare la creazione del corso?\n   NOME: "+nomeCorso+"\n   TIPOLOGIA: "+nomeTipologia+"\n   PRENOTAZIONE: "+prenotazione+"\n\n";
						int risposta = Message.questionConfirmMessage("CONFERMA", riepilogo);
						if(risposta==JOptionPane.YES_OPTION) 
						{
							if(ConfAbbCorsiHandler.getInstance().configuraCorso(nomeCorso,aux,nomeTipologia)==true)
							{									
								Message.confirmLabel("CORSO INSERITO CORRETTAMENTE", true, label);
																   
							}
							else
								Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
								
						}
						else if(risposta==JOptionPane.NO_OPTION){}							
					}
					else
					{
						Message.errorMessage("ERRORE", "Il nome del corso scelto è già stato inserito");
					}
				
			    }	
					
				
				
			}
		});
		
	}
	public void ascoltatoreGetTipologie()
	{
		comboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				//if(ConfAbbCorsiHandler.getInstance().getNomiTipologie()==null)
					//System.out.println(ConfAbbCorsiHandler.getInstance().getNomiTipologie());
			
				if(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)==null){
					comboBox.setEnabled(false);
					Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");						
					comboBox.setEnabled(true);
				}
				else
				{
				
				ArrayList<String> nomiTip = ConfAbbCorsiHandler.getInstance().getNomiTipologie();
				if(nomiTip.size()==0){
					//System.out.println(nomiTip.size());
					comboBox.setEnabled(false);
					Message.errorMessage("ERRORE","Nessuna tipologia corso presente");						
				}
				else{
					DefaultComboBoxModel dcbm=new DefaultComboBoxModel();
					for(String s : ConfAbbCorsiHandler.getInstance().getNomiTipologie()){
						dcbm.addElement(s);
					    comboBox.setModel(dcbm);
				   }
				}
				}
			}
		});
	}
}

