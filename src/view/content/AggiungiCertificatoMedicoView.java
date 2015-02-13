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
import ngs.controller.ErogaAbbonamentoHandler;
import ngs.persistentmodel.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AggiungiCertificatoMedicoView extends JPanel {
	private JLabel lblCognome;
	private JTextField textField;
	private JButton button;
	private JLabel lblCodiceFiscale;
	private JLabel lblNome;
	private JLabel lblCognome_1;
	private JSeparator separator;

	/**
	 * Create the panel.
	 */
	public AggiungiCertificatoMedicoView() {
		System.out.println("inizio");
		setLayout(null);
		{
			lblCognome = new JLabel("cognome");
			lblCognome.setBounds(55, 54, 72, 14);
			add(lblCognome);
		}
		{
			textField = new JTextField();
			textField.setBounds(162, 51, 86, 20);
			add(textField);
			textField.setColumns(10);
		}
		{
			button = new JButton("");
			ascoltatoreFiltraClientiCognome();
			button.setIcon(new ImageIcon(AggiungiCertificatoMedicoView.class.getResource("/view/img/lente.png")));
			button.setBounds(267, 50, 20, 20);
			add(button);
		}
		{
			lblCodiceFiscale = new JLabel("CODICE FISCALE");
			lblCodiceFiscale.setBounds(55, 139, 97, 14);
			add(lblCodiceFiscale);
		}
		{
			lblNome = new JLabel("NOME");
			lblNome.setBounds(255, 139, 46, 14);
			add(lblNome);
		}
		{
			lblCognome_1 = new JLabel("COGNOME");
			lblCognome_1.setBounds(455, 139, 86, 14);
			add(lblCognome_1);
		}
		{
			separator = new JSeparator();
			separator.setBounds(55, 164, 500, 3);
			add(separator);
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
				removeAll();
				repaint();
				{
					lblCognome = new JLabel("cognome");
					lblCognome.setBounds(55, 54, 72, 14);
					add(lblCognome);
				}
				{
					textField = new JTextField();
					textField.setBounds(162, 51, 86, 20);
					add(textField);
					textField.setColumns(10);
				}
				{
					button = new JButton("");
					ascoltatoreFiltraClientiCognome();
					button.setIcon(new ImageIcon(AggiungiCertificatoMedicoView.class.getResource("/view/img/lente.png")));
					button.setBounds(267, 50, 20, 20);
					add(button);
				}
				{
					JButton buttonRicarica = new JButton("ricarica");
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
					buttonRicarica.setBounds(300, 50, 100, 20);
					add(buttonRicarica);
				}
				{
					lblCodiceFiscale = new JLabel("CODICE FISCALE");
					lblCodiceFiscale.setBounds(55, 139, 97, 14);
					add(lblCodiceFiscale);
				}
				{
					lblNome = new JLabel("NOME");
					lblNome.setBounds(255, 139, 46, 14);
					add(lblNome);
				}
				{
					lblCognome_1 = new JLabel("COGNOME");
					lblCognome_1.setBounds(455, 139, 86, 14);
					add(lblCognome_1);
				}
				{
					separator = new JSeparator();
					separator.setBounds(55, 164, 500, 3);
					add(separator);
				}
				HashMap<Integer,JLabel> map = new HashMap<Integer,JLabel>();
				
				int x=55;
				int y=150;
				int b=0;
				ArrayList<Cliente> elencoClientiFiltro= ErogaAbbonamentoHandler.getInstance().filtraClienti(cognome);
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
						b=y+20;
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
								DialogInserimentoCertificatoView dicv=new DialogInserimentoCertificatoView(codFisc);
								
								
							}
						});
						bottone.setBounds(x, b, 200, 20);
						add(bottone);
						
						map.put(b,label1);
						
						y=y+50;
						x=55;
					
					
				}
				
			}
		});
		
	}

	private void stampaElencoClienti() {
		System.out.println("ciao");
		HashMap<Integer,JLabel> map = new HashMap<Integer,JLabel>();
		
		int x=55;
		int y=150;
		int b=0;
		Cliente[] elencoClienti= ErogaAbbonamentoHandler.getInstance().getElencoClienti();
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
				b=y+20;
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
						DialogInserimentoCertificatoView dicv=new DialogInserimentoCertificatoView(codFisc);
						
						
					}
				});
				bottone.setBounds(x, b, 200, 20);
				add(bottone);
				
				map.put(b,label1);
				
				y=y+50;
				x=55;
			
			
		}
		
		
		
	}
}
