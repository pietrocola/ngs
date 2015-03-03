package view.utility.observer;

import javax.swing.JLabel;

import ngs.factory.PoliticaScontoAbbonamentoStrategyFactory;

public class LabelPrezzoAbbonamento extends JLabel implements IListener{


	
	
	
	public void addInPublisher(PoliticaScontoAbbonamentoStrategyFactory psasf){
		psasf.addListener(this);
	}




	@Override
	public void actionAfterEvent(PoliticaScontoAbbonamentoStrategyFactory politicaScontoAbbonamentoStrategyFactory,String nome, float prezzo) {
		
		String p=Float.toString(prezzo);
		
		if(nome.equals("prezzoAbb"))
			this.setText(p+" €");
	}
	
	
	
	

}
