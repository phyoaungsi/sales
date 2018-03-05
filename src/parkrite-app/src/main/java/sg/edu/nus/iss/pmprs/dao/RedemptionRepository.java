package sg.edu.nus.iss.pmprs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsRedemption;

public interface RedemptionRepository extends JpaRepository<PmprsRedemption, Integer> {
	
	List<PmprsRedemption> findByMemberIdOrderByCreatedTimeDesc(Integer memberId);

}
