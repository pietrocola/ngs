package ngs.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.orm.PersistentException;

import ngs.factory.PoliticaScontoAbbonamentoStrategyFactory;
import ngs.model.*;
import ngs.model.strategy.ScontoPercentualeStrategy;
import ngs.persistentmodel.*;
import ngs.model.strategy.*;
import ngs.model.strategy.composite.CompositePrezzoProCentroStrategy;
import ngs.model.strategy.composite.CompositePrezzoProClienteStrategy;
import ngs.model.strategy.composite.CompositePrezzoStrategy;



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
	ScontoFissoStrategy scontoFisso;
	IPoliticaScontoAbbonamentoStrategy politicaScontoAbbStrategy;

	
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



	/**
	 * 
	 * @param categoriaCliente
	 * @param nomePolitica
	 * @param numeroMesi
	 * @param scontoPercentuale
	 */
	public boolean impostaPoliticaScontoPercentuale(CategoriaCliente categoriaCliente, String nomePolitica, int numeroMesi, float scontoPercentuale) {
	    
		return PoliticaScontoAbbonamentoStrategyFactory.getInstance().impostaPoliticaScontoPercentuale(categoriaCliente,nomePolitica,numeroMesi,scontoPercentuale);
		
		/*
		ScontoPercentuale sps=ScontoPercentualeDAO.createScontoPercentuale();
	    sps.setCategoriaCliente(categoriaCliente);
	    sps.setNomePolitica(nomePolitica);
	    sps.setNumeroMesi(numeroMesi);
	    sps.setScontoPercentuale(scontoPercentuale);

	    return ScontoPercentualeDAO.save(sps);
	    */
		
	}

	public ArrayList<DescrizioneAbbonamento> getDescrizioniAbbonamenti() {
		descAbb=new M_DescrizioneAbbonamento();
		return descAbb.getDescrizioniAbbonamenti();
	}

	
	
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat,int numMesi) {
		
		ArrayList<PoliticaScontoAbbonamento> elencoPoliticheSconto= new ArrayList<PoliticaScontoAbbonamento>();
		//System.out.println("ciao");
		

		politicaScontoAbbStrategy= new ScontoPercentualeStrategy();
		elencoPoliticheSconto=politicaScontoAbbStrategy.getPoliticheSconto(cat,numMesi);
		
		politicaScontoAbbStrategy= new ScontoFissoStrategy();
		elencoPoliticheSconto.addAll(politicaScontoAbbStrategy.getPoliticheSconto(cat,numMesi));
		
		
		//for(PoliticaScontoAbbonamento p: elencoPoliticheSconto){
			//System.out.println(p.getNomePolitica()); 
			//System.out.println(p.getClass());
		//}
		
		
		return elencoPoliticheSconto;
	}

	
	
	
	/**
	 * 
	 * @param descAbb
	 * @param politicaSconto
	 */
	public float calcolaPrezzoAbbonamento(DescrizioneAbbonamento descAbb, ArrayList<PoliticaScontoAbbonamento> elencoPoliticheSconto,boolean proContro) {
		float pbm=descAbb.getPrezzoBaseMensile();
		return PoliticaScontoAbbonamentoStrategyFactory.getInstance().calcolaPrezzoAbbonamento(pbm, elencoPoliticheSconto, proContro);
	}
	
	
	
	
	
	
	
	

	/**
	 * 
	 * @param descAbb
	 * @param politicaSconto
	 * @param prezzo
	 */
	public boolean creaPreventivoAbbonamento(DescrizioneAbbonamento descAbb,CategoriaCliente catCliente, int numMesi, float prezzo) {
			//int numMesi=politicaScontoAbbStrategy.getNumeroMesi(politicaSconto);
			PreventivoAbbonamento pa=PreventivoAbbonamentoDAO.createPreventivoAbbonamento();
	    
		    pa.setDescAbb(descAbb);
		    pa.setCategoriaCliente(catCliente);
		    //pa.setPoliticaSconto(politicaSconto);
		    pa.setPrezzo(prezzo);
		    pa.setNumeroMesi(numMesi);
		    return PreventivoAbbonamentoDAO.save(pa);
	    
	}
	
	
	
	public HashSet<Integer> getNumeroMesi(CategoriaCliente catCliente){
		
		HashSet<Integer> elencoNumeroMesi = new HashSet<Integer>();
		
		politicaScontoAbbStrategy= new ScontoPercentualeStrategy();
		elencoNumeroMesi=politicaScontoAbbStrategy.getNumeroMesi(catCliente);
		
		politicaScontoAbbStrategy= new ScontoFissoStrategy();
		
		
		elencoNumeroMesi.addAll(politicaScontoAbbStrategy.getNumeroMesi(catCliente));
		
		/*
		for(PoliticaScontoAbbonamento p: politiche){
			System.out.println(p.getNomePolitica()); 
			System.out.println(p.getClass());
		}
		*/
		
		return elencoNumeroMesi;
	}
	
	
	
	
	public int getNumeroMesi(PoliticaScontoAbbonamento politicaSconto){
		int numMesi=politicaScontoAbbStrategy.getNumeroMesi(politicaSconto);
		return numMesi;
	}
	
	
	
	public boolean verificaPreventivo(DescrizioneAbbonamento descAbb, CategoriaCliente cat, int numMesi) {
		M_PreventivoAbbonamento prevAbb = new M_PreventivoAbbonamento();
		return prevAbb.verificaPreventivo(descAbb,cat,numMesi);
		
		/*
		if(PreventivoAbbonamentoDAO.listPreventivoAbbonamentoByQuery("PoliticaScontoAbbonamentoID = '" + politicaSconto + "' AND DescrizioneAbbonamentoID = '" + descAbb + "'", "ID").length!=0)
	    {return true;}
		else
		{return false;}
		*/
	}
	
	
	
	public ArrayList<DescrizioneCorso> getDescrizioneCorso(
			DescrizioneAbbonamento descAbb2) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Restituisce la Descrizione Abbonamento dato il suo nome
	 */	
	public DescrizioneAbbonamento getDescrizioneAbbonamento(String string) 
	{
		descAbb = new M_DescrizioneAbbonamento();
		return descAbb.getDescrizioneAbbonamento(string);
	}

	
	
	
	
	public boolean verificaCatClienteNumMesiScontoPercentuale(CategoriaCliente categoria,int numMesi) {
		
		scontoPercentuale= new ScontoPercentualeStrategy();
		return scontoPercentuale.verificaCatClienteNumMesiScontoPercentuale(categoria,numMesi);
		
		
		
	}

	
	

	
	
	
	public boolean verificaNomePoliticaScontoFisso(String nomePolitica) {
		scontoFisso= new ScontoFissoStrategy();
		return scontoFisso.verificaNomePoliticaScontoFisso(nomePolitica);
	}

	
	
	
	
	
	
	
	public boolean verificaCatClienteNumMesiScontoFisso(CategoriaCliente categoria, int numMesi) {
		scontoFisso= new ScontoFissoStrategy();
		return scontoFisso.verificaCatClienteNumMesiScontoFisso(categoria,numMesi);
	}

	
	
	
	public boolean impostaPoliticaScontoFisso(CategoriaCliente categoria,String nomePolitica, int numMesi, float scontoFis) {
		return PoliticaScontoAbbonamentoStrategyFactory.getInstance().impostaPoliticaScontoFisso(categoria,nomePolitica,numMesi,scontoFis);
	}

	
	
	public Boolean verificaConfigurazioneAbbonamento(Set<DescrizioneCorso> elencoCorsiSelezionati,Set<SalaPesi> elencoSalePesiSelezionate) {
		descAbb=new M_DescrizioneAbbonamento();
		return descAbb.verificaConfigurazioneAbbonamento(elencoCorsiSelezionati,elencoSalePesiSelezionate);
	}

	
	
	
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat) {
		ArrayList<PoliticaScontoAbbonamento> elencoPoliticheSconto= new ArrayList<PoliticaScontoAbbonamento>();
		//System.out.println("ciao");
		

		politicaScontoAbbStrategy= new ScontoPercentualeStrategy();
		elencoPoliticheSconto=politicaScontoAbbStrategy.getPoliticheSconto(cat);
		
		politicaScontoAbbStrategy= new ScontoFissoStrategy();
		elencoPoliticheSconto.addAll(politicaScontoAbbStrategy.getPoliticheSconto(cat));
		
		return elencoPoliticheSconto;
	}

	

	
	
}