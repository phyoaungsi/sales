package sg.edu.iss.nus.parkrite.service.inbox;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.business.inbox.InboxMessageBl;



@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })
public class InboxMessageTest {

	
	@Autowired
	InboxMessageBl inboxService;
	
	@Test
	 public void createMessage() 
	 {
		inboxService.createMessage("Redemption", "successfully redemption", 1);
		
	 }
}
