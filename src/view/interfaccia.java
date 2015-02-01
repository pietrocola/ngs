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
import view.content.Home;
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

	private JFrame frame;
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
	private JPopupMenu popupMenu_1;
	private JMenuItem mntmImpostaCategoriaCliente;
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
	private JMenuItem mntmModificaCategoriaCliente;
	private JMenuItem mntmCancellaCategoriaCliente;
	private JMenuItem mntmModifica_1;
	private JMenuItem mntmElimina_1;
	private JPanel panel_1;
	private JButton btnCorsi;
	
	

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
					Thread.sleep(1500);
					window.frame.setVisible(true);
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
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);

		frame.setSize(800, 600);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
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
			frame.getContentPane().add(toolBar, BorderLayout.NORTH);
			{
				{
					btnHome = new JButton("");
					btnHome.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							clearMainPanel(frame);
							
							Home home = new Home();
							
							frame.getContentPane().add(home,	BorderLayout.CENTER);
				
							// internalFrame.setVisible(true);
							frame.getContentPane().revalidate();
							frame.repaint();
						}
					});
					btnHome.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/home.png")));
					btnHome.setBorderPainted(false);
					toolBar.add(btnHome);
				}
				
			}
			{
				btnCorsi = new JButton("GESTIONE CORSI");
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
						mnImpostaTipologiaCorso = new JMenu("tipologia corso");
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
						ascoltatoreConfiguraAbbonamento(frame);
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
				btnPreventiviAbbonamenti.setBorderPainted(false);
				btnPreventiviAbbonamenti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu_3.show(btnPreventiviAbbonamenti, 0,	btnPreventiviAbbonamenti.getY() + btnPreventiviAbbonamenti.getHeight());
					}
				});
				btnPreventiviAbbonamenti.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/calcolatrice.png")));
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
				btnClienti.setBorderPainted(false);
				btnClienti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu_1.show(btnClienti, 0,	btnClienti.getY() + btnClienti.getHeight());
					}
				});
				btnClienti.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/cliente.png")));
				toolBar.add(btnClienti);
				{
					popupMenu_1 = new JPopupMenu();
					addPopup(btnClienti, popupMenu_1);
					{
						mntmImpostaCategoriaCliente = new JMenuItem("imposta categoria cliente");
						ascoltatoreImpostaCategoriaCliente();
						popupMenu_1.add(mntmImpostaCategoriaCliente);
					}
					{
						mntmModificaCategoriaCliente = new JMenuItem("modifica categoria cliente");
						mntmModificaCategoriaCliente.setEnabled(false);
						popupMenu_1.add(mntmModificaCategoriaCliente);
					}
					{
						mntmCancellaCategoriaCliente = new JMenuItem("cancella categoria cliente");
						mntmCancellaCategoriaCliente.setEnabled(false);
						popupMenu_1.add(mntmCancellaCategoriaCliente);
					}
					{
						mnImpostaPoliticaSconto = new JMenu("politica sconto percentuale");
						popupMenu_1.add(mnImpostaPoliticaSconto);
						{
							mntmScontoPercentuale = new JMenuItem("nuovo\r\n");
							ascoltatoreScontoPercentuale();
							mnImpostaPoliticaSconto.add(mntmScontoPercentuale);
						}
						{
							mntmModifica_1 = new JMenuItem("modifica");
							mntmModifica_1.setEnabled(false);
							mnImpostaPoliticaSconto.add(mntmModifica_1);
						}
						{
							mntmElimina_1 = new JMenuItem("elimina");
							mntmElimina_1.setEnabled(false);
							mnImpostaPoliticaSconto.add(mntmElimina_1);
						}
					}
				}
			}
			
		}
		{
			/*
			 * stampa home all'avvio
			 */
			panel_1 = new JPanel();
			frame.getContentPane().add(panel_1, BorderLayout.CENTER);
			clearMainPanel(frame);
			
			Home home = new Home();
			// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
			frame.getContentPane().add(home,	BorderLayout.CENTER);

			// internalFrame.setVisible(true);
			frame.getContentPane().revalidate();
			frame.repaint();
		}
	}

	private void ascoltatoreCreaPreventivo() 
	{
		mntmCreaPreventivo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearMainPanel(frame);
				
				CreaPreventivoView vtv = new CreaPreventivoView();
				// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
				frame.getContentPane().add(vtv,	BorderLayout.CENTER);
	
				// internalFrame.setVisible(true);
				frame.getContentPane().revalidate();
				frame.repaint();
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
						clearMainPanel(frame);
		
						ImpostaTipologiaCorsoView itc = new ImpostaTipologiaCorsoView();
						// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
		
						frame.getContentPane().add(itc,
								BorderLayout.CENTER);
		
						// internalFrame.setVisible(true);
						frame.getContentPane().revalidate();
		
						frame.repaint();

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
						clearMainPanel(frame);
		
						ImpostaPoliticaScontoPercentualeView psp = new ImpostaPoliticaScontoPercentualeView();
						// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
		
						frame.getContentPane().add(psp,
								BorderLayout.CENTER);
		
						// internalFrame.setVisible(true);
						frame.getContentPane().revalidate();
		
						frame.repaint();

				}
			});
		}
	
	
	
	public void ascoltatoreConfiguraCorso()
	{
		mntmConfiguraCorso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				clearMainPanel(frame);

				ConfiguraCorsoView cfv = new ConfiguraCorsoView();
				// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
				frame.getContentPane().add(cfv,	BorderLayout.CENTER);

				// internalFrame.setVisible(true);
				frame.getContentPane().revalidate();
				frame.repaint();

			}
		});
	}

	
	
	
	public void ascoltatoreImpostaCategoriaCliente()
		{
		  mntmImpostaCategoriaCliente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
	
					clearMainPanel(frame);
	
					ImpostaCategoriaClienteView cfv = new ImpostaCategoriaClienteView();
					// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
					frame.getContentPane().add(cfv,	BorderLayout.CENTER);
	
					// internalFrame.setVisible(true);
					frame.getContentPane().revalidate();
					frame.repaint();
	
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


