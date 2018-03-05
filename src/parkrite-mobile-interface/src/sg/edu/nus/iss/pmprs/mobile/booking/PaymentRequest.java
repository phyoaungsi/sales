package sg.edu.nus.iss.pmprs.mobile.booking;


import sg.edu.nus.iss.pmprs.mobile.CommonRequest;

public class PaymentRequest extends CommonRequest {
	
	public static String REQUEST_URL="/booking/payment.do";
	

	private String bookingRefId;
    private float bookingFee;
    private String paymentRefId;
	public String getBookingRefId() {
		return bookingRefId;
	}
	public void setBookingRefId(String bookingRefId) {
		this.bookingRefId = bookingRefId;
	}
	public float getBookingFee() {
		return bookingFee;
	}
	public void setBookingFee(float bookingFee) {
		this.bookingFee = bookingFee;
	}
	public String getPaymentRefId() {
		return paymentRefId;
	}
	public void setPaymentRefId(String paymentRefId) {
		this.paymentRefId = paymentRefId;
	}
    


}
