package view.utility.mediator;

import javax.swing.JButton;

public class BtnSalva extends JButton implements Component {

	Mediator mediatore;

	   public BtnSalva(Mediator mediatore1, String etichetta) {
	    	
	    	super(etichetta);
							
	        mediatore=mediatore1; 
	        mediatore.registraBtnSalva(this);
	  }
	     
	  	@Override
		public void invia(String messaggio) 
		{	  		
			mediatore.inviaRicevi(messaggio);		
		}

}