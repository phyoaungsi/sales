package sg.edu.nus.iss.pmprs.mobile.updatemember;

import java.util.List;

import sg.edu.nus.iss.pmprs.mobile.CommonResponse;
import sg.edu.nus.iss.pmprs.mobile.login.Vehicle;

public class AddVehicleResponse extends CommonResponse {
	
	private List<Vehicle> vehicles;
	private String statusCode;
	private String statusMessage;
	private String faultString;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getFaultString() {
		return faultString;
	}
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	

}
