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

public class CategoriaClienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomeCat;
	
	public CategoriaClienteDetachedCriteria() {
		super(ngs.persistentmodel.CategoriaCliente.class, ngs.persistentmodel.CategoriaClienteCriteria.class);
		nomeCat = new StringExpression("nomeCat", this.getDetachedCriteria());
	}
	
	public CategoriaClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.CategoriaClienteCriteria.class);
		nomeCat = new StringExpression("nomeCat", this.getDetachedCriteria());
	}
	
	public CategoriaCliente uniqueCategoriaCliente(PersistentSession session) {
		return (CategoriaCliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public CategoriaCliente[] listCategoriaCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (CategoriaCliente[]) list.toArray(new CategoriaCliente[list.size()]);
	}
}

