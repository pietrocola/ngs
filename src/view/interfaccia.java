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
import view.content.ImpostaCategoriaClienteView;
import view.content.ImpostaTipologiaCorsoView;
import view.utility.ProvaMap;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;

import ngs.model.M_TipologiaCorso;

import javax.swing.JLabel;

public class interfaccia {

	public class ProvaMap {

	}

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnModifica;
	private JMenu menu;
	private JToolBar toolBar;
	private JButton btnCorsi;
	private JPopupMenu popupMenu;
	private JMenu mnImpostaTipologiaCorso;
	private JMenuItem mntmAggiungi;
	private JMenuItem mntmConfiguraCorso;

	private JPanel panel;
	private JButton btnAbbonamenti;
	private JButton btnStruttura;
	private JButton btnClienti;
	private JButton btnPersonale;
	private JPopupMenu popupMenu_1;
	private JMenuItem mntmImpostaCategoriaCliente;
	private JPopupMenu popupMenu_2;
	private JMenuItem mntmConfiguraAbbonamento;

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
				btnCorsi = new JButton("GESTIONE CORSI ");
				btnCorsi.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/yoga50.png")));
				btnCorsi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu.show(btnCorsi, 0,	btnCorsi.getY() + btnCorsi.getHeight());
					}
				});
				toolBar.add(btnCorsi);
				{
					popupMenu = new JPopupMenu();
					//addPopup(btnCorsi, popupMenu);
					{
						mnImpostaTipologiaCorso = new JMenu("imposta tipologia corso");
						popupMenu.add(mnImpostaTipologiaCorso);
						{
							mntmAggiungi = new JMenuItem("aggiungi");
							ascoltatoreAggiungi();							
							mnImpostaTipologiaCorso.add(mntmAggiungi);
						}
					}
					{
						mntmConfiguraCorso = new JMenuItem("configura corso");
						ascoltatoreConfiguraCoroso();						
						popupMenu.add(mntmConfiguraCorso);
					}
				}
			}
			{
				btnAbbonamenti = new JButton("GESTIONE ABBONAMENTI");
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
						ascoltatoreConfiguraAbbonamento();
						popupMenu_2.add(mntmConfiguraAbbonamento);
					}
				}
			}
			
			{
				btnStruttura = new JButton("STRUTTURA");
				btnStruttura.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/struttura.png")));
				toolBar.add(btnStruttura);
			}
			{
				btnClienti = new JButton("CLIENTI");
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
				}
			}
			{
				btnPersonale = new JButton("PERSONALE");
				btnPersonale.setIcon(new ImageIcon(interfaccia.class.getResource("/view/img/personale.png")));
				toolBar.add(btnPersonale);
			}
			
		}
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
	
	public void ascoltatoreAggiungi()
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
	
	public void ascoltatoreConfiguraCoroso()
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


public void ascoltatoreConfiguraAbbonamento()
{
  mntmConfiguraAbbonamento.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {

			clearMainPanel(frame);

			ConfiguraAbbonamentoView cfv = new ConfiguraAbbonamentoView();
			// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
			frame.getContentPane().add(cfv,	BorderLayout.CENTER);

			// internalFrame.setVisible(true);
			frame.getContentPane().revalidate();
			frame.repaint();

		}
	});
}


}


