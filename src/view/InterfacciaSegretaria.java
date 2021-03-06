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

import view.content.AggiungiCertificatoMedicoView;
import view.content.ConfiguraAbbonamentoView;
import view.content.ConfiguraCorsoView;
import view.content.ElencoPreventiviDisponibiliView;
import view.content.GestioneCertificatiMediciView;
import view.content.HomeView;
import view.content.ImpostaCategoriaClienteView;
import view.content.ImpostaPoliticaScontoPercentualeView;
import view.content.ImpostaTipologiaCorsoView;
import view.content.RegistraClienteView;
import view.content.VerificaCategoriaClienteView;
import view.utility.ProvaMap;
import view.utility.decorator.FrameDecorator;
import view.utility.decorator.ScrollDecorator;
import view.utility.decorator.Pannello;

import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;

import ngs.factory.PoliticaScontoAbbonamentoStrategyFactory;
import ngs.factory.ServicesCreatorFactory;
import ngs.model.M_ElencoAbbonamenti;
import ngs.model.M_TipologiaCorso;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import org.orm.ertodb.decorator.Decorator;

public class InterfacciaSegretaria {

	
	private Pannello pannello;
	
	
	public static JFrame segFrame;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmEsci;
	private JMenu mnModifica;
	private JMenu menu;
	public static JToolBar toolBar;
	private JButton btnAbbonamento;
	private JButton btnClienti;
	private JButton btnHome;
	private JButton btnCertificatiMedici;
	private JButton btnPagamenti;
	private JPanel panel;
	private JPopupMenu popupMenu;
	private JMenuItem mntmVerificaCategoriaCliente;
	private JPopupMenu popupMenu_1;
	private JMenuItem mntmPreventiviDisponibili;
	private JMenuItem mntmRegistraCliente;
	private JPopupMenu popupMenu_2;
	private JMenuItem mntmAggiungiCertificatoCliente;
	private JMenuItem mntmCreaAbbonamento;
	private JMenuItem mntmGes;
	private JButton btnListeAttesa;
	

