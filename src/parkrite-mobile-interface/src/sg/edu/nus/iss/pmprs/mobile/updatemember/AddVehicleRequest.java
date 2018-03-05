package sg.edu.nus.iss.pmprs.mobile.updatemember;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;
import sg.edu.nus.iss.pmprs.mobile.login.Vehicle;

public class AddVehicleRequest extends CommonRequest{
	
	public static String REQUEST_URL = "/member/addcar.do";
	private Vehicle car;
	private String operation;
	public Vehicle getCar() {
		return car;
	}
	public void setCar(Vehicle car) {
		this.car = car;
	}
	
	public enum Operation
	{
		ADD,REMOVE,LIST
	}

	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

}
