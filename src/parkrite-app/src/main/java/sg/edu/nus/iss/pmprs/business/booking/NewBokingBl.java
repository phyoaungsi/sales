package sg.edu.nus.iss.pmprs.business.booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsBookingFeesRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.dao.ProductRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsVehicleRepository;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.PmprsBoookingFees;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PmprsMemberVehicle;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingResponse;
import sg.edu.nus.iss.pmprs.utils.DateUtils;
import sg.edu.nus.iss.pmprs.vo.booking.BookingRequestVo;

@Component
public class NewBokingBl extends BusinessLogic<BookingResponse> {

	private static final Object CONFIRM = null;
	@Autowired PmprsBookingRepository bookingRepository;
	@Autowired ProductRepository carparkRepository;
	@Autowired PmprsVehicleRepository memberVehicleRepository;
	@Autowired PmprsBookingFeesRepository bookingFeesRepository;
	@Autowired PmprsMemberRepository memberRepository;
	@Override
	protected void execute(CommonVo vo) {
	    // TODO Auto-generated method stub
		
	   BookingRequestVo bvo=(BookingRequestVo) vo;
	//   bvo.getBooking().getMemberId();
	   
	   
	   PmprsMember pm=memberRepository.findByMemberUserId(bvo.getUserId());
	  // PmprsMemberVehicle memberVehicle=memberVehicleRepository.findOne(Integer.parseInt(bvo.getBooking().getMemberVehicleId()));
	   PmprsMemberVehicle memberVehicle=null;
	  Order booking= bookingRepository.findByInvRef(bvo.getBooking().getBookingRefId());
	  
	  if(booking!=null){
		  BookingResponse r=new BookingResponse();
	       r.setBookedDate(new SimpleDateFormat("DD-MM-yyyy").format(booking.getOrderSubmitDatetime()));
	       //r.setBookingFee(booking.getBookingFees().getBookingFees());
	       String fees = booking.getTotal() + "";
	       r.setBookingFee( Float.parseFloat(fees));
	      
	       
	       r.setBookingRefId(booking.getInvRef());
	       if(booking.getOrderStatus().equals(CONFIRM)){
	       r.setBookingStatus("CONFIRM");
	       r.setStatusCode("0");
	       r.setStatusMessage("BOOKING_SUCCESSFUL");
	       }
	      
	       setResult(r);
		  
		  
	  }
	  
	  
	  else {
	  // Product carPark=carparkRepository.findOne(Integer.parseInt(bvo.getBooking().getCarParkId()));
	   Order book=new Order();
	 
	   book.setMember(pm); 
	  // book.setBookedToDatetime(new Date());
       book.setInvRef(bvo.getBooking().getBookingRefId());
       book.setOrderSubmitDatetime(new Date());
       book.setTotal(bvo.getBooking().getBookingFee());
       try {
	   book.setDeliveryDate(DateUtils.convertTimeOnlyFromMobile(bvo.getBooking().getFromTime()));
       }
       catch(Exception e)
       {
    	   throw new RuntimeException("Invalid date format");
       }
       //FEE
       // PmprsBoookingFees bookingFees=new PmprsBoookingFees();
       // bookingFees.setBookingFees(bvo.getBooking().getBookingFee());
//       book.setMinimumHourFees(bvo.getBooking().getMinOccupyFee());
//       // bookingFees=bookingFeesRepository.save(bookingFees);
//	   //book.setBookingFees(carPark.getCarparkBookingFees().getBookingFees());   
//       book.setBookingFees(bvo.getBooking().getTotalAmount()); 
//       book.setStatusId(0);
       BookingResponse r=new BookingResponse();
       if(true){
      // holdCarPark(carPark);
       bookingRepository.save(book);
       }
       else{
    	    r.setBookingStatus("CARPARK_FULL");
       }
	  
      
       r.setBookedDate(bvo.getBooking().getBookedDate());
       r.setBookingFee(bvo.getBooking().getBookingFee());
       r.setBookingRefId(bvo.getBooking().getBookingRefId());
       r.setBookingStatus("PENDING");
     //  r.setCarParkName(carPark.getName());
      // r.setCarParkPostalCode(carPark.getName());
       r.setFromTime(bvo.getBooking().getFromTime());
       r.setToTime(bvo.getBooking().getToTime());
       r.setMinOccupyFee(bvo.getBooking().getMinOccupyFee());
       r.setPlateNo(memberVehicle.getVehiclePlateNumber());
       r.setStatusCode("0");
       r.setStatusMessage("BOOKING_SUCCESSFUL");
       r.setTotalAmount(bvo.getBooking().getTotalAmount());
       r.setVehicleIu(memberVehicle.getIuNumber());
       setResult(r);
	}
	}

	private void holdCarPark(Product carPark) {
		// TODO Auto-generated method stub
		//carPark.setHoldingSlot(1);
		carparkRepository.save(carPark);
		
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
        
	}
	
}
