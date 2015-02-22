package view.utility.mediator;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import view.utility.mediator.Component;

public class ListNumMesi extends JList implements Component{

	Mediator mediatore;
	
	public ListNumMesi(Mediator med, DefaultListModel defList)
	{
		super(defList);
		
        mediatore=med;
        mediatore.registraListNumMesi(this);        
	}
	
	@Override
	public void invia(String messaggio) 
	{
		mediatore.inviaRicevi(messaggio);			
	}

	

}
