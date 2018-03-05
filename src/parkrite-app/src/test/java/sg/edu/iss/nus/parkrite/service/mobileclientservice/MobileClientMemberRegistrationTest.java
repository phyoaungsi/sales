package sg.edu.iss.nus.parkrite.service.mobileclientservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.slf4j.spi.LocationAwareLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingRequest;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingResponse;
import sg.edu.nus.iss.pmprs.mobile.dashboard.DashboardResponse;
import sg.edu.nus.iss.pmprs.mobile.login.Vehicle;
import sg.edu.nus.iss.pmprs.mobile.register.RegistrationRequest;
import sg.edu.nus.iss.pmprs.service.MobileClientService;
import sg.edu.nus.iss.pmprs.utils.DateUtils;
import sg.edu.nus.iss.pmprs.vo.DashboardRequestVo;
import sg.edu.nus.iss.pmprs.vo.MemberRegisterVo;
import sg.edu.nus.iss.pmprs.vo.booking.BookingRequestVo;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })
public class MobileClientMemberRegistrationTest  {
	
	@Autowired PmprsMemberRepository repository;
	
	@Autowired
	@Qualifier("mobileServiceImpl")
	MobileClientService mobileService;

	RegistrationRequest registerInfo;
	
	 @Before
	    public void setUp() {
	       
			registerInfo=new RegistrationRequest();
			registerInfo.setAddress("Singapore");
			registerInfo.setBirthDate("3.12.2011");
			registerInfo.setEmail("verify@email.gmail");
			registerInfo.setGender("M");
			registerInfo.setHomeNumber("98798789");
			registerInfo.setMemberUserId("userid");
			registerInfo.setMobileNumber("9898789888");
			registerInfo.setName("Roberto Carlo");
			registerInfo.setNric("S89898989F");
			registerInfo.setPostalCode("9798798");
             
	    }

	 
	// @Test
	 public void createMember()
	 {
		 
		 repository.count();
		 
	 }
	 
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {

	                 { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 },{ 6, 8 }  
	           });
	    }

	 @BeforeClass
	  public static void setUpClass() {
	    System.out.println("@BeforeClass setUpClass");
	    
	  }
	 
	 @Test
	 public void registerMember()
	 {
		 MemberRegisterVo vo=new MemberRegisterVo();
		 RegistrationRequest request=new RegistrationRequest();
		 request.setAddress("Ang Mo Kio Ave 3");
		 request.setBirthDate("12 JAN 2014 12:00:00");
		 		request.setEmail("robert2@gmail.com");
		 		request.setGender("M");
		 		request.setHomeNumber("+989898");
		 		request.setMemberUserId("robert2@gmail.com");
		 		request.setMobileNumber("+898989898");
		 		request.setName("Roberto Carlos");
		 		request.setNric("N98989S");
		 		request.setPassword("p@ssw0rd");
		 		request.setPostalCode("89809890");
		 		List<Vehicle> vehicles=new ArrayList<Vehicle>();
	
		 		Vehicle v=new Vehicle();
		 		v.setIuNumber("IU989989");
		 		v.setVehiclePlateNumber("PLATE0980909");
		 		
				vehicles.add(v);
				
				Vehicle v1=new Vehicle();
		 		v1.setIuNumber("IU989989");
		 		v1.setVehiclePlateNumber("PLATE0980909");
		 		vehicles.add(v1);
		 		
				request.setVehicles(vehicles);
		         vo.setRequest( request);
		 
		 mobileService.register(vo);	 
		 
	 }
	 
	 
	 
	 @Test
	 public void makeNewBooking()
	 {
		 
	     BookingRequestVo vo=new BookingRequestVo();
	     BookingRequest request=new BookingRequest();
	     request.setBookedDate("Aug 12, 2014");
	     request.setCarParkId("1");
	     request.setFromTime("12:00");
	    
	     request.setToTime("13:00");
	     request.setUserId("veejay");
	     request.setBookingFee(12.00f);
	     request.setBookingRefId("43143982743");
	     request.setCarParkId("1");
	     request.setMemberId("1");
	     request.setMemberVehicleId("1");
	     request.setMinOccupyFee(23.0f);
	     request.setTotalAmount(23f);
	     request.setUserId("1");
	     vo.setBooking(request);
		BookingResponse r = mobileService.newBooking(vo);
		System.out.println(r.getBookedDate());
		 
	 }
	 
	 @Test
	 public void checkBookingStatus()
	 {
		 mobileService.checkBookingStatus("89080"); 
	 }
	 
	 @Test
	 public void getInboxMessages()
	 {
		 mobileService.getInboxMessage("1");
	 }
	 
	 @Test
	 public void getDashboard()
	 {
		 DashboardRequestVo m=new DashboardRequestVo();
		 DashboardResponse r=mobileService.getDashboard(m);
		 System.out.println(r.getCarParks().get(0).getTotalSlot());
		 
	 }
	 

}
