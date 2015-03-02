package view.content;

import javax.swing.JPanel;
import javax.swing.JInternalFrame;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import java.awt.Color;

import javax.swing.border.LineBorder;

import java.awt.SystemColor;

import javax.swing.UIManager;

public class Prova extends JPanel {
	private JInternalFrame internalFrame;
	private JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public Prova() {
		setLayout(new BorderLayout(0, 0));
		{
			internalFrame = new JInternalFrame("New JInternalFrame");
			internalFrame.setBorder(new LineBorder(Color.LIGHT_GRAY));
			internalFrame.setNormalBounds(new Rectangle(0, 0, 0, 0));
			add(internalFrame, BorderLayout.CENTER);
			{
				scrollPane = new JScrollPane();
			
				internalFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);
			}
			internalFrame.setVisible(true);
		}

	}

}
