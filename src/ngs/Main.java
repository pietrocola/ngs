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
		
		
		/*
		 * Splash screen di due secondi seguita dal pannello di Log 
		 */
		final SplashScreen  splash = new SplashScreen(); //spalsh screen
		splash.setVisible(true);	//spalsh screen
		Thread.sleep(0);
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
		}
		{
			btnSegretaria = new JButton("Segretaria");
			ascoltatoreLoginSegretaria();
		}
		{
			label = new JLabel("");
			label.setIcon(new ImageIcon(Main.class.getResource("/view/img/login1.png")));
		}
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(104)
					.addComponent(label))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(21)
					.addComponent(btnAmministratore, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(btnSegretaria, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(label)
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnAmministratore, 0, 0, Short.MAX_VALUE)
						.addComponent(btnSegretaria, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(43))
		);
		panel.setLayout(gl_panel);
		
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
