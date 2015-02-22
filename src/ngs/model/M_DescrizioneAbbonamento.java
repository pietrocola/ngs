package ngs.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.hibernate.mapping.Set;

import ngs.model.strategy.*;
import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.CategoriaClienteDAO;
import ngs.persistentmodel.DescrizioneAbbonamento;
import ngs.persistentmodel.DescrizioneAbbonamentoDAO;
import ngs.persistentmodel.DescrizioneCorso;
import ngs.persistentmodel.DescrizioneCorsoDAO;
import ngs.persistentmodel.SalaPesi;
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

	
	
	public ArrayList<DescrizioneCorso> getCorsiAbbonamento(String nomeAbb) {
		ArrayList<DescrizioneCorso> elencoCorsiAbb=new ArrayList<DescrizioneCorso>();
		DescrizioneAbbonamento da=null;
		for(int i=0;i<DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null).length;i++)
			if(DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null)[i].getNomeAbbonamento().equals(nomeAbb))
				da=DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null)[i];
		
		java.util.Set s=da.getElencoCorsi();
		Iterator<DescrizioneCorso> iter =  s.iterator();
		while(iter.hasNext())
		 {								
			DescrizioneCorso dc = iter.next();
			elencoCorsiAbb.add(dc);
			
		 }
		
		 return elencoCorsiAbb;
		 
	}

	public ArrayList<SalaPesi> getSalePesiAbbonamento(String nomeAbb) {
		ArrayList<SalaPesi> elencoSalePesi=new ArrayList<SalaPesi>();
		DescrizioneAbbonamento da=null;
		for(int i=0;i<DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null).length;i++)
			if(DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null)[i].getNomeAbbonamento().equals(nomeAbb))
				da=DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null)[i];
		
		java.util.Set s=da.getElencoSalePesi();
		Iterator<SalaPesi> iter =  s.iterator();
		while(iter.hasNext())
		 {								
			SalaPesi sp = iter.next();
			elencoSalePesi.add(sp);
			
		 }
		
		 return elencoSalePesi;
	}

	
	
	
	
	public Boolean verificaConfigurazioneAbbonamento(java.util.Set<DescrizioneCorso> elencoCorsiSelezionati,java.util.Set<SalaPesi> elencoSalePesiSelezionate) {
		
		Boolean aux=false;
		
		for(int i=0; i<DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null).length;i++){
			java.util.Set<DescrizioneCorso> elencoCorsi=DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null)[i].getElencoCorsi();
			if(elencoCorsi.equals(elencoCorsiSelezionati))
				aux=true;
		}
		
		
		
		if(aux==true){
			for(int i=0; i<DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null).length;i++){
				java.util.Set<SalaPesi> elencoSale= DescrizioneAbbonamentoDAO.listDescrizioneAbbonamentoByQuery(null, null)[i].getElencoSalePesi();
				if(elencoSale.equals(elencoSalePesiSelezionate))
					return true;
			}
		}

		return false;
		

	}

}