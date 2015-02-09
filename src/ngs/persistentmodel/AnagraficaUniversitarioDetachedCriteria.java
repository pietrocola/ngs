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

public class AnagraficaUniversitarioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression matricola;
	public final StringExpression nome;
	public final StringExpression cognome;
	
	public AnagraficaUniversitarioDetachedCriteria() {
		super(ngs.persistentmodel.AnagraficaUniversitario.class, ngs.persistentmodel.AnagraficaUniversitarioCriteria.class);
		matricola = new IntegerExpression("matricola", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
	}
	
	public AnagraficaUniversitarioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.AnagraficaUniversitarioCriteria.class);
		matricola = new IntegerExpression("matricola", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		cognome = new StringExpression("cognome", this.getDetachedCriteria());
	}
	
	public AnagraficaUniversitario uniqueAnagraficaUniversitario(PersistentSession session) {
		return (AnagraficaUniversitario) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public AnagraficaUniversitario[] listAnagraficaUniversitario(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (AnagraficaUniversitario[]) list.toArray(new AnagraficaUniversitario[list.size()]);
	}
}

