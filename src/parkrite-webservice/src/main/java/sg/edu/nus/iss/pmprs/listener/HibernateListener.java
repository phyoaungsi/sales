package sg.edu.nus.iss.pmprs.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import sg.edu.nus.iss.pmprs.core.dao.HibernateUtil;


public class HibernateListener implements ServletContextListener {
	 
    public void contextInitialized(ServletContextEvent event) {
        HibernateUtil.getSessionFactory(); // Just call the static initializer of that class    
    }
 
    public void contextDestroyed(ServletContextEvent event) {
        HibernateUtil.getSessionFactory().close(); // Free all resources
    }
}