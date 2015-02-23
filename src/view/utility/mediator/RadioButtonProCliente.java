package view.utility.mediator;

import javax.swing.JRadioButton;

public class RadioButtonProCliente extends JRadioButton implements Component{

	
	Mediator mediatore;
	
	public RadioButtonProCliente(Mediator med, String testo)
	{
		super(testo);
		
		mediatore=med;
		mediatore.registraRadioButtonProCliente(this);
	}
	
	
	@Override
	public void invia(String messaggio) {
		mediatore.inviaRicevi(messaggio);
		
	}

}
