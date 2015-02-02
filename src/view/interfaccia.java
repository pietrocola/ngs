package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;

import javax.swing.ImageIcon;

import view.content.ConfiguraAbbonamentoView;
import view.content.ConfiguraCorsoView;
import view.content.HomeView;
import view.content.ImpostaCategoriaClienteView;
import view.content.ImpostaPoliticaScontoPercentualeView;
import view.content.ImpostaTipologiaCorsoView;
import view.content.CreaPreventivoView;
import view.utility.ProvaMap;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;

import ngs.factory.PoliticaScontoAbbonamentoStrategyFactory;
import ngs.model.M_TipologiaCorso;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class interfaccia {

	public class ProvaMap {

	}

	private JFrame frmNextgensportAmministratore;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnModifica;
	private JMenu menu;
	private JToolBar toolBar;
	private JPopupMenu popupMenu;
	private JMenu mnImpostaTipologiaCorso;
	private JMenuItem mntmAggiungi;
	private JMenuItem mntmConfiguraCorso;

	private JPanel panel;
	private JButton btnAbbonamenti;
	private JButton btnPreventiviAbbonamenti;
	private JButton btnClienti;
	private JButton btnHome;
	private JButton btnPersonale;
	private JPopupMenu popupMenu_1;
	private JPopupMenu popupMenu_2;
	private JMenuItem mntmConfiguraAbbonamento;
	private JMenu mnImpostaPoliticaSconto;
	private JMenuItem mntmScontoPercentuale;
	
	private JMenuItem mntmModifica;
	private JMenuItem mntmElimina;
	private JMenuItem mntmModificaCorso;
	private JMenuItem mntmEliminaCorso;
	private JMenuItem mntmModificaAbbonamento;
	private JMenuItem mntmEliminaAbbonamento;
	private JPopupMenu popupMenu_3;
	private JMenuItem mntmCreaPreventivo;
	private JMenuItem mntmModificaPreventivo;
	private JMenuItem mntmEliminaPreventivo;
	private JPanel panel_1;
	private JButton btnCorsi;
	private JButton btnStruttura;
	private JMenu mnCategoriaCliente;
	private JMenuItem mntmAggiungi_1;
	private JMenuItem mntmModifica_2;
	private JMenuItem mntmElimina_2;
	private JPopupMenu popupMenu_4;
	private JMenuItem mntmConfiguraStruttura;
	private JPopupMenu popupMenu_5;
	private JMenuItem mntmGestioneSegretarie;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		final SplashScreen  splash = new SplashScreen(); //spalsh screen
		splash.setVisible(true);						//spalsh screen
		//SwingUtilities.invokeLater(new Runnable() {			//spalsh screen
		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					

					interfaccia window = new interfaccia();
					Thread.sleep(2000);
					window.frmNextgensportAmministratore.setVisible(true);
					splash.setVisible(false);  		//spalsh screen
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws PropertyVetoException
	 */
	public interfaccia() throws PropertyVetoException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws PropertyVetoException
	 */
	private void initialize() throws PropertyVetoException {
		frmNextgensportAmministratore = new JFrame();
		frmNextgensportAmministratore.setTitle("nextGenSport - AMMINISTRATORE");
		frmNextgensportAmministratore.setIconImage(Toolkit.getDefaultToolkit().getImage(interfaccia.class.getResource("/view/img/user_icon.png")));
		frmNextgensportAmministratore.setBounds(100, 100, 450, 300);

		//frmNextgensportAmministratore.setSize(1000, 599);
		frmNextgensportAmministratore.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frmNextgensportAmministratore.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			menuBar = new JMenuBar();
			frmNextgensportAmministratore.setJMenuBar(menuBar);
			{
				mnFile = new JMenu("File");
				menuBar.add(mnFile);
			}
			{
				mnModifica = new JMenu("Modifica");
				menuBar.add(mnModifica);
			}
			{
				menu = new JMenu("?");
				menuBar.add(menu);
			}
		}
		{
			toolBar = new JToolBar();
			toolBar.setFloatable(false);
			frmNextgensportAmministratore.getContentPane().add(toolBar, BorderLayout.NORTH);
			{
				{
					btnHome = new JButton("HOME ");
					btnHome.setFocusable(false);
					btnHome.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							clearMainPanel(frmNextgensportAmministratore);
							
							HomeView home = new HomeView();
							
							frmNextgensportAmministratore.getContentPane().add(home,	BorderLayout.CENTER);
				
							// internalFrame.setVisible(true);
							frmNextgensportAmministratore.getContentPane().revalidate();
							frmNextgensportAmministratore.repaint();
						}
					});
					btnHome.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/home2.png")));
					btnHome.setBorderPainted(false);
					toolBar.add(btnHome);
				}
				
			}
			{
				btnCorsi = new JButton("GESTIONE CORSI");
				btnCorsi.setFocusable(false);
				btnCorsi.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/yoga50.png")));
				btnCorsi.setBorderPainted(false);
				btnCorsi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu.show(btnCorsi, 0,	btnCorsi.getY() + btnCorsi.getHeight());
					}
				});
				toolBar.add(btnCorsi);
				{
					popupMenu = new JPopupMenu();
					addPopup(btnCorsi, popupMenu);
					{
						mnImpostaTipologiaCorso = new JMenu("imposta tipologia corso");
						popupMenu.add(mnImpostaTipologiaCorso);
						{
							mntmAggiungi = new JMenuItem("aggiungi");
							ascoltatoreAggiungiTipologia();							
							mnImpostaTipologiaCorso.add(mntmAggiungi);
						}
						{
							mntmModifica = new JMenuItem("modifica");
							mntmModifica.setEnabled(false);							
							mnImpostaTipologiaCorso.add(mntmModifica);
						}
						{
							mntmElimina = new JMenuItem("elimina");
							mntmElimina.setEnabled(false);							
							mnImpostaTipologiaCorso.add(mntmElimina);
						}
					}
					{
						mntmConfiguraCorso = new JMenuItem("configura corso");
						ascoltatoreConfiguraCorso();						
						popupMenu.add(mntmConfiguraCorso);
					}
					{
						mntmModificaCorso = new JMenuItem("modifica corso");
						mntmModificaCorso.setEnabled(false);						
						popupMenu.add(mntmModificaCorso);
					}
					{
						mntmEliminaCorso = new JMenuItem("elimina corso");
						mntmEliminaCorso.setEnabled(false);					
						popupMenu.add(mntmEliminaCorso);
					}
				}
			}
			{
				btnAbbonamenti = new JButton("GESTIONE ABBONAMENTI");
				btnAbbonamenti.setFocusable(false);
				btnAbbonamenti.setBorderPainted(false);
				btnAbbonamenti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu_2.show(btnAbbonamenti, 0,	btnAbbonamenti.getY() + btnAbbonamenti.getHeight());
					}
				});				
				btnAbbonamenti.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/abbonamento1.png")));
				toolBar.add(btnAbbonamenti);
				{
					popupMenu_2 = new JPopupMenu();
					addPopup(btnAbbonamenti, popupMenu_2);
					{
						mntmConfiguraAbbonamento = new JMenuItem("configura abbonamento");
						ascoltatoreConfiguraAbbonamento(frmNextgensportAmministratore);
						popupMenu_2.add(mntmConfiguraAbbonamento);
					}
					{
						//ascoltatoreCalcolaPrezzoAbbonamento();						
						{
							mntmModificaAbbonamento = new JMenuItem("modifica abbonamento");
							mntmModificaAbbonamento.setEnabled(false);
							popupMenu_2.add(mntmModificaAbbonamento);
						}
						{
							mntmEliminaAbbonamento = new JMenuItem("elimina abbonamento");
							mntmEliminaAbbonamento.setEnabled(false);
							popupMenu_2.add(mntmEliminaAbbonamento);
						}
					}
				}
			}
			
			{
				btnPreventiviAbbonamenti = new JButton("PREVENTIVI ABBONAMENTI ");
				btnPreventiviAbbonamenti.setFocusable(false);
				btnPreventiviAbbonamenti.setBorderPainted(false);
				btnPreventiviAbbonamenti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu_3.show(btnPreventiviAbbonamenti, 0,	btnPreventiviAbbonamenti.getY() + btnPreventiviAbbonamenti.getHeight());
					}
				});
				btnPreventiviAbbonamenti.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/calcolatrice 5.png")));
				toolBar.add(btnPreventiviAbbonamenti);
				{
					popupMenu_3 = new JPopupMenu();
					addPopup(btnPreventiviAbbonamenti, popupMenu_3);
					{
						mntmCreaPreventivo = new JMenuItem("calcola prezzi / crea preventivo");
						ascoltatoreCreaPreventivo();						
						//ascoltatoreCalcolaPrezzoAbbonamento();						
						popupMenu_3.add(mntmCreaPreventivo);
					}
					{
						mntmModificaPreventivo = new JMenuItem("modifica preventivo");
						mntmModificaPreventivo.setEnabled(false);
						popupMenu_3.add(mntmModificaPreventivo);
					}
					{
						mntmEliminaPreventivo = new JMenuItem("elimina preventivo");
						mntmEliminaPreventivo.setEnabled(false);
						popupMenu_3.add(mntmEliminaPreventivo);
					}
				}
			}
			{
				btnClienti = new JButton("CLIENTI ");
				btnClienti.setFocusable(false);
				btnClienti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu_1.show(btnClienti, 0,	btnClienti.getY() + btnClienti.getHeight());
					}
				});
				btnClienti.setBorderPainted(false);
				btnClienti.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/cliente.png")));
				toolBar.add(btnClienti);
				{
					popupMenu_1 = new JPopupMenu();
					addPopup(btnClienti, popupMenu_1);
					{
						
					}
					{
						mnCategoriaCliente = new JMenu("imposta categoria cliente");
						popupMenu_1.add(mnCategoriaCliente);
						{
							mntmAggiungi_1 = new JMenuItem("aggiungi");

							ascoltatoreAggiungiCategoriaCliente();
							mnCategoriaCliente.add(mntmAggiungi_1);
						}
						{
							mntmModifica_2 = new JMenuItem("modifica");
							mntmModifica_2.setEnabled(false);
							mnCategoriaCliente.add(mntmModifica_2);
						}
						{
							mntmElimina_2 = new JMenuItem("elimina");
							mntmElimina_2.setEnabled(false);
							mnCategoriaCliente.add(mntmElimina_2);
						}
					}
					{
						mnImpostaPoliticaSconto = new JMenu("crea politica sconto ");
						popupMenu_1.add(mnImpostaPoliticaSconto);
						{
							mntmScontoPercentuale = new JMenuItem("sconto percentuale");
							ascoltatoreScontoPercentuale();
							mnImpostaPoliticaSconto.add(mntmScontoPercentuale);
						}
					}
				}
			}
			{
				btnStruttura = new JButton("STRUTTURA ");
				btnStruttura.setFocusable(false);
				btnStruttura.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu_4.show(btnStruttura, 0,	btnStruttura.getY() + btnStruttura.getHeight());
					}
				});
				btnStruttura.setBorderPainted(false);
				btnStruttura.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/struttura.png")));
				toolBar.add(btnStruttura);
				{
					popupMenu_4 = new JPopupMenu();
					addPopup(btnStruttura, popupMenu_4);
					{
						mntmConfiguraStruttura = new JMenuItem("configura struttura");
						mntmConfiguraStruttura.setEnabled(false);
						popupMenu_4.add(mntmConfiguraStruttura);
					}
				}
			}
			{
				btnPersonale = new JButton("PERSONALE ");
				btnPersonale.setFocusable(false);
				btnPersonale.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu_5.show(btnPersonale, 0,	btnPersonale.getY() + btnPersonale.getHeight());
					}
				});
				btnPersonale.setBorderPainted(false);
				btnPersonale.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/personale.png")));
				toolBar.add(btnPersonale);
				{
					popupMenu_5 = new JPopupMenu();
					addPopup(btnPersonale, popupMenu_5);
					{
						mntmGestioneSegretarie = new JMenuItem("gestione segretarie");
						mntmGestioneSegretarie.setEnabled(false);
						popupMenu_5.add(mntmGestioneSegretarie);
					}
				}
			}
			
		}
		{
			/*
			 * stampa home all'avvio
			 */
			panel_1 = new JPanel();
			frmNextgensportAmministratore.getContentPane().add(panel_1, BorderLayout.CENTER);
			clearMainPanel(frmNextgensportAmministratore);
			
			HomeView home = new HomeView();
			// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
			frmNextgensportAmministratore.getContentPane().add(home,	BorderLayout.CENTER);

			// internalFrame.setVisible(true);
			frmNextgensportAmministratore.getContentPane().revalidate();
			frmNextgensportAmministratore.repaint();
		}
	}

	private void ascoltatoreAggiungiCategoriaCliente() {
		mntmAggiungi_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearMainPanel(frmNextgensportAmministratore);
				
				ImpostaCategoriaClienteView cfv = new ImpostaCategoriaClienteView();
				// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
				frmNextgensportAmministratore.getContentPane().add(cfv,	BorderLayout.CENTER);

				// internalFrame.setVisible(true);
				frmNextgensportAmministratore.getContentPane().revalidate();
				frmNextgensportAmministratore.repaint();
			}
		});
	
		
	}

	private void ascoltatoreCreaPreventivo() 
	{
		mntmCreaPreventivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearMainPanel(frmNextgensportAmministratore);
				
				CreaPreventivoView vtv = new CreaPreventivoView();
				// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
				frmNextgensportAmministratore.getContentPane().add(vtv,	BorderLayout.CENTER);
	
				// internalFrame.setVisible(true);
				frmNextgensportAmministratore.getContentPane().revalidate();
				frmNextgensportAmministratore.repaint();
			}
		});
		
	}

	/*
	 * ascoltatore per la viusalizzazione del menu pop up collegato alla toolbar
	 */
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	/**
	 * Pulisce il panel variabile e ripristina la toolBar con in bottoni
	 */
	public void clearMainPanel(JFrame frame) {
		frame.getContentPane().removeAll();
		frame.getContentPane().repaint();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
	}
	
	public void ascoltatoreAggiungiTipologia()
	{
		mntmAggiungi.addActionListener(new ActionListener() {
			public void actionPerformed(
					ActionEvent e) {
						// JInternalFrame internalFrame =
						// new JInternalFrame("home->corso->imposta tipologia corso");		
						clearMainPanel(frmNextgensportAmministratore);
		
						ImpostaTipologiaCorsoView itc = new ImpostaTipologiaCorsoView();
						// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
		
						frmNextgensportAmministratore.getContentPane().add(itc,
								BorderLayout.CENTER);
		
						// internalFrame.setVisible(true);
						frmNextgensportAmministratore.getContentPane().revalidate();
		
						frmNextgensportAmministratore.repaint();

				}
			});
		}
	
	
	
	public void ascoltatoreScontoPercentuale()
	{
		mntmScontoPercentuale.addActionListener(new ActionListener() {
			public void actionPerformed(
					ActionEvent e) {
						// JInternalFrame internalFrame =
						// new JInternalFrame("home->corso->imposta tipologia corso");		
						clearMainPanel(frmNextgensportAmministratore);
		
						ImpostaPoliticaScontoPercentualeView psp = new ImpostaPoliticaScontoPercentualeView();
						// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
		
						frmNextgensportAmministratore.getContentPane().add(psp,
								BorderLayout.CENTER);
		
						// internalFrame.setVisible(true);
						frmNextgensportAmministratore.getContentPane().revalidate();
		
						frmNextgensportAmministratore.repaint();

				}
			});
		}
	
	
	
	public void ascoltatoreConfiguraCorso()
	{
		mntmConfiguraCorso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				clearMainPanel(frmNextgensportAmministratore);

				ConfiguraCorsoView cfv = new ConfiguraCorsoView();
				// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
				frmNextgensportAmministratore.getContentPane().add(cfv,	BorderLayout.CENTER);

				// internalFrame.setVisible(true);
				frmNextgensportAmministratore.getContentPane().revalidate();
				frmNextgensportAmministratore.repaint();

			}
		});
	}

	
	
	

	
	
	public void ascoltatoreConfiguraAbbonamento(JFrame frame)
	{
	  mntmConfiguraAbbonamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	
				clearMainPanel(frame);
	
				ConfiguraAbbonamentoView cfv = new ConfiguraAbbonamentoView(frame);
				// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
				frame.getContentPane().add(cfv,	BorderLayout.CENTER);
	
				// internalFrame.setVisible(true);
				frame.getContentPane().revalidate();
				frame.repaint();
	
			}
		});
	}
	
	/*public void ascoltatoreCalcolaPrezzoAbbonamento()
	{
		mntmCreaPreventivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearMainPanel(frame);
				
				CreaPreventivoView vtv = new CreaPreventivoView();
				// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
				frame.getContentPane().add(vtv,	BorderLayout.CENTER);
	
				// internalFrame.setVisible(true);
				frame.getContentPane().revalidate();
				frame.repaint();
			}
		});
				
	
		
	}*/

}


