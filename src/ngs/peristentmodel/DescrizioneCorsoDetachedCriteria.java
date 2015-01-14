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

public class DescrizioneCorsoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomeCorso;
	public final StringExpression tipCorsoId;
	public final AssociationExpression tipCorso;
	public final BooleanExpression prenotazione;
	
	public DescrizioneCorsoDetachedCriteria() {
		super(ngs.peristentmodel.DescrizioneCorso.class, ngs.peristentmodel.DescrizioneCorsoCriteria.class);
		nomeCorso = new StringExpression("nomeCorso", this.getDetachedCriteria());
		tipCorsoId = new StringExpression("tipCorso.nomeTip", this.getDetachedCriteria());
		tipCorso = new AssociationExpression("tipCorso", this.getDetachedCriteria());
		prenotazione = new BooleanExpression("prenotazione", this.getDetachedCriteria());
	}
	
	public DescrizioneCorsoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.peristentmodel.DescrizioneCorsoCriteria.class);
		nomeCorso = new StringExpression("nomeCorso", this.getDetachedCriteria());
		tipCorsoId = new StringExpression("tipCorso.nomeTip", this.getDetachedCriteria());
		tipCorso = new AssociationExpression("tipCorso", this.getDetachedCriteria());
		prenotazione = new BooleanExpression("prenotazione", this.getDetachedCriteria());
	}
	
	public TipologiaCorsoDetachedCriteria createTipCorsoCriteria() {
		return new TipologiaCorsoDetachedCriteria(createCriteria("tipCorso"));
	}
	
	public DescrizioneCorso uniqueDescrizioneCorso(PersistentSession session) {
		return (DescrizioneCorso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DescrizioneCorso[] listDescrizioneCorso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
	}
}

