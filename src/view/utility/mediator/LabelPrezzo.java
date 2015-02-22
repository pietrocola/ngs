package view.utility.mediator;

import javax.swing.JLabel;

import view.utility.Message;

public class LabelPrezzo extends JLabel implements Component {

	private String testo;
	Mediator mediatore;

	   public LabelPrezzo(Mediator med, String testo)
	   {	        
	    	super(testo);
	    		    	
	    	mediatore = med;
	    	mediatore.registraLabelPrezzo(this);  
	    }

	@Override
	public void invia(String messaggio) {
		mediatore.inviaRicevi( messaggio);	
	}
	 
	    

		

}