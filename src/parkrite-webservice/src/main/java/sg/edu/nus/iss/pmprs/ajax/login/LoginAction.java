package sg.edu.nus.iss.pmprs.ajax.login;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import sg.com.mecomb.security.pmprs.service.UserDetailServiceImpl;
import sg.edu.nus.iss.pmprs.ajax.JsonServiceAction;
import sg.edu.nus.iss.pmprs.mobile.login.LoginRequest;
import sg.edu.nus.iss.pmprs.mobile.login.LoginResponse;
import sg.edu.nus.iss.pmprs.mobile.login.Member;
import sg.edu.nus.iss.pmprs.mobile.login.Vehicle;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends JsonServiceAction<LoginRequest,LoginResponse> implements ModelDriven<LoginResponse>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2007591060376690023L;


	public String executeJson(LoginRequest requestObj) {
		
		String userName=requestObj.getUserName();
		String password=requestObj.getPassword();
		
		if(!service.checkUserByUserIdPassword(userName, password))
		{
			
			LoginResponse res=new LoginResponse();
			res.setStatusMessage("Login failed");
			res.setStatusCode("-1");
			setModel(res);
			return SUCCESS;
			
		}else{
		try {
			this.getSession().put("LOGIN_USER", userName);
			UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(requestObj.getUserName(),requestObj.getPassword());
		   // UserDetails userDetails = userDetailService.loadUserByUsername(requestObj.getUserName());
			Collection<GrantedAuthority> roles=new ArrayList<GrantedAuthority>();
			UserDetails userDetails =new User(userName, password, false, false, false, false, roles);
			
		    token.setDetails(userDetails);
		    Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(), userDetails.getAuthorities());
		    System.out.println(authentication.isAuthenticated());
		    SecurityContextHolder.getContext().setAuthentication(authentication);
		    LoginResponse r=new LoginResponse();
		    setModel(service.loadMember(userName));
		    return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		    SecurityContextHolder.getContext().setAuthentication(null);
		  
		}
		}
		
       
		
			
		
		
		return Action.SUCCESS;
	}


	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return LoginRequest.class;
	}






}
