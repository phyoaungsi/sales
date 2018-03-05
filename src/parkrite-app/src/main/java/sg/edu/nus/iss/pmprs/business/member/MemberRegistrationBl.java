package sg.edu.nus.iss.pmprs.business.member;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsVehicleRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PmprsMemberVehicle;
import sg.edu.nus.iss.pmprs.mobile.login.Vehicle;
import sg.edu.nus.iss.pmprs.mobile.register.RegistrationResponse;
import sg.edu.nus.iss.pmprs.utils.DateUtils;
import sg.edu.nus.iss.pmprs.vo.MemberRegisterVo;

@Component
public class MemberRegistrationBl extends BusinessLogic<RegistrationResponse> {

	@Autowired
	PmprsMemberRepository memberRepository;

	@Autowired
	PmprsVehicleRepository vehicleRepository;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub

		MemberRegisterVo memberVo = (MemberRegisterVo) vo;

		PmprsMember member = new PmprsMember();
		member.setAddress(memberVo.getRequest().getAddress());
		try {
			member.setBirthDate(DateUtils.convertDateFromMobile(memberVo
					.getRequest().getBirthDate()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Invalid date format exception");
		}

		member.setEmail(memberVo.getRequest().getEmail());
		member.setGender(true);
		member.setPassword(memberVo.getRequest().getPassword());
		member.setHomeNumber(memberVo.getRequest().getHomeNumber());
		member.setMemberUserId(memberVo.getRequest().getEmail());
		member.setMobileNumber(memberVo.getRequest().getMobileNumber());
		member.setName(memberVo.getRequest().getName());
		member.setNric(memberVo.getRequest().getNric());
		member.setPostalCode(memberVo.getRequest().getPostalCode());
		member.setStatusId(0);
		// member.setMemberVehicle(mvs);
		member = memberRepository.save(member);
		//List<PmprsMemberVehicle> mvs = new ArrayList<PmprsMemberVehicle>();
		for (Vehicle v : memberVo.getRequest().getVehicles()) {

			PmprsMemberVehicle mv = new PmprsMemberVehicle();

			mv.setVehiclePlateNumber(v.getVehiclePlateNumber());
			mv.setIuNumber(v.getIuNumber());
			mv.setMember(member);
			vehicleRepository.save(mv);
		}

		memberRepository.flush();
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}

}
