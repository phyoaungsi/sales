package sg.edu.nus.iss.pmprs.vo.ticket;

import java.util.Date;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

public class ComplimentaryReportVo extends CommonVo {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 4296172521539905241L;
	private static final long serialVersionUID = 1L;
	
	private String memberId;
	private String userEmail;
	private String vehiclePlateNumber;
	private String iuNumber;
	private Integer carParkId;
	private String fromDate;
	private String toDate;
	private Integer reasonId;
	private String remarks;
	private String status;
	
	

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
	
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
