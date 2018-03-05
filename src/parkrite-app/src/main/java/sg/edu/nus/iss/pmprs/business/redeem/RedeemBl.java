package sg.edu.nus.iss.pmprs.business.redeem;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.business.inbox.InboxMessageBl;
import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.exceptions.BusinessException;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsComplimentaryRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.dao.RedeemHistoryRepository;
import sg.edu.nus.iss.pmprs.dao.RedemptionRepository;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsComplimentary;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PmprsRedeemHistory;
import sg.edu.nus.iss.pmprs.entity.PmprsRedemption;
import sg.edu.nus.iss.pmprs.vo.RedeemVo;

@Component
public class RedeemBl extends BusinessLogic<Boolean> {

	SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
	@Autowired
	RedeemHistoryRepository historyDao;

	@Autowired InboxMessageBl inbox;
	@Autowired
	PmprsComplimentaryRepository complimentDao;

	@Autowired
	PmprsMemberRepository memberDao;

	@Autowired
	RedemptionRepository redeemDao;
	
	@Autowired
	PmprsCarParkRepository carparkDao;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		RedeemVo redeem = (RedeemVo) vo;

		if (getType(redeem.getRedeemId()).equals("C")) {
			findInComplimentry(getId(redeem.getRedeemId()));
		} else if (getType(redeem.getRedeemId()).equals("R")) {
			PmprsRedemption redemption = redeemDao.findOne(getId(redeem
					.getRedeemId()));
			if (redemption.isRedeemed() == true)
				throw new BusinessException("Already Redeemed");
			if (redemption.getToDate().after(new Date())) {
				double remaining = redemption.getAmount() - redeem.getAmount();
				if (remaining == 0) {
					redemption.setRedeemed(true);
					redeemDao.save(redemption);
					PmprsRedeemHistory history = new PmprsRedeemHistory();
					history.setRedeemId(getId(redeem.getRedeemId()));
					
					String message = "Yo have redeem for vehicle -"
							+ redemption.getVehiclePlateNumber()
							+ " has been claimed";
					inbox.createMessage("Redeemed successfully -"+redemption.getCarPark().getName()+ "("+df.format(new Date())+")",
							message, redemption.getMemberId());

					this.setResult(true);

				} else {
					throw new BusinessException("Invalid Redeem amount");
				}
			} else {
				throw new BusinessException("Redeemed Expired");
			}
		} else {
			throw new BusinessException("Redeemed not found");
		}
	}

	private void findInComplimentry(Integer redeemId) {
		// TODO Auto-generated method stub

		PmprsComplimentary cm = complimentDao.findOne(redeemId);
		
		String message = "Your complimentary for vehicle -"
				+ cm.getVehiclePlateNumber() + " has been claimed";
		
		Product car=carparkDao.findOne(cm.getCarParkId());
		inbox.createMessage("Redeemed successfully -"+car.getName()+ "("+df.format(new Date())+")", message,
				cm.getMemberId());

		complimentDao.delete(redeemId);
		this.setResult(true);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}

	public String getType(String redeem) {

		String[] type = redeem.split("-");
		return type[0];

	}

	public Integer getId(String redeemId) {

		String[] type = redeemId.split("-");
		String id = type[1];
		return Integer.parseInt(id);

	}

}
