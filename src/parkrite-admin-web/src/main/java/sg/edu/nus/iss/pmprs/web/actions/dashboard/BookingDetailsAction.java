package sg.edu.nus.iss.pmprs.web.actions.dashboard;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import sg.edu.nus.iss.pmprs.entity.BookCarPark;
import sg.edu.nus.iss.pmprs.service.BookingService;
import sg.edu.nus.iss.pmprs.vo.booking.BookingVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;

@Action(
		value="bookingDetails", 
	    results={@Result(name="success", location="/content/dashboard/bookingdetails.jsp")}
		
		)
public class BookingDetailsAction extends CommonAction {

	/**
	 * 
	 */
	BookingService bookingService;
	private static final long serialVersionUID = -6849110422162029424L;
	private String carparkId;
	private List<BookingVo> list;
	public String execute()
	{
	
		
       
		List<BookingVo> list=bookingService.getBookingsByCarPark(Integer.parseInt(carparkId));
		
		
		this.setList(list);
		return SUCCESS;
	}
	public String getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}
	public List<BookingVo> getList() {
		return list;
	}
	public void setList(List<BookingVo> list) {
		this.list = list;
	}
	public BookingService getBookingService() {
		return bookingService;
	}
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	

}
