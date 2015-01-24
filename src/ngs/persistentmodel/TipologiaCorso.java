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

public class TipologiaCorso extends ngs.persistentmodel.APersistentModel {
	public TipologiaCorso() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof TipologiaCorso))
			return false;
		TipologiaCorso tipologiacorso = (TipologiaCorso)aObj;
		if ((getNomeTip() != null && !getNomeTip().equals(tipologiacorso.getNomeTip())) || (getNomeTip() == null && tipologiacorso.getNomeTip() != null))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (getNomeTip() == null ? 0 : getNomeTip().hashCode());
		return hashcode;
	}
	
	private String nomeTip;
	
	public void setNomeTip(String value) {
		this.nomeTip = value;
	}
	
	public String getNomeTip() {
		return nomeTip;
	}
	
	public String getORMID() {
		return getNomeTip();
	}
	
	public String toString() {
		return String.valueOf(getNomeTip());
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
