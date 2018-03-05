package sg.edu.nus.iss.pmprs.ajax;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import sg.edu.nus.iss.pmprs.actions.CommonAction;
import sg.edu.nus.iss.pmprs.entity.BookCarPark;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingRequest;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingResponse;
import sg.edu.nus.iss.pmprs.mobile.notifications.TerminalResponses;
import sg.edu.nus.iss.pmprs.service.BookingService;
import sg.edu.nus.iss.pmprs.service.MobileClientService;
import sg.edu.nus.iss.pmprs.vo.booking.BookingRequestVo;
import sg.edu.nus.iss.pmprs.webservice.BookingNotifiUtility;

import com.google.gson.Gson;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class BookingAction extends JsonServiceAction<BookingRequest,BookingResponse> implements ModelDriven<BookingResponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2007591060376690023L;

	

	public String executeJson(BookingRequest request) {

		BookingRequestVo bookingVo=new BookingRequestVo();
		bookingVo.setBooking(request);
		BookingResponse response=service.newBooking(bookingVo);
		setModel(response);
//		BookCarPark m = new BookCarPark();
//		try {
//			
//			
//			
//
//			String bookingref = UUID.randomUUID().toString();
//
//			m.setBookinRefId(request.getBookingRefId());
//			m.setBookinStatus("SUBMITTED");
//			m.setCarparkId(request.getCarParkId());
//			m.setPlateId(request.getMemberVehicleId());
//			m.setUserId(request.getUserId());
//			BookingService service = new BookingService();
//			
//			service.book(m);
//			
//			TerminalResponses res=BookingNotifiUtility.getBookingSubject();
//			//res.addObserver(m);
//			
//			
//			
//			boolean  loop=true;
//			int count=0;
//			int max=2;//SEC
//			//BookingService check = new BookingService();
//			while(count<max)
//			{
//				
//				System.out.println("Booking Status:"+m.getBookinStatus() + " "+bookingref);
//				if(m.getBookinStatus()!="SUBMITTED")
//				{
//					//res.deleteObserver(m);
//					getModel().setBookingStatus(m.getBookinStatus());
//					getModel().setBookingRefId("id");
//					count=max+1;
//				}
//				
//				count++;
//				Thread.sleep(1000);
//			}
//			
//			getModel().setBookingRefId(m.getBookinRefId());
//			getModel().setBookingStatus(m.getBookinStatus());
//		} catch (Exception e) {
//
//			e.printStackTrace();
//			return Action.SUCCESS;
//		}
		return Action.SUCCESS;
	}



	@Override
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return BookingRequest.class;
	}




}
