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

public class CertificatoMedicoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression clienteId;
	public final AssociationExpression cliente;
	public final DateExpression scadenza;
	
	public CertificatoMedicoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		clienteId = new StringExpression("cliente.codiceFiscale", this);
		cliente = new AssociationExpression("cliente", this);
		scadenza = new DateExpression("scadenza", this);
	}
	
	public CertificatoMedicoCriteria(PersistentSession session) {
		this(session.createCriteria(CertificatoMedico.class));
	}
	
	public CertificatoMedicoCriteria() throws PersistentException {
		this(ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public CertificatoMedico uniqueCertificatoMedico() {
		return (CertificatoMedico) super.uniqueResult();
	}
	
	public CertificatoMedico[] listCertificatoMedico() {
		java.util.List list = super.list();
		return (CertificatoMedico[]) list.toArray(new CertificatoMedico[list.size()]);
	}
}

