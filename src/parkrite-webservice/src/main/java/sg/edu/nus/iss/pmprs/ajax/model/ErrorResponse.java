package sg.edu.nus.iss.pmprs.ajax.model;

import sg.edu.nus.iss.pmprs.mobile.CommonResponse;

public class ErrorResponse extends CommonResponse{

	private String faultString;
	
    private String statusCode;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getFaultString() {
		return faultString;
	}

	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	

}
