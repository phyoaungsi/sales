package sg.edu.nus.iss.pmprs.vo;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

public class DashboardRequestVo extends CommonVo {

	/**
	 * 
	 */
	private static final double serialVersionUID = 1L;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double doubleitude) {
		this.longitude = doubleitude;
	}
	private String userId;
	private double latitude;
	private double longitude;

}
