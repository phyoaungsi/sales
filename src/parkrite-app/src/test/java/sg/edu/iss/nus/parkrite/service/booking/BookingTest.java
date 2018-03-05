package sg.edu.iss.nus.parkrite.service.booking;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.entity.BookCarPark;
import sg.edu.nus.iss.pmprs.service.BookingService;


@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })

public class BookingTest {
	
	@Autowired
	BookingService bookingService;
	
	@Test
	 public void getAllBookings() 
	 {
		List<BookCarPark> vos = bookingService.getAllBookings();
		
		for (BookCarPark vo:vos){
			System.out.println(vo.getBookinRefId());
			System.out.println(vo.getBookinStatus());
			System.out.println(vo.getCarparkId());
			System.out.println(vo.getPlateId());
			System.out.println(vo.getUserId());
			System.out.println("##################");
		}
				
	 }
	
	@Test
	 public void getTodayBookings() 
		{
				
				List<BookCarPark> vos=bookingService.getTodayBookings("1");
				for (BookCarPark vo:vos){
					System.out.println(vo.getBookinRefId());
					System.out.println(vo.getBookinStatus());
					System.out.println(vo.getCarparkId());
					System.out.println(vo.getPlateId());
					System.out.println(vo.getUserId());
					System.out.println("##################");
				}
				
		}
}
