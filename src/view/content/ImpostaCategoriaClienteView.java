package view.content;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import ngs.controller.ConfAbbCorsiHandler;

import org.orm.PersistentException;

import view.utility.Message;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class ImpostaCategoriaClienteView extends JPanel {
	private JLabel labelCategoria;
	private JTextField textField;
	private JButton btnSalva;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public ImpostaCategoriaClienteView() {
		setLayout(null);
		{
			labelCategoria = new JLabel("nome categoria");
			labelCategoria.setBounds(40, 55, 121, 14);
			add(labelCategoria);
		}
		{
			textField = new JTextField();
			textField.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					label.setText("");
				}
			});
			textField.setBounds(193, 52, 121, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			btnSalva = new JButton("salva");
			ascoltatoreInserisciCategoriaCliente();
			btnSalva.setBounds(193, 100, 89, 23);
			add(btnSalva);
		}
		{
			label = new JLabel("");
			label.setFont(new Font("Tahoma", Font.BOLD, 15));
			label.setBounds(329, 104, 383, 14);
			add(label);
		}

	}
	
	
	
	
	public void ascoltatoreInserisciCategoriaCliente()
	{
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nomeCat = textField.getText();
				if(nomeCat.length()==0) Message.errorMessage("ERRORE", "Inserire una categoria");
				else{
					label.setText("");
					boolean aux;
					aux=ConfAbbCorsiHandler.getInstance().verificaNomeCategoriaCliente(textField.getText());
					if(aux==true)
					{
						String riepilogo="Confermare la creazione della categoria cliente?\n   NOME CATEGORIA: "+textField.getText()+"\n\n";
						int risposta=Message.questionConfirmMessage("CONFERMA",riepilogo);
						if(risposta==JOptionPane.YES_OPTION) 
						{
							if(ConfAbbCorsiHandler.getInstance().impostaCategoriaCliente(nomeCat)==true)
								Message.confirmLabel("CATEGORIA INSERITA CORRETTAMENTE",true,label);
							else{}
								//Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
						}
					}
					else
					{
						//System.out.println("errore");
						Message.errorMessage("ERRORE","La categoria scelta è già stata inserita");
						
					}
				}
			}
			
		});
	}
}
