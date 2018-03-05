package sg.edu.nus.iss.pmprs.vo;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.mobile.register.RegistrationRequest;

public class MemberRegisterVo extends CommonVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6846547402089733442L;
	RegistrationRequest request;
	public RegistrationRequest getRequest() {
		return request;
	}
	public void setRequest(RegistrationRequest request) {
		this.request = request;
	}

}
