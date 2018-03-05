package sg.edu.nus.iss.pmprs.webservice.booking.response;

import javax.xml.bind.annotation.XmlElement;

public class BookingStatusInput {

	// @XmlElement(required = true)
	private String bookingStatus;
	// @XmlElement(required = true)
    private String bookingRefId;
	//@XmlElement(required = true)
    private String carParkId;
	// @XmlElement(required = true)
    private String carParkLotId;
    
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
	public String getCarParkId() {
		return carParkId;
	}
	public void setCarParkId(String carParkId) {
		this.carParkId = carParkId;
	}
	public String getCarParkLotId() {
		return carParkLotId;
	}
	public void setCarParkLotId(String carParkLotId) {
		this.carParkLotId = carParkLotId;
	}
	
	
	
}
