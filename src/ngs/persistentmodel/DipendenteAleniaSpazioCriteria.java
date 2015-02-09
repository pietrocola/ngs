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

public class DipendenteAleniaSpazioCriteria extends AbstractORMCriteria {
	public final IntegerExpression codiceDipendente;
	public final StringExpression nome;
	public final StringExpression cognome;
	
	public DipendenteAleniaSpazioCriteria(Criteria criteria) {
		super(criteria);
		codiceDipendente = new IntegerExpression("codiceDipendente", this);
		nome = new StringExpression("nome", this);
		cognome = new StringExpression("cognome", this);
	}
	
	public DipendenteAleniaSpazioCriteria(PersistentSession session) {
		this(session.createCriteria(DipendenteAleniaSpazio.class));
	}
	
	public DipendenteAleniaSpazioCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public DipendenteAleniaSpazio uniqueDipendenteAleniaSpazio() {
		return (DipendenteAleniaSpazio) super.uniqueResult();
	}
	
	public DipendenteAleniaSpazio[] listDipendenteAleniaSpazio() {
		java.util.List list = super.list();
		return (DipendenteAleniaSpazio[]) list.toArray(new DipendenteAleniaSpazio[list.size()]);
	}
}

