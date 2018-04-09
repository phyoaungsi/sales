package sg.edu.nus.iss.pmprs.business.booking;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.util.WebUtils;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.BookingRepository;
import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.dao.ProductRepository;
import sg.edu.nus.iss.pmprs.entity.BookCarPark;
import sg.edu.nus.iss.pmprs.entity.CarPark;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.vo.dashboard.DashBoardVo;

@Component
public class DashDataBl extends BusinessLogic<List<DashBoardVo>> {

	WebUtils a;
	List<DashBoardVo> vos = new ArrayList<DashBoardVo>();
	@Autowired
	PmprsBookingRepository bookingRepository;
	@Autowired
	ProductRepository carparkRepository;

	@Override
	protected void execute(CommonVo commonVo) {

		List<Product> carparks = (List<Product>) carparkRepository
				.findAll();

		vos = new ArrayList<DashBoardVo>();
		for (Product p : carparks) {

			DashBoardVo vo = new DashBoardVo();

			// List<BookCarPark>
			// bookings=bookingRepository..getBookingByIdAndStatus(p.getCarparkId(),"ARRIVED");
			List<Order> bookings = bookingRepository
					.findByCarParkIdAndStatusId(p.getId(), 0);

			Date d = new Date();
			Calendar c = Calendar.getInstance();
			c.set(Calendar.HOUR, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);

			Calendar c1 = Calendar.getInstance();
			c1.set(Calendar.HOUR, 0);
			c1.set(Calendar.MINUTE, 0);
			c1.set(Calendar.SECOND, 0);
			c1.add(Calendar.DAY_OF_MONTH, 1);

			int todayBookings = bookingRepository.getTodayBookings(c.getTime(),
					c1.getTime(), p.getId()).size();
			int occupied = 0;
			int available = 0;
			int currentBooking = bookingRepository
					.findByCarParkIdAndCreatedTimeAndStatusId(p.getId(), d, 0)
					.size();
			System.out.println("Current booking " + currentBooking);
			vo.setCarparkId(p.getId().toString());
			vo.setCarparkName(p.getName());
			vo.setOccupiedSlot(occupied);
			vo.setAvailableSlot(available);
			vo.setTotalSlot(0);
			vo.setCompanyName(p.getName());
			System.out.println(todayBookings);
			vo.setNoOfBookToday(todayBookings);
			vo.setCurrentBooking(occupied);
			vos.add(vo);
		}

	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<DashBoardVo> getResult() {
		// TODO Auto-generated method stub
		return vos;
	}
}
