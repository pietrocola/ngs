package ngs.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.orm.PersistentException;

import ngs.model.*;
import ngs.model.strategy.ScontoPercentualeStrategy;
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
	ScontoPercentualeStrategy scontoPercentuale;

	
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
		
	    CategoriaCliente cc=CategoriaClienteDAO.createCategoriaCliente();
	    cc.setNomeCat(nomeCat);

	    return CategoriaClienteDAO.save(cc);
		
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

	
	
	
	/**
	 * restituisce tutte le sale pesi presenti su db
	 * @return
	 */
	public ArrayList<SalaPesi> getSalePesi() {
		
		salaPesi=new M_SalaPesi();
		return salaPesi.getSalePesi();
	}


	
	
	
	
	public ArrayList<FasciaOrariaSalaPesi> getFasceOrarieSalaPesi() {
		throw new UnsupportedOperationException();
	}

	
	/**
	 * salva su db una descrizioneAbbonamento
	 * @param nomeAbb
	 * @param prezzoBaseMensile
	 * @param elencoCorsiSelezionati
	 * @param elencoSalePesiSelezionate
	 * @return
	 */
	public boolean configuraAbbonamento(String nomeAbb, float prezzoBaseMensile, Set<DescrizioneCorso> elencoCorsiSelezionati, Set<SalaPesi> elencoSalePesiSelezionate) {
	    DescrizioneAbbonamento da=DescrizioneAbbonamentoDAO.createDescrizioneAbbonamento();
	    da.setNomeAbbonamento(nomeAbb);
	    da.setPrezzoBaseMensile(prezzoBaseMensile);
	    da.setElencoCorsi(elencoCorsiSelezionati);
	    da.setElencoSalePesi(elencoSalePesiSelezionate);
	    return DescrizioneAbbonamentoDAO.save(da);
	}


	/**
	 * prende le categorie clienti da db
	 * @return
	 */
	
	public ArrayList<CategoriaCliente> getCategorieClienti() {
		
		catCliente=new M_CategoriaCliente();
		return catCliente.getCategorieClienti();
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
	public boolean impostaPoliticaScontoPercentuale(CategoriaCliente categoriaCliente, String nomePolitica, float unMese, float treMesi, float seiMesi, float dodiciMesi) {
	    ScontoPercentuale sps=ScontoPercentualeDAO.createScontoPercentuale();
	    sps.setCategoriaCliente(categoriaCliente);
	    sps.setNomePolitica(nomePolitica);
	    sps.setUnMese(unMese);
	    sps.setTreMesi(treMesi);
	    sps.setSeiMesi(seiMesi);
	    sps.setDodiciMesi(dodiciMesi);

	    return ScontoPercentualeDAO.save(sps);
	}

	
	
	
	
	public boolean verificaNomeCategoriaCliente(String nomeCat) {
		catCliente= new M_CategoriaCliente();
		//System.out.println(tipCorso.verificaNomeTipologiaCorso(text));
		return catCliente.verificaNomeCategoriaCliente(nomeCat);
	}

	public boolean verificaNomeDescrizioneAbbonamento(String nomeAbb) {
		descAbb= new M_DescrizioneAbbonamento();
		return descAbb.verificaNomeDescrizioneAbbonamento(nomeAbb);
	}

	public boolean verificaNomePoliticaScontoPercentuale(String nomePolitica) {
		// TODO Auto-generated method stub
		
		scontoPercentuale= new ScontoPercentualeStrategy();
		return scontoPercentuale.verificaNomePoliticaScontoPercentuale(nomePolitica);
	
	}


	
}