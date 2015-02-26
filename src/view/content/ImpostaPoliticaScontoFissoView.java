package view.content;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.model.M_CategoriaCliente;
import ngs.persistentmodel.CategoriaCliente;
import view.utility.Message;
import view.utility.decorator.Pannello;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

public class ImpostaPoliticaScontoFissoView extends Pannello {
	private JLabel lblNewLabel;
	private JComboBox comboBox;
	private JLabel lblNomePoliticaSconto;
	private JTextField textField;
	private JLabel lblDurataMensile;
	private JTextField textField_1;
	private JLabel lblSconto;
	private JTextField textField_2;
	private JButton btnSalva;
	private JLabel lblConfermaSalvataggio;

	
	
	public ImpostaPoliticaScontoFissoView(Boolean aux) {
		
	}
	
	
	/**
	 * Create the panel.
	 */
	public ImpostaPoliticaScontoFissoView() {
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screen.width-WIDTH);
        int y = (screen.height-HEIGHT);
		//System.out.println(x+"x"+y);
		setPreferredSize(new Dimension(x,y));
		
		setLayout(null);
		{
			lblNewLabel = new JLabel("categoria cliente");
			lblNewLabel.setBounds(40, 55, 114, 14);
			add(lblNewLabel);
		}
		{
			comboBox = new JComboBox();
			ascoltatoreListaCategorieClienti();
			comboBox.setBounds(200, 52, 146, 20);
			add(comboBox);
		}
		{
			lblNomePoliticaSconto = new JLabel("nome politica sconto");
			lblNomePoliticaSconto.setBounds(40, 107, 125, 14);
			add(lblNomePoliticaSconto);
		}
		{
			textField = new JTextField();
			textField.setBounds(200, 104, 114, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			lblDurataMensile = new JLabel("durata mensile");
			lblDurataMensile.setBounds(40, 162, 100, 14);
			add(lblDurataMensile);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(200, 159, 65, 20);
			add(textField_1);
			textField_1.setColumns(10);
		}
		{
			lblSconto = new JLabel("sconto (\u20AC)");
			lblSconto.setBounds(40, 217, 65, 14);
			add(lblSconto);
		}
		{
			textField_2 = new JTextField();
			textField_2.setText("0");
			textField_2.setBounds(200, 214, 65, 20);
			add(textField_2);
			textField_2.setColumns(10);
		}
		{
			btnSalva = new JButton("salva");
			ascoltatoreSalvaScontoFisso();
			btnSalva.setBounds(200, 266, 89, 23);
			add(btnSalva);
		}
		{
			lblConfermaSalvataggio = new JLabel("");
			lblConfermaSalvataggio.setBounds(339, 270, 400, 14);
			add(lblConfermaSalvataggio);
		}

	}
	
	
	
	
	private void ascoltatoreListaCategorieClienti() 
	{
		comboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				
				lblConfermaSalvataggio.setText("");
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
		
	}
	
	
	
	
	
	
	public void ascoltatoreSalvaScontoFisso()
	{
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblConfermaSalvataggio.setText("");
				
				String nomeCategoria= (String) comboBox.getSelectedItem();
				M_CategoriaCliente c=new M_CategoriaCliente();
				CategoriaCliente categoria=c.getCategoriaCliente(nomeCategoria);
				//System.out.println("ciao");
				String nomePolitica=textField.getText();
				
				String numeroMesi=textField_1.getText();
				String scontoFisso=textField_2.getText();

				

				
			    if(nomePolitica.trim().length()==0 || comboBox.getItemCount()==0 || numeroMesi.trim().length()==0 || scontoFisso.trim().length()==0)
			    	Message.errorMessage("ERRORE", "Compilare tutti i campi");
			    else
			    {
			    
					int numMesi=Integer.parseInt(numeroMesi);
					float scontoFis=Float.parseFloat(scontoFisso);
		
					
					boolean aux1;
					aux1=ConfAbbCorsiHandler.getInstance().verificaNomePoliticaScontoFisso(nomePolitica);
					
					boolean aux2;
					aux2=ConfAbbCorsiHandler.getInstance().verificaCatClienteNumMesiScontoFisso(categoria,numMesi);
					
					if(aux1==true && aux2==true)
					{
						String riepilogo="Confermare la creazione dello sconto fisso?\n   NOME: "+nomePolitica+"\n   CATEGORIA CLIENTE: "+categoria.getNomeCat()+"\n   NUMERO MESI: "+numMesi+"\n   SCONTO FISSO: "+scontoFis+" €\n\n";
						int risposta = Message.questionConfirmMessage("CONFERMA", riepilogo);
						if(risposta==JOptionPane.YES_OPTION) 
						{
							if(ConfAbbCorsiHandler.getInstance().impostaPoliticaScontoFisso(categoria,nomePolitica,numMesi,scontoFis)==true)
							{									
								Message.confirmLabel("POLITICA INSERITA CORRETTAMENTE", true, lblConfermaSalvataggio);
																   
							}
							else{}
								//Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
								
						}
						else if(risposta==JOptionPane.NO_OPTION){}							
					}
					else
					{
						if(aux1==false && aux2==true || (aux1==false && aux2==false))
						    Message.errorMessage("ERRORE", "Il nome della politica scelto è già stato inserito");
						else
							if(aux1==true && aux2==false)
								Message.errorMessage("ERRORE", "E' già stato inserito uno sconto per la categoria cliente e il numero mesi scelti");
							
					}
				
			    }	
					
				
				
			}
			
		});
	}




	@Override
	public Pannello draw() {
		return new ImpostaPoliticaScontoFissoView();
	}




	@Override
	public Pannello drawEmpty() {
		return new ImpostaPoliticaScontoFissoView(true);
	}
	
	
	
	
	
	
	
}
