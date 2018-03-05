package sg.edu.nus.iss.pmprs.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsMember;

public interface PmprsMemberRepository extends JpaRepository<PmprsMember, Integer> {
	PmprsMember findByMemberUserIdAndPassword(String memberUserId,String password);
	PmprsMember findByMemberUserId(String memberUserId);
	List<PmprsMember> findByNricLike(String nric);
	List<PmprsMember> findByNameLike(String name);
	List<PmprsMember> findByMemberUserIdLike(String memberUserId);

	PmprsMember findByNric(String nric);
}
