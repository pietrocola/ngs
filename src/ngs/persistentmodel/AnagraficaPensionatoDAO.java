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

public class AnagraficaPensionatoDAO {
	public static AnagraficaPensionato loadAnagraficaPensionatoByORMID(String codiceFiscale) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAnagraficaPensionatoByORMID(session, codiceFiscale);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato getAnagraficaPensionatoByORMID(String codiceFiscale) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getAnagraficaPensionatoByORMID(session, codiceFiscale);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato loadAnagraficaPensionatoByORMID(String codiceFiscale, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAnagraficaPensionatoByORMID(session, codiceFiscale, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato getAnagraficaPensionatoByORMID(String codiceFiscale, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getAnagraficaPensionatoByORMID(session, codiceFiscale, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato loadAnagraficaPensionatoByORMID(PersistentSession session, String codiceFiscale) {
		try {
			return (AnagraficaPensionato) session.load(ngs.persistentmodel.AnagraficaPensionato.class, codiceFiscale);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato getAnagraficaPensionatoByORMID(PersistentSession session, String codiceFiscale) {
		try {
			return (AnagraficaPensionato) session.get(ngs.persistentmodel.AnagraficaPensionato.class, codiceFiscale);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato loadAnagraficaPensionatoByORMID(PersistentSession session, String codiceFiscale, org.hibernate.LockMode lockMode) {
		try {
			return (AnagraficaPensionato) session.load(ngs.persistentmodel.AnagraficaPensionato.class, codiceFiscale, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato getAnagraficaPensionatoByORMID(PersistentSession session, String codiceFiscale, org.hibernate.LockMode lockMode) {
		try {
			return (AnagraficaPensionato) session.get(ngs.persistentmodel.AnagraficaPensionato.class, codiceFiscale, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAnagraficaPensionato(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryAnagraficaPensionato(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAnagraficaPensionato(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryAnagraficaPensionato(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato[] listAnagraficaPensionatoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listAnagraficaPensionatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato[] listAnagraficaPensionatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listAnagraficaPensionatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAnagraficaPensionato(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.AnagraficaPensionato as AnagraficaPensionato");
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
	
	public static List queryAnagraficaPensionato(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.AnagraficaPensionato as AnagraficaPensionato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AnagraficaPensionato", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato[] listAnagraficaPensionatoByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryAnagraficaPensionato(session, condition, orderBy);
			return (AnagraficaPensionato[]) list.toArray(new AnagraficaPensionato[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato[] listAnagraficaPensionatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryAnagraficaPensionato(session, condition, orderBy, lockMode);
			return (AnagraficaPensionato[]) list.toArray(new AnagraficaPensionato[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato loadAnagraficaPensionatoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAnagraficaPensionatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato loadAnagraficaPensionatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAnagraficaPensionatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato loadAnagraficaPensionatoByQuery(PersistentSession session, String condition, String orderBy) {
		AnagraficaPensionato[] anagraficaPensionatos = listAnagraficaPensionatoByQuery(session, condition, orderBy);
		if (anagraficaPensionatos != null && anagraficaPensionatos.length > 0)
			return anagraficaPensionatos[0];
		else
			return null;
	}
	
	public static AnagraficaPensionato loadAnagraficaPensionatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		AnagraficaPensionato[] anagraficaPensionatos = listAnagraficaPensionatoByQuery(session, condition, orderBy, lockMode);
		if (anagraficaPensionatos != null && anagraficaPensionatos.length > 0)
			return anagraficaPensionatos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAnagraficaPensionatoByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateAnagraficaPensionatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAnagraficaPensionatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateAnagraficaPensionatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAnagraficaPensionatoByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.AnagraficaPensionato as AnagraficaPensionato");
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
	
	public static java.util.Iterator iterateAnagraficaPensionatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.AnagraficaPensionato as AnagraficaPensionato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AnagraficaPensionato", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaPensionato createAnagraficaPensionato() {
		return new ngs.persistentmodel.AnagraficaPensionato();
	}
	
	public static boolean save(ngs.persistentmodel.AnagraficaPensionato anagraficaPensionato) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(anagraficaPensionato);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.AnagraficaPensionato anagraficaPensionato) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(anagraficaPensionato);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.AnagraficaPensionato anagraficaPensionato) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(anagraficaPensionato);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.AnagraficaPensionato anagraficaPensionato) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(anagraficaPensionato);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static AnagraficaPensionato loadAnagraficaPensionatoByCriteria(AnagraficaPensionatoCriteria anagraficaPensionatoCriteria) {
		AnagraficaPensionato[] anagraficaPensionatos = listAnagraficaPensionatoByCriteria(anagraficaPensionatoCriteria);
		if(anagraficaPensionatos == null || anagraficaPensionatos.length == 0) {
			return null;
		}
		return anagraficaPensionatos[0];
	}
	
	public static AnagraficaPensionato[] listAnagraficaPensionatoByCriteria(AnagraficaPensionatoCriteria anagraficaPensionatoCriteria) {
		return anagraficaPensionatoCriteria.listAnagraficaPensionato();
	}
}
