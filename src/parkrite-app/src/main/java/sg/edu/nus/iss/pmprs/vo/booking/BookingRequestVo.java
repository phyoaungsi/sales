package sg.edu.nus.iss.pmprs.vo.booking;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingRequest;

public class BookingRequestVo extends CommonVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2932183849101727449L;
	private BookingRequest booking;
	private String userId;
	public BookingRequest getBooking() {
		return booking;
	}
	public void setBooking(BookingRequest booking) {
		this.booking = booking;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
