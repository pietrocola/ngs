package ngs.model.strategy;

import ngs.model.*;
import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;

public class ScontoPercentualeStrategy extends AModel implements IPoliticaScontoAbbonamentoStrategy {

	/**
	 * 
	 * @param catCliente
	 * @param durataMesi
	 */
	public float calcolaPrezzoAbbonamento(CategoriaCliente catCliente, int durataMesi) {
		throw new UnsupportedOperationException();
	}

	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

}