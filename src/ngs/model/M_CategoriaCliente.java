package ngs.model;
import java.util.ArrayList;

import ngs.persistentmodel.APersistentModel;
import ngs.persistentmodel.CategoriaCliente;
import ngs.persistentmodel.CategoriaClienteDAO;
import ngs.persistentmodel.TipologiaCorso;
import ngs.persistentmodel.TipologiaCorsoDAO;
public class M_CategoriaCliente extends AModel {

	
	
	/**
	 * prende le categorie clienti da db
	 * @return
	 */
	public ArrayList<CategoriaCliente> getCategorieClienti() {
		
		ArrayList<CategoriaCliente> arrayCat = new ArrayList<CategoriaCliente>();
		
		CategoriaCliente cat=(CategoriaCliente)this.getPersistentModel();
		
		
		for(int i=0;i<CategoriaClienteDAO.listCategoriaClienteByQuery(null, null).length;i++){
			arrayCat.add(CategoriaClienteDAO.listCategoriaClienteByQuery(null, null)[i]);

		}
		
		return arrayCat;	
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
	
	
	public CategoriaCliente getCategoriaCliente(String nomeCat)
	{
		return CategoriaClienteDAO.getCategoriaClienteByORMID(nomeCat);
	}
}