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

public class PoliticaScontoPercentualeCriteria extends AbstractORMCriteria {
	public final StringExpression nomePolitica;
	public final StringExpression categoriaClienteId;
	public final AssociationExpression categoriaCliente;
	public final FloatExpression unMese;
	public final FloatExpression treMesi;
	public final FloatExpression seiMesi;
	public final FloatExpression dodiciMesi;
	
	public PoliticaScontoPercentualeCriteria(Criteria criteria) {
		super(criteria);
		nomePolitica = new StringExpression("nomePolitica", this);
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this);
		categoriaCliente = new AssociationExpression("categoriaCliente", this);
		unMese = new FloatExpression("unMese", this);
		treMesi = new FloatExpression("treMesi", this);
		seiMesi = new FloatExpression("seiMesi", this);
		dodiciMesi = new FloatExpression("dodiciMesi", this);
	}
	
	public PoliticaScontoPercentualeCriteria(PersistentSession session) {
		this(session.createCriteria(PoliticaScontoPercentuale.class));
	}
	
	public PoliticaScontoPercentualeCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public CategoriaClienteCriteria createCategoriaClienteCriteria() {
		return new CategoriaClienteCriteria(createCriteria("categoriaCliente"));
	}
	
	public PoliticaScontoPercentuale uniquePoliticaScontoPercentuale() {
		return (PoliticaScontoPercentuale) super.uniqueResult();
	}
	
	public PoliticaScontoPercentuale[] listPoliticaScontoPercentuale() {
		java.util.List list = super.list();
		return (PoliticaScontoPercentuale[]) list.toArray(new PoliticaScontoPercentuale[list.size()]);
	}
}

