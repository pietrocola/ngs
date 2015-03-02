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
	
	
	
	
	
	public Pannello draw() {
		
		Pannello p=super.draw();

		JScrollPane scroll = new JScrollPane(p);
		scroll.setBorder(null);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setVisible(true);
		
		Pannello pan=component.drawEmpty();
	
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
	    int x=(screen.width)/2;
	    int y=(screen.height)/2;
	    pan.setPreferredSize(new Dimension(x,y));
		pan.setLayout(new BorderLayout(0, 0));
		
		pan.add(scroll);
		
		return pan;
				
	}





	@Override
	public Pannello drawEmpty() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}