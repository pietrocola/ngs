package ngs.model.Adapter;

import ngs.persistentmodel.AnagraficaPensionato;
import ngs.persistentmodel.AnagraficaPensionatoDAO;
import ngs.persistentmodel.AnagraficaUniversitarioDAO;

public class ClientePensionatoAdapter  implements IVerificaCategoriaClienteAdapter{
	
public String verificaCategoriaCliente(String codice) {
		
		String a = "Pensionato: NO <br />";
		for(int i=0; i<AnagraficaPensionatoDAO.listAnagraficaPensionatoByQuery(null, null).length;i++){
			if(AnagraficaPensionatoDAO.listAnagraficaPensionatoByQuery(null, null)[i].getCodiceFiscale().equals(codice))
				{
					a = "Pensionato: SI <br />";
					//return AnagraficaPensionatoDAO.listAnagraficaPensionatoByQuery(null, null)[i];
				}
				
		}
		return a;
	}

}
