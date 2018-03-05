package sg.edu.nus.iss.pmprs.business.booking;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.BookingRepository;
import sg.edu.nus.iss.pmprs.dao.CarParkRepository;
import sg.edu.nus.iss.pmprs.entity.BookCarPark;

@Service
public class GetTodayBookingBl extends BusinessLogic<List<BookCarPark>> {

	private String carparkId;
	private List<BookCarPark> bookingList;
	@Autowired
	BookingRepository bookingRepository;
	@Autowired
	CarParkRepository carparkRepository;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub

		this.bookingList = bookingRepository.findByCarparkIdAndCreatedTime(
				this.getCarparkId(), new Date());

	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		if (this.getCarparkId() == null)
			throw new RuntimeException("Id to search is null");
	}

	@Override
	public List<BookCarPark> getResult() {
		// TODO Auto-generated method stub
		return this.bookingList;
	}

	public String getCarparkId() {
		return carparkId;
	}

	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}

}
