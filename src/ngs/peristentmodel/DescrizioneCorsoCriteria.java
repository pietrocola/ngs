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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class DescrizioneCorsoCriteria extends AbstractORMCriteria {
	public final StringExpression nomeCorso;
	public final StringExpression tipCorsoId;
	public final AssociationExpression tipCorso;
	public final BooleanExpression prenotazione;
	
	public DescrizioneCorsoCriteria(Criteria criteria) {
		super(criteria);
		nomeCorso = new StringExpression("nomeCorso", this);
		tipCorsoId = new StringExpression("tipCorso.nomeTip", this);
		tipCorso = new AssociationExpression("tipCorso", this);
		prenotazione = new BooleanExpression("prenotazione", this);
	}
	
	public DescrizioneCorsoCriteria(PersistentSession session) {
		this(session.createCriteria(DescrizioneCorso.class));
	}
	
	public DescrizioneCorsoCriteria() throws PersistentException {
		this(ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public TipologiaCorsoCriteria createTipCorsoCriteria() {
		return new TipologiaCorsoCriteria(createCriteria("tipCorso"));
	}
	
	public DescrizioneCorso uniqueDescrizioneCorso() {
		return (DescrizioneCorso) super.uniqueResult();
	}
	
	public DescrizioneCorso[] listDescrizioneCorso() {
		java.util.List list = super.list();
		return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
	}
}

