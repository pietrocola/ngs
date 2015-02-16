package view.content;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import view.utility.Message;
import ngs.controller.ConfAbbCorsiHandler;
import ngs.controller.ErogaAbbonamentoHandler;
import ngs.persistentmodel.CategoriaCliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;

public class VerificaCategoriaClienteView extends JPanel {
	private JLabel lblCodice;
	private JTextField textField;
	private JButton btnVerifica;
	private JLabel lblRisultatoVerifica;
	private JComboBox comboBox;
	private JLabel lblCategoria;

	/**
	 * Create the panel.
	 */
	public VerificaCategoriaClienteView() {
		setLayout(null);
		{
			lblCodice = new JLabel("codice");
			lblCodice.setBounds(42, 97, 68, 14);
			add(lblCodice);
		}
		{
			textField = new JTextField();
			textField.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					lblRisultatoVerifica.setText("");
				}
			});
			textField.setBounds(185, 94, 109, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			btnVerifica = new JButton("verifica");
			ascoltatoreBottoneVerifica();
			btnVerifica.setBounds(185, 150, 89, 23);
			add(btnVerifica);
		}
		{
			lblRisultatoVerifica = new JLabel("");
			lblRisultatoVerifica.setBounds(333, 154, 400, 14);
			add(lblRisultatoVerifica);
		}
		{
			comboBox = new JComboBox();
			ascoltatoreListaCategorieClienti();
			comboBox.setBounds(185, 35, 134, 20);
			add(comboBox);
		}
		{
			lblCategoria = new JLabel("categoria");
			lblCategoria.setBounds(42, 38, 81, 14);
			add(lblCategoria);
		}

	}

	
	
  private void ascoltatoreListaCategorieClienti() 
	{
		comboBox.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
				textField.setText("");
				lblRisultatoVerifica.setText("");
				ArrayList<CategoriaCliente> cc=ConfAbbCorsiHandler.getInstance().getCategorieClienti();
				if(cc.size()==0){
					comboBox.setEnabled(false);
					Message.errorMessage("ERRORE", "Nessuna categoria cliente presente");
					btnVerifica.setEnabled(false);
				}
				else{
					DefaultComboBoxModel dcbm=new DefaultComboBoxModel();
					for(CategoriaCliente cat:cc){
						if(cat.getNomeCat().equals("univ") || cat.getNomeCat().equals("dipendente alenia")){
							dcbm.addElement(cat);
							comboBox.setModel(dcbm);
						}
					}
						
				}
				
			}
		});
		
	}
	
	
	
	
	private void ascoltatoreBottoneVerifica() {
		btnVerifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CategoriaCliente cat=(CategoriaCliente) comboBox.getSelectedItem();
				String codice=textField.getText();
				
				if(codice.trim().length()==0 || comboBox.getItemCount()==0)
					Message.errorMessage("ERRORE", "Inserire tutti i campi");
				else{
					Boolean aux=ErogaAbbonamentoHandler.getInstance().verificaCategoriaCliente(cat,codice);
					if(aux==true)
						Message.confirmLabel("Verifica ok", true, lblRisultatoVerifica);
					else
						Message.confirmLabel("il tizio mente", false, lblRisultatoVerifica);
				}
			}
		});
		
	}
}
