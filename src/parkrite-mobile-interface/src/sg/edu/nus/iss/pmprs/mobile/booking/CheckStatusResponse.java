package sg.edu.nus.iss.pmprs.mobile.booking;

import java.util.List;

import sg.edu.nus.iss.pmprs.mobile.*;
public class CheckStatusResponse extends CommonResponse {
	

    private List<Booking> bookings;
  //  private float minOccupyFee;   
	private String statusMessage;
	private String faultString;
	private String statusCode;
	
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
	/**
	 * @return the statusMessage
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
	public String getFaultString() {
		return faultString;
	}
	public void setFaultString(String faultString) {
		this.faultString = faultString;
	}
	/**
	 * @return the statusCode
	 */
	public List<Booking> getBookings() {
		return bookings;
	}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}
	

}
