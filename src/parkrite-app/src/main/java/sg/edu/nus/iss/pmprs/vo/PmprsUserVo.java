package sg.edu.nus.iss.pmprs.vo;

import java.util.List;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.entity.PmprsRole;
import sg.edu.nus.iss.pmprs.entity.PmprsUser;

public class PmprsUserVo extends CommonVo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3025822580850213050L;
	private PmprsUser user;

	public PmprsUser getUser() {
		return user;
	}

	public void setUser(PmprsUser user) {
		this.user = user;
	}

	  
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


		private Integer statusId;
	   
	
		private String mobileNumber;
	 
		private String homeNumber;
	   
		private String department;
	   
		private String company;
	 
		private String designation;
	    
		private String postcalCode;
	
	 	private String userName;
	
		private String address;
	 
		private Integer gender;
	
		private java.util.Date birthDate;
	
		private String nric;
	
		private String name;
	 
		private String password;
	  
		private String email;
	    private Integer id;
		private List<PmprsRole> roles;
        private Integer roleId;
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

		public List<PmprsRole> getRoles() {
			return roles;
		}

		public void setRoles(List<PmprsRole> roles) {
			this.roles = roles;
		}

		public String postalCode;
		public String getPostalCode() {
			// TODO Auto-generated method stub
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getRoleId() {
			return roleId;
		}

		public void setRoleId(Integer roleId) {
			this.roleId = roleId;
		}
		
}
