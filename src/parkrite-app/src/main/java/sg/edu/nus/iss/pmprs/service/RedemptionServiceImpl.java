package sg.edu.nus.iss.pmprs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.nus.iss.pmprs.business.ticket.CreateRedemptionBl;
import sg.edu.nus.iss.pmprs.dao.PmprsRedemptionRepository;
import sg.edu.nus.iss.pmprs.dao.RedemptionRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsRedemption;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.ticket.RedemptionVo;

@org.springframework.stereotype.Service
public class RedemptionServiceImpl implements RedemptionService{
	
	@Autowired
	CreateRedemptionBl createBl;
	
	
	
	@Autowired
	PmprsRedemptionRepository redemptionRepository;
	
	public RedemptionVo createRedemption(RedemptionVo vo) {
		
		createBl.setParamter(vo);
		createBl.process();
		createBl.getResult();
		
		return vo;

	}

	public List<RedemptionVo> getAllRedemptions() {

		List<PmprsRedemption> redemptions = redemptionRepository.findAll();
		List<RedemptionVo> vos = new ArrayList<RedemptionVo>();
		for (PmprsRedemption r : redemptions) {
			RedemptionVo vo = new RedemptionVo();
			
			vo.setFromDate(r.getFromDate());
			vo.setIuNumber(r.getIuNumber());
			vo.setMemberId(r.getMemberId());
			vo.setReasonId(r.getReasonId());
			
			//CARPARKID
			vo.setRemarks(r.getRemarks());
			vo.setToDate(r.getToDate());
			vo.setUserEmail(r.getUserEamil());
			vo.setVehiclePlateNumber(r.getVehiclePlateNumber());
			if(r.isRedeemed())
			{
				vo.setStatus("Redeemed.");
			}
			else if(r.getToDate().before(new Date()))
			{
				vo.setStatus("Expired Reward.");
			}
			else
			{
				vo.setStatus("Pending Reward.");
			}
			
			vos.add(vo);
		}

		return vos;

	}
}
