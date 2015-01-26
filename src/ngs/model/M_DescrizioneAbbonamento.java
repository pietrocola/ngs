package ngs.model;

import ngs.model.strategy.*;
import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.CategoriaClienteDAO;
import ngs.persistentmodel.DescrizioneAbbonamentoDAO;
import ngs.persistentmodel.DescrizioneCorsoDAO;
import ngs.persistentmodel.TipologiaCorso;
import ngs.persistentmodel.TipologiaCorsoDAO;

public class M_DescrizioneAbbonamento extends AModel {

	IPoliticaScontoAbbonamentoStrategy prezzoStrategy;


	public float calcolaPrezzo() {
		throw new UnsupportedOperationException();
	}

	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

	public boolean verificaNomeDescrizioneAbbonamento(String nomeAbb) {
		if(DescrizioneAbbonamentoDAO.getDescrizioneAbbonamentoByORMID(nomeAbb)==null)
		{
			return true; // la descrizione abbonamento non esiste
		}
		else
		{
			return false; // la descrzione abbonamento � gia presente!!
		}
	}

}