package sg.edu.nus.iss.pmprs.business.ticket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsRedemptionRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsRedemption;

import sg.edu.nus.iss.pmprs.vo.ticket.RedemptionVo;


@Component
public class CreateRedemptionBl extends BusinessLogic<Boolean> {

	@Autowired 
	PmprsRedemptionRepository cRespository;
	private RedemptionVo redeemVo;
	
	@Autowired 
	PmprsCarParkRepository carparkRespository;
	
	@Override
	protected void execute(CommonVo vo) {
		RedemptionVo comVo = (RedemptionVo) vo;
		PmprsRedemption p = new PmprsRedemption();
		//p.setCarParkId(Integer.parseInt(comVo.getCarParkId()));
		
		p.setCarPark(carparkRespository.getOne(comVo.getCarParkId()));
		p.setReasonId(comVo.getReasonId());
		p.setFromDate(comVo.getFromDate());
		p.setToDate(comVo.getToDate());
		p.setUserEamil(comVo.getUserEmail());
		p.setMemberId(comVo.getMemberId());
		p.setAmount(comVo.getAmount());
		p.setToDate(comVo.getToDate());
		p.setToDate(comVo.getToDate());
		p.setRemarks(comVo.getRemarks());
		cRespository.save(p);
		cRespository.flush();
	}


	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		//if(this.getRedemption().getMemberId()==null)
		//throw new NoCarparkIdException();
	}

	public void setRedemption(RedemptionVo redeem) {
		this.redeemVo = redeem;
	}
	
	public RedemptionVo  getRedemption(){
		return this.redeemVo;
	}
}