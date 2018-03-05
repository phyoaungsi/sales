package sg.edu.nus.iss.pmprs.business.member;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.constants.Gender;
import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.mobile.login.Member;
import sg.edu.nus.iss.pmprs.mobile.updatemember.UpdateMemberResponse;
import sg.edu.nus.iss.pmprs.utils.DateUtils;
import sg.edu.nus.iss.pmprs.vo.MemberVo;

@Component
public class UpdateMemberBl extends BusinessLogic<UpdateMemberResponse> {
	@Autowired
	PmprsMemberRepository memberRepository;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub

		MemberVo memberVo = (MemberVo) vo;
		if (vo.getLoggedInUserId() != null) {
			PmprsMember member1 = memberRepository.findByMemberUserId(vo
					.getLoggedInUserId());
			memberVo.setId(member1.getId());
		}
		PmprsMember member = memberRepository.getOne(memberVo.getId());
		if (memberVo.getMemberUserId() != null)
			member.setMemberUserId(memberVo.getMemberUserId());
		if (memberVo.getName() != null)
			member.setName(memberVo.getName());
		if (memberVo.getNric() != null)
			member.setNric(memberVo.getNric());

		if (memberVo.getAddress() != null)
			member.setAddress(memberVo.getAddress());
		 try {
			member.setBirthDate(DateUtils.convertDateOnlyFromMobile(memberVo.getBirthDate()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// member.setCreatedTime(createdTime);
		if (memberVo.getEmail() != null)
			member.setEmail(memberVo.getEmail());
		if (memberVo.getGender() != null) {
			if (memberVo.getGender().equals("M")) {
				member.setGender(true);
			} else {
				member.setGender(false);
			}
		}
		if (memberVo.getHomeNumber() != null)
			member.setHomeNumber(memberVo.getHomeNumber());
		if (memberVo.getMobileNumber() != null)
			member.setMobileNumber(memberVo.getMobileNumber());
		if (memberVo.getPostalCode() != null)
			member.setPostalCode(memberVo.getPostalCode());
	   PmprsMember m=	memberRepository.save(member);
		
	   UpdateMemberResponse response=new UpdateMemberResponse();
	   response.setMember(new Member());
	   response.getMember().setAddress( m.getAddress());
		 if(m.getBirthDate()!=null)
		 {
			 response.getMember().setBirthDate(new SimpleDateFormat("dd/MM/yyyy").format(m.getBirthDate()));
		 }
		 response.getMember().setEmail( m.getEmail());
		// response.getMember().setId( m.getId());
		 response.getMember().setMemberUserId( m.getMemberUserId());
		 response.getMember().setNric(m.getNric());
		 response.getMember().setName(m.getName());
		 response.getMember().setPostalCode(m.getPostalCode());
		 if(m.getGender())
		 {
			 response.getMember().setGender(Gender.M.getName());
		 }
		 else
		 {
			 response.getMember().setGender(Gender.F.getName());
		 }
		// vo.setStatus(m.getStatusId());
         response.getMember().setMobileNumber(m.getMobileNumber());
         response.getMember().setHomeNumber(m.getHomeNumber());
		response.setStatusCode("SUCCESS");
		 
		setResult(response);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		MemberVo memberVo = (MemberVo) super.getParamter();
		if (memberVo.getId() == 0) {
			throw new RuntimeException("Which Member Are you going to update?");
		}

	}

}
