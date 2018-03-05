package sg.edu.nus.iss.pmprs.ajax;

import com.opensymphony.xwork2.ModelDriven;

import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingResponse;
import sg.edu.nus.iss.pmprs.mobile.register.RegistrationRequest;
import sg.edu.nus.iss.pmprs.mobile.register.RegistrationResponse;
import sg.edu.nus.iss.pmprs.vo.MemberRegisterVo;

public class RegisterAction extends
		JsonServiceAction<RegistrationRequest, RegistrationResponse> implements ModelDriven<RegistrationResponse>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6438878445825327933L;

	@Override
	public String executeJson(RegistrationRequest requestObj) {

		MemberRegisterVo vo = new MemberRegisterVo();
		vo.setRequest(requestObj);
		PmprsMember member = service.register(vo);
		
		RegistrationResponse response = new RegistrationResponse();
		response.setStatusCode("SUCCESS");
		this.setModel(response);
		return SUCCESS;
	}

	@SuppressWarnings("rawtypes")
	public Class getJsonClass() {
		return RegistrationRequest.class;
	}

}
