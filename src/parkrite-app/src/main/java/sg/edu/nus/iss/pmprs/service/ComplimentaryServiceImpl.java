package sg.edu.nus.iss.pmprs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.nus.iss.pmprs.business.ticket.CreateComplimentaryBl;
import sg.edu.nus.iss.pmprs.dao.PmprsComplimentaryRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsRedemptionRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsComplimentary;
import sg.edu.nus.iss.pmprs.vo.ticket.ComplimentaryVo;;


@org.springframework.stereotype.Service
public class ComplimentaryServiceImpl implements ComplimentaryService{
	
	@Autowired
	CreateComplimentaryBl createBl;

	@Autowired
	PmprsComplimentaryRepository complimentaryRepository;
	
	public ComplimentaryVo createComplimentary(ComplimentaryVo vo) {
		System.out.println("createComplimentary");
		createBl.setParamter(vo);
		createBl.process();
		createBl.getResult();
		
		return vo;

	}


	public List<ComplimentaryVo> getAllComplimentaries() {

		List<PmprsComplimentary> complimentaries = complimentaryRepository.findAll();
		List<ComplimentaryVo> vos = new ArrayList<ComplimentaryVo>();
		for (PmprsComplimentary c : complimentaries) {
			ComplimentaryVo vo = new ComplimentaryVo();
			
			vo.setCarParkId(c.getCarParkId());
			vo.setFromDate(c.getFromDate());
			vo.setIuNumber(c.getIuNumber());
			vo.setMemberId(c.getMemberId());
			vo.setReasonId(c.getReasonId());
			vo.setRemarks(c.getRemarks());
			vo.setToDate(c.getToDate());
			vo.setUserEmail(c.getUserEmail());
			vo.setVehiclePlateNumber(c.getVehiclePlateNumber());
			vos.add(vo);
		}

		return vos;

	}

}
