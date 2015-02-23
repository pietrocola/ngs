package view.utility.mediator;

import javax.swing.JLabel;

public class LabelNoAbbonamento extends JLabel implements Component{

	Mediator mediatore;
	
	public LabelNoAbbonamento(Mediator med, String testo)
	{
		super(testo);
		
		mediatore=med;
		mediatore.registraLabelNoAbbonamento(this);
	}
	
	@Override
	public void invia(String messaggio) {
		mediatore.inviaRicevi(messaggio);
		
	}

}
