package sg.edu.nus.iss.pmprs.mobile.booking;


import sg.edu.nus.iss.pmprs.mobile.CommonRequest;

public class BookingRequest extends CommonRequest {
	
	public static String REQUEST_URL="/booking/newbooking.do";
	
	private String carParkId;
	private String memberVehicleId;
	private String userId;
	private String bookingRefId;
    private String bookingStatus;
    private float bookingFee;
    private String memberId;
    private float totalAmount;
    private String bookedDate;
    private String fromTime;
    private String toTime;
    private float minOccupyFee;
    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBookingRefId() {
		return bookingRefId;
	}
	public void setBookingRefId(String bookingRefId) {
		this.bookingRefId = bookingRefId;
	}
	
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getCarParkId() {
		return carParkId;
	}
	public void setCarParkId(String carParkId) {
		this.carParkId = carParkId;
	}
	public String getMemberVehicleId() {
		return memberVehicleId;
	}
	public void setMemberVehicleId(String memberVehicleId) {
		this.memberVehicleId = memberVehicleId;
	}
	public float getBookingFee() {
		return bookingFee;
	}
	public void setBookingFee(float bookingFee) {
		this.bookingFee = bookingFee;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
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
	public float getMinOccupyFee() {
		return minOccupyFee;
	}
	public void setMinOccupyFee(float minOccupyFee) {
		this.minOccupyFee = minOccupyFee;
	}



}
