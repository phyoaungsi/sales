package sg.edu.nus.iss.pmprs.business.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsReasonRepository;

import sg.edu.nus.iss.pmprs.mobile.register.RegistrationResponse;




@Component
public class ModifyPromotionReasonBl extends BusinessLogic<RegistrationResponse>{
	@Autowired
	PmprsReasonRepository reasonRepository;
	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub

	}
	
	

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}
}