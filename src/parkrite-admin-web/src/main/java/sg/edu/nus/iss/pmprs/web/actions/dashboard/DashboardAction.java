package sg.edu.nus.iss.pmprs.web.actions.dashboard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import sg.edu.nus.iss.pmprs.entity.BookCarPark;
import sg.edu.nus.iss.pmprs.service.BookingService;
import sg.edu.nus.iss.pmprs.vo.dashboard.DashBoardVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;

import com.opensymphony.xwork2.ActionSupport;

@ParentPackage("parkrite-default")
@Action( results={@Result(name="success", location="/content/dashboard/dashboard-success.jsp")})
public class DashboardAction extends CommonAction {

	BookingService bookingService;

	
	private List<DashBoardVo> list;
	
	private static final long serialVersionUID = 4755109534943806368L;
	public String execute()
	{
		
		list=new ArrayList<DashBoardVo>();
		list=bookingService.getDashBoardList();
	   Collection<String> errorMessages=new ArrayList<String>();
	   errorMessages.add("error1");
	//super.setActionErrors(errorMessages);
	
		return SUCCESS;
	}
	public List<DashBoardVo> getList() {
		return list;
	}
	public void setList(List<DashBoardVo> list) {
		this.list = list;
	}
	public BookingService getBookingService() {
		return bookingService;
	}
	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}

}
