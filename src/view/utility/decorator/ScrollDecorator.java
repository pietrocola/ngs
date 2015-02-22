package view.utility.decorator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import view.InterfacciaSegretaria;
import view.content.ElencoPreventiviDisponibiliView;

public class ScrollDecorator extends Decorator {

	
	public ScrollDecorator(Pannello c){
		
		super(c);
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
	    int x=(screen.width)/2;
	    int y=(screen.height)/2;
	    mainPanel.setPreferredSize(new Dimension(x,y));
		mainPanel.setLayout(new BorderLayout(0, 0));
		JScrollPane scroll= new JScrollPane();
		//scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setViewportView(p);
		mainPanel.add(scroll);
		
		
		//component.removeAll();
		//component.repaint();
		//component.revalidate();
		//component.add(mainPanel);
		
		return mainPanel;
				
	}
	
	
	
	

}