	/**
	 * Create the application.
	 * @param logFrame 
	 * 
	 * @throws PropertyVetoException
	 */
	public InterfacciaSegretaria(JFrame logFrame) throws PropertyVetoException {
		initialize(logFrame);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param logFrame 
	 * 
	 * @throws PropertyVetoException
	 */
	private void initialize(JFrame logFrame) throws PropertyVetoException {

		segFrame = new JFrame();
		segFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(InterfacciaSegretaria.class.getResource("/view/img/segretaria.png")));
		segFrame.setTitle("nextGenSport - SEGRETARIA");
		segFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		segFrame.setBounds(0, 0, 1300, 500);
		segFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		segFrame.setVisible(true);
		{
			menuBar = new JMenuBar();
			segFrame.setJMenuBar(menuBar);
			{
				mnFile = new JMenu("File");
				menuBar.add(mnFile);
				{
					mntmEsci = new JMenuItem("Logout");
					mntmEsci.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							segFrame.setVisible(false);
							segFrame.dispose();		//libero le risorse dopo la chiusura della finestra
							logFrame.setVisible(true);
						}
					});
					mnFile.add(mntmEsci);
				}
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
			segFrame.getContentPane().add(toolBar, BorderLayout.NORTH);
			{
				btnHome = new JButton("HOME ");
				btnHome.setFont(new Font("Tahoma", Font.BOLD, 12));
				ascoltatoreBottoneHome();
				btnHome.setFocusable(false);
				btnHome.setBorderPainted(false);
				btnHome.setIcon(new ImageIcon(InterfacciaSegretaria.class.getResource("/view/img/home2.png")));
				toolBar.add(btnHome);
			}
			{
				btnAbbonamento = new JButton("ABBONAMENTI ");
				btnAbbonamento.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnAbbonamento.setFocusable(false);
				btnAbbonamento.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						popupMenu_1.show(btnAbbonamento, 0,	btnAbbonamento.getY() + btnAbbonamento.getHeight());
					}
				});

				btnAbbonamento.setIcon(new ImageIcon(InterfacciaSegretaria.class.getResource("/view/img/abbonamento1.png")));
				btnAbbonamento.setBorderPainted(false);
				toolBar.add(btnAbbonamento);
				{
					popupMenu_1 = new JPopupMenu();
					addPopup(btnAbbonamento, popupMenu_1);
					{
						mntmPreventiviDisponibili = new JMenuItem("preventivi disponibili / associa cliente");
						ascoltatorePreventiviDisponibili();
						popupMenu_1.add(mntmPreventiviDisponibili);
					}
					{
						mntmCreaAbbonamento = new JMenuItem("gestione abbonamenti");
						mntmCreaAbbonamento.setEnabled(false);
						popupMenu_1.add(mntmCreaAbbonamento);
					}
				}
			}
			{
				btnClienti = new JButton("CLIENTI ");
				btnClienti.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnClienti.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu.show(btnClienti, 0,	btnClienti.getY() + btnClienti.getHeight());
						
					}
				});
				btnClienti.setFocusable(false);
				btnClienti.setBorderPainted(false);
				btnClienti.setIcon(new ImageIcon(InterfacciaSegretaria.class.getResource("/view/img/cliente.png")));
				toolBar.add(btnClienti);
				{
					popupMenu = new JPopupMenu();
					addPopup(btnClienti, popupMenu);
					{
						mntmVerificaCategoriaCliente = new JMenuItem("verifica categoria cliente");
						ascoltatoreVerificaCategoriaCliente();
						popupMenu.add(mntmVerificaCategoriaCliente);
					}
					{
						mntmRegistraCliente = new JMenuItem("registra cliente");
						ascoltatoreRegistraCliente();
						popupMenu.add(mntmRegistraCliente);
					}
				}
			}
			{
				btnCertificatiMedici = new JButton("CERTIFICATI MEDICI ");
				btnCertificatiMedici.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnCertificatiMedici.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						popupMenu_2.show(btnCertificatiMedici, 0,	btnCertificatiMedici.getY() + btnCertificatiMedici.getHeight());
					}
				});
				//ascoltatoreBottoneHome();
				btnCertificatiMedici.setFocusable(false);
				btnCertificatiMedici.setBorderPainted(false);
				btnCertificatiMedici.setIcon(new ImageIcon(InterfacciaSegretaria.class.getResource("/view/img/cuore 1.png")));
				toolBar.add(btnCertificatiMedici);
				{
					popupMenu_2 = new JPopupMenu();
					addPopup(btnCertificatiMedici, popupMenu_2);
					{
						mntmAggiungiCertificatoCliente = new JMenuItem("aggiungi certificato cliente");
						ascoltatoreAggiungiCertificatoMedico();
						popupMenu_2.add(mntmAggiungiCertificatoCliente);
					}
					{
						mntmGes = new JMenuItem("gestione certificati");
						ascoltatoreGestioneCertificati();
						popupMenu_2.add(mntmGes);
					}
				}
			}
			{
				btnPagamenti = new JButton("PAGAMENTI ");
				btnPagamenti.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnPagamenti.setFocusable(false);
				btnPagamenti.setBorderPainted(false);
				btnPagamenti.setIcon(new ImageIcon(InterfacciaSegretaria.class.getResource("/view/img/euro 1.png")));
				toolBar.add(btnPagamenti);
			}
			{
				btnListeAttesa = new JButton("LISTE D'ATTESA ");
				btnListeAttesa.setFont(new Font("Tahoma", Font.BOLD, 12));
				btnListeAttesa.setFocusable(false);
				btnListeAttesa.setBorderPainted(false);
				btnListeAttesa.setIcon(new ImageIcon(InterfacciaSegretaria.class.getResource("/view/img/listaattesa1.png")));
				toolBar.add(btnListeAttesa);
			}
		}
		{
			HomeView home = new HomeView();
			// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
			segFrame.getContentPane().add(home,	BorderLayout.CENTER);
		}
		
	}

	
	
	
	
	private void ascoltatoreGestioneCertificati() {
		mntmGes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearMainPanel(segFrame);
				
				pannello=new GestioneCertificatiMediciView(true);
				
				pannello=new ScrollDecorator(pannello);
				pannello=pannello.draw();
				
				pannello=new FrameDecorator(pannello,"GESTIONE CERTIFICATI MEDICI CLIENTI","/view/img/cuore 1 frame.png");
				pannello=pannello.draw();
				
				segFrame.getContentPane().add(pannello,	BorderLayout.CENTER);
				segFrame.getContentPane().revalidate();
				segFrame.repaint();
			}
		});
		
	}

	private void ascoltatoreAggiungiCertificatoMedico() {
		mntmAggiungiCertificatoCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearMainPanel(segFrame);
				
				pannello=new AggiungiCertificatoMedicoView(true);
				
				pannello=new ScrollDecorator(pannello);
				pannello=pannello.draw();
				
				pannello=new FrameDecorator(pannello,"AGGIUNGI CERTIFICATO MEDICO CLIENTE","/view/img/cuore 1 frame.png");
				pannello=pannello.draw();
				
				segFrame.getContentPane().add(pannello,	BorderLayout.CENTER);
				segFrame.getContentPane().revalidate();
				segFrame.repaint();
			}
		});
		
	}

	private void ascoltatoreRegistraCliente() {
		mntmRegistraCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearMainPanel(segFrame);
				
				pannello = new RegistraClienteView(true);
			
				pannello=new FrameDecorator(pannello,"REGISTRA CLIENTE","/view/img/cliente frame.png");
				pannello=pannello.draw();
				
				segFrame.getContentPane().add(pannello,	BorderLayout.CENTER);
				segFrame.getContentPane().revalidate();
				segFrame.repaint();
				
			}
		});
		
	}

	
	
	
	
	
	private void ascoltatorePreventiviDisponibili() {
		mntmPreventiviDisponibili.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clearMainPanel(segFrame);
				

				
				pannello=new ElencoPreventiviDisponibiliView(true);
				
				pannello=new ScrollDecorator(pannello);
				pannello=pannello.draw();
				
				pannello=new FrameDecorator(pannello,"PREVENTIVI DISPONIBILI","/view/img/abbonamento1 frame.png");
				pannello=pannello.draw();
				
				InterfacciaSegretaria.segFrame.getContentPane().add(pannello,	BorderLayout.CENTER);
				InterfacciaSegretaria.segFrame.getContentPane().revalidate();
				InterfacciaSegretaria.segFrame.repaint();
				
			}
		});
		
	}

	
	
	
	
	private void ascoltatoreBottoneHome() {
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearMainPanel(segFrame);
				
				HomeView hv = new HomeView();
				// internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
				segFrame.getContentPane().add(hv,	BorderLayout.CENTER);

				// internalFrame.setVisible(true);
				segFrame.getContentPane().revalidate();
				segFrame.repaint();
			}
		});
		
	}

	private void ascoltatoreVerificaCategoriaCliente() {
		mntmVerificaCategoriaCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				clearMainPanel(segFrame);
				
				pannello = new VerificaCategoriaClienteView(true);
				
				pannello=new FrameDecorator(pannello,"VERIFICA CATEGORIA CLIENTE","/view/img/cliente frame.png");
				pannello=pannello.draw();

				
				segFrame.getContentPane().add(pannello,	BorderLayout.CENTER);
				segFrame.getContentPane().revalidate();
				segFrame.repaint();
				
			}
		});
		
	}
	
	
	public void clearMainPanel(JFrame frame) {
		frame.getContentPane().removeAll();
		frame.getContentPane().repaint();
		frame.getContentPane().add(toolBar, BorderLayout.NORTH);
	}

	
	
	
	
	
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}


