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

public class ScontoPercentualeDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomePolitica;
	public final StringExpression categoriaClienteId;
	public final AssociationExpression categoriaCliente;
	public final IntegerExpression numeroMesi;
	public final FloatExpression scontoPercentuale;
	
	public ScontoPercentualeDetachedCriteria() {
		super(ngs.persistentmodel.ScontoPercentuale.class, ngs.persistentmodel.ScontoPercentualeCriteria.class);
		nomePolitica = new StringExpression("nomePolitica", this.getDetachedCriteria());
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this.getDetachedCriteria());
		categoriaCliente = new AssociationExpression("categoriaCliente", this.getDetachedCriteria());
		numeroMesi = new IntegerExpression("numeroMesi", this.getDetachedCriteria());
		scontoPercentuale = new FloatExpression("scontoPercentuale", this.getDetachedCriteria());
	}
	
	public ScontoPercentualeDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.ScontoPercentualeCriteria.class);
		nomePolitica = new StringExpression("nomePolitica", this.getDetachedCriteria());
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this.getDetachedCriteria());
		categoriaCliente = new AssociationExpression("categoriaCliente", this.getDetachedCriteria());
		numeroMesi = new IntegerExpression("numeroMesi", this.getDetachedCriteria());
		scontoPercentuale = new FloatExpression("scontoPercentuale", this.getDetachedCriteria());
	}
	
	public CategoriaClienteDetachedCriteria createCategoriaClienteCriteria() {
		return new CategoriaClienteDetachedCriteria(createCriteria("categoriaCliente"));
	}
	
	public ScontoPercentuale uniqueScontoPercentuale(PersistentSession session) {
		return (ScontoPercentuale) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ScontoPercentuale[] listScontoPercentuale(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ScontoPercentuale[]) list.toArray(new ScontoPercentuale[list.size()]);
	}
}

