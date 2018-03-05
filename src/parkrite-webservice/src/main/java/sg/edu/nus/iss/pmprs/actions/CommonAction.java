package sg.edu.nus.iss.pmprs.actions;

import java.util.List;



import javax.persistence.EntityManager;

import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import sg.edu.nus.iss.pmprs.core.dao.HibernateEmUtility;
import sg.edu.nus.iss.pmprs.core.web.CommonActionSupport;


//@Namespace("/admin")
public class CommonAction extends CommonActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5470733640878677004L;
	private String scopeKey;
  
	public EntityManager getEntityManager()
	{
		
		if(HibernateEmUtility.getEntityManager().getTransaction().isActive() && HibernateEmUtility.getEntityManager().getTransaction().getRollbackOnly())
		{
			HibernateEmUtility.getEntityManager().getTransaction().rollback();
			HibernateEmUtility.getEntityManager().getTransaction().begin();
			
		}
		return HibernateEmUtility.getEntityManager();
		
	}
	

	
	public String getLoginUserId()
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName(); //get logged in username
	      return name;		
	}
	
	public void setScopeKey(String key) {
		// TODO Auto-generated method stub
		this.scopeKey = key;
	}

	public String getScopeKey() {
		// TODO Auto-generated method stub
		return this.scopeKey;
	}
	
}
