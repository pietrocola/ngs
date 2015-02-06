package ngs.factory;



import java.util.Date;

import ngs.model.Adapter.*;
import ngs.persistentmodel.Cliente;
import ngs.persistentmodel.ElencoAbbonamentiDAO;

public class ServicesCreatorFactory {

	IVerificaCategoriaClienteAdapter IccAdapter;
	
	public static ServicesCreatorFactory instance;
	
	public static ServicesCreatorFactory getInstance(){
		if(instance==null)
			instance=new ServicesCreatorFactory();
		return instance;
	}
	

	/**
	 * 
	 * @param dataScadenza
	 * @param cliente
	 */
	public void associaCertificatoMedicoCliente(Date dataScadenza, Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public IVerificaCategoriaClienteAdapter getCategoriaClienteAdapter() {
		throw new UnsupportedOperationException();
	}

	public void creaElencoAbbonamenti() {
		
		if(ElencoAbbonamentiDAO.listElencoAbbonamentiByQuery(null,null).length==0){
			
			ElencoAbbonamentiDAO.save(ElencoAbbonamentiDAO.createElencoAbbonamenti());
		}
		
		
	}

}