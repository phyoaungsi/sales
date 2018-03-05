package sg.edu.nus.iss.pmprs.web.actions.user;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.entity.PmprsUser;
import sg.edu.nus.iss.pmprs.service.UserService;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.UserForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "editUserForm", results = { @Result(name = "success", location = "/content/user/maintainuser.jsp") })
public class EditUserFormAction extends CommonAction implements
		ScopedModelDriven<UserForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1127337637515702797L;
	private String userId;
	private UserForm model;

	@Autowired
	@Qualifier("userServiceImpl")
	UserService service;

	public String execute() {
		
		if (model.getUserId() != null) {
			
			PmprsUser vo = service.getUserByUserName(model.getUserId());
			model = new UserForm();
			
			model.setUserId (vo.getUserName());
			model.setId(model.getId());
			model.setEmail(vo.getEmail());
			model.setId(vo.getId());
			model.setNric(vo.getNric());
			model.setName(vo.getName());
			model.setHomeNumber(vo.getHomeNumber());
			model.setAddress(vo.getAddress());
			// model.setBirthDate(vo.getBirthDate());
			//model.setGender(vo.getGender());
			model.setMobileNumber(vo.getMobileNumber());
			model.setPostalCode(vo.getPostcalCode());
			
			// messages.add("Successfully created the user.");
			// setActionMessages(messages);
		}
		Map<Integer, String> map = fillRolesDDL();
		this.getModel().setRoles(map);
		return SUCCESS;
	}

	@Override
	public UserForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public void setModel(UserForm model) {
		// TODO Auto-generated method stub
		this.model = model;

	}

}
