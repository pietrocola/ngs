package view.content;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSlider;

import java.awt.FlowLayout;

public class Home extends JPanel {
	private JLabel label;
	private JLabel label_1;

	/**
	 * Create the panel.
	 */
	public Home() {
		{
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
			//riduco l'immagine del 20% rispetto al display
	        int WIDTH = (screen.width)-((screen.width)/100*30);
	        int HEIGHT = (screen.height)-((screen.height)/100*30);
			setLayout(new FlowLayout(FlowLayout.CENTER));
	        
			
			
		}
		{
			label_1 = new JLabel("");
			label_1.setIcon(new ImageIcon(Home.class.getResource("/view/content/img/sports1.png")));
			add(label_1);
		}
		

	}

}
