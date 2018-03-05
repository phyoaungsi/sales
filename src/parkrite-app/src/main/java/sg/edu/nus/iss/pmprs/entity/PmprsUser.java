
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/**
 * PmprsUser is a mapping of pmprs_user Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_user" )
public class PmprsUser extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 507973618172620185L;	
    
	
    
	
    
	
    @Column(name="status_id")
	private Integer statusId;

    @Column(name="mobile_number")
	private String mobileNumber;
    @Column(name="home_number")
	private String homeNumber;
    @Column(name="department")
	private String department;
    @Column(name="company")
	private String company;
    @Column(name="designation")
	private String designation;
    @Column(name="postcal_code")
	private String postcalCode;
    @Column(name="user_name",unique=true)
 	private String userName;
    @Column(name="address")
	private String address;
    @Column(name="gender")
	private Integer gender;
    @Column(name="birth_date")
	private java.util.Date birthDate;
    @Column(name="nric")
	private String nric;
    @Column(name="name")
	private String name;
    @Column(name="password")
	private String password;
    @Column(name="email",unique=true)
	private String email;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private List<PmprsUserRole> userRoles;
	public Integer getStatusId() {
		return statusId;
	}
	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPostcalCode() {
		return postcalCode;
	}
	public void setPostcalCode(String postcalCode) {
		this.postcalCode = postcalCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public java.util.Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(java.util.Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getNric() {
		return nric;
	}
	public void setNric(String nric) {
		this.nric = nric;
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
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<PmprsUserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(List<PmprsUserRole> userRoles) {
		this.userRoles = userRoles;
	}
 


}
