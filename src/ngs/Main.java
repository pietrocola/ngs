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
		
		/*
		 * Splash screen di due secondi seguita dal pannello di Log 
		 */
		final SplashScreen  splash = new SplashScreen(); //spalsh screen
		splash.setVisible(true);	//spalsh screen
		Thread.sleep(2000);
		splash.setVisible(false);  		//spalsh screen
		
		logFrame = new JFrame();
		//logFrame.setUndecorated(true);
		
		
		//logFrame.setSize(600, 273);
		
		logFrame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 300, 347);
		logFrame.getContentPane().add(panel);
		
		
		 Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	        int x = (screen.width-WIDTH)/2;
	        int y = (screen.height-HEIGHT)/2;
	        
	        logFrame.setBounds(x,y,316,193);
	        
	        
		{
			btnAmministratore = new JButton("Amministratore");
			ascoltatoreLoginAdmin();			
			panel.setLayout(null);
			btnAmministratore.setBounds(21, 122, 140, 23);
			panel.add(btnAmministratore);
		}
		{
			btnSegretaria = new JButton("Segretaria");
			ascoltatoreLoginSegretaria();
			btnSegretaria.setBounds(171, 122, 103, 23);
			panel.add(btnSegretaria);
		}
		{
			label = new JLabel("");
			label.setIcon(new ImageIcon(Main.class.getResource("/view/img/login1.png")));
			label.setBounds(104, 11, 100, 100);
			panel.add(label);
		}
		
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
