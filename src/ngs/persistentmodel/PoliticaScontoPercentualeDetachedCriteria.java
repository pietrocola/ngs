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

public class PoliticaScontoPercentualeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomePolitica;
	public final StringExpression categoriaClienteId;
	public final AssociationExpression categoriaCliente;
	public final FloatExpression unMese;
	public final FloatExpression treMesi;
	public final FloatExpression seiMesi;
	public final FloatExpression dodiciMesi;
	
	public PoliticaScontoPercentualeDetachedCriteria() {
		super(ngs.persistentmodel.PoliticaScontoPercentuale.class, ngs.persistentmodel.PoliticaScontoPercentualeCriteria.class);
		nomePolitica = new StringExpression("nomePolitica", this.getDetachedCriteria());
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this.getDetachedCriteria());
		categoriaCliente = new AssociationExpression("categoriaCliente", this.getDetachedCriteria());
		unMese = new FloatExpression("unMese", this.getDetachedCriteria());
		treMesi = new FloatExpression("treMesi", this.getDetachedCriteria());
		seiMesi = new FloatExpression("seiMesi", this.getDetachedCriteria());
		dodiciMesi = new FloatExpression("dodiciMesi", this.getDetachedCriteria());
	}
	
	public PoliticaScontoPercentualeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.PoliticaScontoPercentualeCriteria.class);
		nomePolitica = new StringExpression("nomePolitica", this.getDetachedCriteria());
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this.getDetachedCriteria());
		categoriaCliente = new AssociationExpression("categoriaCliente", this.getDetachedCriteria());
		unMese = new FloatExpression("unMese", this.getDetachedCriteria());
		treMesi = new FloatExpression("treMesi", this.getDetachedCriteria());
		seiMesi = new FloatExpression("seiMesi", this.getDetachedCriteria());
		dodiciMesi = new FloatExpression("dodiciMesi", this.getDetachedCriteria());
	}
	
	public CategoriaClienteDetachedCriteria createCategoriaClienteCriteria() {
		return new CategoriaClienteDetachedCriteria(createCriteria("categoriaCliente"));
	}
	
	public PoliticaScontoPercentuale uniquePoliticaScontoPercentuale(PersistentSession session) {
		return (PoliticaScontoPercentuale) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PoliticaScontoPercentuale[] listPoliticaScontoPercentuale(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PoliticaScontoPercentuale[]) list.toArray(new PoliticaScontoPercentuale[list.size()]);
	}
}

