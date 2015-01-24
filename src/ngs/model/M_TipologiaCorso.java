package ngs.model;

import java.util.ArrayList;

import org.orm.PersistentException;

import ngs.persistentmodel.*;

public class M_TipologiaCorso extends AModel {

	
	
	
	
	public String getNomeTipologia() {
		// TODO - implement M_TipologiaCorso.getNomeTipologia
		throw new UnsupportedOperationException();
	}

	
	/**
	 * restituisce tutte le tipologie memorizzate
	 * @return
	 */
	public java.util.ArrayList<String> getNomiTipologie() {
		// TODO - implement M_TipologiaCorso.getNomiTipologie
		
		ArrayList<String> arrayNomiTip = new ArrayList<String>();
		
		TipologiaCorso tip=(TipologiaCorso)this.getPersistentModel();
		
		
		//if(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)==null)
			//System.out.println("ciao");
		
		for(int i=0;i<TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null).length;i++){
			arrayNomiTip.add(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)[i].getNomeTip());
			//System.out.println(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)[i].getNomeTip());
		     //System.out.println(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)[i].getNomeTip().getClass());
		}
		
		//for(String s: arrayNomiTip)
			//System.out.println(s);
		
		//ArrayList<String> arrayNomiTip = new ArrayList<String>();
	
		
		return arrayNomiTip;	
		
		//throw new UnsupportedOperationException();
	}

	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

	
	
	//verifica se nome tipologia corso gia esiste, ogni volta che se inserisce una lettere nel textfield
	public boolean verificaNomeTipologiaCorso(String text) throws PersistentException {
		// TODO Auto-generated method stub
		
		if(TipologiaCorsoDAO.getTipologiaCorsoByORMID(text)==null)
		{
			//System.out.println("errore: tipologia non presente");
			return true; // la tipologia non esiste
		}
		else
		{
			//System.out.println(TipologiaCorsoDAO.getTipologiaCorsoByORMID(text).getNomeTip());
			return false; // la tipologia è gia presente!!
		}
		    
		/*
		if(TipologiaCorsoDAO.queryTipologiaCorso("nomeTip=lol", null).isEmpty())
		{ System.out.println("vettore vuoto");	return true;}
		else
		{System.out.println("vet pieno"); return false;}
		*/
	}


	/**
	 * 
	 * @param nomeCorso
	 */
	public TipologiaCorso getTipologia(String nomeCorso) {
		// TODO Auto-generated method stub
		//TipologiaCorso tp=(TipologiaCorso)this.getPersistentModel();
		return TipologiaCorsoDAO.getTipologiaCorsoByORMID(nomeCorso);
	}
	

}