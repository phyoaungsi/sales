package sg.edu.nus.iss.pmprs.business.booking;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.BookingRepository;
import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.entity.BookCarPark;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.utils.DateUtils;
import sg.edu.nus.iss.pmprs.vo.booking.BookingVo;

@Service
public class GetBookingsByCarParkBl extends BusinessLogic<List<BookingVo>> {

	
    private List<BookingVo> bookingList;
	@Autowired 
	PmprsBookingRepository bookingRepository;
	@Autowired 
	StockRepository carparkRepository;
	@Override
	protected void execute(CommonVo vo1) {
		// TODO Auto-generated method stub
		int carparkId=getIntParam()[0];
		bookingList=new ArrayList<BookingVo>();
		List<Order> bookings=bookingRepository.findByCarParkId(carparkId);
		for(Order b:bookings)
		{
			BookingVo vo=new BookingVo();
//			vo.setBookedFromTime(DateUtils.convertToMobileTimeOnly(b.getBookedFromDatetime()));
//			vo.setBookedToTime(DateUtils.convertToMobileTimeOnly(b.getBookedToDatetime()));
//			vo.setBookingRefNumber(b.getBookingRefNumber());
//			vo.setBookingDate(DateUtils.convertToMobileDateOnly(b.getBookedSubmitDatetime()));
//			vo.setVehicleNumber(b.getMemberVehicle().getIuNumber());
			bookingList.add(vo);
		}
		
		setResult(bookingList);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
	}

	

	


	

}
