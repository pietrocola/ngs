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

public class HomeView extends JPanel {
	private JLabel label;
	private JLabel label_1;

	/**
	 * Create the panel.
	 */
	public HomeView() {
		{
			Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	        
			
			
		}
		setLayout(new BorderLayout());
		{
			label_1 = new JLabel("");
			label_1.setHorizontalAlignment(SwingConstants.CENTER);
			label_1.setIcon(new ImageIcon(HomeView.class.getResource("/view/img/sport.png")));
			add(label_1);
		}
		

	}

}
