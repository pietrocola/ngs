package view.utility.mediator;

import javax.swing.JLabel;

import view.utility.Message;

public class LabelFrecciaAbb extends JLabel implements Component {

	private String testo;
	Mediator mediatore;

	   public LabelFrecciaAbb(Mediator med, String testo)
	   {	        
	    	super(testo);
	    		    	
	    	mediatore = med;
	    	mediatore.registraLabelFrecciaAbb(this);  
	    }

	@Override
	public void invia(String messaggio) {
		mediatore.inviaRicevi( messaggio);	
	}
	 
	    

		

}