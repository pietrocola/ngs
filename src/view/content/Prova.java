package view.content;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;

import javax.swing.ScrollPaneConstants;
import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;

public class Prova extends JPanel {
	private JPanel panel_1;
	private JInternalFrame internalFrame;

	/**
	 * Create the panel.
	 */
	public Prova() {
		setLayout(new BorderLayout(0, 0));
		{
			internalFrame = new JInternalFrame("PROVA");
			internalFrame.setFrameIcon(new ImageIcon(Prova.class.getResource("/view/img/IconaErrore.jpg")));
			add(internalFrame, BorderLayout.CENTER);
			internalFrame.setVisible(true);
		}


	}
}
