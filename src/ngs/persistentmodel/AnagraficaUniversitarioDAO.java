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

public class AnagraficaUniversitarioDAO {
	public static AnagraficaUniversitario loadAnagraficaUniversitarioByORMID(int matricola) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAnagraficaUniversitarioByORMID(session, matricola);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario getAnagraficaUniversitarioByORMID(int matricola) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getAnagraficaUniversitarioByORMID(session, matricola);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario loadAnagraficaUniversitarioByORMID(int matricola, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAnagraficaUniversitarioByORMID(session, matricola, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario getAnagraficaUniversitarioByORMID(int matricola, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getAnagraficaUniversitarioByORMID(session, matricola, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario loadAnagraficaUniversitarioByORMID(PersistentSession session, int matricola) {
		try {
			return (AnagraficaUniversitario) session.load(ngs.persistentmodel.AnagraficaUniversitario.class, new Integer(matricola));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario getAnagraficaUniversitarioByORMID(PersistentSession session, int matricola) {
		try {
			return (AnagraficaUniversitario) session.get(ngs.persistentmodel.AnagraficaUniversitario.class, new Integer(matricola));
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario loadAnagraficaUniversitarioByORMID(PersistentSession session, int matricola, org.hibernate.LockMode lockMode) {
		try {
			return (AnagraficaUniversitario) session.load(ngs.persistentmodel.AnagraficaUniversitario.class, new Integer(matricola), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario getAnagraficaUniversitarioByORMID(PersistentSession session, int matricola, org.hibernate.LockMode lockMode) {
		try {
			return (AnagraficaUniversitario) session.get(ngs.persistentmodel.AnagraficaUniversitario.class, new Integer(matricola), lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAnagraficaUniversitario(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryAnagraficaUniversitario(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAnagraficaUniversitario(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryAnagraficaUniversitario(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario[] listAnagraficaUniversitarioByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listAnagraficaUniversitarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario[] listAnagraficaUniversitarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listAnagraficaUniversitarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static List queryAnagraficaUniversitario(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.AnagraficaUniversitario as AnagraficaUniversitario");
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
	
	public static List queryAnagraficaUniversitario(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.AnagraficaUniversitario as AnagraficaUniversitario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AnagraficaUniversitario", lockMode);
			return query.list();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario[] listAnagraficaUniversitarioByQuery(PersistentSession session, String condition, String orderBy) {
		try {
			List list = queryAnagraficaUniversitario(session, condition, orderBy);
			return (AnagraficaUniversitario[]) list.toArray(new AnagraficaUniversitario[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario[] listAnagraficaUniversitarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			List list = queryAnagraficaUniversitario(session, condition, orderBy, lockMode);
			return (AnagraficaUniversitario[]) list.toArray(new AnagraficaUniversitario[list.size()]);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario loadAnagraficaUniversitarioByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAnagraficaUniversitarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario loadAnagraficaUniversitarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadAnagraficaUniversitarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario loadAnagraficaUniversitarioByQuery(PersistentSession session, String condition, String orderBy) {
		AnagraficaUniversitario[] anagraficaUniversitarios = listAnagraficaUniversitarioByQuery(session, condition, orderBy);
		if (anagraficaUniversitarios != null && anagraficaUniversitarios.length > 0)
			return anagraficaUniversitarios[0];
		else
			return null;
	}
	
	public static AnagraficaUniversitario loadAnagraficaUniversitarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		AnagraficaUniversitario[] anagraficaUniversitarios = listAnagraficaUniversitarioByQuery(session, condition, orderBy, lockMode);
		if (anagraficaUniversitarios != null && anagraficaUniversitarios.length > 0)
			return anagraficaUniversitarios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAnagraficaUniversitarioByQuery(String condition, String orderBy) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateAnagraficaUniversitarioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAnagraficaUniversitarioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) {
		try {
			PersistentSession session = ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateAnagraficaUniversitarioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static java.util.Iterator iterateAnagraficaUniversitarioByQuery(PersistentSession session, String condition, String orderBy) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.AnagraficaUniversitario as AnagraficaUniversitario");
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
	
	public static java.util.Iterator iterateAnagraficaUniversitarioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) {
		StringBuffer sb = new StringBuffer("From ngs.persistentmodel.AnagraficaUniversitario as AnagraficaUniversitario");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("AnagraficaUniversitario", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			return null;
		}
	}
	
	public static AnagraficaUniversitario createAnagraficaUniversitario() {
		return new ngs.persistentmodel.AnagraficaUniversitario();
	}
	
	public static boolean save(ngs.persistentmodel.AnagraficaUniversitario anagraficaUniversitario) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().saveObject(anagraficaUniversitario);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean delete(ngs.persistentmodel.AnagraficaUniversitario anagraficaUniversitario) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().deleteObject(anagraficaUniversitario);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean refresh(ngs.persistentmodel.AnagraficaUniversitario anagraficaUniversitario) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(anagraficaUniversitario);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static boolean evict(ngs.persistentmodel.AnagraficaUniversitario anagraficaUniversitario) {
		try {
			ngs.persistentmodel.NextGenSport2PersistentManager.instance().getSession().evict(anagraficaUniversitario);
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
	
	public static AnagraficaUniversitario loadAnagraficaUniversitarioByCriteria(AnagraficaUniversitarioCriteria anagraficaUniversitarioCriteria) {
		AnagraficaUniversitario[] anagraficaUniversitarios = listAnagraficaUniversitarioByCriteria(anagraficaUniversitarioCriteria);
		if(anagraficaUniversitarios == null || anagraficaUniversitarios.length == 0) {
			return null;
		}
		return anagraficaUniversitarios[0];
	}
	
	public static AnagraficaUniversitario[] listAnagraficaUniversitarioByCriteria(AnagraficaUniversitarioCriteria anagraficaUniversitarioCriteria) {
		return anagraficaUniversitarioCriteria.listAnagraficaUniversitario();
	}
}
