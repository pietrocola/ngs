package ngs.model.Adapter;

import ngs.persistentmodel.AnagraficaUniversitarioDAO;

public class ClienteUniversitarioAdapter implements IVerificaCategoriaClienteAdapter {

	/**
	 * 
	 * @param codice
	 */
	public Boolean verificaCategoriaCliente(String codice) {
		
		int c=Integer.parseInt(codice);
		for(int i=0; i<AnagraficaUniversitarioDAO.listAnagraficaUniversitarioByQuery(null, null).length;i++){
			if(AnagraficaUniversitarioDAO.listAnagraficaUniversitarioByQuery(null, null)[i].getMatricola()==c)
				return true;
		}
		
		
		return false;
	}

}