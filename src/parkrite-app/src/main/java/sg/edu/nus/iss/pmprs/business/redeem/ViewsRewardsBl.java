package sg.edu.nus.iss.pmprs.business.redeem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsComplimentaryRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.dao.RedemptionRepository;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsComplimentary;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PmprsRedemption;
import sg.edu.nus.iss.pmprs.mobile.viewrewards.Reward;
import sg.edu.nus.iss.pmprs.mobile.viewrewards.ViewRewardsResponse;

@Component
public class ViewsRewardsBl extends BusinessLogic<ViewRewardsResponse> {

	@Autowired
	RedemptionRepository dao;

	@Autowired
	PmprsComplimentaryRepository complimentDao;
	@Autowired
	PmprsMemberRepository memberDao;
	@Autowired
	PmprsCarParkRepository carParkDao;
	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sg.edu.nus.iss.pmprs.core.business.BusinessLogic#execute(sg.edu.nus.iss
	 * .pmprs.core.vo.CommonVo)
	 */
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		List<Reward> list = new ArrayList<Reward>();
		PmprsMember member = memberDao.findByMemberUserId(userId);
		List<PmprsRedemption> redemptions = dao.findByMemberIdOrderByCreatedTimeDesc(member.getId());
		List<PmprsComplimentary> complementaries = complimentDao
				.findByMemberIdOrderByCreatedTimeDesc(member.getId());

		for (PmprsComplimentary cm : complementaries) {
			if (cm.getToDate().after(new Date())) {
				Reward res = new Reward();
				res.setAmount("-");
				res.setExpire(cm.getToDate().toString());
				res.setId("C-"+cm.getId().toString());
				Product carpark = carParkDao.findOne(cm.getCarParkId());

				res.setCarparkName(carpark.getName());
				// res.setCarParkAddress(r.getCarPark().getAddress());
				res.setRedeemed(false);
				res.setType("C");
				list.add(res);
			}
		}

		for (PmprsRedemption r : redemptions) {
			Reward res = new Reward();
			res.setAmount(Double.toString(r.getAmount()));
			res.setExpire(r.getToDate().toString());
			res.setId("R-"+r.getId().toString());
			// PmprsCarPark carpark=carParkDao.findOne(r.getCarParkId());
			res.setCarparkName(r.getCarPark().getName());
			// res.setCarParkAddress(r.getCarPark().getAddress());
			res.setRedeemed(r.isRedeemed());
			res.setType("R");
			list.add(res);
		}
		ViewRewardsResponse rr = new ViewRewardsResponse();
		rr.setRewards(list);

		setResult(rr);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}
}