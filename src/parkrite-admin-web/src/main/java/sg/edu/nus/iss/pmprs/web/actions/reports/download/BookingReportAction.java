package sg.edu.nus.iss.pmprs.web.actions.reports.download;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.service.BookingService;
import sg.edu.nus.iss.pmprs.vo.BookingReportVo;
import sg.edu.nus.iss.pmprs.web.actions.reports.CommonReportAction;

@ParentPackage("jasperreports-default")
@Action(value="bookingReport",results = {
		@Result(name = "success",type="jasper", params = {"location","/WEB-INF/jasper/bookings.jasper","dataSource","list","format","PDF","reportParameters","parameters"}),
		@Result(name = "error", location = "/pages/Error.jsp"),

})
public class BookingReportAction extends CommonReportAction{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Autowired
	@Qualifier("bookingService")
	BookingService service;
	
	@Autowired
	PmprsBookingRepository bookings;
	
	public void fillReportData()
	{
		//setList(service.getAllBookings());
		List<Order> booking=bookings.findAll();
		List<BookingReportVo> vos=new ArrayList();
		for(Order b:booking){
			BookingReportVo vo=new BookingReportVo();
			vo.setBookingRefNumber(b.getInvRef());
			vo.setBookingDate(new SimpleDateFormat("dd-MM-yyyy").format(b.getOrderSubmitDatetime()));
			//vo.setBookedFromTime(new SimpleDateFormat("HH:mm").format(b.getBookedFromDatetime()));
			//vo.setBookedToTime(new SimpleDateFormat("HH:mm").format(b.getBookedToDatetime()));
			//vo.setVehicleNumber(b.getMemberVehicle().getVehiclePlateNumber());
			vos.add(vo);
			
		}
		setList(vos);
	}


	@Override
	public String getReportTemplate() {
		// TODO Auto-generated method stub
		return "bookings";
	}

}
