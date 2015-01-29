package view.content;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.utility.Message;
import ngs.controller.ConfAbbCorsiHandler;
import ngs.model.M_CategoriaCliente;
import ngs.persistentmodel.CategoriaCliente;

import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImpostaPoliticaScontoPercentualeView extends JPanel {
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblNomePolitcaSconto;
	private JTextField textField;
	private JLabel lblScontoMese;
	private JTextField textField_1;
	private JLabel lblScontoMesi;
	private JTextField textField_2;
	private JButton btnSalva;
	private JLabel label;

	/**
	 * Create the panel.
	 */
	public ImpostaPoliticaScontoPercentualeView() {
		setLayout(null);
		setSize(800, 600);
		{
			lblNewLabel = new JLabel("categoria cliente");
			lblNewLabel.setBounds(40, 55, 101, 14);
			add(lblNewLabel);
		}
		{
			comboBox = new JComboBox();
			comboBox.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					
					label.setText("");
					ArrayList<CategoriaCliente> cc=ConfAbbCorsiHandler.getInstance().getCategorieClienti();
					if(cc.size()==0){
						comboBox.setEnabled(false);
						Message.errorMessage("ERRORE", "Nessuna categoria cliente presente");
						btnSalva.setEnabled(false);
					}
					else{
						DefaultComboBoxModel dcbm=new DefaultComboBoxModel();
						for(CategoriaCliente cat:cc){
							dcbm.addElement(cat.getNomeCat());
							comboBox.setModel(dcbm);
						}
							
					}
					
				}
			});
			comboBox.setBounds(189, 52, 108, 20);
			add(comboBox);
		}
		{
			lblNomePolitcaSconto = new JLabel("nome politca sconto");
			lblNomePolitcaSconto.setBounds(40, 117, 139, 14);
			add(lblNomePolitcaSconto);
		}
		{
			textField = new JTextField();
			resetLabelConfermaInserimento( textField);
			textField.setBounds(189, 114, 108, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			lblScontoMese = new JLabel("durata mensile");
			lblScontoMese.setBounds(40, 170, 108, 14);
			add(lblScontoMese);
		}
		{
			textField_1 = new JTextField("");
			resetLabelConfermaInserimento( textField_1);
			textField_1.setBounds(189, 167, 58, 20);
			add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblScontoMesi = new JLabel("sconto (%)");
			lblScontoMesi.setBounds(40, 220, 101, 14);
			add(lblScontoMesi);
		}
		{
			textField_2 = new JTextField("0");
			resetLabelConfermaInserimento( textField_2);
			textField_2.setBounds(189, 217, 58, 20);
			add(textField_2);
			textField_2.setColumns(10);
		}
		{
			btnSalva = new JButton("salva");
			ascoltatoreSalvaScontoPercentuale();
			btnSalva.setBounds(189, 271, 89, 23);
			add(btnSalva);
		}
		{
			label = new JLabel("");
			label.setBounds(189, 331, 400, 14);
			label.setFont(new Font("Thaoma",Font.BOLD,15));
			add(label);
		}

	}
	
	
	public void ascoltatoreSalvaScontoPercentuale()
	{
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				label.setText("");
				
				String nomeCategoria= (String) comboBox.getSelectedItem();
				M_CategoriaCliente c=new M_CategoriaCliente();
				CategoriaCliente categoria=c.getCategoriaCliente(nomeCategoria);
				//System.out.println("ciao");
				String nomePolitica=textField.getText();
				
				String numeroMesi=textField_1.getText();
				String scontoPercentuale=textField_2.getText();

				

				
			    if(nomePolitica.length()==0 || comboBox.getItemCount()==0 || numeroMesi.length()==0 || scontoPercentuale.length()==0)
			    	Message.errorMessage("ERRORE", "Compilare tutti i campi");
			    else
			    {
			    
					int numMesi=Integer.parseInt(numeroMesi);
					float scontoPerc=Float.parseFloat(scontoPercentuale);
		
			    	
			    	boolean aux1;
					aux1=ConfAbbCorsiHandler.getInstance().verificaNomePoliticaScontoPercentuale(nomePolitica);
					
					if(aux1==true)
					{
						String riepilogo="Confermare la creazione dello sconto percentuale?\n   NOME: "+nomePolitica+"\n   CATEGORIA CLIENTE: "+categoria.getNomeCat()+"\n   DURATA MENSILE: "+numMesi+"\n   SCONTO PERCENTUALE: "+scontoPerc+"%\n\n";
						int risposta = Message.questionConfirmMessage("CONFERMA", riepilogo);
						if(risposta==JOptionPane.YES_OPTION) 
						{
							if(ConfAbbCorsiHandler.getInstance().impostaPoliticaScontoPercentuale(categoria,nomePolitica,numMesi,scontoPerc)==true)
							{									
								Message.confirmLabel("POLITICA INSERITA CORRETTAMENTE", true, label);
																   
							}
							else{}
								//Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
								
						}
						else if(risposta==JOptionPane.NO_OPTION){}							
					}
					else
					{
						Message.errorMessage("ERRORE", "Il nome della politica scelto è già stato inserito");
					}
				
			    }	
					
				
				
			}
			
		});
	}
	

/**
 * cancella il contenuto della label di conferma inserimento 	
 * @param tf
 */
	
public void resetLabelConfermaInserimento(JTextField tf){
		tf.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				
				label.setText("");
			}
		});
	}

}
