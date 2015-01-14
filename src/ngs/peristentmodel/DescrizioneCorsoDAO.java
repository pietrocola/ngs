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
package ngs.peristentmodel;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class DescrizioneCorsoDAO {
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(String nomeCorso) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByORMID(session, nomeCorso);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(String nomeCorso) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getDescrizioneCorsoByORMID(session, nomeCorso);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(String nomeCorso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByORMID(session, nomeCorso, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(String nomeCorso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return getDescrizioneCorsoByORMID(session, nomeCorso, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(PersistentSession session, String nomeCorso) throws PersistentException {
		try {
			return (DescrizioneCorso) session.load(ngs.peristentmodel.DescrizioneCorso.class, nomeCorso);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(PersistentSession session, String nomeCorso) throws PersistentException {
		try {
			return (DescrizioneCorso) session.get(ngs.peristentmodel.DescrizioneCorso.class, nomeCorso);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByORMID(PersistentSession session, String nomeCorso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DescrizioneCorso) session.load(ngs.peristentmodel.DescrizioneCorso.class, nomeCorso, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso getDescrizioneCorsoByORMID(PersistentSession session, String nomeCorso, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (DescrizioneCorso) session.get(ngs.peristentmodel.DescrizioneCorso.class, nomeCorso, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneCorso(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryDescrizioneCorso(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneCorso(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return queryDescrizioneCorso(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listDescrizioneCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return listDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneCorso(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ngs.peristentmodel.DescrizioneCorso as DescrizioneCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static List queryDescrizioneCorso(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ngs.peristentmodel.DescrizioneCorso as DescrizioneCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneCorso", lockMode);
			return query.list();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDescrizioneCorso(session, condition, orderBy);
			return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDescrizioneCorso(session, condition, orderBy, lockMode);
			return (DescrizioneCorso[]) list.toArray(new DescrizioneCorso[list.size()]);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return loadDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		DescrizioneCorso[] descrizioneCorsos = listDescrizioneCorsoByQuery(session, condition, orderBy);
		if (descrizioneCorsos != null && descrizioneCorsos.length > 0)
			return descrizioneCorsos[0];
		else
			return null;
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		DescrizioneCorso[] descrizioneCorsos = listDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		if (descrizioneCorsos != null && descrizioneCorsos.length > 0)
			return descrizioneCorsos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateDescrizioneCorsoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession();
			return iterateDescrizioneCorsoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ngs.peristentmodel.DescrizioneCorso as DescrizioneCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDescrizioneCorsoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ngs.peristentmodel.DescrizioneCorso as DescrizioneCorso");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("DescrizioneCorso", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso createDescrizioneCorso() {
		return new ngs.peristentmodel.DescrizioneCorso();
	}
	
	public static boolean save(ngs.peristentmodel.DescrizioneCorso descrizioneCorso) throws PersistentException {
		try {
			ngs.peristentmodel.NextGenSport2PersistentManager.instance().saveObject(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ngs.peristentmodel.DescrizioneCorso descrizioneCorso) throws PersistentException {
		try {
			ngs.peristentmodel.NextGenSport2PersistentManager.instance().deleteObject(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(ngs.peristentmodel.DescrizioneCorso descrizioneCorso) throws PersistentException {
		try {
			ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession().refresh(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ngs.peristentmodel.DescrizioneCorso descrizioneCorso) throws PersistentException {
		try {
			ngs.peristentmodel.NextGenSport2PersistentManager.instance().getSession().evict(descrizioneCorso);
			return true;
		}
		catch (Exception e) {
			throw new PersistentException(e);
		}
	}
	
	public static DescrizioneCorso loadDescrizioneCorsoByCriteria(DescrizioneCorsoCriteria descrizioneCorsoCriteria) {
		DescrizioneCorso[] descrizioneCorsos = listDescrizioneCorsoByCriteria(descrizioneCorsoCriteria);
		if(descrizioneCorsos == null || descrizioneCorsos.length == 0) {
			return null;
		}
		return descrizioneCorsos[0];
	}
	
	public static DescrizioneCorso[] listDescrizioneCorsoByCriteria(DescrizioneCorsoCriteria descrizioneCorsoCriteria) {
		return descrizioneCorsoCriteria.listDescrizioneCorso();
	}
}
