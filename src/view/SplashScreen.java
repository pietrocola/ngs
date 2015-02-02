package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.LineBorder;

import view.interfaccia;
import java.awt.Font;

public class SplashScreen extends JWindow{

	 private static final long serialVersionUID = 0;
	 private static final String COPYRIGHT  = "\u00a9";
	 private static final int WIDTH = 500;		//dimensioni immagine
	 private static final int HEIGHT = 300;
	 
	 public SplashScreen() {
	 	
	       		 
		 	/*
		 	 * A SEGUIRE SPALSH SCREEN CLASSICA
		 	 */
		 	
		 	JPanel content = (JPanel)getContentPane();
	        	        
	        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	        int x = (screen.width-WIDTH)/2;
	        int y = (screen.height-HEIGHT)/2;
	        setBounds(x,y,WIDTH,HEIGHT);
	        	       
	        JPanel panel = new JPanel();
	        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
	        content.add(panel, BorderLayout.CENTER);
	        panel.setLayout(new BorderLayout(0, 0));
	        
	       // ImageIcon img=new ImageIcon(SplashScreen.this.getClass().getResource("/view/img/rotella.gif"));
	        
	        JLabel label = new JLabel(new ImageIcon(interfaccia.class.getResource("/view/img/splash.jpg")));	        
	        label.setBackground(Color.WHITE);
	        label.setOpaque(true);	           
	        panel.add(label, BorderLayout.CENTER);
	       JLabel nome = new JLabel("nextGenSport", JLabel.CENTER);
	       nome.setFont(new Font("Tahoma", Font.BOLD, 15));
	       panel.add(nome, BorderLayout.SOUTH);    
	        
	        setOpacity(1f); //opacità esempio:setOpacity(0.8f)
	        
	 }
}
