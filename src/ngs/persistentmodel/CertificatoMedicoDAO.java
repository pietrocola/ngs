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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CertificatoMedicoDAO {
	public static CertificatoMedico loadCertificatoMedicoByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadCertificatoMedicoByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico getCertificatoMedicoByORMID(int ID) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getCertificatoMedicoByORMID(session, ID);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico loadCertificatoMedicoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadCertificatoMedicoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico getCertificatoMedicoByORMID(int ID, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getCertificatoMedicoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico loadCertificatoMedicoByORMID(PersistentSession session, int ID) {
		try {
			return (CertificatoMedico) session.load(ngs.persistentmodel.CertificatoMedico.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico getCertificatoMedicoByORMID(PersistentSession session, int ID) {
		try {
			return (CertificatoMedico) session.get(ngs.persistentmodel.CertificatoMedico.class, new Integer(ID));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico loadCertificatoMedicoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CertificatoMedico) session.load(ngs.persistentmodel.CertificatoMedico.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico getCertificatoMedicoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) {
		try {
			return (CertificatoMedico) session.get(ngs.persistentmodel.CertificatoMedico.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCertificatoMedico(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryCertificatoMedico(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCertificatoMedico(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryCertificatoMedico(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico[] listCertificatoMedicoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listCertificatoMedicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico[] listCertificatoMedicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listCertificatoMedicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCertificatoMedico(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.CertificatoMedico as CertificatoMedico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryCertificatoMedico(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.CertificatoMedico as CertificatoMedico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("CertificatoMedico", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico[] listCertificatoMedicoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryCertificatoMedico(session, condition, orderBy);
			return (CertificatoMedico[]) list.toArray(new CertificatoMedico[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico[] listCertificatoMedicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryCertificatoMedico(session, condition, orderBy, lockMode);
			return (CertificatoMedico[]) list.toArray(new CertificatoMedico[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico loadCertificatoMedicoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadCertificatoMedicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico loadCertificatoMedicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadCertificatoMedicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico loadCertificatoMedicoByQuery(PersistentSession session, String condition, String orderBy) {
		CertificatoMedico[] certificatoMedicos = listCertificatoMedicoByQuery(session, condition, orderBy);
		if (certificatoMedicos != null && certificatoMedicos.length > 0)
			return certificatoMedicos[0];
		else
			return null;
	}
	
	public static CertificatoMedico loadCertificatoMedicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		CertificatoMedico[] certificatoMedicos = listCertificatoMedicoByQuery(session, condition, orderBy, lockMode);
		if (certificatoMedicos != null && certificatoMedicos.length > 0)
			return certificatoMedicos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCertificatoMedicoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateCertificatoMedicoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateCertificatoMedicoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateCertificatoMedicoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateCertificatoMedicoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.CertificatoMedico as CertificatoMedico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateCertificatoMedicoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.CertificatoMedico as CertificatoMedico");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("CertificatoMedico", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static CertificatoMedico createCertificatoMedico() {
		return new ngs.persistentmodel.CertificatoMedico();
	}
	
	public static boolean save(ngs.persistentmodel.CertificatoMedico certificatoMedico) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(certificatoMedico);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.CertificatoMedico certificatoMedico) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(certificatoMedico);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.CertificatoMedico certificatoMedico) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(certificatoMedico);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.CertificatoMedico certificatoMedico) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(certificatoMedico);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static CertificatoMedico loadCertificatoMedicoByCriteria(CertificatoMedicoCriteria certificatoMedicoCriteria) {
		CertificatoMedico[] certificatoMedicos = listCertificatoMedicoByCriteria(certificatoMedicoCriteria);
		if(certificatoMedicos == null || certificatoMedicos.length == 0) {
			return null;
		}
		return certificatoMedicos[0];
	}
	
	public static CertificatoMedico[] listCertificatoMedicoByCriteria(CertificatoMedicoCriteria certificatoMedicoCriteria) {
		return certificatoMedicoCriteria.listCertificatoMedico();
	}
}
