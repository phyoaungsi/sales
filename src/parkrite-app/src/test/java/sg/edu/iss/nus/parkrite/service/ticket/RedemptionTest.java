package sg.edu.iss.nus.parkrite.service.ticket;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import sg.edu.nus.iss.pmprs.service.RedemptionService;
import sg.edu.nus.iss.pmprs.vo.ticket.RedemptionVo;



@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })
public class RedemptionTest {

	@Autowired
	@Qualifier("redemptionServiceImpl")
	RedemptionService compservice;
	
	 @Test
	 public void createComplimentary() throws java.text.ParseException
	 {
		 
		 	RedemptionVo vo = new RedemptionVo();
			vo.setMemberId(10000);
			vo.setRemarks("Remarks Junit Test");
			Date fromdate = new Date();
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
			String dateInString = "11-02-2015";
			Date date = sdf.parse(dateInString);
		
			String dateInString2 = "20-02-2015";
			Date date2 = sdf.parse(dateInString2);
			
			vo.setFromDate(date);
			vo.setToDate(date2);
			
			vo.setReasonId(1);
			vo.setCarParkId(1);
			vo.setAmount(2.5);
			compservice.createRedemption(vo);
			
			System.out.println("succcess creation");
	 }
	 
	 
	 
	 @Test
	 public void getAllRedemption() throws java.text.ParseException
	 {
		 
		    List<RedemptionVo> vos =  compservice.getAllRedemptions();
		
		    for(RedemptionVo vo : vos){
		    	
		    	System.out.println(vo.getIuNumber());
		    	System.out.println(vo.getUserEmail());
		    	System.out.println(vo.getVehiclePlateNumber());
		    	System.out.println(vo.getCarParkId());
		    	System.out.println(vo.getMemberId());
		    	System.out.println(vo.getReasonId());
		    	System.out.println(vo.getToDate().toString());
		    	System.out.println(vo.getToDate().toString());
		    	System.out.println(vo.getAmount());
		    	System.out.println("########################");
		    }
		    
		    
		    
	 }
}
