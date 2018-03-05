package sg.edu.nus.iss.pmprs.core.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateEmUtility {
	
	private static final EntityManager em;
  
	static {
		try {
			EntityManagerFactory entityManagerFactory;
			entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
			
			em= entityManagerFactory.createEntityManager();
			System.out.println(em.getClass().getCanonicalName());

		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static EntityManager getEntityManager() {
	//	return em;
		try {
			EntityManagerFactory entityManagerFactory;
			entityManagerFactory = Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
			
			return entityManagerFactory.createEntityManager();
			

		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

}
