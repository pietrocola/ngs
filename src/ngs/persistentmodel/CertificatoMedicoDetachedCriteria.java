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

public class CertificatoMedicoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression clienteId;
	public final AssociationExpression cliente;
	public final DateExpression scadenza;
	
	public CertificatoMedicoDetachedCriteria() {
		super(ngs.persistentmodel.CertificatoMedico.class, ngs.persistentmodel.CertificatoMedicoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		clienteId = new StringExpression("cliente.codiceFiscale", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		scadenza = new DateExpression("scadenza", this.getDetachedCriteria());
	}
	
	public CertificatoMedicoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ngs.persistentmodel.CertificatoMedicoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		clienteId = new StringExpression("cliente.codiceFiscale", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		scadenza = new DateExpression("scadenza", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public CertificatoMedico uniqueCertificatoMedico(PersistentSession session) {
		return (CertificatoMedico) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public CertificatoMedico[] listCertificatoMedico(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (CertificatoMedico[]) list.toArray(new CertificatoMedico[list.size()]);
	}
}

