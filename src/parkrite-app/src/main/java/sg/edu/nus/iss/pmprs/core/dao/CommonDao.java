package sg.edu.nus.iss.pmprs.core.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CommonDao implements IDao {

	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;

	public CommonDao(EntityManager em) {

		entityManager = em;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#create(java.lang.Object)
	 */
	public boolean create(Object o) {

		//if(!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();
		entityManager.persist(o);
		//if(entityManager.getTransaction().isActive())
		entityManager.getTransaction().commit();
		 //entityManager.close();
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#update(java.lang.Object)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#update(java.lang.Object)
	 */
	public boolean update(Object o) {
 
		if(!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();
		entityManager.merge(o);
		entityManager.flush();
		//if(entityManager.getTransaction().isActive())
		//entityManager.getTransaction().commit();
		 //entityManager.close();
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#delete(java.lang.Object)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#delete(java.lang.Object)
	 */
	public boolean delete(Object o) {

		if(!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();
		entityManager.remove(o);
		if(entityManager.getTransaction().isActive())
		entityManager.getTransaction().commit();
		//entityManager.close();
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#getList(java.lang.Class)
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#getList(java.lang.Class)
	 */
	public List getList(Class clazz) {
		// now lets pull events from the database and list them
		if(!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();

		List result =null;// entityManager.createQuery("from " + clazz.getName(),
			//	clazz).getResultList();
		if(entityManager.getTransaction().isActive())
		entityManager.getTransaction().commit();
		// entityManager.close();
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#getSingleQuery(java.lang.String,
	 * java.util.Map)
	 */
	public CommonEntity getSingleQuery(String query, Map<String, Object> params) {

		if(!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();

		Query q = entityManager.createQuery(query);
		Iterator<String> s = params.keySet().iterator();
		while (s.hasNext()) {
			String key = s.next();
			q.setParameter(key, params.get(key));
		}

		CommonEntity result = null;
		if (q.getSingleResult() != null) {
			result = (CommonEntity) q.getSingleResult();
		}
		
		//if(entityManager.getTransaction().isActive())
		//entityManager.getTransaction().commit();
		// entityManager.flush();

		 //entityManager.close();
		return result;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#queryResults(java.lang.String,
	 * java.util.Map)
	 */
	public List queryResults(String query, Map<String, Object> params) {

		if(!entityManager.getTransaction().isActive())
			entityManager.getTransaction().begin();
		
		Query q = entityManager.createQuery(query);
		Iterator<String> s = params.keySet().iterator();
		while (s.hasNext()) {
			String key = s.next();
			q.setParameter(key, params.get(key));
		}

		List result = q.getResultList();

		if(entityManager.getTransaction().isActive())
		entityManager.getTransaction().commit();
		// entityManager.close();
		return result;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#closeConnection()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#closeConnection()
	 */
	public void closeConnection() {
		entityManager.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#queryResults(java.lang.String,
	 * java.util.Map, int)
	 */
	public List queryResults(String query, Map<String, Object> params, int max) {

		if(!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();
		Query q = entityManager.createQuery(query);
		q.setMaxResults(max);

		Iterator<String> s = params.keySet().iterator();
		while (s.hasNext()) {
			String key = s.next();
			q.setParameter(key, params.get(key));
		}

		List result = q.getResultList();

		if(entityManager.getTransaction().isActive())
		entityManager.getTransaction().commit();
		// entityManager.close();
		return result;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#queryResults(java.lang.String)
	 */
	public List queryResults(String query) {

		if(!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();

		Query q = entityManager.createQuery(query);
		List result = q.getResultList();

		if(entityManager.getTransaction().isActive())
		entityManager.getTransaction().commit();
		// entityManager.close();
		return result;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mmdrama.core.dao.IDao#executeNonQuery(java.lang.String)
	 */
	public int executeNonQuery(String query) {

		if(!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();
		Query q = entityManager.createQuery(query);
		int i = q.executeUpdate();
		if(entityManager.getTransaction().isActive())
		entityManager.getTransaction().commit();
		// entityManager.close();
		return i;

	}

	public CommonEntity get(String id) {
		if(!entityManager.getTransaction().isActive())
		entityManager.getTransaction().begin();
		CommonEntity result = entityManager.find(CommonEntity.class, id);
		if(entityManager.getTransaction().isActive())
		entityManager.getTransaction().commit();
		return result;

	}

}
