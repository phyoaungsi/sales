package sg.edu.nus.iss.pmprs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsUser;

public interface PmprsUserRepository  extends JpaRepository<PmprsUser , Integer>  {
	
	PmprsUser findByEmailAndPassword(String email,String password);
    PmprsUser findByUserName(String userName);
	

}
