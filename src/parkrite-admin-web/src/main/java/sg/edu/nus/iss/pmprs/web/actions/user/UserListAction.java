package sg.edu.nus.iss.pmprs.web.actions.user;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import sg.edu.nus.iss.pmprs.entity.PmprsUser;
import sg.edu.nus.iss.pmprs.service.UserService;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;

@Action(value = "userList", results = { @Result(name = "success", location = "/content/user/list.jsp") })
public class UserListAction extends CommonAction {

	/**
	 * 
	 */
	List<PmprsUser> users;

	@Autowired
	@Qualifier("userServiceImpl")
	UserService service;

	private static final long serialVersionUID = -3643334708957881550L;

	public String execute() {
		users = service.getAll();
		return SUCCESS;
	}

	public List<PmprsUser> getUsers() {
		return users;
	}

	public void setUsers(List<PmprsUser> users) {
		this.users = users;
	}

}
