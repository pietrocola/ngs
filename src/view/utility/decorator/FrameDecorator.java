package view.utility.decorator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import view.content.Prova;

public class FrameDecorator extends Decorator{

	
	public FrameDecorator(Pannello c){
		
		super(c);
		
		//this.draw();
	}
	
	
	
	
	
	public JPanel draw() {
		
		JPanel p=super.draw();
		
		
		
		/* decorazione aggiuntiva di prova
		JLabel label=new JLabel("prova");
		label.setBounds(500, 50, 400, 20);
		component.add(label);
	    */
		
		JPanel mainPanel = new JPanel();
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x=(screen.width)/2 + 100;
	    int y=(screen.height)/2 + 100;
	    mainPanel.setPreferredSize(new Dimension(x,y));
		mainPanel.setLayout(new BorderLayout(0, 0));
		JInternalFrame frame= new JInternalFrame();
		frame.add(p);
		frame.setVisible(true);
		mainPanel.add(frame, BorderLayout.CENTER);
		

		//component.removeAll();
		//component.repaint();
		//component.revalidate();
		//component.add(mainPanel);
		
		return mainPanel;
				
	}
	
	
}
