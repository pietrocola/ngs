package ngs.model.strategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javassist.bytecode.Descriptor.Iterator;
import ngs.model.*;
import ngs.model.strategy.composite.CompositePrezzoProClienteStrategy;
import ngs.model.strategy.composite.CompositePrezzoStrategy;
import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.DescrizioneCorso;
import ngs.persistentmodel.DescrizioneCorsoDAO;
import ngs.persistentmodel.PoliticaScontoAbbonamento;
import ngs.persistentmodel.PoliticaScontoAbbonamentoDAO;
import ngs.persistentmodel.ScontoPercentuale;
import ngs.persistentmodel.ScontoPercentualeDAO;

public class ScontoPercentualeStrategy extends AModel implements IPoliticaScontoAbbonamentoStrategy {

	/**
	 * 
	 * @param pbm
	 * @param numMesi
	 */
	
	
	private float percentuale;
	

	
	public float calcolaPrezzoAbbonamento(float pbm, PoliticaScontoAbbonamento politicaSconto) {
		
		//int numMesi=((ScontoPercentuale) politicaSconto).getNumeroMesi();
		//float percentuale=((ScontoPercentuale) politicaSconto).getScontoPercentuale();
		
		int numMesi=((ScontoPercentuale) politicaSconto).getNumeroMesi();
		float percentuale=((ScontoPercentuale) politicaSconto).getScontoPercentuale();
		
		return ((pbm*numMesi)-(((pbm*numMesi)*percentuale)/100));
		
	}

	
	
	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return model;
	}

	
	
	public boolean verificaNomePoliticaScontoPercentuale(String nomePolitica) {
		if(ScontoPercentualeDAO.getScontoPercentualeByORMID(nomePolitica)==null)
		{
			return true; // la descrizione corso non esiste
		}
		else
		{
			return false; // la descrzione corso è gia presente!!
		}
	}





	//private CompositePrezzoProClienteStrategy cppcs=new CompositePrezzoProClienteStrategy();  // meglio in FACTORY !!!
	
	@Override
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat,int numMesi) {
		
		//System.out.println("sto prendendo sconto percentuale dentro ScontoPercentualeStrategy");
		
		ArrayList<PoliticaScontoAbbonamento> elencoPoliticheSconto = new ArrayList<PoliticaScontoAbbonamento>();
		
		//PoliticaScontoAbbonamento psa=(PoliticaScontoAbbonamento)this.getPersistentModel();

		for(int i=0;i<ScontoPercentualeDAO.listScontoPercentualeByQuery(null,null).length;i++){
			if(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getCategoriaCliente().equals(cat) && ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getNumeroMesi()==numMesi){  
				elencoPoliticheSconto.add(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i]);
			   
			   
			   //IPoliticaScontoAbbonamentoStrategy sps=new ScontoPercentualeStrategy();
			   //System.out.println(sps.getClass());
			   
			  // ((ScontoPercentualeStrategy) sps).setPercentuale(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getScontoPercentuale());
			  // ((ScontoPercentualeStrategy) sps).setNumeroMesi(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getNumeroMesi());
			   
			   
			   //System.out.println(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getScontoPercentuale());
			   //sps.calcolaPrezzoAbbonamento(pbm, politicaSconto);	
			   //cppcs.addStrategiaPrezzo(sps); // farlo fare alla FACTORY !!!!
			   //System.out.println(cppcs.getElencoStrategie().size());
			   //System.out.println(cppcs.getElencoStrategie().get(0).getClass());
			}
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

	
	public void setPercentuale(float percentuale){
		this.percentuale=percentuale;
	}
	
	
	public float getPercentuale(){
		return percentuale;
	}
	
	
	
	
	@Override
	public int getNumeroMesi(PoliticaScontoAbbonamento politicaSconto) {
		
		int aux=-1;
		for(int i=0;i<ScontoPercentualeDAO.listScontoPercentualeByQuery(null,null).length;i++){
			if(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getNomePolitica()==politicaSconto.getNomePolitica())  
			   //arrayPolitiche.add(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i]);
				aux=ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getNumeroMesi();
			
				
		}
		return aux;
	}

	@Override
	public float getPercentuale(PoliticaScontoAbbonamento politicaSconto) {
		float aux=-1;
		for(int i=0;i<ScontoPercentualeDAO.listScontoPercentualeByQuery(null,null).length;i++){
			if(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getNomePolitica()==politicaSconto.getNomePolitica())  
			   //arrayPolitiche.add(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i]);
				aux=ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getScontoPercentuale();
			
				
		}
		return aux;
	}

	public boolean verificaCatClienteNumMesiScontoPercentuale(CategoriaCliente categoria,int numMesi) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null).length;i++){
			if(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getCategoriaCliente().equals(categoria) && ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getNumeroMesi()==numMesi)
				return false;
		}
		
		
		return true;
	}



	@Override
	public HashSet<Integer> getNumeroMesi(CategoriaCliente catCliente) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> elencoNumeroMesi = new HashSet<Integer>();

		for(int i=0;i<ScontoPercentualeDAO.listScontoPercentualeByQuery(null,null).length;i++){
			if(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getCategoriaCliente().equals(catCliente)){  
				elencoNumeroMesi.add(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getNumeroMesi());
			}
		}
		return elencoNumeroMesi;
	}



	@Override
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat) {
		
		ArrayList<PoliticaScontoAbbonamento> elencoPoliticheSconto = new ArrayList<PoliticaScontoAbbonamento>();
		
		for(int i=0;i<ScontoPercentualeDAO.listScontoPercentualeByQuery(null,null).length;i++){
			if(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getCategoriaCliente().equals(cat)){  
				elencoPoliticheSconto.add(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i]);
			   
			}
		}
		return elencoPoliticheSconto;
	}



}