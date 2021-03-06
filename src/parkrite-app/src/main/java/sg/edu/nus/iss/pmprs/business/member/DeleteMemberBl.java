package sg.edu.nus.iss.pmprs.business.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;

@Component
public class DeleteMemberBl extends BusinessLogic<Boolean>{

	@Autowired PmprsMemberRepository memberDao; 
	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		int memberId=getIntParam()[0];
		memberDao.delete(memberId);
		setResult(Boolean.TRUE);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
