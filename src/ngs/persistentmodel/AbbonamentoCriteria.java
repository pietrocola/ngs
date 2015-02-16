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

public class AbbonamentoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression preventivoAbbId;
	public final AssociationExpression preventivoAbb;
	public final StringExpression clienteId;
	public final AssociationExpression cliente;
	public final DateExpression dataInizio;
	public final DateExpression dataFine;
	
	public AbbonamentoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		preventivoAbbId = new IntegerExpression("preventivoAbb.ID", this);
		preventivoAbb = new AssociationExpression("preventivoAbb", this);
		clienteId = new StringExpression("cliente.codiceFiscale", this);
		cliente = new AssociationExpression("cliente", this);
		dataInizio = new DateExpression("dataInizio", this);
		dataFine = new DateExpression("dataFine", this);
	}
	
	public AbbonamentoCriteria(PersistentSession session) {
		this(session.createCriteria(Abbonamento.class));
	}
	
	public AbbonamentoCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public PreventivoAbbonamentoCriteria createPreventivoAbbCriteria() {
		return new PreventivoAbbonamentoCriteria(createCriteria("preventivoAbb"));
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public Abbonamento uniqueAbbonamento() {
		return (Abbonamento) super.uniqueResult();
	}
	
	public Abbonamento[] listAbbonamento() {
		java.util.List list = super.list();
		return (Abbonamento[]) list.toArray(new Abbonamento[list.size()]);
	}
}

