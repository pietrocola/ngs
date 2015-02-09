package ngs.model.strategy;

import java.util.ArrayList;

import javassist.bytecode.Descriptor.Iterator;
import ngs.model.*;
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
	
	
	public float calcolaPrezzoAbbonamento(float pbm, PoliticaScontoAbbonamento politicaSconto) {
		
		int numMesi=((ScontoPercentuale) politicaSconto).getNumeroMesi();
		float percentuale=((ScontoPercentuale) politicaSconto).getScontoPercentuale();
		return ((pbm*numMesi)-(((pbm*numMesi)*percentuale)/100));
		
	}

	
	
	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
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





	
	
	@Override
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat) {
		
		ArrayList<PoliticaScontoAbbonamento> arrayPolitiche = new ArrayList<PoliticaScontoAbbonamento>();
		
		//PoliticaScontoAbbonamento psa=(PoliticaScontoAbbonamento)this.getPersistentModel();

		
		for(int i=0;i<ScontoPercentualeDAO.listScontoPercentualeByQuery(null,null).length;i++){
			if(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i].getCategoriaCliente().equals(cat))  
			   arrayPolitiche.add(ScontoPercentualeDAO.listScontoPercentualeByQuery(null, null)[i]);
	
		}
		
		return arrayPolitiche;
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

}