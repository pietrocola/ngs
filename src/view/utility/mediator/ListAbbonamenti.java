package view.utility.mediator;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import view.utility.mediator.Component;

public class ListAbbonamenti extends JList implements Component{

	Mediator mediatore;
	
	public ListAbbonamenti(Mediator med, DefaultListModel defList)
	{
		super(defList);
		
        mediatore=med;
        mediatore.registraListAbbonamenti(this);
        
	}
	
	@Override
	public void invia(String messaggio) {
		mediatore.inviaRicevi(messaggio);		
		
	}

	

}
