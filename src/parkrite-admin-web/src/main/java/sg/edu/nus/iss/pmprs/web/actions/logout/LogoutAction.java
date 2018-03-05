package sg.edu.nus.iss.pmprs.web.actions.logout;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.security.core.context.SecurityContextHolder;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;

@Action(
		
	    results={@Result(name="success", location="/login/login.jsp")}
		
		)
public class LogoutAction extends CommonAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String execute()
	{
		

	        SecurityContextHolder.clearContext();

	   
		return SUCCESS;
	}
	

}
