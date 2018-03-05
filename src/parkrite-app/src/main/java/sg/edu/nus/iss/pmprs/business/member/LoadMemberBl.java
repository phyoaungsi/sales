package sg.edu.nus.iss.pmprs.business.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.constants.Gender;
import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PmprsMemberVehicle;
import sg.edu.nus.iss.pmprs.mobile.login.LoginResponse;
import sg.edu.nus.iss.pmprs.mobile.login.Member;
import sg.edu.nus.iss.pmprs.mobile.login.Vehicle;
import sg.edu.nus.iss.pmprs.utils.DateUtils;

@Component
public class LoadMemberBl extends BusinessLogic<LoginResponse>{

	@Autowired PmprsMemberRepository memberRepository;
	
	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		String memberUserId=super.getStringParam()[0];
		
		LoginResponse res=new LoginResponse();
		PmprsMember pm=memberRepository.findByMemberUserId(memberUserId);
		Member m =new Member();
		m.setMemberUserId(pm.getId().toString());
		m.setAddress(pm.getAddress());
		if(pm.getBirthDate()!=null){
		m.setBirthDate(DateUtils.converToDateString(pm.getBirthDate()));
		
		}
		m.setEmail(pm.getEmail());
		if(pm.getGender()){
		m.setGender(Gender.M.getName());
		}
		else
		{
			m.setGender(Gender.F.getName());
		}
		m.setHomeNumber(pm.getHomeNumber());
		m.setMobileNumber(pm.getMobileNumber());
		m.setName(pm.getName());
		m.setNric(pm.getNric());
		m.setPostalCode(pm.getPostalCode());
		List<Vehicle> vehicles=new ArrayList<Vehicle>();
		for(PmprsMemberVehicle v: pm.getMemberVehicle())
		{
			Vehicle vehicle=new Vehicle();
		vehicle.setId(v.getId().toString());
		vehicle.setIuNumber(v.getIuNumber());
		vehicle.setVehiclePlateNumber(v.getVehiclePlateNumber());
		vehicles.add(vehicle);
        }
		res.setMember(m);
		res.setVehicles(vehicles);
		res.setStatusCode("0");
		res.setStatusMessage("SUCCESS");
		setResult(res);
	 
		
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
