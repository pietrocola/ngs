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

public class DipendenteAleniaSpazioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression codiceDipendente;
	public final StringExpression nome;
	public final StringExpression cognome;
	
	public DipendenteAleniaSpazioDetachedCriteria() {
		super(ngs.persistentmodel.DipendenteAleniaSpazio.class, ngs.persistentmodel.DipendenteAleniaSpazioCriteria.class);
		codiceDipendente = new IntegerExpression("codiceDipendente", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
	}
	
	public DipendenteAleniaSpazioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.DipendenteAleniaSpazioCriteria.class);
		codiceDipendente = new IntegerExpression("codiceDipendente", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
	}
	
	public DipendenteAleniaSpazio uniqueDipendenteAleniaSpazio(PersistentSession session) {
		return (DipendenteAleniaSpazio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DipendenteAleniaSpazio[] listDipendenteAleniaSpazio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DipendenteAleniaSpazio[]) list.toArray(new DipendenteAleniaSpazio[list.size()]);
	}
}

