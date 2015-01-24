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

public class PoliticaScontoAbbonamento extends ngs.persistentmodel.APersistentModel {
	public PoliticaScontoAbbonamento() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof PoliticaScontoAbbonamento))
			return false;
		PoliticaScontoAbbonamento politicascontoabbonamento = (PoliticaScontoAbbonamento)aObj;
		if ((getNomePolitica() != null && !getNomePolitica().equals(politicascontoabbonamento.getNomePolitica())) || (getNomePolitica() == null && politicascontoabbonamento.getNomePolitica() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNomePolitica() == null ? 0 : getNomePolitica().hashCode());
		return hashcode;
	}
	
	private String nomePolitica;
	
	private ngs.persistentmodel.CategoriaCliente categoriaCliente;
	
	public void setNomePolitica(String value) {
		this.nomePolitica = value;
	}
	
	public String getNomePolitica() {
		return nomePolitica;
	}
	
	public String getORMID() {
		return getNomePolitica();
	}
	
	public void setCategoriaCliente(ngs.persistentmodel.CategoriaCliente value) {
		this.categoriaCliente = value;
	}
	
	public ngs.persistentmodel.CategoriaCliente getCategoriaCliente() {
		return categoriaCliente;
	}
	
	public String toString() {
		return String.valueOf(getNomePolitica());
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
