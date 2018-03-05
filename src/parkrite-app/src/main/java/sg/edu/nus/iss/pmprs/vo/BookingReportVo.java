package sg.edu.nus.iss.pmprs.vo;

public class BookingReportVo {
	
	private String bookingRefNumber;
	private String bookingDate;
	private String vehicleNumber;
	private String bookedFromTime;
	private String bookedToTime;
	public String getBookingRefNumber() {
		return bookingRefNumber;
	}
	public void setBookingRefNumber(String bookingRefNumber) {
		this.bookingRefNumber = bookingRefNumber;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getBookedFromTime() {
		return bookedFromTime;
	}
	public void setBookedFromTime(String bookedFromTime) {
		this.bookedFromTime = bookedFromTime;
	}
	public String getBookedToTime() {
		return bookedToTime;
	}
	public void setBookedToTime(String bookedToTime) {
		this.bookedToTime = bookedToTime;
	}
	

}
