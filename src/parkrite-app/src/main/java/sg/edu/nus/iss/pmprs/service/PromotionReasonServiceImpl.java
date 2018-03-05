package sg.edu.nus.iss.pmprs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.business.member.SearchMemberBl;
import sg.edu.nus.iss.pmprs.business.ticket.CreatePromotionReasonBl;
import sg.edu.nus.iss.pmprs.business.ticket.DeletePromotionReasonBl;
import sg.edu.nus.iss.pmprs.dao.PmprsReasonRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsReason;
import sg.edu.nus.iss.pmprs.vo.ticket.PromotionReasonVo;

@org.springframework.stereotype.Service
public class PromotionReasonServiceImpl implements PromotionReasonService {

	@Autowired
	CreatePromotionReasonBl createBl;
	
	@Autowired
	DeletePromotionReasonBl deleteBl;
	

	@Autowired
	SearchMemberBl searchBl;
	
	@Autowired
	PmprsReasonRepository reasonRepository;

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.MemberService#createMmeber(sg.edu.nus.iss.pmprs.vo.MemberVo)
	 */
	public PromotionReasonVo createPromotionReason(PromotionReasonVo vo) {
		createBl.setParamter(vo);
		createBl.process();
		createBl.getResult();
		return vo;

	}

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.MemberService#deleteMember(int)
	 */
	public boolean deletePromotionReason(int reasonId) {
		
		deleteBl.setIntParam(reasonId);
		deleteBl.process();
		return deleteBl.getResult();

	}
	
	
	
	
@Transactional	
public PromotionReasonVo getPromotionReason(int reasonId) {
	   PmprsReason m=  reasonRepository.getOne(reasonId);
	   PromotionReasonVo vo=new PromotionReasonVo();
	   vo.setId(m.getId());
	   vo.setName(m.getName());
	   return vo;
}


	@Transactional	
	public List<PromotionReasonVo> getPromotionReasons() {
		  List<PmprsReason> m=  reasonRepository.findAll();
		   List<PromotionReasonVo> vos = new ArrayList<PromotionReasonVo>();
		   for (int i=0; i< m.size(); i++){
			   PromotionReasonVo vo = new PromotionReasonVo();
			   vo.setId(m.get(i).getId());
			   vo.setName(m.get(i).getName());
			   vos.add(vo);
		   }
		   
		   return vos;
	}



	/*
	public List<PromotionReasonVo> searchMember(String field, String keyword)
	{
		searchBl.setStringParam(field,keyword);
		searchBl.process();
		return searchBl.getResult();
	
	}*/
}
