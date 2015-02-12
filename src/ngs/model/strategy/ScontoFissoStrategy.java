package ngs.model.strategy;

import java.util.ArrayList;
import java.util.HashSet;

import ngs.model.*;
import ngs.model.strategy.composite.CompositePrezzoProClienteStrategy;
import ngs.model.strategy.composite.CompositePrezzoStrategy;
import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.PoliticaScontoAbbonamento;
import ngs.persistentmodel.ScontoFissoDAO;
import ngs.persistentmodel.ScontoPercentuale;
import ngs.persistentmodel.ScontoFisso;
import ngs.persistentmodel.ScontoPercentualeDAO;

public class ScontoFissoStrategy extends AModel implements IPoliticaScontoAbbonamentoStrategy {

	
	
	
	@Override
	public float calcolaPrezzoAbbonamento(float pbm, PoliticaScontoAbbonamento politicaSconto) {
		
		//int numMesi=((ScontoFisso) politicaSconto).getNumeroMesi();
		//float scontoFisso=((ScontoFisso) politicaSconto).getScontoFisso();
		
		int numMesi=((ScontoFisso) politicaSconto).getNumeroMesi();
		float percentuale=((ScontoFisso) politicaSconto).getScontoFisso();
		
		return ((pbm*numMesi)- scontoFisso);
	}

	
	
	
	
	//CompositePrezzoProClienteStrategy cppcs=new CompositePrezzoProClienteStrategy();  // in FACTORY !!!!
	
	/**
	 * 
	 * @param cat
	 */
	@Override
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat, int numMesi) {
		
		//System.out.println("sto prendendo sconto fisso dentro ScontoPercentualeFisso");
		
		ArrayList<PoliticaScontoAbbonamento> elencoPoliticheSconto = new ArrayList<PoliticaScontoAbbonamento>();
		
		//PoliticaScontoAbbonamento psa=(PoliticaScontoAbbonamento)this.getPersistentModel();

		for(int i=0;i<ScontoFissoDAO.listScontoFissoByQuery(null,null).length;i++){
			if(ScontoFissoDAO.listScontoFissoByQuery(null, null)[i].getCategoriaCliente().equals(cat) && ScontoFissoDAO.listScontoFissoByQuery(null, null)[i].getNumeroMesi()==numMesi)  
				elencoPoliticheSconto.add(ScontoFissoDAO.listScontoFissoByQuery(null, null)[i]);
			  
				//ScontoFissoStrategy sfs=new ScontoFissoStrategy();
			  
			   //((ScontoFissoStrategy) sfs).setScontoFisso(ScontoFissoDAO.listScontoFissoByQuery(null, null)[i].getScontoFisso());
			   //((ScontoFissoStrategy) sfs).setNumeroMesi(ScontoFissoDAO.listScontoFissoByQuery(null, null)[i].getNumeroMesi());
			   
			   
			   //System.out.println(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getScontoPercentuale());
			   //sps.calcolaPrezzoAbbonamento(pbm, politicaSconto);	
			   //cppcs.addStrategiaPrezzo(sfs);// farlo fare alla FACTORY !!!!
			   //System.out.println(cppcs.getElencoStrategie().size());
			}
		
		return elencoPoliticheSconto;
	}



	public int numeroMesi;
	
	public void setNumeroMesi(int numMesi){
		this.numeroMesi=numMesi;
	}
	
	
	public int getNumeroMesi(){
		return numeroMesi;
	}
	
	
	
	
	public void setScontoFisso(float scontoFisso){
		this.scontoFisso=scontoFisso;
	}
	
	public float getScontoFisso(){
		return scontoFisso;
	}
	
	
	
	
	
	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}







	@Override
	public int getNumeroMesi(PoliticaScontoAbbonamento politicaSconto) {
		// TODO Auto-generated method stub
		return 0;
	}







	@Override
	public float getPercentuale(PoliticaScontoAbbonamento politicaSconto) {
		// TODO Auto-generated method stub
		return 0;
	}







	public boolean verificaNomePoliticaScontoFisso(String nomePolitica) {
		if(ScontoFissoDAO.getScontoFissoByORMID(nomePolitica)==null)
		{
			return true; // la descrizione corso non esiste
		}
		else
		{
			return false; // la descrzione corso è gia presente!!
		}
	}







	public boolean verificaCatClienteNumMesiScontoFisso(CategoriaCliente categoria, int numMesi) {
		
		for(int i=0; i<ScontoFissoDAO.listScontoFissoByQuery(null, null).length;i++){
			if(ScontoFissoDAO.listScontoFissoByQuery(null, null)[i].getCategoriaCliente().equals(categoria) && ScontoFissoDAO.listScontoFissoByQuery(null, null)[i].getNumeroMesi()==numMesi)
				return false;
		}
		
		
		return true;
	}

	private float scontoFisso;

	
	
	@Override
	public HashSet<Integer> getNumeroMesi(CategoriaCliente catCliente) {
		HashSet<Integer> elencoNumeroMesi = new HashSet<Integer>();

		for(int i=0;i<ScontoFissoDAO.listScontoFissoByQuery(null,null).length;i++){
			if(ScontoFissoDAO.listScontoFissoByQuery(null, null)[i].getCategoriaCliente().equals(catCliente)){  
				elencoNumeroMesi.add(ScontoFissoDAO.listScontoFissoByQuery(null, null)[i].getNumeroMesi());
			}
		}
		return elencoNumeroMesi;
	}
}