package sg.edu.nus.iss.pmprs.business.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.exceptions.BusinessException;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsPaymentRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsPayment;
import sg.edu.nus.iss.pmprs.mobile.booking.CheckStatusResponse;


@Component
public class CheckPaymentStatusBl extends BusinessLogic<CheckStatusResponse> {

	@Autowired
	PmprsPaymentRepository repository;
	private String paymentRefNumber;

	
	
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		PmprsPayment payment=repository.findByPaymentRefNumber(getPaymentRefNumber());         
	    CheckStatusResponse response=new CheckStatusResponse();
	   
//	    if(payment!=null)
//	    {
//	        response.setPaymentRefId(payment.getPaymentRefNumber());
//	    	response.setPaymentStatus(payment.getId().toString());
//	    	response.setPaymentStatus("CONFIRMED");
//	    	
//	    }else{
//	    	response.setPaymentStatus("FAILED");
//	    	response.setStatusMessage("");
//	    }
//	    
	   
	    setResult(response);
	    
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
       if(getPaymentRefNumber()==null)
       {
    	   
    	   throw new BusinessException("No Payment Reference");
       }
	}

	public String getPaymentRefNumber() {
		return paymentRefNumber;
	}

	public void setPaymentRefNumber(String paymentRefNumber) {
		this.paymentRefNumber = paymentRefNumber;
	}

}
