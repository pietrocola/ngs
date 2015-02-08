package ngs.model;

import ngs.persistentmodel.*;

public class M_Abbonamento extends AModel {

	/**
	 * 
	 * @param nome
	 * @param cognome
	 * @param codiceFiscale
	 * @param telefono
	 * @param email
	 */
	public Boolean registraCliente(String nome, String cognome, String codiceFiscale, int telefono, String email) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dataPagamento
	 * @param importo
	 * @param stato
	 */
	public Pagamento creaPagamento(java.util.Date dataPagamento, float importo, Boolean stato) {
		throw new UnsupportedOperationException();
	}

	@Override
	public APersistentModel getPersistentModel() {
		throw new UnsupportedOperationException();
	}

}