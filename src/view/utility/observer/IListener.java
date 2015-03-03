package view.utility.observer;

import ngs.factory.PoliticaScontoAbbonamentoStrategyFactory;

public interface IListener {
	
	public void actionAfterEvent(PoliticaScontoAbbonamentoStrategyFactory politicaScontoAbbonamentoStrategyFactory,String nome,float prezzo);

}
