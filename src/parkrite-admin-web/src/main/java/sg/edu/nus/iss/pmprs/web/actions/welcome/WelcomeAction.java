package sg.edu.nus.iss.pmprs.web.actions.welcome;




import java.util.StringTokenizer;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.security.access.prepost.PreAuthorize;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;

//@ParentPackage("parkrite-default")
public class WelcomeAction extends CommonAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -56317338472291629L;
	private static final Logger logger = Logger.getLogger(WelcomeAction.class);

	//@PreAuthorize("hasRole('PERM_READ_FACULTY_NEWS')")

	@Action(
			value="welcome", 
		    results={@Result(name="success", location="/content/search/result-success.jsp"),@Result(name="error", location="/pages/Error.jsp")}
			
			)
	public String execute()
	{
		System.out.println("welcome");
	   logger.info("success log");

    	return SUCCESS;
	}

	public static void main(String[] args)
	{
		
		System.out.println("hk");
	}

	
}
