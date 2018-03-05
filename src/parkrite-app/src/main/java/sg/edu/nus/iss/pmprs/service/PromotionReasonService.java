package sg.edu.nus.iss.pmprs.service;

import java.util.List;

import sg.edu.nus.iss.pmprs.vo.ticket.PromotionReasonVo;

public interface PromotionReasonService {
	
	public PromotionReasonVo createPromotionReason(PromotionReasonVo vo);

	public boolean deletePromotionReason(int reasonId);

	//public boolean updateMember(PromotionReasonVo reasonUpdateVo);

	//public List<PromotionReasonVo> getAllMembers();
	
	public PromotionReasonVo getPromotionReason(int reasonId) ;
	public List<PromotionReasonVo> getPromotionReasons() ;
	
}
