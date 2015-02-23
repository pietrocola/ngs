package ngs.model.strategy.composite;

import java.util.ArrayList;
import java.util.HashSet;

import ngs.model.strategy.IPoliticaScontoAbbonamentoStrategy;
import ngs.model.strategy.ScontoFissoStrategy;
import ngs.model.strategy.ScontoPercentualeStrategy;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.PoliticaScontoAbbonamento;
import ngs.persistentmodel.ScontoFisso;
import ngs.persistentmodel.ScontoPercentuale;

public class CompositePrezzoProCentroStrategy extends CompositePrezzoStrategy {

	/**
	 * 
	 * @param pbm
	 * @param politicaSconto
	 */
	public float calcolaPrezzoAbbonamento(float pbm, PoliticaScontoAbbonamento politicaSconto) {
		
		float max=0;
		
		
		for(IPoliticaScontoAbbonamentoStrategy ipsas: elencoStrategie){
			if(ipsas instanceof ScontoPercentualeStrategy){
				ScontoPercentuale sp=new ScontoPercentuale();
				sp.setScontoPercentuale(((ScontoPercentualeStrategy) ipsas).getPercentuale());
				sp.setNumeroMesi(((ScontoPercentualeStrategy) ipsas).getNumeroMesi());
				if(ipsas.calcolaPrezzoAbbonamento(pbm, sp)>max)
					max=ipsas.calcolaPrezzoAbbonamento(pbm, sp);
			}
			if(ipsas instanceof ScontoFissoStrategy){
				ScontoFisso sf=new ScontoFisso();
				sf.setScontoFisso(((ScontoFissoStrategy) ipsas).getScontoFisso());
				sf.setNumeroMesi(((ScontoFissoStrategy) ipsas).getNumeroMesi());
				if(ipsas.calcolaPrezzoAbbonamento(pbm, sf)>max)
					max=ipsas.calcolaPrezzoAbbonamento(pbm, sf);
			}
		}
		return max;
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
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(CategoriaCliente cat, int numMesi) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public HashSet<Integer> getNumeroMesi(CategoriaCliente catCliente) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public ArrayList<PoliticaScontoAbbonamento> getPoliticheSconto(
			CategoriaCliente cat) {
		// TODO Auto-generated method stub
		return null;
	}

}