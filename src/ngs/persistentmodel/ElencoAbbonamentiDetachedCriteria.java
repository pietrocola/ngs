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

public class ElencoAbbonamentiDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression elencoAbb;
	
	public ElencoAbbonamentiDetachedCriteria() {
		super(ngs.persistentmodel.ElencoAbbonamenti.class, ngs.persistentmodel.ElencoAbbonamentiCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		elencoAbb = new CollectionExpression("elencoAbb", this.getDetachedCriteria());
	}
	
	public ElencoAbbonamentiDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.ElencoAbbonamentiCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		elencoAbb = new CollectionExpression("elencoAbb", this.getDetachedCriteria());
	}
	
	public AbbonamentoDetachedCriteria createElencoAbbCriteria() {
		return new AbbonamentoDetachedCriteria(createCriteria("elencoAbb"));
	}
	
	public ElencoAbbonamenti uniqueElencoAbbonamenti(PersistentSession session) {
		return (ElencoAbbonamenti) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ElencoAbbonamenti[] listElencoAbbonamenti(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ElencoAbbonamenti[]) list.toArray(new ElencoAbbonamenti[list.size()]);
	}
}

