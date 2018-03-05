package sg.edu.nus.iss.pmprs.vo.booking;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.mobile.booking.PaymentRequest;

public class PaymentVo extends CommonVo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7172515320232418457L;
	private PaymentRequest request;
	public PaymentVo(PaymentRequest request) {
		super();
		this.request = request;
	}
	public PaymentRequest getRequest() {
		return request;
	}
	public void setRequest(PaymentRequest request) {
		this.request = request;
	}
	

}
