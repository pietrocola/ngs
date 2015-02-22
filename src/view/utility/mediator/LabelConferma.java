package view.utility.mediator;

import javax.swing.JLabel;

import view.utility.Message;

public class LabelConferma extends JLabel implements Component {

	private String testo;
	Mediator mediatore;

	   public LabelConferma(Mediator med, String testo)
	   {	        
	    	super(testo);
	    		    	
	    	mediatore = med;
	        mediatore.registraLabelConferma(this);  
	    }

	@Override
	public void invia(String messaggio) {
		mediatore.inviaRicevi( messaggio);	
	}
	 
}  