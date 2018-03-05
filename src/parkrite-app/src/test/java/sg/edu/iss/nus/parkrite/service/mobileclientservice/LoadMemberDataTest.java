package sg.edu.iss.nus.parkrite.service.mobileclientservice;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.business.member.LoadMemberBl;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingRequest;
import sg.edu.nus.iss.pmprs.mobile.login.LoginResponse;
import sg.edu.nus.iss.pmprs.vo.booking.BookingRequestVo;


@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })
public class LoadMemberDataTest {

	@Autowired LoadMemberBl bl;
	 @Test
	 public void loadMemberData()
	 {
		 
	   bl.setStringParam("robert2@gmail.com");
	   bl.process();
	   LoginResponse r= bl.getResult();
	   System.out.println(r.getMember().getAddress());
	   System.out.println(r.getMember().getAddress());
	   System.out.println(r.getMember().getAddress());
	   System.out.println(r.getMember().getAddress());
	   System.out.println(r.getMember().getAddress());
	   System.out.println(r.getMember().getAddress());
	   System.out.println(r.getVehicles().get(0).getIuNumber());
	   System.out.println(r.getVehicles().get(1).getIuNumber());
	   
	 }
	 
}
