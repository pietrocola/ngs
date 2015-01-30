package ngs.model;

import java.util.ArrayList;

import org.orm.PersistentException;

import ngs.persistentmodel.*;


public class M_DescrizioneCorso extends AModel {

	public String[] getInfoRiepilogo() {
		throw new UnsupportedOperationException();
	}

	
	
	/**
	 * 
	 * @param nomeTip
	 * @throws PersistentException 
	 */
	
	public boolean impostaTipologiaCorso(String nomeTip) throws PersistentException {
		
	    TipologiaCorso tp = (TipologiaCorso)this.getPersistentModel();
	    tp=TipologiaCorsoDAO.createTipologiaCorso();
	    tp.setNomeTip(nomeTip);
	    //tp=new TipologiaCorso();
		//tp.setNomeTip(nomeTip);
		//TipologiaCorsoDAO tpd=new TipologiaCorsoDAO();
		//boolean aux;
		//aux=tpd.save(tp);
	    return TipologiaCorsoDAO.save(tp);
	    //System.out.println(aux);
		//throw new UnsupportedOperationException();
	}



	@Override
	public APersistentModel getPersistentModel() {
		return this.model;
	}



	public boolean verificaNomeDescrizioneCorso(String nomeDesc) {
		if(DescrizioneCorsoDAO.getDescrizioneCorsoByORMID(nomeDesc)==null)
		{
			return true; // la descrizione corso non esiste
		}
		else
		{
			return false; // la descrzione corso è gia presente!!
		}
	}

	public ArrayList<DescrizioneCorso> getDescrizioniCorsi() {
		
		ArrayList<DescrizioneCorso> arrayCorsi = new ArrayList<DescrizioneCorso>();
		
		//DescrizioneCorso des=(DescrizioneCorso)this.getPersistentModel();
		
		
		//if(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)==null)
			//System.out.println("ciao");
		
		for(int i=0;i<DescrizioneCorsoDAO.listDescrizioneCorsoByQuery(null, null).length;i++)
			arrayCorsi.add(DescrizioneCorsoDAO.listDescrizioneCorsoByQuery(null, null)[i]);
			//System.out.println(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)[i].getNomeTip());
		     //System.out.println(TipologiaCorsoDAO.listTipologiaCorsoByQuery(null, null)[i].getNomeTip().getClass());
		
		
		return arrayCorsi;
	}

	

}