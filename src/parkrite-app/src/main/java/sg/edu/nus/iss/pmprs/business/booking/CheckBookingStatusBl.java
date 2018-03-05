package sg.edu.nus.iss.pmprs.business.booking;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.exceptions.BusinessException;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.exceptions.NoBookingRefException;
import sg.edu.nus.iss.pmprs.mobile.booking.Booking;
import sg.edu.nus.iss.pmprs.mobile.booking.CheckStatusResponse;

@Component
public class CheckBookingStatusBl extends BusinessLogic<CheckStatusResponse> {

	@Autowired
	PmprsBookingRepository repository;

	@Autowired
	PmprsMemberRepository memberRepository;
	private String userId;

	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		// PmprsBooking
		// booking=repository.findByBookingRefNumber(getBookingRefNumber());
		CheckStatusResponse response = new CheckStatusResponse();
		//PmprsMember member = memberRepository.findByMemberUserId(getUserId());
		PmprsMember member = memberRepository.getOne(Integer.parseInt(getUserId()));
		Calendar c=Calendar.getInstance(); 
		c.add(Calendar.HOUR, -12);
		List<Order> bookings = repository.getLatestBookingsByMember(
				member, c.getTime());
		List<Booking> bookingVos = new ArrayList<Booking>();
		for (Order booking : bookings) {
			Booking b = new Booking();
			b.setBookedDate(new SimpleDateFormat("DD-MM-yyyy").format(booking
					.getCreatedTime()));
			// b.setBookingFee("38");
//			b.setBookingRefId(booking.getBookingRefNumber());
//
//			if (booking.getStatusId() == 3) {
//				b.setBookingStatus("CONFIRMED");
//			} else if (booking.getStatusId() == 0) {
//				b.setBookingStatus("WAITING_PAYMENT");
//			} else {
//				b.setBookingStatus("CHECKING_AVAILABLE_CARPARK");
//			}
			b.setBookingTime(booking.getCreatedTime().toString());
//			b.setCarParkId(booking.getCarPark().getStockId());
//			b.setCarparkName(booking.getCarPark().getName());
//			b.setCarparkPostalCode(booking.getCarPark().getDescription());
//			b.setFromTime(new SimpleDateFormat("HH:mm").format(booking
//					.getBookedFromDatetime()));
//			b.setBookingTime(new SimpleDateFormat("HH:mm").format(booking
//					.getCreatedTime()));
//			b.setBookingDate(new SimpleDateFormat("dd-MM-yyyy").format(booking
//					.getCreatedTime()));
//			b.setMemberId(member.getMemberUserId());
//			b.setMemberVehicleId(booking.getMemberVehicle().getId().toString());
//			b.setVehiclePlateNumber(booking.getMemberVehicle().getVehiclePlateNumber());
//			b.setMinOccupyFee(booking.getMinimumHourFees());
//			long diff = booking.getBookedToDatetime().getTime()
//					- booking.getBookedFromDatetime().getTime();
			//long hour = ((diff / 1000) / 60) / 60;
			//b.setTotalAmount(hour * booking.getMinimumHourFees());
			//b.setTotalAmount(hour * booking.getMinimumHourFees());
//			b.setTotalAmount((float)booking.getBookingFees());
//			b.setToTime(new SimpleDateFormat("HH:mm").format(booking
//					.getBookedToDatetime()));
//
//			b.setVehicleIu(booking.getMemberVehicle().getIuNumber());
			b.setUserId(this.getUserId());
			bookingVos.add(b);
		}
		response.setBookings(bookingVos);
		response.setStatusCode("SUCCESS");
		response.setStatusMessage(bookingVos.size()+" bookings reterieved");
		// response.setBookingRefId(booking.getBookingRefNumber());
		// response.setBookingStatus(booking.getId().toString());
		// if(booking.getStatusId()==3)
		// response.setBookingStatus("CONFIRMED");
		// else if(booking.getStatusId()==0){
		// response.setBookingStatus("WAITING_PAYMENT");
		// }else
		// {
		// response.setBookingStatus("CHECKING_AVAILABLE_CARPARK");
		// }
		//
		// }else{
		// response.setBookingStatus("FAILED");
		// response.setStatusMessage("Booking not found");
		// }

		setResult(response);

	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		if (getUserId() == null) {

			throw new NoBookingRefException();
		}
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
