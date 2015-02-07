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

public class PagamentoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final DateExpression data;
	public final FloatExpression importo;
	public final BooleanExpression stato;
	
	public PagamentoDetachedCriteria() {
		super(ngs.persistentmodel.Pagamento.class, ngs.persistentmodel.PagamentoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		data = new DateExpression("data", this.getDetachedCriteria());
		importo = new FloatExpression("importo", this.getDetachedCriteria());
		stato = new BooleanExpression("stato", this.getDetachedCriteria());
	}
	
	public PagamentoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.PagamentoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		data = new DateExpression("data", this.getDetachedCriteria());
		importo = new FloatExpression("importo", this.getDetachedCriteria());
		stato = new BooleanExpression("stato", this.getDetachedCriteria());
	}
	
	public Pagamento uniquePagamento(PersistentSession session) {
		return (Pagamento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Pagamento[] listPagamento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Pagamento[]) list.toArray(new Pagamento[list.size()]);
	}
}

