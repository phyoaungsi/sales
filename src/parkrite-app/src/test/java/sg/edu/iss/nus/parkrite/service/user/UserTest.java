package sg.edu.iss.nus.parkrite.service.user;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;


import sg.edu.nus.iss.pmprs.entity.PmprsUser;

import sg.edu.nus.iss.pmprs.service.UserService;
import sg.edu.nus.iss.pmprs.vo.PmprsUserVo;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })
public class UserTest {

	
	@Autowired
	@Qualifier("userServiceImpl")
	UserService userService;
	
	@Test
	private void getAllUsers(){
		List<PmprsUser> vos = userService.getAll();
		
		for (PmprsUser vo:vos){
			System.out.println(vo.getAddress());
			System.out.println(vo.getName());
			System.out.println(vo.getCompany());
			System.out.println(vo.getDesignation());
			System.out.println(vo.getMobileNumber());
			System.out.println(vo.getNric());
		}
	}
	
	@Test
	private void createUser(){
		PmprsUserVo vo = new PmprsUserVo();
		vo.setName("pp");
		vo.setAddress("Singapore");
		vo.setDepartment("IT");
		vo.setEmail("pp@gmmail.com");
		vo.setId(999);
		vo.setHomeNumber("99988875");
		vo.setNric("S8383111F");
		
		userService.create(vo);
		
	}
	
	
}
