package ngs.model.strategy.composite;

import java.util.ArrayList;
import java.util.HashSet;

import javassist.bytecode.Descriptor.Iterator;
import ngs.model.strategy.IPoliticaScontoAbbonamentoStrategy;
import ngs.model.strategy.ScontoFissoStrategy;
import ngs.model.strategy.ScontoPercentualeStrategy;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.PoliticaScontoAbbonamento;
import ngs.persistentmodel.ScontoFisso;
import ngs.persistentmodel.ScontoPercentuale;

public class CompositePrezzoProClienteStrategy extends CompositePrezzoStrategy {

	/**
	 * 
	 * @param pbm
	 * @param politicaSconto
	 */
	public float calcolaPrezzoAbbonamento(float pbm, PoliticaScontoAbbonamento politicaSconto) {
		
		
		float min=10000;
		
		
		for(IPoliticaScontoAbbonamentoStrategy ipsas: elencoStrategie){
			if(ipsas instanceof ScontoPercentualeStrategy){
				ScontoPercentuale sp=new ScontoPercentuale();
				sp.setScontoPercentuale(((ScontoPercentualeStrategy) ipsas).getPercentuale());
				sp.setNumeroMesi(((ScontoPercentualeStrategy) ipsas).getNumeroMesi());
				if(ipsas.calcolaPrezzoAbbonamento(pbm, sp)<min)
					min=ipsas.calcolaPrezzoAbbonamento(pbm, sp);
			}
			if(ipsas instanceof ScontoFissoStrategy){
				ScontoFisso sf=new ScontoFisso();
				sf.setScontoFisso(((ScontoFissoStrategy) ipsas).getScontoFisso());
				sf.setNumeroMesi(((ScontoFissoStrategy) ipsas).getNumeroMesi());
				if(ipsas.calcolaPrezzoAbbonamento(pbm, sf)<min)
					min=ipsas.calcolaPrezzoAbbonamento(pbm, sf);
			}
		}
		
		return min;
		
		
		/*
		System.out.println("ciao");
		//System.out.println(elencoStrategie.size());
		for(java.util.Iterator<IPoliticaScontoAbbonamentoStrategy> i=elencoStrategie.iterator();i.hasNext();){
			
			IPoliticaScontoAbbonamentoStrategy strategia=(IPoliticaScontoAbbonamentoStrategy) i.next();
			System.out.println(strategia.getClass());
			if(strategia instanceof ScontoPercentualeStrategy){
				ScontoPercentuale psa=new ScontoPercentuale();
				psa.setNumeroMesi(((ScontoPercentualeStrategy) strategia).getNumeroMesi());
				psa.setScontoPercentuale(((ScontoPercentualeStrategy) strategia).getPercentuale());
				if(strategia.calcolaPrezzoAbbonamento(pbm,psa)<min)
					min=strategia.calcolaPrezzoAbbonamento(pbm, psa);
			}
			
			if(strategia instanceof ScontoFissoStrategy){
				ScontoFisso sf=new ScontoFisso();
				sf.setNumeroMesi(((ScontoFissoStrategy) strategia).getNumeroMesi());
				sf.setScontoFisso(((ScontoFissoStrategy) strategia).getScontoFisso());
				if(strategia.calcolaPrezzoAbbonamento(pbm,sf)<min)
					min=strategia.calcolaPrezzoAbbonamento(pbm, sf);
			}
			
		}
		*/
		
	
		//throw new UnsupportedOperationException();
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







	@Override
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(
			CategoriaCliente cat, int numMesi) {
		// TODO Auto-generated method stub
		return null;
	}









	@Override
	public HashSet<Integer> getNumeroMesi(CategoriaCliente catCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}