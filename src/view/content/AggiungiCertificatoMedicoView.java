package view.content;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;

import view.InterfacciaSegretaria;
import view.utility.Message;
import ngs.controller.ErogaAbbonamentoHandler;
import ngs.persistentmodel.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class AggiungiCertificatoMedicoView extends JPanel {
	private JLabel lblCognome;
	private JTextField textField;
	private JButton button;
	private JLabel lblCodiceFiscale;
	private JLabel lblNome;
	private JLabel lblCognome_1;
	private JSeparator separator;
	private JLabel labelNoClienti;
	JLabel labelNoClientiFiltro;
	JButton buttonRicarica;

	/**
	 * Create the panel.
	 */
	public AggiungiCertificatoMedicoView() {
		
		setLayout(null);
		{
			lblCognome = new JLabel("cognome");
			lblCognome.setBounds(55, 54, 72, 14);
			add(lblCognome);
		}
		{
			textField = new JTextField();
			textField.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent arg0) {
					labelNoClienti.setText("");
				}
			});
			textField.setBounds(137, 51, 102, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			button = new JButton("");
			button.setBackground(SystemColor.control);
			button.setBorderPainted(false);
			ascoltatoreFiltraClientiCognome();
			button.setIcon(new ImageIcon(AggiungiCertificatoMedicoView.class.getResource("/view/img/lente.png")));
			button.setBounds(243, 51, 20, 20);
			add(button);
		}
		{
			lblCodiceFiscale = new JLabel("CODICE FISCALE");
			lblCodiceFiscale.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblCodiceFiscale.setBounds(55, 150, 123, 20);
			add(lblCodiceFiscale);
		}
		{
			lblNome = new JLabel("NOME");
			lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblNome.setBounds(255, 150, 46, 20);
			add(lblNome);
		}
		{
			lblCognome_1 = new JLabel("COGNOME");
			lblCognome_1.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblCognome_1.setBounds(455, 150, 86, 20);
			add(lblCognome_1);
		}
		{
			separator = new JSeparator();
			separator.setBounds(55, 180, 745, 3);
			add(separator);
		}
		{
			labelNoClienti = new JLabel("");
			labelNoClienti.setBounds(55, 125, 307, 14);
			add(labelNoClienti);
		}
		
		{
			stampaElencoClienti();
		}
		{
			{
				Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		        int x = (screen.width-WIDTH);
		        int y = (screen.height-HEIGHT);
				//System.out.println(x+"x"+y);
			}
		}

	}

	private void ascoltatoreFiltraClientiCognome() {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cognome=textField.getText();
				if(cognome.trim().length()==0)
					Message.errorMessage("ERRORE", "Inserire un cognome");
				else{
				removeAll();
				repaint();
				{
					lblCognome = new JLabel("cognome");
					lblCognome.setBounds(55, 54, 72, 14);
					add(lblCognome);
				}
				{
					textField = new JTextField();
					textField.setText(cognome);
					textField.addFocusListener(new FocusAdapter() {
						@Override
						public void focusGained(FocusEvent arg0) {
							labelNoClientiFiltro.setText("");
						}
					});
					textField.setBounds(137, 51, 102, 20);
					add(textField);
					textField.setColumns(10);
				}
				{
					button = new JButton("");
					button.setBackground(SystemColor.control);
					button.setBorderPainted(false);
					ascoltatoreFiltraClientiCognome();
					button.setIcon(new ImageIcon(AggiungiCertificatoMedicoView.class.getResource("/view/img/lente.png")));
					button.setBounds(243, 51, 20, 20);
					add(button);
				}
				{
					buttonRicarica = new JButton("mostra tutti");
					buttonRicarica.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							InterfacciaSegretaria.segFrame.getContentPane().removeAll();
							InterfacciaSegretaria.segFrame.getContentPane().repaint();
							InterfacciaSegretaria.segFrame.getContentPane().add(InterfacciaSegretaria.toolBar, BorderLayout.NORTH);
							
							AggiungiCertificatoMedicoView acmv = new AggiungiCertificatoMedicoView();
							// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
							InterfacciaSegretaria.segFrame.getContentPane().add(acmv,	BorderLayout.CENTER);

							// internalFrame.setVisible(true);
							InterfacciaSegretaria.segFrame.getContentPane().revalidate();
							InterfacciaSegretaria.segFrame.repaint();
						}
					});
					//buttonRicarica.setIcon(new ImageIcon(AggiungiCertificatoMedicoView.class.getResource("/view/img/lente.png")));
					buttonRicarica.setBounds(300, 51, 100, 20);
					add(buttonRicarica);
				}
				{
					labelNoClientiFiltro = new JLabel("");
					labelNoClientiFiltro.setBounds(55, 125, 307, 14);
					add(labelNoClientiFiltro);
				}
				{
					lblCodiceFiscale = new JLabel("CODICE FISCALE");
					lblCodiceFiscale.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblCodiceFiscale.setBounds(55, 150, 123, 20);
					add(lblCodiceFiscale);
				}
				{
					lblNome = new JLabel("NOME");
					lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblNome.setBounds(255, 150, 46, 20);
					add(lblNome);
				}
				{
					lblCognome_1 = new JLabel("COGNOME");
					lblCognome_1.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblCognome_1.setBounds(455, 150, 86, 20);
					add(lblCognome_1);
				}
				{
					separator = new JSeparator();
					separator.setBounds(55, 180, 745, 3);
					add(separator);
				}
				HashMap<Integer,JLabel> map = new HashMap<Integer,JLabel>();
				
				int x=55;
				int y=180;
				int b=0;
				ArrayList<Cliente> elencoClientiFiltro= ErogaAbbonamentoHandler.getInstance().filtraClienti(cognome);
				
				Cliente[] elencoClienti= ErogaAbbonamentoHandler.getInstance().getElencoClienti();
				if(elencoClientiFiltro.size()==elencoClienti.length)
					buttonRicarica.setVisible(false);
				
				
				if(elencoClientiFiltro.size()==0){
					Message.confirmLabel("Nessun cliente trovato", false, labelNoClientiFiltro);

					lblCodiceFiscale.setText("");
					lblNome.setText("");
					lblCognome_1.setText("");
					separator.setVisible(false);
				}
				else{
				
					for(Cliente c:elencoClientiFiltro){
					
						JLabel label1=new JLabel();
						label1.setText(c.getCodiceFiscale());
						label1.setBounds(x, y, 200, 50);
						add(label1);
						x=x+200;
						JLabel label2=new JLabel();
						label2.setText(c.getNome());
						label2.setBounds(x, y, 200, 50);
						add(label2);
						x=x+200;
						JLabel label3=new JLabel();
						label3.setText(c.getCognome());
						label3.setBounds(x, y, 200, 50);
						add(label3);
						x=x+200;
						b=y+15;
						JButton bottone=new JButton("aggiungi certificato");
						bottone.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								int cordY=bottone.getY();
								//System.out.println(label1.getY());
								String codFisc="";
								Set<Integer> s=map.keySet();
								
								for(Integer aux:s){
									if(aux==cordY)
										codFisc=map.get(aux).getText();
								}
								
								//System.out.println(codFisc);
								if(ErogaAbbonamentoHandler.getInstance().verificaSeCertificatoPresente(codFisc)==true)
									Message.errorMessage("ERRORE", "Certificato già inserito per questo cliente");
								else{
									DialogInserimentoCertificatoView dicv=new DialogInserimentoCertificatoView(codFisc);
									//dicv.setContentPane(InterfacciaSegretaria.segFrame);
									dicv.setLocationRelativeTo(InterfacciaSegretaria.segFrame);
									dicv.setModal(true);
									dicv.setVisible(true);
								}
								
								
							}
						});
						bottone.setBounds(x, b, 145, 20);
						add(bottone);
						
						map.put(b,label1);
						
						y=y+40;
						x=55;
					
					
					}
				}
			}
			}//fine else campo text ricerca vuoto
		});
		
	}

	private void stampaElencoClienti() {
		
		HashMap<Integer,JLabel> map = new HashMap<Integer,JLabel>();
		
		int x=55;
		int y=180;
		int b=0;
		Cliente[] elencoClienti= ErogaAbbonamentoHandler.getInstance().getElencoClienti();
		
		if(elencoClienti.length==0){
			Message.confirmLabel("Nessun cliente presente", false, labelNoClienti);
			textField.setEnabled(false);
			button.setEnabled(false);
			lblCodiceFiscale.setText("");
			lblNome.setText("");
			lblCognome_1.setText("");
			separator.setVisible(false);
		}
		else{
		
			for(int j=0;j<elencoClienti.length;j++){
			
				JLabel label1=new JLabel();
				label1.setText(elencoClienti[j].getCodiceFiscale());
				label1.setBounds(x, y, 200, 50);
				add(label1);
				x=x+200;
				JLabel label2=new JLabel();
				label2.setText(elencoClienti[j].getNome());
				label2.setBounds(x, y, 200, 50);
				add(label2);
				x=x+200;
				JLabel label3=new JLabel();
				label3.setText(elencoClienti[j].getCognome());
				label3.setBounds(x, y, 200, 50);
				add(label3);
				x=x+200;
				b=y+15;
				JButton bottone=new JButton("aggiungi certificato");
				bottone.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						int cordY=bottone.getY();
						//System.out.println(label1.getY());
						String codFisc="";
						Set<Integer> s=map.keySet();
						
						for(Integer aux:s){
							if(aux==cordY)
								codFisc=map.get(aux).getText();
						}
						
						if(ErogaAbbonamentoHandler.getInstance().verificaSeCertificatoPresente(codFisc)==true)
							Message.errorMessage("ERRORE", "Certificato già inserito per questo cliente");
						else{
							DialogInserimentoCertificatoView dicv=new DialogInserimentoCertificatoView(codFisc);
							//dicv.setContentPane(InterfacciaSegretaria.segFrame);
							dicv.setLocationRelativeTo(InterfacciaSegretaria.segFrame);
							dicv.setModal(true);
							dicv.setVisible(true);
						}
						
					}
				});
				bottone.setBounds(x, b, 145, 20);
				add(bottone);
				
				map.put(b,label1);
				
				y=y+40;
				x=55;
			
			
			}
		}
		
		
		
	}
}
