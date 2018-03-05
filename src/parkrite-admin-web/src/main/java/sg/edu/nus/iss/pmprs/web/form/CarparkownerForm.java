package sg.edu.nus.iss.pmprs.web.form;

import java.util.List;

public class CarparkownerForm {

	public int getCarparkOwnerId() {
		return carparkownerid;
	}
	public void setCarparkOwnerId(int carparkOwnerId) {
		this.carparkownerid = carparkOwnerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password =  password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getGenders() {
		return genders;
	}
	public void setGenders(List<String> genders) {
		this.genders = genders;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	


	public String getNric() {
		return nric;
	}
	public void setNric(String nric) {
		this.nric = nric;
	}

	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getOfficephoneno() {
		return officephoneno;
	}
	public void setOfficephoneno(String officephoneno) {
		this.officephoneno = officephoneno;
	}

	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getParkriteMerchantid() {
		return parkriteMerchantid;
	}
	public void setParkriteMerchantid(String parkriteMerchantid) {
		this.parkriteMerchantid = parkriteMerchantid;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}



	public int carparkownerid;
	public String name;
	public String email;
	public String password;
	public List<String> genders;
	public String gender;
	private Boolean isActive;
	private String nric;
	private String contactno;
	private String designation;
	private String companyname;
	private String address;
	private String postalcode;
	private String officephoneno;
	private String remark;
	private String parkriteMerchantid;

	private String type;
	private String status;
	

	
}
