package ngs.model;

import java.util.ArrayList;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.DescrizioneAbbonamento;
import ngs.persistentmodel.PoliticaScontoAbbonamento;
import ngs.persistentmodel.PreventivoAbbonamento;
import ngs.persistentmodel.PreventivoAbbonamentoDAO;

public class M_PreventivoAbbonamento extends AModel {

	@Override
	public APersistentModel getPersistentModel() {

		return this.model;
	}

	
	
	public boolean verificaPreventivo(DescrizioneAbbonamento descAbb,PoliticaScontoAbbonamento politicaSconto) {
		
		PreventivoAbbonamento[] pa=PreventivoAbbonamentoDAO.listPreventivoAbbonamentoByQuery(null, null);
		for(int i=0;i<pa.length;i++){
			if(pa[i].getDescAbb().equals(descAbb) && pa[i].getPoliticaSconto().equals(politicaSconto))
				return false;
		}
		
		return true;
		
	}
	
	
}