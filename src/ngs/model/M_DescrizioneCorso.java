package ngs.model;

import org.orm.PersistentException;

import ngs.peristentmodel.APersistentModel;
import ngs.peristentmodel.TipologiaCorso;
import ngs.peristentmodel.TipologiaCorsoDAO;


public class M_DescrizioneCorso extends AModel {

	public String[] getInfoRiepilogo() {
		// TODO - implement M_DescrizioneCorso.getInfoRiepilogo
		throw new UnsupportedOperationException();
	}

	
	
	/**
	 * 
	 * @param nomeTip
	 * @throws PersistentException 
	 */
	
	public boolean impostaTipologiaCorso(String nomeTip) throws PersistentException {
		// TODO - implement M_DescrizioneCorso.impostaTipologiaCorso
		
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
		// TODO Auto-generated method stub
		return this.model;
	}

}