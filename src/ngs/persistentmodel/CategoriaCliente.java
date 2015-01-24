/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universita degli Studi dell'Aquila
 * License Type: Academic
 */
package ngs.persistentmodel;

public class CategoriaCliente extends ngs.persistentmodel.APersistentModel {
	public CategoriaCliente() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof CategoriaCliente))
			return false;
		CategoriaCliente categoriacliente = (CategoriaCliente)aObj;
		if ((getNomeCat() != null && !getNomeCat().equals(categoriacliente.getNomeCat())) || (getNomeCat() == null && categoriacliente.getNomeCat() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNomeCat() == null ? 0 : getNomeCat().hashCode());
		return hashcode;
	}
	
	private String nomeCat;
	
	public void setNomeCat(String value) {
		this.nomeCat = value;
	}
	
	public String getNomeCat() {
		return nomeCat;
	}
	
	public String getORMID() {
		return getNomeCat();
	}
	
	public String toString() {
		return String.valueOf(getNomeCat());
	}
	
	private boolean _saved = false;
	
	public void onSave() {
		_saved=true;
	}
	
	
	public void onLoad() {
		_saved=true;
	}
	
	
	public boolean isSaved() {
		return _saved;
	}
	
	
}
