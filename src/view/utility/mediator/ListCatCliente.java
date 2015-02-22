package view.utility.mediator;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import view.utility.mediator.Component;

public class ListCatCliente extends JList implements Component{

	Mediator mediatore;
	
	public ListCatCliente(Mediator med, DefaultListModel defList)
	{
		super(defList);
		
        mediatore=med;
        mediatore.registraListCatCliente(this);        
	}
	
	@Override
	public void invia(String messaggio) 
	{
		mediatore.inviaRicevi(messaggio);			
	}

	

}
