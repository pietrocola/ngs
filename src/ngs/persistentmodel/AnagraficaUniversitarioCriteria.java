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

public class AnagraficaUniversitarioCriteria extends AbstractORMCriteria {
	public final StringExpression codiceFiscale;
	public final StringExpression nome;
	public final StringExpression cognome;
	public final IntegerExpression matricola;
	
	public AnagraficaUniversitarioCriteria(Criteria criteria) {
		super(criteria);
		codiceFiscale = new StringExpression("codiceFiscale", this);
		nome = new StringExpression("nome", this);
		cognome = new StringExpression("cognome", this);
		matricola = new IntegerExpression("matricola", this);
	}
	
	public AnagraficaUniversitarioCriteria(PersistentSession session) {
		this(session.createCriteria(AnagraficaUniversitario.class));
	}
	
	public AnagraficaUniversitarioCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public AnagraficaUniversitario uniqueAnagraficaUniversitario() {
		return (AnagraficaUniversitario) super.uniqueResult();
	}
	
	public AnagraficaUniversitario[] listAnagraficaUniversitario() {
		java.util.List list = super.list();
		return (AnagraficaUniversitario[]) list.toArray(new AnagraficaUniversitario[list.size()]);
	}
}

