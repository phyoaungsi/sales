package sg.edu.nus.iss.pmprs.business.booking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.BookingRepository;
import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.entity.BookCarPark;

@Service
public class GetBookingsBl extends BusinessLogic {

	private List<BookCarPark> result;
	@Autowired 
	BookingRepository bookingRepository;
	@Autowired 
	StockRepository carparkRepository;
	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
	
		 setResult(bookingRepository.findAll());
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

	public List<BookCarPark> getResult() {
		return result;
	}

	public void setResult(List<BookCarPark> result) {
		this.result = result;
	}

	

}
