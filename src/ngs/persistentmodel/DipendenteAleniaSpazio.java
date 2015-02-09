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

public class DipendenteAleniaSpazio {
	public DipendenteAleniaSpazio() {
	}
	
	private int codiceDipendente;
	
	private String nome;
	
	private String cognome;
	
	private void setCodiceDipendente(int value) {
		this.codiceDipendente = value;
	}
	
	public int getCodiceDipendente() {
		return codiceDipendente;
	}
	
	public int getORMID() {
		return getCodiceDipendente();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCognome(String value) {
		this.cognome = value;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String toString() {
		return String.valueOf(getCodiceDipendente());
	}
	
}
