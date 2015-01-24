package ngs.model.strategy;

import ngs.persistentmodel.CategoriaCliente;

public interface IPoliticaScontoAbbonamentoStrategy {

	/**
	 * 
	 * @param catCliente
	 * @param durataMesi
	 */
	float calcolaPrezzoAbbonamento(CategoriaCliente catCliente, int durataMesi);

}