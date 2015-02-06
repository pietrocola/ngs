package ngs.model;

import java.util.Date;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.Pagamento;

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
	public Pagamento creaPagamento(Date dataPagamento, float importo, Boolean stato) {
		throw new UnsupportedOperationException();
	}

	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

}