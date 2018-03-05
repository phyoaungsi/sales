package sg.edu.nus.iss.pmprs.vo.carparkowner;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

public class CarParkOwnerVo  extends CommonVo{

	/**
	 * 
	 */
	private static final long serialVersionUID = 731688283225151113L;
	/**
	 * 
	 */
	
	public int getCarparkownerId() {
		return carparkownerId;
	}

	public void setCarparkownerId(int carparkownerId) {
		this.carparkownerId = carparkownerId;
	}

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

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getStatus_id() {
		return status_id;
	}

	public void setStatus_id(String status_id) {
		this.status_id = status_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}

	public String getOffice_number() {
		return office_number;
	}

	public void setOffice_number(String office_number) {
		this.office_number = office_number;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getLast_updated_by() {
		return last_updated_by;
	}

	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}

	public String getParkritemerchantid() {
		return parkritemerchantid;
	}

	public void setParkritemerchantid(String parkritemerchantid) {
		this.parkritemerchantid = parkritemerchantid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private int carparkownerId;
	private String parkritemerchantid;
	private String password;
	private String name;
	private String nric;
	private String birth_date;
	private String gender;
	private String contact_number;
	private String email;
	private String designation;
	private String status_id;

	private String company_name;
	private String address;
	private String postal_code;
	private String office_number;
	private String remarks;
	private String last_updated_by;

}
