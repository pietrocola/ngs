package view.content;

import javax.swing.JPanel;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.controller.ErogaAbbonamentoHandler;
import ngs.persistentmodel.Cliente;
import ngs.persistentmodel.PreventivoAbbonamento;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.SystemColor;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

import view.utility.Message;
import view.utility.decorator.Pannello;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class CreaAbbonamentoView extends Pannello {
	private JPanel panel;
	private JLabel lblAbbonamentoScelto;
	private JLabel lblNomeAbb;
	private JLabel lblDurataAbb;
	private JLabel lblPrezzoAbb;
	private JPanel panel_1;
	private JLabel lblSelezionaUnCliente;
	private JButton button;
	private JTextField textField;
	private JLabel label;
	private JLabel labelNoClienti;
	private JRadioButton radioButton;
	private JLabel lblImpostaDataInizio;
	private JTextField textField_1;
	private JButton btnSalva;
	
	private HashMap<Integer,Cliente> map= new HashMap<Integer,Cliente>();
	private ArrayList<JRadioButton> arrayRB=new ArrayList<JRadioButton>();
	private JLabel lblConferma;

	
	
	public CreaAbbonamentoView(Boolean aux) {
		
	}

	
	
	/**
	 * Create the panel.
	 * @wbp.parser.constructor
	 */
	public CreaAbbonamentoView(PreventivoAbbonamento prevAbb) {
		setForeground(Color.WHITE);
		
		Dimension screen1 = Toolkit.getDefaultToolkit().getScreenSize();
        int x1 = (screen1.width-WIDTH);
        int y1 = (screen1.height-HEIGHT);
		//System.out.println(x+"x"+y);
		setPreferredSize(new Dimension(x1,y1));
		
		setLayout(null);
		{
			panel = new JPanel();
			panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel.setBackground(Color.WHITE);
			panel.setBounds(36, 148, 284, 104);
			add(panel);
			panel.setLayout(null);
			{
				lblNomeAbb = new JLabel("- NOME: "+prevAbb.getDescAbb().getNomeAbbonamento());
				lblNomeAbb.setBounds(30, 21, 236, 14);
				panel.add(lblNomeAbb);
			}
			{
				
				lblDurataAbb = new JLabel("- NUMERO MESI: "+prevAbb.getNumeroMesi());
				lblDurataAbb.setBounds(30, 46, 236, 14);
				panel.add(lblDurataAbb);
			}
			{
				lblPrezzoAbb = new JLabel("- PREZZO: "+prevAbb.getPrezzo()+" €");
				lblPrezzoAbb.setBounds(30, 71, 236, 14);
				panel.add(lblPrezzoAbb);
			}
		}
		{
			panel_1 = new JPanel();
			panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panel_1.setBackground(Color.WHITE);
			panel_1.setBounds(36, 290, 537, 142);
			//add(panel_1);
			panel_1.setLayout(null);
			{
				labelNoClienti = new JLabel("");
				labelNoClienti.setBounds(46, 28, 308, 14);
				panel_1.add(labelNoClienti);
			}
			JScrollPane scroll=new JScrollPane();
			scroll.setBounds(537, 148, 592, 149);
			add(scroll);
		    Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		    int x=(screen.width)/2;
		    int y=(screen.height)/2;
		    panel_1.setPreferredSize(new Dimension(x,y));
		    scroll.setViewportView(panel_1);
	
		}
		{
			lblSelezionaUnCliente = new JLabel("SELEZIONA UN CLIENTE");
			lblSelezionaUnCliente.setBounds(537, 71, 233, 14);
			add(lblSelezionaUnCliente);
			lblSelezionaUnCliente.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		{
			lblAbbonamentoScelto = new JLabel("ABBONAMENTO SCELTO");
			lblAbbonamentoScelto.setBounds(36, 71, 207, 14);
			add(lblAbbonamentoScelto);
			lblAbbonamentoScelto.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		{
			button = new JButton("");
			ascoltatoreFiltraClienti();
			button.setIcon(new ImageIcon(CreaAbbonamentoView.class.getResource("/view/img/lente.png")));
			button.setBorderPainted(false);
			button.setBackground(SystemColor.menu);
			button.setBounds(725, 106, 20, 20);
			add(button);
		}
		{
			textField = new JTextField();
			textField.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					labelNoClienti.setText("");
					lblConferma.setText("");
				}
			});
			textField.setColumns(10);
			textField.setBounds(619, 106, 102, 20);
			add(textField);
		}
		{
			label = new JLabel("cognome");
			label.setBounds(537, 108, 72, 14);
			add(label);
		}
		{
			lblImpostaDataInizio = new JLabel("IMPOSTA DATA INIZIO ABBONAMENTO");
			lblImpostaDataInizio.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblImpostaDataInizio.setBounds(537, 342, 291, 14);
			add(lblImpostaDataInizio);
		}
		{
			textField_1 = new JTextField();
			textField_1.addFocusListener(new FocusAdapter() {
				@Override
				public void focusGained(FocusEvent e) {
					lblConferma.setText("");
				}
			});
			textField_1.setBounds(537, 390, 115, 20);
			add(textField_1);
			textField_1.setColumns(10);
		}
		{
			btnSalva = new JButton("salva");
			ascoltatoreSalvaAbbonamentoCliente(prevAbb);
			btnSalva.setBounds(537, 437, 89, 23);
			add(btnSalva);
		}
		{
			lblConferma = new JLabel("");
			lblConferma.setBounds(661, 441, 291, 14);
			add(lblConferma);
		}
		
		
	

	}

	private void ascoltatoreSalvaAbbonamentoCliente(PreventivoAbbonamento prevAbb) {
		btnSalva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int cordY = 0;
				int cont=0;
				for(JRadioButton rb:arrayRB){
					if(rb.isSelected()==true)
					   cordY=rb.getY();
					if(rb.isSelected()==false)
						cont++;
				}
				
				Cliente cliente=null;
				Set<Integer> s=map.keySet();
				
				for(Integer aux:s){
					if(aux==cordY)
						cliente=map.get(aux);
				}
				
				String d=textField_1.getText();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy");
				Date dataInizio = null;
				

					
				
				if(d.trim().length()==0 || cont==arrayRB.size())
					Message.errorMessage("ERRORE", "Inserire tutte le informazioni");
				else{
					Boolean vpc=ErogaAbbonamentoHandler.getInstance().verificaPresenzaCertificato(cliente);
					Boolean vvc=ErogaAbbonamentoHandler.getInstance().verificaValiditaCertificato(cliente);
					if(vpc==true){
						if(vvc==true)
						{
							
							Boolean vpe=ErogaAbbonamentoHandler.getInstance().verificaAbbonamentoEsistente(cliente);
							
							if(vpe==false)
								Message.errorMessage("ERRORE", "Il cliente è già in possesso di un abbonamento");
							else{
									try {
											dataInizio = sdf.parse(d);
										} catch (ParseException e1) {
								
												// TODO Auto-generated catch block
												e1.printStackTrace();
											}
				
						
										Calendar calendar=Calendar.getInstance();
										calendar.setTime(dataInizio);
										calendar.add(Calendar.MONTH,prevAbb.getNumeroMesi());
										Date dataFine=calendar.getTime();
										
										String riepilogo="Confermare la creazione dell'abbonamento?\n ";
										int risposta = Message.questionConfirmMessage("CONFERMA", riepilogo);
										if(risposta==JOptionPane.YES_OPTION) 
										{
											
											if(ErogaAbbonamentoHandler.getInstance().creaAbbonamento(cliente, prevAbb, dataInizio,dataFine)==true)
											{									
												Message.confirmLabel("Abbonamento salvato", true, lblConferma);
																				   
											}
											else{}
												//Message.noConnectionDBMessage("ERRORE CONNESSIONE", "Connessione al database non riuscita");
												
										}
										else if(risposta==JOptionPane.NO_OPTION){}
						
							}
							
							
							// controllo esistenza
							
						}else{
							Message.errorMessage("ERRORE", "Certificato scaduto per questo cliente");
						}
					}
					else{
							Message.errorMessage("ERRORE", "Certificato assente per questo cliente");
						}
					}	
				
			}
		});
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	private void ascoltatoreFiltraClienti() {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				panel_1.removeAll();
				panel_1.revalidate();
				panel_1.repaint();

				
				
				String cognome=textField.getText();
				
				ArrayList<Cliente> elencoClienti = ErogaAbbonamentoHandler.getInstance().filtraClienti(cognome);
				
				
				
				if(cognome.trim().length()==0)
					Message.errorMessage("ERRORE", "Inserire un cognome");
				else{
					
					if(elencoClienti.size()==0){
						labelNoClienti = new JLabel("");
						labelNoClienti.setBounds(23, 27, 308, 14);
						panel_1.add(labelNoClienti);
						Message.confirmLabel("Nessun cliente trovato", false, labelNoClienti);
					}
					else{
						
						ButtonGroup gruppo=new ButtonGroup();
						
						JLabel n = new JLabel("NOME");
						n.setBounds(60, 15, 150, 23);
						panel_1.add(n);
						JLabel co = new JLabel("COGNOME");
						co.setBounds(160, 15, 150, 23);
						panel_1.add(co);
						JLabel cf = new JLabel("CODICE FISCALE");
						cf.setBounds(310, 15, 150, 23);
						panel_1.add(cf);
						
						int x=10;
						int y=50;
						
						for(Cliente c: elencoClienti){
							
							radioButton = new JRadioButton();
							radioButton.setBackground(Color.WHITE);
							gruppo.add(radioButton);
							radioButton.setBounds(x, y, 20, 23);
							arrayRB.add(radioButton);
							panel_1.add(radioButton);
							x=x+50;
							JLabel nome = new JLabel(c.getNome());
							nome.setBounds(x, y, 150, 23);
							panel_1.add(nome);
							x=x+100;
							JLabel cogn = new JLabel(c.getCognome());
							cogn.setBounds(x, y, 200, 23);
							panel_1.add(cogn);
							x=x+150;
							JLabel codFisc = new JLabel(c.getCodiceFiscale());
							codFisc.setBounds(x, y, 150, 23);
							panel_1.add(codFisc);
							
							map.put(y, c);
							
							y=y+30;
							x=10;
							
							
							
						}
						
						
						
						
						//panel_1.revalidate();
						//panel_1.repaint();
						
						
						
					}
					
					
					
				}
				
				
			}
		});
		
	}

	@Override
	public Pannello draw() {
		return new CreaAbbonamentoView(ElencoPreventiviDisponibiliView.prevAbb);
	}

	@Override
	public Pannello drawEmpty() {
		return new CreaAbbonamentoView(true);
	}
}
