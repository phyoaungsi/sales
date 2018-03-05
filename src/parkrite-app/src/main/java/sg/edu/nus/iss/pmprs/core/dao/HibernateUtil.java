package sg.edu.nus.iss.pmprs.core.dao;




import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;




public class HibernateUtil {

	private static final SessionFactory sessionFactory;

	static {
		try {
			 Configuration configuration = new Configuration();
			    configuration.configure();
			ServiceRegistry serviceRegistry = null;//new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();   
			sessionFactory =new Configuration()
	                .configure() // configures settings from hibernate.cfg.xml
	                .buildSessionFactory(serviceRegistry);

		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
