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

public class DescrizioneAbbonamentoCriteria extends AbstractORMCriteria {
	public final StringExpression nomeAbbonamento;
	public final StringExpression elencoCategorieId;
	public final AssociationExpression elencoCategorie;
	public final FloatExpression prezzoBaseMensile;
	public final CollectionExpression elencoSalePesi;
	public final CollectionExpression elencoCorsi;
	
	public DescrizioneAbbonamentoCriteria(Criteria criteria) {
		super(criteria);
		nomeAbbonamento = new StringExpression("nomeAbbonamento", this);
		elencoCategorieId = new StringExpression("elencoCategorie.nomeCat", this);
		elencoCategorie = new AssociationExpression("elencoCategorie", this);
		prezzoBaseMensile = new FloatExpression("prezzoBaseMensile", this);
		elencoSalePesi = new CollectionExpression("elencoSalePesi", this);
		elencoCorsi = new CollectionExpression("elencoCorsi", this);
	}
	
	public DescrizioneAbbonamentoCriteria(PersistentSession session) {
		this(session.createCriteria(DescrizioneAbbonamento.class));
	}
	
	public DescrizioneAbbonamentoCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public CategoriaClienteCriteria createElencoCategorieCriteria() {
		return new CategoriaClienteCriteria(createCriteria("elencoCategorie"));
	}
	
	public SalaPesiCriteria createElencoSalePesiCriteria() {
		return new SalaPesiCriteria(createCriteria("elencoSalePesi"));
	}
	
	public DescrizioneCorsoCriteria createElencoCorsiCriteria() {
		return new DescrizioneCorsoCriteria(createCriteria("elencoCorsi"));
	}
	
	public DescrizioneAbbonamento uniqueDescrizioneAbbonamento() {
		return (DescrizioneAbbonamento) super.uniqueResult();
	}
	
	public DescrizioneAbbonamento[] listDescrizioneAbbonamento() {
		java.util.List list = super.list();
		return (DescrizioneAbbonamento[]) list.toArray(new DescrizioneAbbonamento[list.size()]);
	}
}

