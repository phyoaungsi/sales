package sg.edu.nus.iss.pmprs.ajax;

import sg.edu.nus.iss.pmprs.mobile.booking.PaymentRequest;
import sg.edu.nus.iss.pmprs.mobile.booking.PaymentResponse;

import com.opensymphony.xwork2.ModelDriven;

public class PaymentAction   extends JsonServiceAction<PaymentRequest, PaymentResponse> implements ModelDriven<PaymentResponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1085738598229877916L;

	@Override
	public String executeJson(PaymentRequest requestObj) {
		// TODO Auto-generated method stub
		String loginUser=(String)this.getSession().get("LOGIN_USER");
		PaymentResponse res=new PaymentResponse();
		if(loginUser==null){res.setStatusCode("FAIL");
		res.setStatusMessage("User have not log in");
		setModel(res);
		return SUCCESS;
		}
		
		res=service.submitPayment(requestObj);

		setModel(res);
		return SUCCESS;
		
	}

	@Override
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return PaymentRequest.class;
	}

}
