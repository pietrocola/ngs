package ngs.model.strategy;

import java.util.ArrayList;

import ngs.persistentmodel.CategoriaCliente;

public interface IPoliticaScontoAbbonamentoStrategy {

	/**
	 * 
	 * @param pbm
	 * @param durataMesi
	 * @param numMesi
	 */
	float calcolaPrezzoAbbonamento(float pbm, int numMesi);

	ArrayList<IPoliticaScontoAbbonamentoStrategy> getPoliticheSconto();

	/**
	 * 
	 * @param politicaSconto
	 */
	int getNumeroMesi(IPoliticaScontoAbbonamentoStrategy politicaSconto);

}