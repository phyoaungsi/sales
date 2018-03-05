package sg.edu.nus.iss.pmprs.mobile.changepassword;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;

public class ChangePasswordRequest  extends CommonRequest {
	
	public static String REQUEST_URL="/login/changepassword.do";
	private String userId;
	private String newPassword;
	private String oldPassword;

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	
}
