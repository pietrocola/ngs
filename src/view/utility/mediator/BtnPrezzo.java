package view.utility.mediator;

import javax.swing.JButton;

public class BtnPrezzo extends JButton implements Component{

	private String nome;
	private String etichetta;
	Mediator mediatore;
	
	
	 public BtnPrezzo(Mediator mediatore1, String etichetta) 
	 {	    	
	    	super(etichetta);
								
	        mediatore=mediatore1; 
	        mediatore.registraBtnPrezzo(this);	        
	 }
	 
	@Override
	public void invia(String messaggio) {
		mediatore.inviaRicevi( messaggio);		
		
	}


}
