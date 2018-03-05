package sg.edu.nus.iss.pmprs.web.service;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;

public class Service {
	
	public static BusinessLogic getBl(String fullyQualifyClass) 
	{
		try {
			Class c= Class.forName(fullyQualifyClass);
			BusinessLogic bl=(BusinessLogic) c.newInstance();
			return bl;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	

}
