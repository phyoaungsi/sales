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
import sg.edu.nus.iss.pmprs.service.ComplimentaryService;
import sg.edu.nus.iss.pmprs.vo.ticket.ComplimentaryVo;



@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })
public class ComplimentaryTest {

	@Autowired
	@Qualifier("complimentaryServiceImpl")
	ComplimentaryService compservice;
	
	 @Test
	 public void createComplimentary() throws java.text.ParseException
	 {
		 
		    ComplimentaryVo vo = new ComplimentaryVo();
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
			
			compservice.createComplimentary(vo);
			
			System.out.println("succcess creation");
	 }
	 
	 
	 
	 @Test
	 public void getAllComplimentaries() 
	 {
		 
		    List<ComplimentaryVo> vos =     compservice.getAllComplimentaries();
		
		    for(ComplimentaryVo vo : vos){
		    	
		    	System.out.println(vo.getIuNumber());
		    	System.out.println(vo.getUserEmail());
		    	System.out.println(vo.getVehiclePlateNumber());
		    	System.out.println(vo.getCarParkId());
		    	System.out.println(vo.getMemberId());
		    	System.out.println(vo.getReasonId());
		    	System.out.println(vo.getToDate().toString());
		    	System.out.println(vo.getToDate().toString());
		    	System.out.println("########################");
		    }
		    
		    
		    
	 }
}
