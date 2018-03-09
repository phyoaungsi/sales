package sg.edu.nus.iss.pmprs.web.actions;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import javax.persistence.EntityManager;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import sg.edu.nus.iss.pmprs.core.common.PropertiesFile;
import sg.edu.nus.iss.pmprs.core.dao.HibernateEmUtility;
import sg.edu.nus.iss.pmprs.core.web.CommonActionSupport;
import sg.edu.nus.iss.pmprs.dao.PmprsRoleRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsRole;

public class CommonAction extends CommonActionSupport implements SessionAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5470733640878677004L;
	private static final String TEMPLATE_BASE = "template.base";
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
	
	public String getNamespace()
	{
		String namespace = ServletActionContext.getActionMapping().getNamespace();
		 StringTokenizer st = new StringTokenizer(namespace,"//");
		 return st.nextToken();		
	}
	
	public String getAce()
	{
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		Iterator<SimpleGrantedAuthority> itr=authorities.iterator();
		SimpleGrantedAuthority auth=null;
		if( itr.hasNext()){
			auth=	itr.next();
		}
		 String role= auth.getAuthority();	
		 return role;
	}
	public String getAccess()
	{
		
		Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		Iterator<SimpleGrantedAuthority> itr=authorities.iterator();
		SimpleGrantedAuthority auth=null;
		if( itr.hasNext()){
			auth=	itr.next();
		}
		 String role= auth.getAuthority();	
		 return role;
	}
	public boolean getCarParkOwner()
	{
		String role=getAccess();
		return role.equals("ROLE_CPO");
	}
	
	public boolean getSystemAdmin()
	{
		return getAccess().equals("ROLE_ADMIN");
	}
	public String getLoginUserId()
	{
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName(); //get logged in username
	      return name;		
	}
	
	public void setScopeKey(String key) {
		//TODO Auto-generated method stub
		this.scopeKey = key;
	}

	public String getScopeKey() {
		// TODO Auto-generated method stub
		return this.scopeKey;
	}

	@Autowired
	public
	PmprsRoleRepository rolesDao;
	protected Map<Integer, String> fillRolesDDL() {
		Map<Integer,String> map=new HashMap<Integer,String>();
		for(PmprsRole role:rolesDao.findAll()){
			
			map.put(role.getId(), role.getDescription());
		}
		return map;
	}
	

	public void saveSession(Object key,Object value){
	   Map<Object,Object> m=	this.getSession();
	   if(m==null)
	   {
		 m=new HashMap<Object,Object>();
		 m.put(key, value);
		 this.setSession(m);
	   }else{
	    this.getSession().put(key, value);
	   }
	}
	
	public Object retrieveSession(Object key){
		   Map<Object,Object> m=	this.getSession();
		   if(m!=null)
		    return m.get(key);
		   return null;
	}
}
