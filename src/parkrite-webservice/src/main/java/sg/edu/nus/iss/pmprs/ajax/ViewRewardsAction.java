package sg.edu.nus.iss.pmprs.ajax;

import sg.edu.nus.iss.pmprs.mobile.changepassword.ChangePasswordResponse;
import sg.edu.nus.iss.pmprs.mobile.viewrewards.ViewRewardsRequest;
import sg.edu.nus.iss.pmprs.mobile.viewrewards.ViewRewardsResponse;

import com.opensymphony.xwork2.ModelDriven;

public class ViewRewardsAction  extends JsonServiceAction<ViewRewardsRequest, ViewRewardsResponse> implements ModelDriven<ViewRewardsResponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3471635106671275353L;

	@Override
	public String executeJson(ViewRewardsRequest requestObj) {
		// TODO Auto-generated method stub
		//ChangePasswordResponse response = new ChangePasswordResponse();
		String name=(String)this.getSession().get("LOGIN_USER");
		//String name=this.getLoginUserId();
		ViewRewardsResponse response=service.viewRewards(name);
	//	logger.info("Login ID:"+getLoginUserId());
		response.setStatusCode("SUCCESS");
		setModel(response);
		return SUCCESS;
	}

	@Override
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return ViewRewardsRequest.class;
	}

}
