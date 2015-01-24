package ngs.model;
import java.util.ArrayList;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.CategoriaClienteDAO;
import ngs.persistentmodel.TipologiaCorsoDAO;
public class M_CategoriaCliente extends AModel {

	public ArrayList<CategoriaCliente> getCategorieClienti() {
		throw new UnsupportedOperationException();
	}

	@Override
	public APersistentModel getPersistentModel() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean verificaNomeCategoriaCliente(String nomeCat) {
		if(CategoriaClienteDAO.getCategoriaClienteByORMID(nomeCat)==null)
		{
			//System.out.println("errore: tipologia non presente");
			return true; // la tipologia non esiste
		}
		else
		{
			//System.out.println(TipologiaCorsoDAO.getTipologiaCorsoByORMID(text).getNomeTip());
			return false; // la tipologia è gia presente!!
		}
		    
	}

}