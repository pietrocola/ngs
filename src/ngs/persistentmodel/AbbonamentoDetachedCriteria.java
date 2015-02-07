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

public class AbbonamentoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression preventivoAbbId;
	public final AssociationExpression preventivoAbb;
	public final StringExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression pagamentoId;
	public final AssociationExpression pagamento;
	public final DateExpression dataInizio;
	public final DateExpression dataFine;
	
	public AbbonamentoDetachedCriteria() {
		super(ngs.persistentmodel.Abbonamento.class, ngs.persistentmodel.AbbonamentoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		preventivoAbbId = new IntegerExpression("preventivoAbb.ID", this.getDetachedCriteria());
		preventivoAbb = new AssociationExpression("preventivoAbb", this.getDetachedCriteria());
		clienteId = new StringExpression("cliente.codiceFiscale", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		pagamentoId = new IntegerExpression("pagamento.ID", this.getDetachedCriteria());
		pagamento = new AssociationExpression("pagamento", this.getDetachedCriteria());
		dataInizio = new DateExpression("dataInizio", this.getDetachedCriteria());
		dataFine = new DateExpression("dataFine", this.getDetachedCriteria());
	}
	
	public AbbonamentoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.AbbonamentoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		preventivoAbbId = new IntegerExpression("preventivoAbb.ID", this.getDetachedCriteria());
		preventivoAbb = new AssociationExpression("preventivoAbb", this.getDetachedCriteria());
		clienteId = new StringExpression("cliente.codiceFiscale", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		pagamentoId = new IntegerExpression("pagamento.ID", this.getDetachedCriteria());
		pagamento = new AssociationExpression("pagamento", this.getDetachedCriteria());
		dataInizio = new DateExpression("dataInizio", this.getDetachedCriteria());
		dataFine = new DateExpression("dataFine", this.getDetachedCriteria());
	}
	
	public PreventivoAbbonamentoDetachedCriteria createPreventivoAbbCriteria() {
		return new PreventivoAbbonamentoDetachedCriteria(createCriteria("preventivoAbb"));
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public PagamentoDetachedCriteria createPagamentoCriteria() {
		return new PagamentoDetachedCriteria(createCriteria("pagamento"));
	}
	
	public Abbonamento uniqueAbbonamento(PersistentSession session) {
		return (Abbonamento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Abbonamento[] listAbbonamento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Abbonamento[]) list.toArray(new Abbonamento[list.size()]);
	}
}

