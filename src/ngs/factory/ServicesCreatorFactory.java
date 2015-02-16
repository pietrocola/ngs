package ngs.factory;



import java.util.Date;

import ngs.model.M_ElencoAbbonamenti;
import ngs.model.Adapter.*;
import ngs.persistentmodel.AbbonamentoDAO;
import ngs.persistentmodel.CertificatoMedico;
import ngs.persistentmodel.CertificatoMedicoDAO;
import ngs.persistentmodel.Cliente;


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
	public boolean associaCertificatoMedicoCliente(Date dataScadenza, Cliente cliente) {
		CertificatoMedico cm=CertificatoMedicoDAO.createCertificatoMedico();
		cm.setCliente(cliente);
		cm.setScadenza(dataScadenza);
		return CertificatoMedicoDAO.save(cm);
	}

	
	
	
	
	
	
	
	public IVerificaCategoriaClienteAdapter getCategoriaClienteAdapter() {
		throw new UnsupportedOperationException();
	}

	
	
	
	public void inizializzaElencoAbbonamenti() {
		
		M_ElencoAbbonamenti ea=M_ElencoAbbonamenti.getInstance();
		
		
		for(int i=0; i<AbbonamentoDAO.listAbbonamentoByQuery(null, null).length;i++)
			ea.addAbbonamento(AbbonamentoDAO.listAbbonamentoByQuery(null, null)[i]);
		
	}
	
	
	
	

	
	

}