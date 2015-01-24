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

public class SalaPesi extends ngs.persistentmodel.APersistentModel {
	public SalaPesi() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof SalaPesi))
			return false;
		SalaPesi salapesi = (SalaPesi)aObj;
		if ((getNomeSala() != null && !getNomeSala().equals(salapesi.getNomeSala())) || (getNomeSala() == null && salapesi.getNomeSala() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNomeSala() == null ? 0 : getNomeSala().hashCode());
		return hashcode;
	}
	
	private String nomeSala;
	
	public void setNomeSala(String value) {
		this.nomeSala = value;
	}
	
	public String getNomeSala() {
		return nomeSala;
	}
	
	public String getORMID() {
		return getNomeSala();
	}
	
	public String toString() {
		return String.valueOf(getNomeSala());
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
