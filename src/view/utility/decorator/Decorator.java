package view.utility.decorator;

import javax.swing.JPanel;

public abstract class Decorator extends Pannello {

	public Pannello component;
	
	
	public Decorator(Pannello c){
		//System.out.println(c.getClass());
		//System.out.println(c.getComponentCount());
		component=c;
		

	}
	

	public JPanel draw() {
		
	if(component!=null)
			return component.draw();
	else
		return component;
		
	}

}