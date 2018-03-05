package sg.edu.nus.iss.pmprs.webservice.booking.response;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;


//@WebService(name = "BookingConfirmation")
//@SOAPBinding(parameterStyle = ParameterStyle.BARE)
public interface BookingConfirmation {
	
	// @WebMethod(action = "replyBookingStatus")
	// @WebResult(name = "BookingStatusResponse", targetNamespace = "http://org/apache/axis2/jaxws/samples/echo/", partName = "parameter")
	public BookingStatusResponse replyBookingStatus(
			// @WebParam(name = "BookingStatusInput", targetNamespace = "http://org/apache/axis2/jaxws/samples/echo/", partName = "parameter")
			BookingStatusInput status);
		
		

}
