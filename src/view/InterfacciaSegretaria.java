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

public class InterfacciaSegretaria {

	public static JFrame segFrame;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmEsci;
	private JMenu mnModifica;
	private JMenu menu;
	private JToolBar toolBar;
	private JButton btnAbbonamento;
	

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
		segFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		segFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		segFrame.setVisible(true);
		{
			menuBar = new JMenuBar();
			segFrame.setJMenuBar(menuBar);
			{
				mnFile = new JMenu("File");
				menuBar.add(mnFile);
				{
					mntmEsci = new JMenuItem("Esci");
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
			segFrame.getContentPane().add(toolBar, BorderLayout.NORTH);
			{
				btnAbbonamento = new JButton("Abbonamento");
				toolBar.add(btnAbbonamento);
			}
		}
		
	}

}


