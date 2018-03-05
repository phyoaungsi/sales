package sg.edu.nus.iss.pmprs.ajax;

import com.opensymphony.xwork2.ModelDriven;

import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.mobile.booking.BookingResponse;
import sg.edu.nus.iss.pmprs.mobile.login.LoginResponse;
import sg.edu.nus.iss.pmprs.mobile.register.RegistrationRequest;
import sg.edu.nus.iss.pmprs.mobile.register.RegistrationResponse;
import sg.edu.nus.iss.pmprs.mobile.updatemember.UpdateMemberRequest;
import sg.edu.nus.iss.pmprs.mobile.updatemember.UpdateMemberResponse;
import sg.edu.nus.iss.pmprs.vo.MemberRegisterVo;
import sg.edu.nus.iss.pmprs.vo.MemberVo;

public class ModifyMemberAction extends
		JsonServiceAction<UpdateMemberRequest, UpdateMemberResponse> implements ModelDriven<UpdateMemberResponse>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6438878445825327933L;

	@Override
	public String executeJson(UpdateMemberRequest r) {

		//MemberRegisterVo vo = new MemberRegisterVo();
		//vo.setRequest(requestObj);
		String loginUser=(String)this.getSession().get("LOGIN_USER");
		LoginResponse member=service.loadMember(loginUser);
		MemberVo memberVo=new MemberVo();
		if(member!=null)memberVo.setId(Integer.parseInt(member.getMember().getMemberUserId()));
		memberVo.setAddress(r.getAddress());
		memberVo.setBirthDate(r.getBirthDate());
		memberVo.setEmail(r.getEmail());
		memberVo.setHomeNumber(r.getHomeNumber());
		memberVo.setLoggedInUserId(loginUser);
		memberVo.setMemberUserId(loginUser);
		memberVo.setMobileNumber(r.getMobileNumber());
		memberVo.setName(r.getName());
		memberVo.setNric(r.getNric());
		memberVo.setGender(r.getGender());
		memberVo.setPostalCode(r.getPostalCode());
		UpdateMemberResponse response = service.modifyMember(memberVo);
		//UpdateMemberResponse response = new UpdateMemberResponse();
	
		response.setStatusCode("SUCCESS");response.setStatusMessage("Member is updated successfully");
		
		this.setModel(response);
		return SUCCESS;
	}

	@SuppressWarnings("rawtypes")
	public Class getJsonClass() {
		return UpdateMemberRequest.class;
	}

}
