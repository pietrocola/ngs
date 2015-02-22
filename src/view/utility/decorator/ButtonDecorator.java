package view.utility.decorator;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.InterfacciaSegretaria;

public class ButtonDecorator extends Decorator{

	public ButtonDecorator(Pannello c) {
		super(c);
	
	}
	
	
	
	public JPanel draw(){
		
		JPanel p=super.draw();
		
		
		
		JButton button = new JButton("prova");
		button.setBounds(800, 150, 400, 20);
		
		p.add(button);
		
		//JPanel panel = new JPanel();
		//panel=component;

		return p;
		
	}
	
	
	

}
