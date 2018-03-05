package sg.edu.nus.iss.pmprs.web.actions.user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.UserService;
import sg.edu.nus.iss.pmprs.vo.PmprsUserVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.UserForm;
import sg.edu.nus.iss.pmprs.web.utility.Validator;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "updateuser", results = {
		@Result(name = "success", location = "/content/user/maintainuser.jsp") ,
		@Result(name = "fail", location = "/content/user/maintainuser.jsp")
})
public class UpdateUserAction extends CommonAction implements
		ScopedModelDriven<UserForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6835776536596277046L;
	@Autowired
	@Qualifier("userServiceImpl")
	UserService service;
	UserForm model;

	public String execute() {

		ArrayList<String> errors=new ArrayList();
	    getModel().validateUpdate(errors);
	   
		if (errors.size()>0) {
			this.setActionErrors(errors);
	    	
			return "fail";
		} else { // if no error

			if ( this.getModel().getId() == 0 ){
				errors.add("There is no such a existing user to update!");
				setActionErrors(errors);
				return "fail";
			}
			else{
			PmprsUserVo vo = new PmprsUserVo();
			vo = (PmprsUserVo) getModel().convertFormToVo(vo);
			
			
			 vo.setAddress(getModel().getAddress());
			vo.setBirthDate( getModel().getBirthDate());
			vo.setCompany( getModel().getCompany());
			vo.setDepartment( getModel().getDepartment());
			vo.setDesignation( getModel().getDesination());
			vo.setEmail( getModel().getEmail());
			vo.setGender(Integer.parseInt(getModel().getGender()));
			vo.setHomeNumber( getModel().getHomeNumber());
			vo.setId( getModel().getId());
			vo.setUserName( getModel().getMemberUserId());
			vo.setMobileNumber( getModel().getMobileNumber());
			vo.setName( getModel().getName());
			vo.setNric(getModel().getNric());
			vo.setPassword( getModel().getPassword());
			vo.setPostalCode( getModel().getPostalCode());
			
			vo.setUserName(getModel().getUserId());
			
			//vo.setRoleId(Integer.parseInt(getModel().getRoleId()));
			
			//vo.setId(this.getModel().getId());
			service.update(vo);
			List<String> successMsgs=new ArrayList<String>();
			successMsgs.add("Successfully upated the user.");
		
			setActionMessages(successMsgs);
			Map<Integer, String> map = fillRolesDDL();
			this.getModel().setRoles(map);
			
			return SUCCESS;
			}
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
