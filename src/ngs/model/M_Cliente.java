package ngs.model;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaClienteDAO;
import ngs.persistentmodel.ClienteDAO;

public class M_Cliente extends AModel {

	/**
	 * 
	 * @param nome
	 */
	public Boolean verificaSeDatiClientePresenti(String codiceFiscale) {
		if(ClienteDAO.getClienteByORMID(codiceFiscale)==null)
		{
			return true; // il cliente non esiste
		}
		else
		{
			return false; 
		}
		
	}

	
	
	
	
	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

}