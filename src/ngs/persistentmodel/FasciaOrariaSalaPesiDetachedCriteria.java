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

public class FasciaOrariaSalaPesiDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression oraInizio;
	public final IntegerExpression oraFine;
	
	public FasciaOrariaSalaPesiDetachedCriteria() {
		super(ngs.persistentmodel.FasciaOrariaSalaPesi.class, ngs.persistentmodel.FasciaOrariaSalaPesiCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		oraInizio = new IntegerExpression("oraInizio", this.getDetachedCriteria());
		oraFine = new IntegerExpression("oraFine", this.getDetachedCriteria());
	}
	
	public FasciaOrariaSalaPesiDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.FasciaOrariaSalaPesiCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		oraInizio = new IntegerExpression("oraInizio", this.getDetachedCriteria());
		oraFine = new IntegerExpression("oraFine", this.getDetachedCriteria());
	}
	
	public FasciaOrariaSalaPesi uniqueFasciaOrariaSalaPesi(PersistentSession session) {
		return (FasciaOrariaSalaPesi) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public FasciaOrariaSalaPesi[] listFasciaOrariaSalaPesi(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (FasciaOrariaSalaPesi[]) list.toArray(new FasciaOrariaSalaPesi[list.size()]);
	}
}

