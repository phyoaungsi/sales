package sg.edu.nus.iss.pmprs.vo.ticket;

import java.util.Date;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

public class RedemptionVo extends CommonVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 159615048695585968L;
	
	
	private Integer  memberId;
	private String	userId;
	private String userEmail;
	private String vehiclePlateNumber;
	private String iuNumber;
	private Integer carParkId;
	private Date fromDate;
	private Date toDate;
	private Integer reasonId;
	private String remarks;
    private String status;
	private String fromStrDate;
	private String toStrDate;

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
	public Integer getCarParkId() {
		return carParkId;
	}
	public void setCarParkId(Integer carParkId) {
		this.carParkId = carParkId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
		this.setFromStrDate(fromDate.toString());
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
		this.setToStrDate(toDate.toString());
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFromStrDate() {
		return fromStrDate;
	}
	public void setFromStrDate(String fromStrDate) {
		this.fromStrDate = fromStrDate;
	}
	public String getToStrDate() {
		return toStrDate;
	}
	public void setToStrDate(String toStrDate) {
		this.toStrDate = toStrDate;
	}

	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}
