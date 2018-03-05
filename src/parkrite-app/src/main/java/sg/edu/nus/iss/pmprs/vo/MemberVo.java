package sg.edu.nus.iss.pmprs.vo;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

public class MemberVo extends CommonVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private String status;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int id;

	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public int getId() {

		return id;
	}

}
