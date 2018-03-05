package sg.edu.iss.nus.parkrite.service.carparkowner;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.service.CarParkOwnerService;
import sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo;



@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })
public class CarparkOwnerTest {

	@Autowired
	@Qualifier("carparkownerServiceImpl")
	CarParkOwnerService carparkownerService;
	
	
	 
	 @Test
	 public void getAllCarparkOwners() 
	 {
		    List<CarParkOwnerVo> vos =     carparkownerService.getAllCarparkOwners();
		
		    for(CarParkOwnerVo vo : vos){
		    	
		    	System.out.println(vo.getCarparkownerId());
		    	System.out.println(vo.getCompany_name());
		    	System.out.println(vo.getContact_number());
		    	System.out.println(vo.getDesignation());
		    	System.out.println(vo.getEmail());
		    	System.out.println(vo.getGender());
		    	System.out.println(vo.getNric());
		    	System.out.println(vo.getAddress());
		    	System.out.println(vo.getBirth_date());
		    	System.out.println(vo.getName());
		    	System.out.println("########################");
		    }
	 }
	
	
	 @Test
	 public void getCarparkOwner() 
	 {
		    List<CarParkOwnerVo> vos =     carparkownerService.searchCarparkOwner("nric","S88889999F");
		
		    for(CarParkOwnerVo vo : vos){
		    	
		    	System.out.println(vo.getCarparkownerId());
		    	System.out.println(vo.getCompany_name());
		    	System.out.println(vo.getContact_number());
		    	System.out.println(vo.getDesignation());
		    	System.out.println(vo.getEmail());
		    	System.out.println(vo.getGender());
		    	System.out.println(vo.getNric());
		    	System.out.println(vo.getAddress());
		    	System.out.println(vo.getBirth_date());
		    	System.out.println(vo.getName());
		    	System.out.println("########################");
		    }
	 }
	 
	 
	 @Test
	 public void createCarparkOwner() 
	 {
		   
		
		   CarParkOwnerVo vo = new CarParkOwnerVo();
		    
		   vo.setAddress("Singapore");
		   vo.setBirth_date("10-05-1983");
		   vo.setCompany_name("Ascendas2");
		   vo.setEmail("ascendas2@mail.com");
		   vo.setCarparkownerId(100);
		   vo.setDesignation("Supervisor");
		   vo.setName("Dave");
		   vo.setNric("S88889999F");
		   
		    	System.out.println("########################");
		    	carparkownerService.createCarparkOwner(vo);
		    
	 }
	 
	 
}
