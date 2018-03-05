package sg.edu.nus.iss.pmprs.web.actions.reports;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;

@Action(
		value="index", 
	    results={@Result(name="success", location="/content/reports/index.jsp")}
		
		)
public class IndexAction extends CommonAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3381353750932586876L;
	public String execute()
	{
		return SUCCESS;
	}

}
