package sg.edu.nus.iss.pmprs.web.ajax;

import javax.persistence.EntityManager;

import sg.edu.nus.iss.pmprs.core.dao.HibernateEmUtility;

public class JsonAction {

	private String request;

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}
	
	public EntityManager getEntityManager()
	{
		return HibernateEmUtility.getEntityManager();
		
	}
	

}
