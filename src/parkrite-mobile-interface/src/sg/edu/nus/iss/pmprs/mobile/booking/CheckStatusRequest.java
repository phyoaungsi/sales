package sg.edu.nus.iss.pmprs.mobile.booking;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;

public class CheckStatusRequest extends CommonRequest {
	
	public static String REQUEST_URL="/booking/checkstatus.do";
	public String userId;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
