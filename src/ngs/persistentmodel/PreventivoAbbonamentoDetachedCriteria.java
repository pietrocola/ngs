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

public class PreventivoAbbonamentoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression politicaScontoId;
	public final AssociationExpression politicaSconto;
	public final StringExpression descAbbId;
	public final AssociationExpression descAbb;
	public final FloatExpression prezzo;
	public final IntegerExpression numeroMesi;
	
	public PreventivoAbbonamentoDetachedCriteria() {
		super(ngs.persistentmodel.PreventivoAbbonamento.class, ngs.persistentmodel.PreventivoAbbonamentoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		politicaScontoId = new StringExpression("politicaSconto.nomePolitica", this.getDetachedCriteria());
		politicaSconto = new AssociationExpression("politicaSconto", this.getDetachedCriteria());
		descAbbId = new StringExpression("descAbb.nomeAbbonamento", this.getDetachedCriteria());
		descAbb = new AssociationExpression("descAbb", this.getDetachedCriteria());
		prezzo = new FloatExpression("prezzo", this.getDetachedCriteria());
		numeroMesi = new IntegerExpression("numeroMesi", this.getDetachedCriteria());
	}
	
	public PreventivoAbbonamentoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.PreventivoAbbonamentoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		politicaScontoId = new StringExpression("politicaSconto.nomePolitica", this.getDetachedCriteria());
		politicaSconto = new AssociationExpression("politicaSconto", this.getDetachedCriteria());
		descAbbId = new StringExpression("descAbb.nomeAbbonamento", this.getDetachedCriteria());
		descAbb = new AssociationExpression("descAbb", this.getDetachedCriteria());
		prezzo = new FloatExpression("prezzo", this.getDetachedCriteria());
		numeroMesi = new IntegerExpression("numeroMesi", this.getDetachedCriteria());
	}
	
	public PoliticaScontoAbbonamentoDetachedCriteria createPoliticaScontoCriteria() {
		return new PoliticaScontoAbbonamentoDetachedCriteria(createCriteria("politicaSconto"));
	}
	
	public DescrizioneAbbonamentoDetachedCriteria createDescAbbCriteria() {
		return new DescrizioneAbbonamentoDetachedCriteria(createCriteria("descAbb"));
	}
	
	public PreventivoAbbonamento uniquePreventivoAbbonamento(PersistentSession session) {
		return (PreventivoAbbonamento) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public PreventivoAbbonamento[] listPreventivoAbbonamento(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (PreventivoAbbonamento[]) list.toArray(new PreventivoAbbonamento[list.size()]);
	}
}

