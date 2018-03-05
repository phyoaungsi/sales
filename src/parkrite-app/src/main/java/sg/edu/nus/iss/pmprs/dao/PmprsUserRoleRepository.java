package sg.edu.nus.iss.pmprs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsRole;
import sg.edu.nus.iss.pmprs.entity.PmprsUser;
import sg.edu.nus.iss.pmprs.entity.PmprsUserRole;

public interface PmprsUserRoleRepository   extends JpaRepository<PmprsUserRole , Integer>   {
	
	public PmprsUserRole findByUserAndRole(PmprsUser user,PmprsRole role);

}
