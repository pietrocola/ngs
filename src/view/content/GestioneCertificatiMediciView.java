package view.content;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

import ngs.controller.ErogaAbbonamentoHandler;
import ngs.persistentmodel.CertificatoMedico;
import ngs.persistentmodel.Cliente;
import view.InterfacciaSegretaria;
import view.utility.Message;

import java.util.Date;

public class GestioneCertificatiMediciView extends JPanel {
	private JLabel lblCognome;
	private JTextField textField;
	private JButton button;
	private JLabel lblCodiceFiscale;
	private JLabel lblNome;
	private JLabel lblCognome_1;
	private JSeparator separator;
	private JLabel labelNoCertificati;
	private JLabel lblDataScadenza;
	private JLabel lblStato;
	JLabel labelNoClientiFiltro;
	JButton buttonRicarica;
	/**
	 * Create the panel.
	 */
	public GestioneCertificatiMediciView() {
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
					labelNoCertificati.setText("");
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
			ascoltatoreFiltraCertificatiCognome();
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
			lblDataScadenza = new JLabel("DATA SCADENZA");
			lblDataScadenza.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblDataScadenza.setBounds(655, 150, 150, 20);
			add(lblDataScadenza);
		}
		{
			lblStato = new JLabel("STATO");
			lblStato.setFont(new Font("Tahoma", Font.BOLD, 13));
			lblStato.setBounds(855, 150, 86, 20);
			add(lblStato);
		}
		{
			separator = new JSeparator();
			separator.setBounds(55, 180, 1000, 3);
			add(separator);
		}
		{
			labelNoCertificati = new JLabel("");
			labelNoCertificati.setBounds(55, 125, 307, 14);
			add(labelNoCertificati);
		}
		
		{
			stampaElencoClientiCertificati();
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
	
	
	
	
	
	
	
	private void ascoltatoreFiltraCertificatiCognome() {
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
					ascoltatoreFiltraCertificatiCognome();
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
							
							GestioneCertificatiMediciView acmv = new GestioneCertificatiMediciView();
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
					lblDataScadenza = new JLabel("DATA SCADENZA");
					lblDataScadenza.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblDataScadenza.setBounds(655, 150, 150, 20);
					add(lblDataScadenza);
				}
				{
					lblStato = new JLabel("STATO");
					lblStato.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblStato.setBounds(855, 150, 86, 20);
					add(lblStato);
				}
				{
					separator = new JSeparator();
					separator.setBounds(55, 180, 1000, 3);
					add(separator);
				}
				HashMap<Integer,JLabel> map = new HashMap<Integer,JLabel>();
				
				int x=55;
				int y=180;
				int b=0;
				
				ArrayList<CertificatoMedico> elencoCertificatiFiltro= ErogaAbbonamentoHandler.getInstance().filtraCertificatiCognome(cognome);
				
				CertificatoMedico[] elencoCertificati= ErogaAbbonamentoHandler.getInstance().getElencoCertificati();
				
				if(elencoCertificatiFiltro.size()==elencoCertificati.length)
					buttonRicarica.setVisible(false);
				
				
				if(elencoCertificatiFiltro.size()==0){
					Message.confirmLabel("Nessun cliente trovato", false, labelNoClientiFiltro);

					lblCodiceFiscale.setText("");
					lblNome.setText("");
					lblCognome_1.setText("");
					lblDataScadenza.setText("");
					lblStato.setText("");
					separator.setVisible(false);
				}
				else{
				
					for(CertificatoMedico c:elencoCertificatiFiltro){
					
						JLabel label1=new JLabel();
						label1.setText(c.getCliente().getCodiceFiscale());
						label1.setBounds(x, y, 200, 50);
						add(label1);
						x=x+200;
						JLabel label2=new JLabel();
						label2.setText(c.getCliente().getNome());
						label2.setBounds(x, y, 200, 50);
						add(label2);
						x=x+200;
						JLabel label3=new JLabel();
						label3.setText(c.getCliente().getCognome());
						label3.setBounds(x, y, 200, 50);
						add(label3);
						x=x+200;
						JLabel label4=new JLabel();
						//System.out.println(c.getScadenza());
						label4.setText(c.getScadenza().toString());
						label4.setBounds(x, y, 200, 50);
						add(label4);
						x=x+200;
						JLabel label5=new JLabel();
						java.util.Date datadioggi = java.util.GregorianCalendar.getInstance().getTime();
						//System.out.println(datadioggi.getClass());
						if(datadioggi.compareTo(c.getScadenza()) <= 0)
							label5.setIcon(new ImageIcon(GestioneCertificatiMediciView.class.getResource("/view/img/verde.png")));
						else
							label5.setIcon(new ImageIcon(GestioneCertificatiMediciView.class.getResource("/view/img/rosso.png")));
						//label5.setText("stato");
						label5.setBounds(x+10, y+10, 25, 25);
						add(label5);
						x=x+100;
						b=y+12;
						JButton bottone=new JButton("modifica");
						bottone.setBounds(x, b, 100, 20);
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void stampaElencoClientiCertificati() {
		
		HashMap<Integer,JLabel> map = new HashMap<Integer,JLabel>();
		
		int x=55;
		int y=180;
		int b=0;
		Cliente[] elencoClienti= ErogaAbbonamentoHandler.getInstance().getElencoClienti();
		
		CertificatoMedico[] elencoCertificati= ErogaAbbonamentoHandler.getInstance().getElencoCertificati();
		
		if(elencoCertificati.length==0){
			Message.confirmLabel("Nessun certificato medico presente", false, labelNoCertificati);
			textField.setEnabled(false);
			button.setEnabled(false);
			lblCodiceFiscale.setText("");
			lblNome.setText("");
			lblCognome_1.setText("");
			lblDataScadenza.setText("");
			lblStato.setText("");
			separator.setVisible(false);
		}
		else{
		
			for(int j=0;j<elencoCertificati.length;j++){
			
				JLabel label1=new JLabel();
				label1.setText(elencoCertificati[j].getCliente().getCodiceFiscale());
				label1.setBounds(x, y, 200, 50);
				add(label1);
				x=x+200;
				JLabel label2=new JLabel();
				label2.setText(elencoCertificati[j].getCliente().getNome());
				label2.setBounds(x, y, 200, 50);
				add(label2);
				x=x+200;
				JLabel label3=new JLabel();
				label3.setText(elencoCertificati[j].getCliente().getCognome());
				label3.setBounds(x, y, 200, 50);
				add(label3);
				x=x+200;
				JLabel label4=new JLabel();
				DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				String data = df.format(elencoCertificati[j].getScadenza());
				label4.setText(data);
				label4.setBounds(x, y, 200, 50);
				add(label4);
				x=x+200;
				JLabel label5=new JLabel();
				java.util.Date datadioggi = java.util.GregorianCalendar.getInstance().getTime();
				//System.out.println(datadioggi.getClass());
				if(datadioggi.compareTo(elencoCertificati[j].getScadenza()) <= 0)
					label5.setIcon(new ImageIcon(GestioneCertificatiMediciView.class.getResource("/view/img/verde.png")));
				else
					label5.setIcon(new ImageIcon(GestioneCertificatiMediciView.class.getResource("/view/img/rosso.png")));
				//label5.setText("stato");
				label5.setBounds(x+10, y+10, 25, 25);
				add(label5);
				x=x+100;
				b=y+12;
				JButton bottone=new JButton("modifica");
				bottone.setBounds(x, b, 100, 20);
				add(bottone);
				
				map.put(b,label1);
				
				y=y+40;
				x=55;
			
			
			}
		}
		
		
		
	}
}
