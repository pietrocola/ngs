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

public class ElencoAbbonamentiCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final CollectionExpression elencoAbb;
	
	public ElencoAbbonamentiCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		elencoAbb = new CollectionExpression("elencoAbb", this);
	}
	
	public ElencoAbbonamentiCriteria(PersistentSession session) {
		this(session.createCriteria(ElencoAbbonamenti.class));
	}
	
	public ElencoAbbonamentiCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public AbbonamentoCriteria createElencoAbbCriteria() {
		return new AbbonamentoCriteria(createCriteria("elencoAbb"));
	}
	
	public ElencoAbbonamenti uniqueElencoAbbonamenti() {
		return (ElencoAbbonamenti) super.uniqueResult();
	}
	
	public ElencoAbbonamenti[] listElencoAbbonamenti() {
		java.util.List list = super.list();
		return (ElencoAbbonamenti[]) list.toArray(new ElencoAbbonamenti[list.size()]);
	}
}

