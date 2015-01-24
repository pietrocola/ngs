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

public class PoliticaScontoAbbonamentoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomePolitica;
	public final StringExpression categoriaClienteId;
	public final AssociationExpression categoriaCliente;
	
	public PoliticaScontoAbbonamentoDetachedCriteria() {
		super(ngs.persistentmodel.PoliticaScontoAbbonamento.class, ngs.persistentmodel.PoliticaScontoAbbonamentoCriteria.class);
		nomePolitica = new StringExpression("nomePolitica", this.getDetachedCriteria());
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this.getDetachedCriteria());
		categoriaCliente = new AssociationExpression("categoriaCliente", this.getDetachedCriteria());
	}
	
	public PoliticaScontoAbbonamentoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.PoliticaScontoAbbonamentoCriteria.class);
		nomePolitica = new StringExpression("nomePolitica", this.getDetachedCriteria());
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this.getDetachedCriteria());
		categoriaCliente = new AssociationExpression("categoriaCliente", this.getDetachedCriteria());
	}
	
	public CategoriaClienteDetachedCriteria createCategoriaClienteCriteria() {
		return new CategoriaClienteDetachedCriteria(createCriteria("categoriaCliente"));
	}
	
	public PoliticaScontoAbbonamento uniquePoliticaScontoAbbonamento(PersistentSession session) {
		return (PoliticaScontoAbbonamento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PoliticaScontoAbbonamento[] listPoliticaScontoAbbonamento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PoliticaScontoAbbonamento[]) list.toArray(new PoliticaScontoAbbonamento[list.size()]);
	}
}

