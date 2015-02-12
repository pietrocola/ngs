package ngs.model.strategy.composite;

import ngs.model.strategy.*;
import ngs.persistentmodel.PoliticaScontoAbbonamento;

import java.util.*;

public abstract class CompositePrezzoStrategy implements IPoliticaScontoAbbonamentoStrategy {

	public ArrayList<IPoliticaScontoAbbonamentoStrategy> elencoStrategie=new ArrayList<IPoliticaScontoAbbonamentoStrategy>();

	
	
	/**
	 * 
	 * @param strategia
	 * @return 
	 */
	public void addStrategiaPrezzo(IPoliticaScontoAbbonamentoStrategy strategia) {
		
		//elencoStrategie.add(strategia);
		elencoStrategie.add(strategia);
		//throw new UnsupportedOperationException();
	}


	public ArrayList<IPoliticaScontoAbbonamentoStrategy> getElencoStrategie(){
		return elencoStrategie;
	}
	
	/**
	 * 
	 * @param pbm
	 * @param politicaSconto
	 */
	public abstract float calcolaPrezzoAbbonamento(float pbm, PoliticaScontoAbbonamento politicaSconto);
	
	
	
	

}