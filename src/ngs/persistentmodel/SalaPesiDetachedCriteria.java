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

public class SalaPesiDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomeSala;
	
	public SalaPesiDetachedCriteria() {
		super(ngs.persistentmodel.SalaPesi.class, ngs.persistentmodel.SalaPesiCriteria.class);
		nomeSala = new StringExpression("nomeSala", this.getDetachedCriteria());
	}
	
	public SalaPesiDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.SalaPesiCriteria.class);
		nomeSala = new StringExpression("nomeSala", this.getDetachedCriteria());
	}
	
	public SalaPesi uniqueSalaPesi(PersistentSession session) {
		return (SalaPesi) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SalaPesi[] listSalaPesi(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SalaPesi[]) list.toArray(new SalaPesi[list.size()]);
	}
}

