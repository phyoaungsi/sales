package sg.edu.nus.iss.pmprs.web.actions.user;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.opensymphony.xwork2.ModelDriven;

import sg.edu.nus.iss.pmprs.dao.PmprsRoleRepository;
import sg.edu.nus.iss.pmprs.service.ComplimentaryService;
import sg.edu.nus.iss.pmprs.service.UserService;
import sg.edu.nus.iss.pmprs.vo.PmprsUserVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.UserForm;

@Action(
		value="createUserForm", 
	    	results={@Result(name="success", location="/content/user/user.jsp")}
		)

public class CreateUserFormAction extends CommonAction implements ModelDriven<UserForm> {

	/**
	 * 
	 */
	
	@Autowired
	@Qualifier("userServiceImpl")
	UserService service;
	
	UserForm model;
	
	
	private static final long serialVersionUID = -1433051672517894832L;
	public String execute()
	{
		
		model=new UserForm();
		Map<Integer, String> map = fillRolesDDL();
		this.getModel().setRoles(map);;
		return SUCCESS;
	}
	@Override
	public UserForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}

}
