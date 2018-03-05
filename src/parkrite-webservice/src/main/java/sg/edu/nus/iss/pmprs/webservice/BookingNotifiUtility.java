package sg.edu.nus.iss.pmprs.webservice;



import sg.edu.nus.iss.pmprs.mobile.notifications.TerminalResponses;

public class BookingNotifiUtility {
	

	private static TerminalResponses bookings;
  
	static {
		try {
			
			bookings=new TerminalResponses();
			

		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static TerminalResponses getBookingSubject() {
		return bookings;
	}

}
