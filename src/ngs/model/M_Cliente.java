package ngs.model;

import java.util.ArrayList;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaClienteDAO;
import ngs.persistentmodel.Cliente;
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

	
	public Cliente getCliente(String codiceFiscaleCliente){
		for(int i=0;i<ClienteDAO.listClienteByQuery(null, null).length;i++){
			if(ClienteDAO.listClienteByQuery(null, null)[i].getCodiceFiscale().equals(codiceFiscaleCliente))
				return ClienteDAO.listClienteByQuery(null, null)[i];
		}
		return null;
	}
	
	
	
	public Cliente[] getElencoClienti(){
		
		
		return ClienteDAO.listClienteByQuery(null, null);
		
	}
	
	
	public ArrayList<Cliente> filtraCliente(String cognome){
		
		
		ArrayList<Cliente> elencoClientiCognome=new ArrayList<Cliente>();
		
		for(int i=0;i<ClienteDAO.listClienteByQuery(null, null).length;i++)
			if(ClienteDAO.listClienteByQuery(null, null)[i].getCognome().equals(cognome)){
				elencoClientiCognome.add(ClienteDAO.listClienteByQuery(null, null)[i]);
			}
				
		return  elencoClientiCognome;
	}
	
	
	
	
	
	
	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

}