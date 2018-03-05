package sg.edu.nus.iss.pmprs.web.actions.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.Errors;

import sg.edu.nus.iss.pmprs.service.UserService;
import sg.edu.nus.iss.pmprs.vo.PmprsUserVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.UserForm;
import sg.edu.nus.iss.pmprs.web.utility.Validator;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "createUser", results = {
		@Result(name = "success", location = "/content/user/user.jsp"),
		@Result(name = "error", location = "/content/user/user.jsp"),

})
public class CreateUserAction extends CommonAction implements
		ScopedModelDriven<UserForm> {

	/**
	 * 
	 */
	Logger logger = Logger.getLogger(this.getClass());
	private static final long serialVersionUID = 5317660498577483199L;

	@Autowired
	@Qualifier("userServiceImpl")
	UserService service;

	UserForm model;

	public String execute() {

	
		Map<Integer, String> map = fillRolesDDL();
		this.getModel().setRoles(map);
	
		PmprsUserVo userVo=new PmprsUserVo();
		userVo.setAddress(this.getModel().getAddress());
		userVo.setBirthDate(getModel().getBirthDate());
		userVo.setCompany(getModel().getCompany());
		userVo.setDepartment(getModel().getDepartment());
		userVo.setDesignation(getModel().getDesination());
		userVo.setEmail(getModel().getEmail());
		userVo.setGender(Integer.parseInt(getModel().getGender()));
		userVo.setHomeNumber(getModel().getHomeNumber());
		userVo.setMobileNumber(getModel().getMobileNumber());
		userVo.setName(getModel().getName());
		userVo.setNric(getModel().getNric());
		userVo.setPassword(getModel().getPassword());
		userVo.setPostalCode(getModel().getPostalCode());
		//userVo.setRoles(List<PmprsRole>);
		userVo.setRoleId(Integer.parseInt(getModel().getRoleId()));
		userVo.setStatusId(1);
		
		userVo.setUserName(getModel().getUserId());
		
		ArrayList<String> errors=new ArrayList();
	    getModel().validate(errors);
	    if(errors.size()>0)
	    {
	    	this.setActionErrors(errors);
	    	return ERROR;
	    }
	    
		service.create(userVo);
		

			ArrayList<String> messages = new ArrayList<String>();
			messages.add("Successfully created the user.");

			setActionMessages(messages);
			
			return SUCCESS;
		
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
