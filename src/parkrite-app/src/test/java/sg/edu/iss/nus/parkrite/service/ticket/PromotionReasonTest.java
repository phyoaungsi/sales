package sg.edu.iss.nus.parkrite.service.ticket;



import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.business.member.LoadMemberBl;
import sg.edu.nus.iss.pmprs.business.ticket.GetPromotionReasonBl;
import sg.edu.nus.iss.pmprs.mobile.login.LoginResponse;
import sg.edu.nus.iss.pmprs.vo.ticket.PromotionReasonVo;



@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })
public class PromotionReasonTest {

	
	@Autowired GetPromotionReasonBl bl;
	 @Test
	 public void getPromotionReason()
	 {
		 
	   bl.process();
	   List<PromotionReasonVo> rvos= bl.getResult();
	   for (PromotionReasonVo r: rvos){
	   System.out.println(r.getId());
	   System.out.println(r.getName());
	   
	   }
	   
	 }
	 
}
