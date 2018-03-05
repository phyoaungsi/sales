package sg.com.mecomb.security.pmprs.dao;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sg.edu.nus.iss.pmprs.dao.UserRepository;
import sg.edu.nus.iss.pmprs.service.UserServiceImpl;


public class UserServiceFactory {
	
	@Autowired
	private static UserRepository userRepository;
	
	public static Object getService(String name)
	{
		
		if(name.equals("PMPRS_USER_SERVICE"))
		{
			
		
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
			        new String[] {"META-INF/applicationContext.xml"});
			// of course, an ApplicationContext is just a BeanFactory
			BeanFactory factory = (BeanFactory) appContext;
				return factory.getBean("pmprsUserService");

		}
		return null;
	}

	public UserRepository getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
