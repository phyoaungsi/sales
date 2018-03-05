package sg.edu.nus.iss.pmprs.ajax;

import java.util.UUID;














import sg.edu.nus.iss.pmprs.actions.CommonAction;
import sg.edu.nus.iss.pmprs.entity.BookCarPark;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingRequest;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingResponse;
import sg.edu.nus.iss.pmprs.mobile.booking.CheckStatusRequest;
import sg.edu.nus.iss.pmprs.mobile.booking.CheckStatusResponse;
import sg.edu.nus.iss.pmprs.mobile.login.LoginRequest;
import sg.edu.nus.iss.pmprs.mobile.login.LoginResponse;
import sg.edu.nus.iss.pmprs.service.BookingService;

import com.google.gson.Gson;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

	

public class CheckBookingAction extends JsonServiceAction<CheckStatusRequest,CheckStatusResponse> implements ModelDriven<CheckStatusResponse>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	 public String executeJson(CheckStatusRequest booking)
	{
		

				
				
		
	
		 if(booking!=null){
		 
		
		  CheckStatusResponse  response=service.checkBookingStatus(booking.getUserId());
		 
	     setModel(response);
		 }
		 else
		 {
			 CheckStatusResponse  response=new CheckStatusResponse();
			response.setStatusCode("-1");
			 response.setFaultString("This booking never exit on server");
		     setModel(response);
		 }
		
		  return Action.SUCCESS;
		}

	
	


	@SuppressWarnings("rawtypes")
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return CheckStatusRequest.class;
	}

}
