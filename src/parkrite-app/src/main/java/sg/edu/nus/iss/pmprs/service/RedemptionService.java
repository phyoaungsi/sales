package sg.edu.nus.iss.pmprs.service;

import java.util.List;
import sg.edu.nus.iss.pmprs.vo.ticket.RedemptionVo;;

public interface RedemptionService {

	public RedemptionVo createRedemption (RedemptionVo vo);

	public List<RedemptionVo> getAllRedemptions();
	
}
