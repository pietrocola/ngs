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

public class AnagraficaUniversitario {
	public AnagraficaUniversitario() {
	}
	
	private int matricola;
	
	private String nome;
	
	private String cognome;
	
	private void setMatricola(int value) {
		this.matricola = value;
	}
	
	public int getMatricola() {
		return matricola;
	}
	
	public int getORMID() {
		return getMatricola();
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
		return String.valueOf(getMatricola());
	}
	
}
