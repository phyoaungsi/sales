package sg.edu.nus.iss.pmprs.business.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsReasonRepository;



@Component
public class DeletePromotionReasonBl extends BusinessLogic<Boolean>{

	@Autowired PmprsReasonRepository reasonDao; 
	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		int reasonId=getIntParam()[0];
		reasonDao.delete(reasonId);
		setResult(Boolean.TRUE);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
