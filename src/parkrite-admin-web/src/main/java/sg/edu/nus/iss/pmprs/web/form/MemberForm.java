package sg.edu.nus.iss.pmprs.web.form;


import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import sg.edu.nus.iss.pmprs.core.web.CommonForm;

public class MemberForm extends CommonForm {
	

		/**
	 * 
	 */
	private static final long serialVersionUID = 6636897538987494930L;

	    private int id;
		private Integer statusId;

		private String email;

		private String memberUserId;

		private String mobileNumber;

		private String homeNumber;

		private String postalCode;

		private String address;

		private String gender;

		private String birthDate;

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

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
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

}
