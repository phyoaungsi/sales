package sg.com.mecomb.security.pmprs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import sg.com.mecomb.security.pmprs.SpringUserBuilder;
import sg.com.mecomb.security.pmprs.dao.UserServiceFactory;
import sg.edu.nus.iss.pmprs.entity.User;
import sg.edu.nus.iss.pmprs.service.UserService;
import sg.edu.nus.iss.pmprs.service.UserServiceImpl;


@Service("userDetailsService")
public class UserDetailServiceImpl  implements UserDetailsService {


	//get user from the database, via Hibernate
	@Autowired
    UserService userService;
 
//	@Transactional(readOnly=true)
	public UserDetails loadUserByUsername(String username){

		UserService userService=(UserServiceImpl) UserServiceFactory.getService("PMPRS_USER_SERVICE");
		User user = userService.getUserByUserName(username);
		SpringUserBuilder builder=new SpringUserBuilder();
		return (UserDetails) builder.buildUserFromUserEntity(user);
	}
 
	

}
