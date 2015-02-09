package ngs.model.Adapter;

import ngs.persistentmodel.AnagraficaUniversitarioDAO;
import ngs.persistentmodel.DipendenteAleniaSpazioDAO;

public class ClienteDipendenteAleniaSpazioAdapter implements IVerificaCategoriaClienteAdapter {

	
	
	
	/**
	 * 
	 * @param codice
	 */
	public Boolean verificaCategoriaCliente(String codice) {
		int c=Integer.parseInt(codice);
		for(int i=0; i<DipendenteAleniaSpazioDAO.listDipendenteAleniaSpazioByQuery(null, null).length;i++){
			if(DipendenteAleniaSpazioDAO.listDipendenteAleniaSpazioByQuery(null, null)[i].getCodiceDipendente()==c)
				return true;
		}
		
		
		return false;
	}
	
	
	

}