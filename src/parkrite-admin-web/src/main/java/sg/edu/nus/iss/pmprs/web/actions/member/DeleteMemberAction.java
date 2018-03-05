package sg.edu.nus.iss.pmprs.web.actions.member;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.MemberService;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.MemberForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "deletemember", results = { 
		@Result(name = "success", location = "/content/member/maintainmember.jsp") ,
		@Result(name = "fail", location = "/content/member/maintainmember.jsp")
})
public class DeleteMemberAction extends CommonAction implements
		ScopedModelDriven<MemberForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8137066765363979330L;
	@Autowired
	@Qualifier("memberServiceImpl")
	MemberService service;
	MemberForm model;

	public String execute() {

		Collection<String> messages = new ArrayList<String>();
		
		if ( this.getModel().getId() == 0 ){
			messages.add("There is no such a existing member to delete!");
			setActionErrors(messages);
			return "fail";
		}
		else{
		service.deleteMember(this.getModel().getId());

		messages.add("Successfully Deleted the member.");
		setActionMessages(messages);
		
		model = new MemberForm();
		return SUCCESS;
		}
	}

	@Override
	public MemberForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public void setModel(MemberForm model) {
		// TODO Auto-generated method stub
		this.model = model;
	}

}
