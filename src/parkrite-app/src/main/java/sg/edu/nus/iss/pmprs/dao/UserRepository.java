package sg.edu.nus.iss.pmprs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsUser;


public interface UserRepository extends JpaRepository<PmprsUser,Integer> {
	
	public PmprsUser findByUserName(String userName);

}
