package sg.edu.nus.iss.pmprs.web.listener;


    import javax.servlet.*;

    public final class ScheduleListener implements
       ServletContextListener {
        public void contextInitialized(ServletContextEvent event) {

          /* This method is called when the servlet context is
             initialized(when the Web Application is deployed). 
             You can initialize servlet context related data here.
             
             
          */ 
        new ScheduleThread("hello").start();
        }

        public void contextDestroyed(ServletContextEvent event) {

          /* This method is invoked when the Servlet Context 
             (the Web Application) is undeployed or 
             WebLogic Server shuts down.
          */			    

        }
    }
