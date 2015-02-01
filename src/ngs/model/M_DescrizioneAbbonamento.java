package ngs.model;

import java.util.ArrayList;

import ngs.model.strategy.*;
import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.CategoriaClienteDAO;
import ngs.persistentmodel.DescrizioneAbbonamento;
import ngs.persistentmodel.DescrizioneAbbonamentoDAO;
import ngs.persistentmodel.DescrizioneCorso;
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
			return false; // la descrzione abbonamento è gia presente!!
		}
	}

	public ArrayList<DescrizioneAbbonamento> getDescrizioniAbbonamenti() {
		ArrayList<DescrizioneAbbonamento> arrayAbb = new ArrayList<DescrizioneAbbonamento>();
		DescrizioneAbbonamento des=(DescrizioneAbbonamento)this.getPersistentModel();
		for(int i=0;i<DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null).length;i++)
			arrayAbb.add(DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null)[i]);
		return arrayAbb;
	}

	/**
	 *  
	 * @param descAbb
	 */
	public float getPrezzoBaseMensile(DescrizioneAbbonamento descAbb) {
		throw new UnsupportedOperationException();
	}

	/**
	 *  Restituisce la Descrizione Abbonamento dato il suo nome
	 */
	public DescrizioneAbbonamento getDescrizioneAbbonamento(String nomeAbbonamento) 
	{		
		DescrizioneAbbonamentoDAO desc= new DescrizioneAbbonamentoDAO();		
		return desc.loadDescrizioneAbbonamentoByORMID(nomeAbbonamento);		
	}

}