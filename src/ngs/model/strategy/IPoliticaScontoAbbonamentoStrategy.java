package ngs.model.strategy;

import java.util.ArrayList;

import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.PoliticaScontoAbbonamento;

public interface IPoliticaScontoAbbonamentoStrategy {

	/**
	 * 
	 * @param pbm
	 * @param durataMesi
	 * @param numMesi
	 */
	float calcolaPrezzoAbbonamento(float pbm, int numMesi);

	ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat);

	/**
	 * 
	 * @param politicaSconto
	 */
	int getNumeroMesi(PoliticaScontoAbbonamento politicaSconto);
	
	float getPercentuale(PoliticaScontoAbbonamento politicaSconto);

}