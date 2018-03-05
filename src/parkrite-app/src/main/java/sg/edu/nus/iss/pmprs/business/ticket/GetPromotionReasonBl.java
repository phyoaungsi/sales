package sg.edu.nus.iss.pmprs.business.ticket;

import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsReasonRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsReason;
import sg.edu.nus.iss.pmprs.mobile.register.RegistrationResponse;
import sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo;
import sg.edu.nus.iss.pmprs.vo.ticket.PromotionReasonVo;

import java.util.List;

public class GetPromotionReasonBl extends  BusinessLogic<List<PromotionReasonVo>>{

	@Autowired
	PmprsReasonRepository reasonRepository;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub

		
		List<PmprsReason> reasons = reasonRepository.findAll();
		
		for (int i=0 ; i < reasons.size(); i++){
			PromotionReasonVo reasonVo = new PromotionReasonVo();
			reasonVo.setId(reasons.get(i).getId());
			reasonVo.setName(reasons.get(i).getName());
			getResult().add(reasonVo);
		}
		
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}
}
