package sg.edu.nus.iss.pmprs.mobile.register;

import sg.edu.nus.iss.pmprs.mobile.*;

public class RegistrationResponse extends  CommonResponse {

	private String statusCode;
	private String statusMessage;
	private String faultString;
	


	/**
	 * @param statusCode the statusCode to set
	 */


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
