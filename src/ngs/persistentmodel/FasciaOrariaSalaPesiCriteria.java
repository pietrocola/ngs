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

public class FasciaOrariaSalaPesiCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression oraInizio;
	public final IntegerExpression oraFine;
	
	public FasciaOrariaSalaPesiCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		oraInizio = new IntegerExpression("oraInizio", this);
		oraFine = new IntegerExpression("oraFine", this);
	}
	
	public FasciaOrariaSalaPesiCriteria(PersistentSession session) {
		this(session.createCriteria(FasciaOrariaSalaPesi.class));
	}
	
	public FasciaOrariaSalaPesiCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public FasciaOrariaSalaPesi uniqueFasciaOrariaSalaPesi() {
		return (FasciaOrariaSalaPesi) super.uniqueResult();
	}
	
	public FasciaOrariaSalaPesi[] listFasciaOrariaSalaPesi() {
		java.util.List list = super.list();
		return (FasciaOrariaSalaPesi[]) list.toArray(new FasciaOrariaSalaPesi[list.size()]);
	}
}

