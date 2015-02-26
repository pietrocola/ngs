package view.utility.decorator;

import javax.swing.JPanel;

public abstract class Decorator extends Pannello {

	public Pannello component;
	
	
	public Decorator(Pannello c){
		component=c;
		

	}
	

	public Pannello draw() {
		if(component.countComponents()==0)
			return component.draw();
		else
			return component;
	}
	
	

}