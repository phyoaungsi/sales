package sg.edu.nus.iss.pmprs.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsComplimentary;



public interface PmprsComplimentaryRepository extends JpaRepository<PmprsComplimentary, Integer> {
	
	List<PmprsComplimentary> findByMemberIdOrderByCreatedTimeDesc(Integer memberId);

}
