package sg.edu.nus.iss.pmprs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsInboxMessage;

public interface PmprsInboxMessageRepository extends JpaRepository<PmprsInboxMessage,Integer>{
	
	List<PmprsInboxMessage> findByMemberIdOrderByCreatedTimeDesc(Integer memberId);
	

}
