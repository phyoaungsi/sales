package sg.edu.nus.iss.pmprs.core.dao;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

public class DaoHibernate implements IDao {

	
	private Session entityManager;
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#create(java.lang.Object)
	 * 
	 * 
	 */
	public DaoHibernate()
	{
		
		entityManager=HibernateUtil.getSessionFactory().openSession();
		
	}
	public boolean create(Object o)
	{
		
		entityManager.getTransaction().begin();
		entityManager.persist( o );	
		entityManager.getTransaction().commit();
		//entityManager.close();
		return true;
	}
	
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#update(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#update(java.lang.Object)
	 */
	public boolean update(Object o)
	{
		
		entityManager.getTransaction().begin();
		entityManager.merge(o);
		entityManager.flush();
		entityManager.getTransaction().commit();
		//entityManager.close();
		return true;
	}
	
	
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#delete(java.lang.Object)
	 */
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#delete(java.lang.Object)
	 */
	public boolean delete(Object o)
	{
		
		entityManager.getTransaction().begin();
		entityManager.delete(o);
		entityManager.getTransaction().commit();
		//entityManager.close();
		return true;
	}
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#getList(java.lang.Class)
	 */
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#getList(java.lang.Class)
	 */
	public List getList(Class clazz)
	{
	// now lets pull events from the database and list them
			
			entityManager.getTransaction().begin();
			
	        List result = entityManager.createQuery( "from "+clazz.getName()).list();
			
	        entityManager.getTransaction().commit();
	       // entityManager.close();
	        return result;
	}
	
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#getSingleQuery(java.lang.String, java.util.Map)
	 */
	public CommonEntity getSingleQuery(String query,Map<String,Object> params)
	{
		
		entityManager.getTransaction().begin();
		
		   
				Query q=   entityManager.createQuery(query);
				Iterator<String> s=params.keySet().iterator();
				while(s.hasNext())
				{
					String key=s.next();
					q.setParameter(key, params.get(key));
				}
				
				CommonEntity result=null;
				if(q.uniqueResult()!=null)
				{
				 result=(CommonEntity) q.uniqueResult();
				}
				
				
        entityManager.getTransaction().commit();
        //entityManager.flush();
        
       // entityManager.close();
        return result;
		
	}
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#queryResults(java.lang.String, java.util.Map)
	 */
	public List queryResults(String query,Map<String,Object> params)
	{
		
		entityManager.getTransaction().begin();
		
		   
				Query q=   entityManager.createQuery( query);
				Iterator<String> s=params.keySet().iterator();
				while(s.hasNext())
				{
					String key=s.next();
					q.setParameter(key, params.get(key));
				}
				
				List result= q.list();
				
        entityManager.getTransaction().commit();
       // entityManager.close();
        return result;
		
	}
	
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#closeConnection()
	 */
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#closeConnection()
	 */
	public void closeConnection()
	{	
		entityManager.close();
	}
	
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#queryResults(java.lang.String, java.util.Map, int)
	 */
	public List queryResults(String query,Map<String,Object> params,int max)
	{
		
		entityManager.getTransaction().begin();
		
		   
				Query q=   entityManager.createQuery( query);
				q.setMaxResults(max);
			
				Iterator<String> s=params.keySet().iterator();
				while(s.hasNext())
				{
					String key=s.next();
					q.setParameter(key, params.get(key));
				}
				
				List result= q.list();
				
        entityManager.getTransaction().commit();
        //entityManager.close();
        return result;
		
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#queryResults(java.lang.String)
	 */
	public List queryResults(String query)
	{
		
		entityManager.getTransaction().begin();
		
		   
				Query q=   entityManager.createQuery( query);
				List result= q.list();
				
        entityManager.getTransaction().commit();
        //entityManager.close();
        return result;
		
	}
	
	/* (non-Javadoc)
	 * @see com.mmdrama.core.dao.IDao#executeNonQuery(java.lang.String)
	 */
	public int executeNonQuery(String query)
	{
		
		entityManager.getTransaction().begin();
		
		   
				Query q=   entityManager.createQuery( query);
			int i=	q.executeUpdate();
				
        entityManager.getTransaction().commit();
        //entityManager.close();
        return i;
		
	}
	public CommonEntity get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
