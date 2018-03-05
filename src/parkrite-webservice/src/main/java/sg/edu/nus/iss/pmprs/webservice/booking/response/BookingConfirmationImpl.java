package sg.edu.nus.iss.pmprs.webservice.booking.response;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.nus.iss.pmprs.mobile.notifications.TerminalResponses;
import sg.edu.nus.iss.pmprs.service.BookingService;
import sg.edu.nus.iss.pmprs.webservice.BookingNotifiUtility;



//@WebService(endpointInterface = "sg.edu.nus.iss.pmprs.webservice.booking.response.BookingConfirmation",  serviceName = "BookingConfirmService", portName = "BookingConfirmService" )
public class BookingConfirmationImpl implements BookingConfirmation {


BookingService	bookingService;

	public BookingService getBookingService() {
	return bookingService;
}
public void setBookingService(BookingService bookingService) {
	this.bookingService = bookingService;
}
	public BookingStatusResponse replyBookingStatus(BookingStatusInput status) {
		// TODO Auto-generated method stub
		BookingStatusResponse response=new BookingStatusResponse();
		System.out.println(status.getBookingRefId()+"========="+status.getBookingStatus());
		
		System.out.println(status.getBookingRefId()+"===5======"+status.getBookingStatus());
		System.out.println(status.getBookingRefId()+"=====before noyify===="+status.getBookingStatus());
		TerminalResponses r=BookingNotifiUtility.getBookingSubject();
	//	r.notifyToMobile(status);
		System.out.println(status.getBookingRefId()+"=====notified===="+status.getBookingStatus());
		

		bookingService.updateBookingStatus(status.getBookingRefId(),status.getBookingStatus(),status.getCarParkLotId());
	
		response.setStatus("Sent");
		return response;
	}

}
