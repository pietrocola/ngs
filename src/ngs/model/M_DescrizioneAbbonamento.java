package ngs.model;

import ngs.model.strategy.*;
import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.CategoriaClienteDAO;
import ngs.persistentmodel.TipologiaCorso;
import ngs.persistentmodel.TipologiaCorsoDAO;

public class M_DescrizioneAbbonamento extends AModel {

	IPoliticaScontoAbbonamentoStrategy prezzoStrategy;

	/**
	 * 
	 * @param nomeCat
	 */
	public boolean impostaCategoriaCliente(String nomeCat) {
		
	    CategoriaCliente cc = (CategoriaCliente)this.getPersistentModel();
	    cc=CategoriaClienteDAO.createCategoriaCliente();
	    cc.setNomeCat(nomeCat);

	    return CategoriaClienteDAO.save(cc);
		
		//throw new UnsupportedOperationException();
	}

	public float calcolaPrezzo() {
		throw new UnsupportedOperationException();
	}

	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return this.model;
	}

}