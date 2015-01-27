package ngs.model.strategy;

import ngs.model.*;
import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.DescrizioneCorsoDAO;
import ngs.persistentmodel.ScontoPercentualeDAO;

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

	
	
	public boolean verificaNomePoliticaScontoPercentuale(String nomePolitica) {
		if(ScontoPercentualeDAO.getScontoPercentualeByORMID(nomePolitica)==null)
		{
			return true; // la descrizione corso non esiste
		}
		else
		{
			return false; // la descrzione corso è gia presente!!
		}
	}

}