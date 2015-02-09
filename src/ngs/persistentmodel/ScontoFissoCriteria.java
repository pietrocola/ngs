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

public class ScontoFissoCriteria extends AbstractORMCriteria {
	public final StringExpression nomePolitica;
	public final StringExpression categoriaClienteId;
	public final AssociationExpression categoriaCliente;
	public final IntegerExpression numeroMesi;
	public final FloatExpression scontoFisso;
	
	public ScontoFissoCriteria(Criteria criteria) {
		super(criteria);
		nomePolitica = new StringExpression("nomePolitica", this);
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this);
		categoriaCliente = new AssociationExpression("categoriaCliente", this);
		numeroMesi = new IntegerExpression("numeroMesi", this);
		scontoFisso = new FloatExpression("scontoFisso", this);
	}
	
	public ScontoFissoCriteria(PersistentSession session) {
		this(session.createCriteria(ScontoFisso.class));
	}
	
	public ScontoFissoCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public CategoriaClienteCriteria createCategoriaClienteCriteria() {
		return new CategoriaClienteCriteria(createCriteria("categoriaCliente"));
	}
	
	public ScontoFisso uniqueScontoFisso() {
		return (ScontoFisso) super.uniqueResult();
	}
	
	public ScontoFisso[] listScontoFisso() {
		java.util.List list = super.list();
		return (ScontoFisso[]) list.toArray(new ScontoFisso[list.size()]);
	}
}

