package sg.edu.nus.iss.pmprs.business.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.mobile.register.RegistrationResponse;
import sg.edu.nus.iss.pmprs.vo.MemberRegisterVo;

@Component
public class ModifyMemberBl extends BusinessLogic<RegistrationResponse>{
	@Autowired
	PmprsMemberRepository memberRepository;
	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		
		MemberRegisterVo memberVo=(MemberRegisterVo) vo;
		
		PmprsMember member=new PmprsMember();
		member.setMemberUserId(memberVo.getRequest().getMemberUserId());
		member.setName(memberVo.getRequest().getName());
		member.setNric(memberVo.getRequest().getNric());
		//member.setBirthDate(memberVo.getBirthDate());
		//member.setCreatedTime(createdTime);
		member.setEmail(memberVo.getRequest().getEmail());
		
		if (memberVo.getRequest().getGender().equals("M")){
		member.setGender(true);}
		else {
			member.setGender(false);
		}
		member.setAddress(memberVo.getRequest().getAddress());
		member.setHomeNumber(memberVo.getRequest().getHomeNumber());
		member.setMobileNumber(memberVo.getRequest().getMobileNumber());
		member.setPostalCode(memberVo.getRequest().getPostalCode());
		memberRepository.save(member);
		
	}
	
	

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
