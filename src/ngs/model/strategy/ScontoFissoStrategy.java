package ngs.model.strategy;

import java.util.ArrayList;

import ngs.model.*;
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
		int numMesi=((ScontoFisso) politicaSconto).getNumeroMesi();
		float scontoFisso=((ScontoFisso) politicaSconto).getScontoFisso();
		return ((pbm*numMesi)- scontoFisso);
	}

	
	
	
	
	
	
	@Override
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat) {
		
		ArrayList<PoliticaScontoAbbonamento> arrayPolitiche = new ArrayList<PoliticaScontoAbbonamento>();
		
		//PoliticaScontoAbbonamento psa=(PoliticaScontoAbbonamento)this.getPersistentModel();

		
		for(int i=0;i<ScontoFissoDAO.listScontoFissoByQuery(null,null).length;i++){
			if(ScontoFissoDAO.listScontoFissoByQuery(null, null)[i].getCategoriaCliente().equals(cat))  
			   arrayPolitiche.add(ScontoFissoDAO.listScontoFissoByQuery(null, null)[i]);
	
		}
		
		return arrayPolitiche;
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
}