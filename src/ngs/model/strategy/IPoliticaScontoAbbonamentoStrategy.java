package ngs.model.strategy;

import java.util.ArrayList;

import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.DescrizioneAbbonamento;
import ngs.persistentmodel.PoliticaScontoAbbonamento;
import ngs.persistentmodel.ScontoPercentuale;

public interface IPoliticaScontoAbbonamentoStrategy {

	/**
	 * 
	 * @param pbm
	 * @param durataMesi
	 * @param numMesi
	 */
	float calcolaPrezzoAbbonamento(float pbm, PoliticaScontoAbbonamento politicaSconto);

	ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat);

	/**
	 * 
	 * @param politicaSconto
	 */
	int getNumeroMesi(PoliticaScontoAbbonamento politicaSconto);
	
	float getPercentuale(PoliticaScontoAbbonamento politicaSconto);

}