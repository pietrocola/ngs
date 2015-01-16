package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JToolBar;

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

import view.content.ImpostaTipologiaCorso;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Interfaccia {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnModifica;
	private JMenu menu;
	private JToolBar toolBar;
	private JButton btnCorso;
	private JPopupMenu popupMenu;
	private JMenu mnImpostaTipologiaCorso;
	private JMenuItem mntmAggiungi;
	private JMenuItem mntmConfiguraCorso;

	private JPanel panel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaccia window = new Interfaccia();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws PropertyVetoException 
	 */
	public Interfaccia() throws PropertyVetoException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws PropertyVetoException 
	 */
	private void initialize() throws PropertyVetoException {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		{
			menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			{
				mnFile = new JMenu("file");
				menuBar.add(mnFile);
			}
			{
				mnModifica = new JMenu("modifica");
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
				btnCorso = new JButton("CORSO");
				btnCorso.setIcon(new ImageIcon(Interfaccia.class.getResource("/view/img/trave.png")));
				btnCorso.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						popupMenu.show(btnCorso, 0, btnCorso.getY()+btnCorso.getHeight());
					}
				});
				toolBar.add(btnCorso);
				{
					popupMenu = new JPopupMenu();
					addPopup(btnCorso, popupMenu);
					{
						mnImpostaTipologiaCorso = new JMenu("imposta tipologia corso");
						popupMenu.add(mnImpostaTipologiaCorso);
						{
							mntmAggiungi = new JMenuItem("aggiungi");
							mntmAggiungi.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									//JInternalFrame internalFrame = new JInternalFrame("home->corso->imposta tipologia corso");
									
									ImpostaTipologiaCorso itc=new ImpostaTipologiaCorso();
									//internalFrame.getContentPane().add(itc,BorderLayout.CENTER);
									frame.getContentPane().add(itc, BorderLayout.CENTER);
									//internalFrame.setVisible(true);
									frame.getContentPane().revalidate();
									frame.repaint();
								}
							});
							mnImpostaTipologiaCorso.add(mntmAggiungi);
						}
					}
					{
						mntmConfiguraCorso = new JMenuItem("configura corso");
						popupMenu.add(mntmConfiguraCorso);
					}
				}
			}
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
