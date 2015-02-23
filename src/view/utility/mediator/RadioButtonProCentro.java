package view.utility.mediator;

import javax.swing.JRadioButton;

public class RadioButtonProCentro extends JRadioButton implements Component{

	Mediator mediatore;
	
	public RadioButtonProCentro(Mediator med, String testo)
	{
		super(testo);
		
		mediatore=med;
		mediatore.registraRadioButtonProCentro(this);
	}
	
	
	@Override
	public void invia(String messaggio) {
		// TODO Auto-generated method stub
		mediatore.inviaRicevi(messaggio);
	}

}
