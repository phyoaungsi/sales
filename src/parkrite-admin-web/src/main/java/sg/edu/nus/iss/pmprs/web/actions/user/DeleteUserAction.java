package sg.edu.nus.iss.pmprs.web.actions.user;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.UserService;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.UserForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "deleteuser", results = { 
		@Result(name = "success", location = "/content/user/maintainuser.jsp") ,
		@Result(name = "fail", location = "/content/user/maintainuser.jsp")
})
public class DeleteUserAction extends CommonAction implements
		ScopedModelDriven<UserForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8137066765363979330L;
	@Autowired
	@Qualifier("userServiceImpl")
	UserService service;
	UserForm model;

	public String execute() {

		Collection<String> messages = new ArrayList<String>();
		
		if ( this.getModel().getId() == 0 ){
			messages.add("There is no such a existing user to delete!");
			setActionErrors(messages);
			return "fail";
		}
		else{
		service.delete(this.getModel().getId());

		messages.add("Successfully Deleted the user.");
		setActionMessages(messages);
		
		model = new UserForm();
		return SUCCESS;
		}
	}

	@Override
	public UserForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public void setModel(UserForm model) {
		// TODO Auto-generated method stub
		this.model = model;
	}

}
