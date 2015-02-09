package ngs.factory;

import ngs.controller.ConfAbbCorsiHandler;
import ngs.model.strategy.*;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.ScontoFisso;
import ngs.persistentmodel.ScontoFissoDAO;
import ngs.persistentmodel.ScontoPercentuale;
import ngs.persistentmodel.ScontoPercentualeDAO;

public class PoliticaScontoAbbonamentoStrategyFactory {

	//PATTERN SINGLETON
	public static PoliticaScontoAbbonamentoStrategyFactory instance;
	IPoliticaScontoAbbonamentoStrategy politicaScontoAbbStrategy;
	
	
	
	public static PoliticaScontoAbbonamentoStrategyFactory getInstance(){
		if(instance==null)
			instance=new PoliticaScontoAbbonamentoStrategyFactory();
		return instance;
	}

	
	
	
	public IPoliticaScontoAbbonamentoStrategy getPoliticaSconto(String nomeClasse) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		politicaScontoAbbStrategy=(IPoliticaScontoAbbonamentoStrategy) Class.forName("ngs.model.strategy."+nomeClasse).newInstance();
		
		return politicaScontoAbbStrategy;
		

	}




	public boolean impostaPoliticaScontoPercentuale(CategoriaCliente categoriaCliente, String nomePolitica, int numeroMesi, float scontoPercentuale) {
		
		ScontoPercentuale sps=ScontoPercentualeDAO.createScontoPercentuale();
	    sps.setCategoriaCliente(categoriaCliente);
	    sps.setNomePolitica(nomePolitica);
	    sps.setNumeroMesi(numeroMesi);
	    sps.setScontoPercentuale(scontoPercentuale);

	    return ScontoPercentualeDAO.save(sps);
	
		
	}




	public boolean impostaPoliticaScontoFisso(CategoriaCliente categoria, String nomePolitica, int numMesi, float scontoFis) {
		ScontoFisso sf=ScontoFissoDAO.createScontoFisso();
	    sf.setCategoriaCliente(categoria);
	    sf.setNomePolitica(nomePolitica);
	    sf.setNumeroMesi(numMesi);
	    sf.setScontoFisso(scontoFis);

	    return ScontoFissoDAO.save(sf);
	}
	
	
	
	


}