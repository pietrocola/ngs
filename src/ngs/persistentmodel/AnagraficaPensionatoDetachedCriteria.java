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

public class AnagraficaPensionatoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression codiceFiscale;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final BooleanExpression pensione;
	
	public AnagraficaPensionatoDetachedCriteria() {
		super(ngs.persistentmodel.AnagraficaPensionato.class, ngs.persistentmodel.AnagraficaPensionatoCriteria.class);
		codiceFiscale = new StringExpression("codiceFiscale", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		pensione = new BooleanExpression("pensione", this.getDetachedCriteria());
	}
	
	public AnagraficaPensionatoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.AnagraficaPensionatoCriteria.class);
		codiceFiscale = new StringExpression("codiceFiscale", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
		pensione = new BooleanExpression("pensione", this.getDetachedCriteria());
	}
	
	public AnagraficaPensionato uniqueAnagraficaPensionato(PersistentSession session) {
		return (AnagraficaPensionato) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public AnagraficaPensionato[] listAnagraficaPensionato(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (AnagraficaPensionato[]) list.toArray(new AnagraficaPensionato[list.size()]);
	}
}

