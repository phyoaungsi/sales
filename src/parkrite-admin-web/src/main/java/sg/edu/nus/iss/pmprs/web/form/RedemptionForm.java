package sg.edu.nus.iss.pmprs.web.form;

import java.util.Date;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import sg.edu.nus.iss.pmprs.core.web.CommonForm;

public class RedemptionForm extends CommonForm{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6803938166055460825L;
	private Integer  memberId;
	private String userEmail;
	private String vehiclePlateNumber;
	private String iuNumber;
	private String carparkId;
	private Date fromDate;
	private Date toDate;
	private Integer reasonId;
	private String remarks;
	
	private String userName;
	private String nric;
	private String dob;
	private Double amount;
	
	
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getVehiclePlateNumber() {
		return vehiclePlateNumber;
	}
	public void setVehiclePlateNumber(String vehiclePlateNumber) {
		this.vehiclePlateNumber = vehiclePlateNumber;
	}
	public String getIuNumber() {
		return iuNumber;
	}
	public void setIuNumber(String iuNumber) {
		this.iuNumber = iuNumber;
	}
	public String getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Integer getReasonId() {
		return reasonId;
	}
	public void setReasonId(Integer reasonId) {
		this.reasonId = reasonId;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
	@Override
	public void convertFormToDao(CommonForm f) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void convertDaoToFrom(CommonEntity ent) {
		// TODO Auto-generated method stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getNric() {
		return nric;
	}
	public void setNric(String nric) {
		this.nric = nric;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	
}
