package sg.edu.nus.iss.pmprs.web.actions.dashboard;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import sg.edu.nus.iss.pmprs.entity.BookCarPark;
import sg.edu.nus.iss.pmprs.service.BookingService;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;

@Action(
		value="todayBookings", 
	    results={@Result(name="success", location="/content/dashboard/bookingdetails.jsp")}
		
		)
public class TodayBookingsAction extends CommonAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6849110422162029424L;
	private String carparkId;
	private List<BookCarPark> list;
	public String execute()
	{
		
		
		BookingService service=new BookingService();

		List<BookCarPark> list=service.getTodayBookings(carparkId);

		this.setList(list);
		return SUCCESS;
	}
	public String getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}
	public List<BookCarPark> getList() {
		return list;
	}
	public void setList(List<BookCarPark> list) {
		this.list = list;
	}
	

}
