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

public class DescrizioneAbbonamentoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final StringExpression nomeAbbonamento;
	public final FloatExpression prezzoBaseMensile;
	public final CollectionExpression elencoSalePesi;
	public final CollectionExpression elencoCorsi;
	
	public DescrizioneAbbonamentoDetachedCriteria() {
		super(ngs.persistentmodel.DescrizioneAbbonamento.class, ngs.persistentmodel.DescrizioneAbbonamentoCriteria.class);
		nomeAbbonamento = new StringExpression("nomeAbbonamento", this.getDetachedCriteria());
		prezzoBaseMensile = new FloatExpression("prezzoBaseMensile", this.getDetachedCriteria());
		elencoSalePesi = new CollectionExpression("elencoSalePesi", this.getDetachedCriteria());
		elencoCorsi = new CollectionExpression("elencoCorsi", this.getDetachedCriteria());
	}
	
	public DescrizioneAbbonamentoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.DescrizioneAbbonamentoCriteria.class);
		nomeAbbonamento = new StringExpression("nomeAbbonamento", this.getDetachedCriteria());
		prezzoBaseMensile = new FloatExpression("prezzoBaseMensile", this.getDetachedCriteria());
		elencoSalePesi = new CollectionExpression("elencoSalePesi", this.getDetachedCriteria());
		elencoCorsi = new CollectionExpression("elencoCorsi", this.getDetachedCriteria());
	}
	
	public SalaPesiDetachedCriteria createElencoSalePesiCriteria() {
		return new SalaPesiDetachedCriteria(createCriteria("elencoSalePesi"));
	}
	
	public DescrizioneCorsoDetachedCriteria createElencoCorsiCriteria() {
		return new DescrizioneCorsoDetachedCriteria(createCriteria("elencoCorsi"));
	}
	
	public DescrizioneAbbonamento uniqueDescrizioneAbbonamento(PersistentSession session) {
		return (DescrizioneAbbonamento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public DescrizioneAbbonamento[] listDescrizioneAbbonamento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (DescrizioneAbbonamento[]) list.toArray(new DescrizioneAbbonamento[list.size()]);
	}
}

