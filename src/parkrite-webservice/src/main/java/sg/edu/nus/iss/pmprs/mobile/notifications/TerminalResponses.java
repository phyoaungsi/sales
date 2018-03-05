package sg.edu.nus.iss.pmprs.mobile.notifications;

import java.util.Observable;

import sg.edu.nus.iss.pmprs.webservice.booking.response.BookingStatusResponse;

public class TerminalResponses extends Observable{
	
	public void notifyToMobile(BookingStatusResponse terminalResponse)
	{
		System.out.println("\nNotify All----------------->" +countObservers());
		setChanged();
		notifyObservers(terminalResponse);
		
		
		
	}

}
