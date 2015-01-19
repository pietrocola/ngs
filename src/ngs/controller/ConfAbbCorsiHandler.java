package ngs.controller;

import org.orm.PersistentException;

import ngs.model.*;
import ngs.peristentmodel.DescrizioneCorso;
import ngs.peristentmodel.DescrizioneCorsoDAO;
import ngs.peristentmodel.TipologiaCorsoDAO;

public class ConfAbbCorsiHandler {
//COMMENTO PROVA
	M_DescrizioneCorso descCorso;
	M_TipologiaCorso tipCorso;

	//PATTERN SINGLETON
	public static ConfAbbCorsiHandler instance;
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



}