package sg.edu.nus.iss.pmprs.service;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.dao.UserRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsRole;
import sg.edu.nus.iss.pmprs.entity.PmprsUser;
import sg.edu.nus.iss.pmprs.entity.PmprsUserRole;


@Service("userDetailsService")
public class UserAuthenticationServiceImpl  implements UserDetailsService {

	@Autowired
	UserRepository userRepository;
 
	@Transactional
	public UserDetails loadUserByUsername(String username){

		
		PmprsUser user = userRepository.findByUserName(username);
		SpringUserBuilder builder=new SpringUserBuilder();
		return (UserDetails) builder.buildUserFromUserEntity(user);
	}
 
	
	
	public class SpringUserBuilder {

		 // @Transactional(readOnly = true)
		  public org.springframework.security.core.userdetails.User buildUserFromUserEntity(PmprsUser userEntity) {

			  if(userEntity==null)return null;
		    String username = userEntity.getUserName();
		    String password = userEntity.getPassword();
		    boolean enabled = true;
		    boolean accountNonExpired = Boolean.TRUE;
		    boolean credentialsNonExpired =  Boolean.TRUE;
		    boolean accountNonLocked =  Boolean.TRUE;

		    Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
	        for (PmprsUserRole role : userEntity.getUserRoles()) {
		      authorities.add(role.getRole());
		    }
		    org.springframework.security.core.userdetails.User springUser = new  org.springframework.security.core.userdetails.User(username, password, enabled,
		      accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		    return springUser;
		  }
		}

}
