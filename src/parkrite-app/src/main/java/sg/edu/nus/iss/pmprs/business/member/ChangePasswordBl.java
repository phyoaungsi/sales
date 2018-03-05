package sg.edu.nus.iss.pmprs.business.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
@Component
public class ChangePasswordBl extends BusinessLogic<Boolean> {

	
	@Autowired
	PmprsMemberRepository memberRepository;
	private String oldPassword;
	private String newPassword;
	private String userId;
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		PmprsMember member=memberRepository.findByMemberUserIdAndPassword(userId, oldPassword);
		member.setPassword(newPassword);
		memberRepository.save(member);
		super.setResult(true);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}
	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}


}
