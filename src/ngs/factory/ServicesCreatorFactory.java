package ngs.factory;

import ngs.model.Adapter.*;
import ngs.persistentmodel.*;

public class ServicesCreatorFactory {

	IVerificaCategoriaClienteAdapter IccAdapter;
	public static ServicesCreatorFactory instance;

	public ServicesCreatorFactory getInstance() {
		return this.instance;
	}

	public IVerificaCategoriaClienteAdapter getCategoriaClienteAdapter() {
		throw new UnsupportedOperationException();
	}

	public void creaElencoAbbonamenti() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dataScadenza
	 * @param cliente
	 */
	public void associaCertificatoMedicoCliente(java.util.Date dataScadenza, Cliente cliente) {
		throw new UnsupportedOperationException();
	}

}