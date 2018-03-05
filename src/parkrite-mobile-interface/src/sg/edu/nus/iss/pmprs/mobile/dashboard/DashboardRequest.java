package sg.edu.nus.iss.pmprs.mobile.dashboard;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;

public class DashboardRequest extends CommonRequest{

	public static String REQUEST_URL="/dashboard/dashboard.do";
	public double latitude;
	public double longitude;
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
