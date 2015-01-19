package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.LineBorder;

import view.interfaccia;

public class SplashScreen extends JWindow{

	 private static final long serialVersionUID = 0;
	 private static final String COPYRIGHT  = "\u00a9";
	 private static final int WIDTH = 450;
	 private static final int HEIGHT = 250;
	 
	 public SplashScreen() {

	        JPanel content = (JPanel)getContentPane();
	        
	        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	        int x = (screen.width-WIDTH)/2;
	        int y = (screen.height-HEIGHT)/2;
	        setBounds(x,y,WIDTH,HEIGHT);
	        
	        JPanel panel = new JPanel();
	        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
	        content.add(panel, BorderLayout.CENTER);
	        panel.setLayout(new BorderLayout(0, 0));
	        
	        JLabel label = new JLabel(new ImageIcon(interfaccia.class.getResource("/view/img/splash.png")));
	        panel.add(label, BorderLayout.CENTER);
	        JLabel copyrt = new JLabel("Copyright "+COPYRIGHT+" nextGenSport", JLabel.CENTER);
	        panel.add(copyrt, BorderLayout.SOUTH);    
	        
	        setOpacity(1f); //opacità setOpacity(0.8f)
	 }
}
