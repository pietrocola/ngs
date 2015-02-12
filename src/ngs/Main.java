package ngs;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import view.InterfacciaSegretaria;
import view.SplashScreen;
import view.InterfacciaAmministratore;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import ngs.factory.ServicesCreatorFactory;
import ngs.model.strategy.IPoliticaScontoAbbonamentoStrategy;
import ngs.model.strategy.ScontoPercentualeStrategy;
import ngs.model.strategy.composite.CompositePrezzoProClienteStrategy;
import ngs.model.strategy.composite.CompositePrezzoStrategy;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import java.awt.Color;

public class Main {
	private static JButton btnAmministratore;
	private static JButton btnSegretaria;
	private static JFrame logFrame;
	 private static final int WIDTH = 300;		//dimensioni LOG
	 private static final int HEIGHT = 150;
	 private static JLabel label;

	/**
	 * Launch the application.
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		ServicesCreatorFactory.getInstance().creaElencoAbbonamenti();
		
		//IPoliticaScontoAbbonamentoStrategy s= new ScontoPercentualeStrategy();
		//CompositePrezzoProClienteStrategy c = new CompositePrezzoProClienteStrategy();
		//c.addStrategiaPrezzo(s);
		
		/*
		 * Splash screen di due secondi seguita dal pannello di Log 
		 */
		final SplashScreen  splash = new SplashScreen(); //spalsh screen
		splash.setVisible(true);	//spalsh screen
		Thread.sleep(0);
		splash.setVisible(false);  		//spalsh screen
		
		logFrame = new JFrame();
		logFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/view/img/lucchetto 4.png")));
		logFrame.setTitle("nextGenSport - LOGIN");
		//logFrame.setUndecorated(true);
		
		
		//logFrame.setSize(600, 273);
		
		logFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(450, 205, 434, 262);
		logFrame.getContentPane().add(panel);
		
		
		 Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	        int x = (screen.width-WIDTH)/2;
	        int y = (screen.height-HEIGHT)/2;
	        
	        //logFrame.setBounds(x,y,316,292);
	        logFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	        
	        
		{
			btnAmministratore = new JButton("AMMINISTRATORE ");
			btnAmministratore.setFocusable(false);
			btnAmministratore.setBounds(32, 156, 191, 54);
			btnAmministratore.setIcon(new ImageIcon(Main.class.getResource("/view/img/user_icon.png")));
			ascoltatoreLoginAdmin();
		}
		{
			btnSegretaria = new JButton("SEGRETARIA ");
			btnSegretaria.setFocusable(false);
			btnSegretaria.setBounds(244, 156, 180, 54);
			btnSegretaria.setIcon(new ImageIcon(Main.class.getResource("/view/img/segretaria.png")));
			ascoltatoreLoginSegretaria();
		}
		{
			label = new JLabel("");
			label.setBounds(192, 25, 100, 100);
			label.setHorizontalAlignment(SwingConstants.CENTER);
			label.setIcon(new ImageIcon(Main.class.getResource("/view/img/login1.png")));
		}
		panel.setLayout(null);
		panel.add(label);
		panel.add(btnAmministratore);
		panel.add(btnSegretaria);
		
		logFrame.setVisible(true);
	}

	private static void ascoltatoreLoginSegretaria() {
		btnSegretaria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SwingUtilities.invokeLater(new Runnable() {			//spalsh screen
					//EventQueue.invokeLater(new Runnable() {

						public void run() {

							try 
							{
								InterfacciaSegretaria window = new InterfacciaSegretaria(logFrame);								
								window.segFrame.setVisible(true);
								logFrame.setVisible(false);	
								logFrame.dispose(); //libero le risorse dopo la chiusura della finestra
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
			
			}
		});
		
	}

	private static void ascoltatoreLoginAdmin() {
		btnAmministratore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SwingUtilities.invokeLater(new Runnable() {			//spalsh screen
					//EventQueue.invokeLater(new Runnable() {

						public void run() {

							try 
							{
								InterfacciaAmministratore window = new InterfacciaAmministratore(logFrame);								
								window.frmNextgensportAmministratore.setVisible(true);
								logFrame.setVisible(false);								
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
			}
		});
		
	}
}
