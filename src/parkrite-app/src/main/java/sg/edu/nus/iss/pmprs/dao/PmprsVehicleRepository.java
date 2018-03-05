package sg.edu.nus.iss.pmprs.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PmprsMemberVehicle;

public interface PmprsVehicleRepository extends JpaRepository<PmprsMemberVehicle, Integer> {
	
	List<PmprsMemberVehicle> findByMember(PmprsMember member);

}
