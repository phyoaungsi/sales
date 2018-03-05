package sg.edu.nus.iss.pmprs.mobile.favouritecarpark;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;

public class NearByCarParkRequest extends CommonRequest{
	
	public static String REQUEST_URL="/carpark/getnearby.do";
	public double lattitude;
	public double getLattitude() {
		return lattitude;
	}
	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double longitude;

}
