package sg.edu.nus.iss.pmprs.ajax;

import org.apache.struts2.ServletActionContext;

import sg.edu.nus.iss.pmprs.mobile.changepassword.ChangePasswordRequest;
import sg.edu.nus.iss.pmprs.mobile.changepassword.ChangePasswordResponse;

import com.opensymphony.xwork2.ModelDriven;

public class ChangePasswordAction extends
		JsonServiceAction<ChangePasswordRequest, ChangePasswordResponse>
		implements ModelDriven<ChangePasswordResponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6438878445825327933L;

	@Override
	public String executeJson(ChangePasswordRequest requestObj) {
		ChangePasswordResponse response = new ChangePasswordResponse();
		String name=(String)this.getSession().get("LOGIN_USER");
		logger.info("Login user id:"+name+" Sessiong ID"+ServletActionContext.getRequest().getSession().getId());
	
		if( service.changePassword(name, requestObj.getOldPassword(), requestObj.getNewPassword())){
		
		
		  response.setStatusCode("SUCCESS");
		}
		this.setModel(response);
		return SUCCESS;
	}

	@SuppressWarnings("rawtypes")
	public Class getJsonClass() {
		return ChangePasswordRequest.class;
	}

}
