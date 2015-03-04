package ngs.factory;

import java.util.ArrayList;

import view.utility.observer.IListener;
import ngs.controller.ConfAbbCorsiHandler;
import ngs.model.strategy.*;
import ngs.model.strategy.composite.CompositePrezzoProCentroStrategy;
import ngs.model.strategy.composite.CompositePrezzoProClienteStrategy;
import ngs.model.strategy.composite.CompositePrezzoStrategy;
import ngs.persistentmodel.*;

public class PoliticaScontoAbbonamentoStrategyFactory {

	// PATTERN OBSERVER
	public ArrayList<IListener> elencoAscoltatori=new ArrayList<IListener>();
	
	public void addListener(IListener a){
		elencoAscoltatori.add(a);
	}
	
	public void publishEvent(String nome,float prezzo){
		for(IListener a:elencoAscoltatori){
			a.actionAfterEvent(this, nome, prezzo);
		}
			
	}
	
	
	public float calcolaPrezzoAbbonamento(float pbm,ArrayList<PoliticaScontoAbbonamento> elencoPoliticheSconto, boolean proContro){
		
		if(proContro==true) // pro cliente
			politicaScontoAbbStrategy=new CompositePrezzoProClienteStrategy();
		
		if(proContro==false) // pro cliente
			politicaScontoAbbStrategy=new CompositePrezzoProCentroStrategy();
		
		for(PoliticaScontoAbbonamento psa: elencoPoliticheSconto){
			if(psa instanceof ScontoPercentuale){
				ScontoPercentualeStrategy sps=new ScontoPercentualeStrategy();
				sps.setPercentuale(((ScontoPercentuale) psa).getScontoPercentuale());
				sps.setNumeroMesi(((ScontoPercentuale) psa).getNumeroMesi());
				//cps.addStrategiaPrezzo(sps);
				((CompositePrezzoStrategy) politicaScontoAbbStrategy).addStrategiaPrezzo(sps);
			}
			if(psa instanceof ScontoFisso){
				ScontoFissoStrategy sfs=new ScontoFissoStrategy();
				sfs.setScontoFisso(((ScontoFisso) psa).getScontoFisso());
				sfs.setNumeroMesi(((ScontoFisso) psa).getNumeroMesi());
				//cps.addStrategiaPrezzo(sfs);
				((CompositePrezzoStrategy) politicaScontoAbbStrategy).addStrategiaPrezzo(sfs);
			}
		}
		
		PoliticaScontoAbbonamento politicaSconto=null;

		
		float prezzo=politicaScontoAbbStrategy.calcolaPrezzoAbbonamento(pbm, politicaSconto);
		
		//this.publishEvent("prezzoAbb", cps.calcolaPrezzoAbbonamento(pbm, politicaSconto)); // pattern observer
		this.publishEvent("prezzoAbb", prezzo); // pattern observer
		
		//return cps.calcolaPrezzoAbbonamento(pbm, politicaSconto);
		return prezzo;
		
		//int numMesi=politicaScontoAbbStrategy.getNumeroMesi(politicaSconto);
		//float percentuale=politicaScontoAbbStrategy.getPercentuale(politicaSconto);
		//return ((pbm*numMesi)-(((pbm*numMesi)*percentuale)/100));
		//System.out.println(politicaSconto.getClass());
		
		/*
		if(politicaSconto instanceof ScontoPercentuale)
		   politicaScontoAbbStrategy= new ScontoPercentualeStrategy();
		
		if(politicaSconto instanceof ScontoFisso)
			politicaScontoAbbStrategy= new ScontoFissoStrategy();
		*/
		
		//return politicaScontoAbbStrategy.calcolaPrezzoAbbonamento(pbm, politicaSconto);
		

	}
	// fine OBSERVER
	
	
	//PATTERN SINGLETON
	public static PoliticaScontoAbbonamentoStrategyFactory instance;
	
	IPoliticaScontoAbbonamentoStrategy politicaScontoAbbStrategy;

	//CompositePrezzoStrategy cps;
	
	
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
		
		ScontoPercentualeStrategy s= new ScontoPercentualeStrategy();
		ScontoPercentuale sps=(ScontoPercentuale) s.getPersistentModel();
		
		//ScontoPercentuale sps=ScontoPercentualeDAO.createScontoPercentuale();
		sps=ScontoPercentualeDAO.createScontoPercentuale();
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