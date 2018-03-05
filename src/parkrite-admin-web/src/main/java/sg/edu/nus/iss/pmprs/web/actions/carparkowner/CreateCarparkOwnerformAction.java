package sg.edu.nus.iss.pmprs.web.actions.carparkowner;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ModelDriven;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.CarparkownerForm;


@Action(
		value="createcarparkownerform", 
	    	results={@Result(name="success", location="/content/carparkowner/carparkowner.jsp")}
		)

public class CreateCarparkOwnerformAction extends CommonAction implements ModelDriven<CarparkownerForm> {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4557307365105737334L;

	public String execute()
	{
		
		return SUCCESS;
	}
	
	@Override
	public CarparkownerForm getModel() {
		// TODO Auto-generated method stub
		return null;
	}


}
