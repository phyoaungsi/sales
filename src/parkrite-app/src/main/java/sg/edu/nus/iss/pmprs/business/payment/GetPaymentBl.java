package sg.edu.nus.iss.pmprs.business.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsPaymentRepository;
import sg.edu.nus.iss.pmprs.entity.BookCarPark;

@Service
public class GetPaymentBl extends BusinessLogic {

	private List<BookCarPark> result;
	@Autowired 
	PmprsPaymentRepository paymentRepository;
	@Autowired 
	StockRepository carparkRepository;
	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
	
		 setResult(paymentRepository.findAll());
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
