package ngs.controller;

import java.util.ArrayList;

import org.orm.PersistentException;

import ngs.model.*;
import ngs.persistentmodel.*;



public class ConfAbbCorsiHandler {
//COMMENTO PROVA
	M_DescrizioneCorso descCorso;
	M_TipologiaCorso tipCorso;

	//PATTERN SINGLETON
	public static ConfAbbCorsiHandler instance;
	M_DescrizioneAbbonamento descAbb;
	M_CategoriaCliente catCliente;
	M_SalaPesi salaPesi;
	

	
	//PATTER SINGLETON
	public static ConfAbbCorsiHandler getInstance()
	{
		if(instance==null)
		{
			instance = new ConfAbbCorsiHandler();
		}
		return instance;
	}
	
	/**
	 * 
	 * @param nomeTip
	 * @throws PersistentException 
	 */
	
	
	public boolean impostaTipologiaCorso(String nomeTip) throws PersistentException {
		// TODO - implement ConfAbbCorsiHandler.impostaTipologiaCorso
		
		//System.out.println(nomeTip);
		descCorso = new M_DescrizioneCorso();
		return descCorso.impostaTipologiaCorso(nomeTip);
		
		//throw new UnsupportedOperationException();
	}

	
	/**
	 * restituisce tutte le tipologie memorizzate
	 * @return
	 */
	public java.util.ArrayList<String> getNomiTipologie() {
		// TODO - implement ConfAbbCorsiHandler.getNomiTipologie
		tipCorso = new M_TipologiaCorso();
		return tipCorso.getNomiTipologie();
		//throw new UnsupportedOperationException();
	}

	/**
	 * creazione e salvataggio su database di una descrizione corso
	 * @param nomeCorso
	 * @param prenotazione
	 * @param nomeTip
	 */
	public Boolean configuraCorso(String nomeCorso, boolean prenotazione, String nomeTip) {
		// TODO - implement ConfAbbCorsiHandler.configuraCorso
		tipCorso = new M_TipologiaCorso();
		

		DescrizioneCorso dc=DescrizioneCorsoDAO.createDescrizioneCorso();
		dc.setNomeCorso(nomeCorso);
		dc.setTipCorso(tipCorso.getTipologia(nomeTip));
		dc.setPrenotazione(prenotazione);
		
		return DescrizioneCorsoDAO.save(dc);
		
		//throw new UnsupportedOperationException();
	}

	
	public boolean verificaNomeTipologiaCorso(String text) throws PersistentException {
		// TODO Auto-generated method stub
		tipCorso= new M_TipologiaCorso();
		//System.out.println(tipCorso.verificaNomeTipologiaCorso(text));
		return tipCorso.verificaNomeTipologiaCorso(text);
	}

	
	public boolean verificaNomeDescrizioneCorso(String nomeDesc) {
		// TODO Auto-generated method stub
		descCorso= new M_DescrizioneCorso();
		//System.out.println(tipCorso.verificaNomeTipologiaCorso(text));
		return descCorso.verificaNomeDescrizioneCorso(nomeDesc);

	}

	/**
	 * 
	 * @param nomeCat
	 */
	public boolean impostaCategoriaCliente(String nomeCat) {
		
		descAbb = new M_DescrizioneAbbonamento();
		return descAbb.impostaCategoriaCliente(nomeCat);
		//throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param oraInizio
	 * @param oraFine
	 */
	public boolean impostaFasciaOrariaSalaPesi(int oraInizio, int oraFine) {
		throw new UnsupportedOperationException();
	}

	
	
	
	/**
	 * restituisce tutti i corsi presenti su db
	 * @return
	 */
	public ArrayList<DescrizioneCorso> getDescrizioniCorsi() {
		
		descCorso=new M_DescrizioneCorso();
		return descCorso.getDescrizioniCorsi();

	}

	
	
	
	
	public ArrayList<SalaPesi> getSalePesi() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<FasciaOrariaSalaPesi> getFasceOrarieSalaPesi() {
		throw new UnsupportedOperationException();
	}

	public boolean configuraAbbonamento() {
		throw new UnsupportedOperationException();
	}


	public ArrayList<CategoriaCliente> getCategorieClienti() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param categoriaCliente
	 * @param nomePolitica
	 * @param unMese
	 * @param treMesi
	 * @param seiMesi
	 * @param dodiciMesi
	 */
	public void impostaPoliticaScontoPercentuale(CategoriaCliente categoriaCliente, String nomePolitica, float unMese, float treMesi, float seiMesi, float dodiciMesi) {
		throw new UnsupportedOperationException();
	}

	public boolean verificaNomeCategoriaCliente(String nomeCat) {
		catCliente= new M_CategoriaCliente();
		//System.out.println(tipCorso.verificaNomeTipologiaCorso(text));
		return catCliente.verificaNomeCategoriaCliente(nomeCat);
	}


	
}