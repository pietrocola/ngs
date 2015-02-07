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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression codiceFiscale;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final IntegerExpression telefono;
	public final StringExpression email;
	
	public ClienteDetachedCriteria() {
		super(ngs.persistentmodel.Cliente.class, ngs.persistentmodel.ClienteCriteria.class);
		codiceFiscale = new StringExpression("codiceFiscale", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		telefono = new IntegerExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.ClienteCriteria.class);
		codiceFiscale = new StringExpression("codiceFiscale", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		telefono = new IntegerExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
	}
	
	public Cliente uniqueCliente(PersistentSession session) {
		return (Cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente[] listCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

