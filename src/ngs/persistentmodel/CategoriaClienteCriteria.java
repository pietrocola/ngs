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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CategoriaClienteCriteria extends AbstractORMCriteria {
	public final StringExpression nomeCat;
	
	public CategoriaClienteCriteria(Criteria criteria) {
		super(criteria);
		nomeCat = new StringExpression("nomeCat", this);
	}
	
	public CategoriaClienteCriteria(PersistentSession session) {
		this(session.createCriteria(CategoriaCliente.class));
	}
	
	public CategoriaClienteCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public CategoriaCliente uniqueCategoriaCliente() {
		return (CategoriaCliente) super.uniqueResult();
	}
	
	public CategoriaCliente[] listCategoriaCliente() {
		java.util.List list = super.list();
		return (CategoriaCliente[]) list.toArray(new CategoriaCliente[list.size()]);
	}
}

