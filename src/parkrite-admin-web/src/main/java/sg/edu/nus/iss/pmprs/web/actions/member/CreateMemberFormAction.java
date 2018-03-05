package sg.edu.nus.iss.pmprs.web.actions.member;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ModelDriven;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.MemberForm;

@Action(
		value="createMemberForm", 
	    	results={@Result(name="success", location="/content/member/member.jsp")}
		)

public class CreateMemberFormAction extends CommonAction implements ModelDriven<MemberForm> {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = -1433051672517894832L;
	public String execute()
	{
		
		return SUCCESS;
	}
	@Override
	public MemberForm getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
