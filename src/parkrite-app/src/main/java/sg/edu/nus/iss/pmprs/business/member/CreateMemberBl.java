package sg.edu.nus.iss.pmprs.business.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.vo.MemberVo;

@Component
public class CreateMemberBl extends BusinessLogic<Boolean> {

	@Autowired
	PmprsMemberRepository memberRepository;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub

		MemberVo memberVo = (MemberVo) vo;

		PmprsMember member = new PmprsMember();
		member.setAddress(memberVo.getAddress());
	   
		member.setEmail(memberVo.getEmail());
		member.setGender(true);
		member.setHomeNumber(memberVo.getHomeNumber());
		member.setMemberUserId(memberVo.getMemberUserId());
		member.setMobileNumber(memberVo.getMobileNumber());
		member.setName(memberVo.getName());
		member.setNric(memberVo.getNric());
		member.setPostalCode(memberVo.getPostalCode());
		member.setStatusId(0);

		memberRepository.save(member);
		memberRepository.flush();
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}

}
