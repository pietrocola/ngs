package ngs.model;

import org.orm.PersistentException;

import ngs.peristentmodel.APersistentModel;
import ngs.peristentmodel.TipologiaCorsoDAO;

public class M_TipologiaCorso extends AModel {

	
	
	
	
	public String getNomeTipologia() {
		// TODO - implement M_TipologiaCorso.getNomeTipologia
		throw new UnsupportedOperationException();
	}

	public java.util.ArrayList<String> getNomiTipologie() {
		// TODO - implement M_TipologiaCorso.getNomiTipologie
		throw new UnsupportedOperationException();
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
	

}