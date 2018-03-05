package sg.edu.nus.iss.pmprs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.business.member.CreateMemberBl;
import sg.edu.nus.iss.pmprs.business.member.DeleteMemberBl;
import sg.edu.nus.iss.pmprs.business.member.SearchMemberBl;
import sg.edu.nus.iss.pmprs.business.member.SearchByMememberNRICBl;
import sg.edu.nus.iss.pmprs.business.member.UpdateMemberBl;
import sg.edu.nus.iss.pmprs.business.redeem.ViewsRewardsBl;

import sg.edu.nus.iss.pmprs.constants.Gender;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.vo.MemberVo;

@org.springframework.stereotype.Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	CreateMemberBl createBl;

	@Autowired
	DeleteMemberBl deleteBl;

	@Autowired
	UpdateMemberBl updateBl;

	@Autowired
	SearchMemberBl searchBl;
	
	@Autowired
    SearchByMememberNRICBl searchNricBl;
//	

	@Autowired
	PmprsMemberRepository memberRepository;

	@Autowired
	ViewsRewardsBl rewardsBl;
	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sg.edu.nus.iss.pmprs.service.MemberService#createMmeber(sg.edu.nus.iss
	 * .pmprs.vo.MemberVo)
	 */
	public MemberVo createMmeber(MemberVo vo) {
		createBl.setParamter(vo);
		createBl.process();
		createBl.getResult();
		return vo;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sg.edu.nus.iss.pmprs.service.MemberService#deleteMember(int)
	 */
	public boolean deleteMember(int memberId) {

		deleteBl.setIntParam(memberId);
		deleteBl.process();
		return deleteBl.getResult();

	}

	@Transactional
	public MemberVo getMember(int memberId) {

		PmprsMember m = memberRepository.getOne(memberId);
		MemberVo vo = new MemberVo();
		vo.setId(m.getId());
		vo.setAddress(m.getAddress());
		// vo.setBirthDate(m.getBirthDate().toString());
		vo.setEmail(m.getEmail());
		if (m.getGender()) {
			vo.setGender("M");
		} else {
			vo.setGender("F");
		}
		vo.setHomeNumber(m.getHomeNumber());
		vo.setMemberUserId(m.getMemberUserId());
		vo.setMobileNumber(m.getMobileNumber());
		vo.setName(m.getName());
		vo.setNric(m.getNric());
		vo.setPostalCode(m.getPostalCode());
		// if(m.getStatusId()!=null){
		// vo.setStatus(m.getStatusId().toString());
		// }
		return vo;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * sg.edu.nus.iss.pmprs.service.MemberService#updateMember(sg.edu.nus.iss
	 * .pmprs.vo.MemberVo)
	 */
	@Transactional
	public boolean updateMember(MemberVo memberUpdateVo) {

		updateBl.setParamter(memberUpdateVo);
		updateBl.process();
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sg.edu.nus.iss.pmprs.service.MemberService#getAllMembers()
	 */
	public List<MemberVo> getAllMembers() {

		List<PmprsMember> members = memberRepository.findAll();
		List<MemberVo> vos = new ArrayList<MemberVo>();
		for (PmprsMember m : members) {
			MemberVo vo = new MemberVo();
			vo.setAddress(m.getAddress());
			if (m.getBirthDate() != null) {
				vo.setBirthDate(m.getBirthDate().toString());
			}
			vo.setEmail(m.getEmail());
			vo.setId(m.getId());
			vo.setMemberUserId(m.getMemberUserId());
			vo.setNric(m.getNric());
			vo.setName(m.getName());
			if (m.getGender()) {
				vo.setGender(Gender.M.getName());
			} else {
				vo.setGender(Gender.F.getName());
			}
			// vo.setStatus(m.getStatusId());
			vos.add(vo);

		}

		return vos;

	}

	public List<MemberVo> searchMember(String field, String keyword) {
		searchBl.setStringParam(field, keyword);
		searchBl.process();
		return searchBl.getResult();

	}
	
	public MemberVo searchMemberbyNric(String field, String keyword){

	searchNricBl.setStringParam(field,keyword);
		searchNricBl.process();
		return searchNricBl.getResult();
		
		//return null;
	}
}
