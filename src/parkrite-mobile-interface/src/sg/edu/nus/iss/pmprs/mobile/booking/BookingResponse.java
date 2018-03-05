package sg.edu.nus.iss.pmprs.mobile.booking;

import sg.edu.nus.iss.pmprs.mobile.CommonResponse;
public class BookingResponse extends CommonResponse {
	
	
	private String bookingRefId;
	private String bookingStatus;
	
	private String statusMessage;
	private String plateNo;
	private String vehicleIu;
	private String carParkName;
	private String carParkPostalCode;
	private float bookingFee;
	private float minOccupyFee;
	private float totalAmount;
	private String bookedDate;
	private String fromTime;
	private String toTime;
	private String faultString;
	private String statusCode;
	
	
	
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getBookingRefId() {
		return bookingRefId;
	}
	public void setBookingRefId(String bookingRefId) {
		this.bookingRefId = bookingRefId;
	}
	/**
	 * @return the statusCode
	 */
	
	public String getStatusMessage() {
		return statusMessage;
	}
	/**
	 * @param statusMessage the statusMessage to set
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getVehicleIu() {
		return vehicleIu;
	}
	public void setVehicleIu(String vehicleIu) {
		this.vehicleIu = vehicleIu;
	}
	public String getCarParkName() {
		return carParkName;
	}
	public void setCarParkName(String carParkName) {
		this.carParkName = carParkName;
	}
	public String getCarParkPostalCode() {
		return carParkPostalCode;
	}
	public void setCarParkPostalCode(String carParkPostalCode) {
		this.carParkPostalCode = carParkPostalCode;
	}
	public float getBookingFee() {
		return bookingFee;
	}
	public void setBookingFee(float bookingFee) {
		this.bookingFee = bookingFee;
	}
	public float getMinOccupyFee() {
		return minOccupyFee;
	}
	public void setMinOccupyFee(float minOccupyFee) {
		this.minOccupyFee = minOccupyFee;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(String bookedDate) {
		this.bookedDate = bookedDate;
	}
	public String getFromTime() {
		return fromTime;
	}
	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}
	public String getToTime() {
		return toTime;
	}
	public void setToTime(String toTime) {
		this.toTime = toTime;
	}
	public String getFaultString() {
		return faultString;
	}
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}


}
