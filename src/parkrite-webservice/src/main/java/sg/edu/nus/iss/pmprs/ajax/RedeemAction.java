package sg.edu.nus.iss.pmprs.ajax;

import sg.edu.nus.iss.pmprs.mobile.changepassword.ChangePasswordRequest;
import sg.edu.nus.iss.pmprs.mobile.changepassword.ChangePasswordResponse;
import sg.edu.nus.iss.pmprs.mobile.login.LoginResponse;
import sg.edu.nus.iss.pmprs.mobile.viewrewards.RedeemRequest;
import sg.edu.nus.iss.pmprs.mobile.viewrewards.RedeemResponse;
import sg.edu.nus.iss.pmprs.vo.RedeemVo;

import com.opensymphony.xwork2.ModelDriven;

public class RedeemAction extends JsonServiceAction<RedeemRequest, RedeemResponse> implements ModelDriven<RedeemResponse> {

	@Override
	public String executeJson(RedeemRequest r) {
		// TODO Auto-generated method stub
		RedeemVo vo=new RedeemVo();
		vo.setAmount(r.getAmount());
		String loginUser=(String)this.getSession().get("LOGIN_USER");
		vo.setMemberId(loginUser);
		vo.setRedeemId(r.getRedeemId());
		RedeemResponse response=new RedeemResponse();
		if(service.redeem(vo))
		{
			
			 response.setStatusCode("SUCCESS");
		}
		else{
			response.setStatusCode("FAILED");
		}
		setModel(response);
			
		return SUCCESS;
	}

	@Override
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return RedeemRequest.class;
	} 

}
