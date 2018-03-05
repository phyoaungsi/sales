package sg.edu.nus.iss.pmprs.mobile.updatemember;

import java.util.List;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;
import sg.edu.nus.iss.pmprs.mobile.login.Vehicle;

public class UpdateMemberRequest extends CommonRequest {

	public static String REQUEST_URL = "/member/update.do";
	//private List<Vehicle> vehicles;
	private String name;
	private String nric;
	private String birthDate;
	private String gender;
	private String address;
	private String postalCode;
	private String homeNumber;
	private String mobileNumber;
	private String memberUserId;
	private String email;
//	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNric() {
		return nric;
	}

	public void setNric(String nric) {
		this.nric = nric;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postal) {
		this.postalCode = postal;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMemberUserId() {
		return memberUserId;
	}

	public void setMemberUserId(String memberUserId) {
		this.memberUserId = memberUserId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public List<Vehicle> getVehicles() {
//		return vehicles;
//	}
//
//	public void setVehicles(List<Vehicle> vehicles) {
//		this.vehicles = vehicles;
//	}

}
