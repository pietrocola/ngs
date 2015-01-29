package ngs.model.strategy;

import java.util.ArrayList;

import ngs.model.*;
import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.DescrizioneCorsoDAO;
import ngs.persistentmodel.ScontoPercentualeDAO;

public class ScontoPercentualeStrategy extends AModel implements IPoliticaScontoAbbonamentoStrategy {

	/**
	 * 
	 * @param pbm
	 * @param numMesi
	 */
	public float calcolaPrezzoAbbonamento(float pbm, int numMesi) {
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

	public ArrayList<IPoliticaScontoAbbonamentoStrategy> getPoliticheSconto() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param politicaSconto
	 */
	public int getNumeroMesi(IPoliticaScontoAbbonamentoStrategy politicaSconto) {
		throw new UnsupportedOperationException();
	}

}