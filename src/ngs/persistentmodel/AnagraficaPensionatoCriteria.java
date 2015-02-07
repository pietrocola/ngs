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

public class AnagraficaPensionatoCriteria extends AbstractORMCriteria {
	public final StringExpression codiceFiscale;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final BooleanExpression pensione;
	
	public AnagraficaPensionatoCriteria(Criteria criteria) {
		super(criteria);
		codiceFiscale = new StringExpression("codiceFiscale", this);
		nome = new StringExpression("nome", this);
		cognome = new StringExpression("cognome", this);
		pensione = new BooleanExpression("pensione", this);
	}
	
	public AnagraficaPensionatoCriteria(PersistentSession session) {
		this(session.createCriteria(AnagraficaPensionato.class));
	}
	
	public AnagraficaPensionatoCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public AnagraficaPensionato uniqueAnagraficaPensionato() {
		return (AnagraficaPensionato) super.uniqueResult();
	}
	
	public AnagraficaPensionato[] listAnagraficaPensionato() {
		java.util.List list = super.list();
		return (AnagraficaPensionato[]) list.toArray(new AnagraficaPensionato[list.size()]);
	}
}

