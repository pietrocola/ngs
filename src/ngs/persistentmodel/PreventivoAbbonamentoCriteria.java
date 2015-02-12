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

public class PreventivoAbbonamentoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression categoriaClienteId;
	public final AssociationExpression categoriaCliente;
	public final StringExpression descAbbId;
	public final AssociationExpression descAbb;
	public final FloatExpression prezzo;
	public final IntegerExpression numeroMesi;
	
	public PreventivoAbbonamentoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		categoriaClienteId = new StringExpression("categoriaCliente.nomeCat", this);
		categoriaCliente = new AssociationExpression("categoriaCliente", this);
		descAbbId = new StringExpression("descAbb.nomeAbbonamento", this);
		descAbb = new AssociationExpression("descAbb", this);
		prezzo = new FloatExpression("prezzo", this);
		numeroMesi = new IntegerExpression("numeroMesi", this);
	}
	
	public PreventivoAbbonamentoCriteria(PersistentSession session) {
		this(session.createCriteria(PreventivoAbbonamento.class));
	}
	
	public PreventivoAbbonamentoCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public CategoriaClienteCriteria createCategoriaClienteCriteria() {
		return new CategoriaClienteCriteria(createCriteria("categoriaCliente"));
	}
	
	public DescrizioneAbbonamentoCriteria createDescAbbCriteria() {
		return new DescrizioneAbbonamentoCriteria(createCriteria("descAbb"));
	}
	
	public PreventivoAbbonamento uniquePreventivoAbbonamento() {
		return (PreventivoAbbonamento) super.uniqueResult();
	}
	
	public PreventivoAbbonamento[] listPreventivoAbbonamento() {
		java.util.List list = super.list();
		return (PreventivoAbbonamento[]) list.toArray(new PreventivoAbbonamento[list.size()]);
	}
}

