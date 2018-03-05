package sg.edu.nus.iss.pmprs.vo.dashboard;

import javax.persistence.Column;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

public class DashBoardVo extends CommonVo {
	
	
	private String carparkId;
	
	private String companyName;
	
	private String carparkName;
	
	private int  totalSlot;
	
	private int occupiedSlot;
	private int availableSlot;
	private int currentBooking;
	private int noOfBookToday;
	public String getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCarparkName() {
		return carparkName;
	}
	public void setCarparkName(String carparkName) {
		this.carparkName = carparkName;
	}
	public int getTotalSlot() {
		return totalSlot;
	}
	public void setTotalSlot(int totalSlot) {
		this.totalSlot = totalSlot;
	}
	public int getOccupiedSlot() {
		return occupiedSlot;
	}
	public void setOccupiedSlot(int occupiedSlot) {
		this.occupiedSlot = occupiedSlot;
	}
	public int getAvailableSlot() {
		return availableSlot;
	}
	public void setAvailableSlot(int availableSlot) {
		this.availableSlot = availableSlot;
	}
	public int getCurrentBooking() {
		return currentBooking;
	}
	public void setCurrentBooking(int currentBooking) {
		this.currentBooking = currentBooking;
	}
	public int getNoOfBookToday() {
		return noOfBookToday;
	}
	public void setNoOfBookToday(int noOfBookToday) {
		this.noOfBookToday = noOfBookToday;
	}

}
