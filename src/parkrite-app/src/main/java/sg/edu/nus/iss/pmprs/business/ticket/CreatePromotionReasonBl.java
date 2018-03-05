package sg.edu.nus.iss.pmprs.business.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

import sg.edu.nus.iss.pmprs.dao.PmprsReasonRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsReason;
import sg.edu.nus.iss.pmprs.vo.ticket.PromotionReasonVo;;


@Component
public class CreatePromotionReasonBl extends BusinessLogic<Boolean> {

	@Autowired
	PmprsReasonRepository reasonRepository;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub

		PromotionReasonVo reasonVo = (PromotionReasonVo) vo;

		PmprsReason reason = new PmprsReason();
		reason.setName(reasonVo.getName());
		
		reasonRepository.save(reason);
		reasonRepository.flush();
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}

}