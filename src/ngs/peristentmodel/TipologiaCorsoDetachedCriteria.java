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
package ngs.peristentmodel;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TipologiaCorsoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomeTip;
	
	public TipologiaCorsoDetachedCriteria() {
		super(ngs.peristentmodel.TipologiaCorso.class, ngs.peristentmodel.TipologiaCorsoCriteria.class);
		nomeTip = new StringExpression("nomeTip", this.getDetachedCriteria());
	}
	
	public TipologiaCorsoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.peristentmodel.TipologiaCorsoCriteria.class);
		nomeTip = new StringExpression("nomeTip", this.getDetachedCriteria());
	}
	
	public TipologiaCorso uniqueTipologiaCorso(PersistentSession session) {
		return (TipologiaCorso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public TipologiaCorso[] listTipologiaCorso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (TipologiaCorso[]) list.toArray(new TipologiaCorso[list.size()]);
	}
}

