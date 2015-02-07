package ngs.model.Adapter;

import ngs.persistentmodel.AnagraficaUniversitario;
import ngs.persistentmodel.AnagraficaUniversitarioDAO;

public class ClienteUniversitarioAdapter implements IVerificaCategoriaClienteAdapter {

	/**
	 * 
	 * @param codice
	 */
	public AnagraficaUniversitario verificaCategoriaCliente(String codice) {
		
		
		for(int i=0; i<AnagraficaUniversitarioDAO.listAnagraficaUniversitarioByQuery(null, null).length;i++){
			if(AnagraficaUniversitarioDAO.listAnagraficaUniversitarioByQuery(null, null)[i].getCodiceFiscale().equals(codice))
			{
				return AnagraficaUniversitarioDAO.listAnagraficaUniversitarioByQuery(null, null)[i];
			}
				
		}
		
		return null;
	}

}