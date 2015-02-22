package view.utility.mediator;

import java.util.*;

public class ConcreteMediator extends Mediator {

    private List<Component> elencoComponenti = new ArrayList<Component>();

	
    @Override
    public void aggiungi(Component comp) {
    	elencoComponenti.add(comp);
    }
 
    
   
    @Override
    public void inviaRicevi(String Mittente, String messaggio, String Destinatario) 
    {
        for(Component comp: elencoComponenti)
        {
        	if( comp.getNome().equals(Destinatario))
            {
        		comp.ricevi(messaggio, Mittente);
            }
        }
    }
    
    
    public void stampaArray()
	{
		for(int i=0;i<elencoComponenti.size();i++)
		{
			System.out.println(elencoComponenti.get(i).getNome());
		}
	}


}