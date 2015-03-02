package ngs.model;

import java.util.Date;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.Cliente;
import ngs.persistentmodel.ClienteDAO;
import ngs.persistentmodel.Pagamento;
import ngs.persistentmodel.TipologiaCorso;
import ngs.persistentmodel.TipologiaCorsoDAO;

public class M_Abbonamento extends AModel {

	/**
	 * 
	 * @param nome
	 * @param cognome
	 * @param codiceFiscale
	 * @param telefono
	 * @param email
	 */
	public Boolean registraCliente(String nome, String cognome, String codiceFiscale, String telefono, String email) {
	    Cliente c = (Cliente)this.getPersistentModel();
	    c=ClienteDAO.createCliente();
	    c.setCodiceFiscale(codiceFiscale);
	    c.setNome(nome);
	    c.setCognome(cognome);
	    c.setTelefono(telefono);
	    c.setEmail(email);
	    return ClienteDAO.save(c);
	    //System.out.println(aux);
		//throw new UnsupportedOperationException();
	}



	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

}