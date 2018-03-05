package sg.edu.nus.iss.pmprs.mobile.dashboard;

import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.pmprs.mobile.CommonResponse;
public class DashboardResponse extends CommonResponse{
	
	List<CarPark> carParks=new ArrayList<CarPark>();
	private String statusCode;
	private String statusMessage;
	private String faultString;

	public List<CarPark> getCarParks() {
		return carParks;
	}

	public void setCarParks(List<CarPark> carParks) {
		this.carParks = carParks;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}

	/**
	 * @param statusMessage the statusMessage to set
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getFaultString() {
		return faultString;
	}

	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}



}
