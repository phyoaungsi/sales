package sg.edu.nus.iss.pmprs.mobile.login;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;

public class LoginRequest extends CommonRequest{
	
	public static String REQUEST_URL="/login/login.do";
	
	private String userName;
    private String password;

    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	

}
