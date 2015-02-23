package view.utility.mediator;

import javax.swing.JLabel;

public class LabelNoPoliticheSconto extends JLabel implements Component{
	
	
	Mediator mediatore;
	
	public LabelNoPoliticheSconto(Mediator med, String testo)
	{
		super(testo);
		
		mediatore=med;
		mediatore.registraLabelNoPoliticheSconto(this);
	}

	@Override
	public void invia(String messaggio) {
		mediatore.inviaRicevi(messaggio);
		
	}

}
