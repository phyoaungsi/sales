package sg.edu.nus.iss.pmprs.exceptions;

import sg.edu.nus.iss.pmprs.core.exceptions.BusinessException;

public class NoBookingRefException extends BusinessException{

	public NoBookingRefException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public NoBookingRefException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8284915487050017597L;

}
