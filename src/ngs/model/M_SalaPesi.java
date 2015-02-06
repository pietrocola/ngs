package ngs.model;

import java.util.ArrayList;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.DescrizioneCorso;
import ngs.persistentmodel.DescrizioneCorsoDAO;
import ngs.persistentmodel.SalaPesi;
import ngs.persistentmodel.SalaPesiDAO;

public class M_SalaPesi extends AModel {

	
	
	
	
	public ArrayList<SalaPesi> getSalePesi() {
		
		ArrayList<SalaPesi> arraySalePesi = new ArrayList<SalaPesi>();
		
		SalaPesi sl=(SalaPesi)this.getPersistentModel();
		
		
		//if(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)==null)
			//System.out.println("ciao");
		
		for(int i=0;i<SalaPesiDAO.listSalaPesiByQuery(null, null).length;i++)
			arraySalePesi.add(SalaPesiDAO.listSalaPesiByQuery(null, null)[i]);
			//System.out.println(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)[i].getNomeTip());
		     //System.out.println(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)[i].getNomeTip().getClass());
		
		
		return arraySalePesi;
	}

	
	
	
	


	
	
	
	
	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

}