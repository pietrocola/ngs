package view.utility.decorator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LabelDecorator  extends Decorator{
	
	public LabelDecorator(Pannello c) {
		super(c);
	
	}
	
	
	
	public JPanel draw(){
		
		//super.draw();
		
		
		
		JLabel label = new JLabel("prova");
		label.setBounds(800, 400, 400, 20);
		
		component.add(label);
		
		//JPanel panel = new JPanel();
		//panel=component;

		return component;
		
	}
	
	

}
