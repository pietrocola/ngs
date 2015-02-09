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

public class ScontoFissoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomePolitica;
	public final StringExpression categoriaClienteId;
	public final AssociationExpression categoriaCliente;
	public final IntegerExpression numeroMesi;
	public final FloatExpression scontoFisso;
	
	public ScontoFissoDetachedCriteria() {
		super(ngs.persistentmodel.ScontoFisso.class, ngs.persistentmodel.ScontoFissoCriteria.class);
		nomePolitica = new StringExpression("nomePolitica", this.getDetachedCriteria());
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this.getDetachedCriteria());
		categoriaCliente = new AssociationExpression("categoriaCliente", this.getDetachedCriteria());
		numeroMesi = new IntegerExpression("numeroMesi", this.getDetachedCriteria());
		scontoFisso = new FloatExpression("scontoFisso", this.getDetachedCriteria());
	}
	
	public ScontoFissoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.ScontoFissoCriteria.class);
		nomePolitica = new StringExpression("nomePolitica", this.getDetachedCriteria());
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this.getDetachedCriteria());
		categoriaCliente = new AssociationExpression("categoriaCliente", this.getDetachedCriteria());
		numeroMesi = new IntegerExpression("numeroMesi", this.getDetachedCriteria());
		scontoFisso = new FloatExpression("scontoFisso", this.getDetachedCriteria());
	}
	
	public CategoriaClienteDetachedCriteria createCategoriaClienteCriteria() {
		return new CategoriaClienteDetachedCriteria(createCriteria("categoriaCliente"));
	}
	
	public ScontoFisso uniqueScontoFisso(PersistentSession session) {
		return (ScontoFisso) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public ScontoFisso[] listScontoFisso(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (ScontoFisso[]) list.toArray(new ScontoFisso[list.size()]);
	}
}

