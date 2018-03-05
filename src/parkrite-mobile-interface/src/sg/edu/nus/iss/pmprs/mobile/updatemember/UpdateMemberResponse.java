package sg.edu.nus.iss.pmprs.mobile.updatemember;

import sg.edu.nus.iss.pmprs.mobile.*;
import sg.edu.nus.iss.pmprs.mobile.login.Member;

public class UpdateMemberResponse extends  CommonResponse {

	private String statusCode;
	private String statusMessage;
	private String faultString;
	
	private Member member;
	
//	private String name;
//	private String nric;
//	private String birthDate;
//	private String gender;
//	private String address;
//	private String postalCode;
//	private String homeNumber;
//	private String mobileNumber;
//	private String memberUserId;
//	private String email;
//	private int id;
	private String status;

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

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getNric() {
//		return nric;
//	}
//
//	public void setNric(String nric) {
//		this.nric = nric;
//	}
//
//	public String getBirthDate() {
//		return birthDate;
//	}
//
//	public void setBirthDate(String birthDate) {
//		this.birthDate = birthDate;
//	}
//
//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getPostalCode() {
//		return postalCode;
//	}
//
//	public void setPostalCode(String postalCode) {
//		this.postalCode = postalCode;
//	}
//
//	public String getHomeNumber() {
//		return homeNumber;
//	}
//
//	public void setHomeNumber(String homeNumber) {
//		this.homeNumber = homeNumber;
//	}
//
//	public String getMobileNumber() {
//		return mobileNumber;
//	}
//
//	public void setMobileNumber(String mobileNumber) {
//		this.mobileNumber = mobileNumber;
//	}
//
//	public String getMemberUserId() {
//		return memberUserId;
//	}
//
//	public void setMemberUserId(String memberUserId) {
//		this.memberUserId = memberUserId;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

}
