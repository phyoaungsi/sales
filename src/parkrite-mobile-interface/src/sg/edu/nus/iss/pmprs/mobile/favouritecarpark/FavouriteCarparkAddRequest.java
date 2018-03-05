package sg.edu.nus.iss.pmprs.mobile.favouritecarpark;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;

public class FavouriteCarparkAddRequest extends CommonRequest {
	
	public static String REQUEST_URL="/carpark/addfavorite.do";
	private String loginUserName;
	private String carparkId;
	private boolean delete;
	public String getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}
	public String getLoginUserName() {
		return loginUserName;
	}
	public void setLoginUserName(String loginUserName) {
		this.loginUserName = loginUserName;
	}
	public boolean isDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
	}


}
