package sg.edu.nus.iss.pmprs.mobile.favouritecarpark;

import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.pmprs.mobile.CommonResponse;
import sg.edu.nus.iss.pmprs.mobile.dashboard.CarPark;

public class ViewFavouriteCarparksReponse extends CommonResponse {
	private List<CarPark> carparks;
	public ViewFavouriteCarparksReponse() {
		carparks=new ArrayList<CarPark>();
	}

	

	public List<CarPark> getCarparks() {
		return carparks;
	}

	public void setCarparks(List<CarPark> carparks) {
		this.carparks = carparks;
	}
	private String statusCode;
	private String statusMessage;
	private String faultString;


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

}
