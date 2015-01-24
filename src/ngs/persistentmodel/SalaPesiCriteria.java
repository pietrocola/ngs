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

public class SalaPesiCriteria extends AbstractORMCriteria {
	public final StringExpression nomeSala;
	
	public SalaPesiCriteria(Criteria criteria) {
		super(criteria);
		nomeSala = new StringExpression("nomeSala", this);
	}
	
	public SalaPesiCriteria(PersistentSession session) {
		this(session.createCriteria(SalaPesi.class));
	}
	
	public SalaPesiCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public SalaPesi uniqueSalaPesi() {
		return (SalaPesi) super.uniqueResult();
	}
	
	public SalaPesi[] listSalaPesi() {
		java.util.List list = super.list();
		return (SalaPesi[]) list.toArray(new SalaPesi[list.size()]);
	}
}

