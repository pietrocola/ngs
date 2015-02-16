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

public class PagamentoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression abbonamentoId;
	public final AssociationExpression abbonamento;
	public final DateExpression data;
	public final FloatExpression importo;
	public final BooleanExpression stato;
	
	public PagamentoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		abbonamentoId = new IntegerExpression("abbonamento.ID", this);
		abbonamento = new AssociationExpression("abbonamento", this);
		data = new DateExpression("data", this);
		importo = new FloatExpression("importo", this);
		stato = new BooleanExpression("stato", this);
	}
	
	public PagamentoCriteria(PersistentSession session) {
		this(session.createCriteria(Pagamento.class));
	}
	
	public PagamentoCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public AbbonamentoCriteria createAbbonamentoCriteria() {
		return new AbbonamentoCriteria(createCriteria("abbonamento"));
	}
	
	public Pagamento uniquePagamento() {
		return (Pagamento) super.uniqueResult();
	}
	
	public Pagamento[] listPagamento() {
		java.util.List list = super.list();
		return (Pagamento[]) list.toArray(new Pagamento[list.size()]);
	}
}

