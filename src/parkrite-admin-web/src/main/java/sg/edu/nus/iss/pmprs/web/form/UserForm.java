package sg.edu.nus.iss.pmprs.web.form;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import sg.edu.nus.iss.pmprs.core.web.CommonForm;
import sg.edu.nus.iss.pmprs.web.utility.Validator;

public class UserForm extends CommonForm {
	

		/**
	 * 
	 */
	private static final long serialVersionUID = 6636897538987494930L;

	    private int id;
		private Integer statusId;
        private Map<Integer,String> roles;
		private String email;
		private String password;
        private String company;
		private String memberUserId;
		private String roleId;
		private String mobileNumber;

		private String homeNumber;

		private String postalCode;

		private String address;

		private String gender;

		private Date birthDate;

		private String nric;

		public Integer getStatusId() {
			return statusId;
		}

		public void setStatusId(Integer statusId) {
			this.statusId = statusId;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMemberUserId() {
			return memberUserId;
		}

		public void setMemberUserId(String memberUserId) {
			this.memberUserId = memberUserId;
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

		public String getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(String postalCode) {
			this.postalCode = postalCode;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Date getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(Date birthDate) {
			this.birthDate =birthDate ;
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

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		private String name;

		@Override
		public void convertFormToDao(CommonForm f) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void convertDaoToFrom(CommonEntity ent) {
			// TODO Auto-generated method stub
			
	}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}
        private String department;
		public String getDepartment() {
			// TODO Auto-generated method stub
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}
		private String desination;

		private String userId;
		public String getDesination() {
			// TODO Auto-generated method stub
			return desination;
		}

		public void setDesination(String desination) {
			this.desination = desination;
		}

		public String getUserId() {
			// TODO Auto-generated method stub
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public Map<Integer,String> getRoles() {
			return roles;
		}

		public void setRoles(Map<Integer,String> roles) {
			this.roles = roles;
		}

		public String getRoleId() {
			return roleId;
		}

		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}
       
		public void validate(ArrayList<String> errors)
		{
			Validator.isEmpty(this.userId, "User Id", errors);
			Validator.isEmpty(address, "Address", errors);
			Validator.isEmpty(company, "Company", errors);
			//Validator.isEmpty(department, "Department", errors);
			Validator.isEmpty(desination, "Designation", errors);
			Validator.isEmpty(email, "Email", errors);
		
		
			Validator.isEmail(email,"Email", errors);
			
		//	Validator.isPhoneNumber(homeNumber,"Home Number", errors);
			
		//	Validator.isPhoneNumber(mobileNumber,"Mobile Number", errors);
			
			Validator.isEmpty(name, "Name", errors);
		
			Validator.isEmpty(nric, "NRIC", errors);
			Validator.isNric(nric, "NRIC", errors);
			Validator.isEmpty(password, "Password", errors);
			
			Validator.isPostalCode(postalCode, "Postal Code", errors);
		
		}

		public void validateUpdate(ArrayList<String> errors) {
			
			Validator.isEmpty(this.userId, "User Id", errors);
			Validator.isEmpty(address, "Address", errors);
			Validator.isEmpty(company, "Company", errors);
			
			Validator.isEmpty(desination, "Designation", errors);
			Validator.isEmpty(email, "Email", errors);
		
		
			Validator.isEmail(email,"Email", errors);
			
		//	Validator.isPhoneNumber(homeNumber,"Home Number", errors);
			
		//	Validator.isPhoneNumber(mobileNumber,"Mobile Number", errors);
			
			Validator.isEmpty(name, "Name", errors);
		
			Validator.isEmpty(nric, "NRIC", errors);
			Validator.isNric(nric, "NRIC", errors);
		
	
			Validator.isPostalCode(postalCode, "Postal Code", errors);

			
		}

}
