package view.utility.mediator;

import javax.swing.JLabel;

public class LabelNoCategorieClienti extends JLabel implements Component {

	
	
	Mediator mediatore;
	
	public LabelNoCategorieClienti(Mediator med, String testo)
	{
		super(testo);
		
		mediatore=med;
		mediatore.registraLabelNoCategorieClienti(this);
	}
	
	
	@Override
	public void invia(String messaggio) {
		mediatore.inviaRicevi(messaggio);
		
	}

}
