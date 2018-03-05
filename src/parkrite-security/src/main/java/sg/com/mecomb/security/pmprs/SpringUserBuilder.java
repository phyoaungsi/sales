package sg.com.mecomb.security.pmprs;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.stereotype.Service;



import sg.edu.nus.iss.pmprs.entity.User;
@SuppressWarnings("deprecation")
@Service("assembler")
public class SpringUserBuilder {

 // @Transactional(readOnly = true)
  public org.springframework.security.core.userdetails.User buildUserFromUserEntity(User userEntity) {

	  if(userEntity==null)return null;
    String username = userEntity.getUserName();
    String password = userEntity.getPassword();
    boolean enabled = true;
    boolean accountNonExpired = Boolean.TRUE;
    boolean credentialsNonExpired =  Boolean.TRUE;
    boolean accountNonLocked =  Boolean.TRUE;

    Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//    for (Role role : userEntity.getRoles()) {
//      authorities.add(new GrantedAuthorityImpl(role.getRoleName()));
//    }

    authorities.add(new GrantedAuthorityImpl(userEntity.getRole().getName()));
    org.springframework.security.core.userdetails.User springUser = new  org.springframework.security.core.userdetails.User(username, password, enabled,
      accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    return springUser;
  }
}