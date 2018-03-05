package sg.edu.nus.iss.pmprs.service;

import java.util.List;

import sg.edu.nus.iss.pmprs.vo.MemberVo;

public interface MemberService {

	public MemberVo createMmeber(MemberVo vo);

	public boolean deleteMember(int memberId);

	public boolean updateMember(MemberVo memberUpdateVo);

	public List<MemberVo> getAllMembers();
	
	public MemberVo getMember(int memberId) ;
	
	public List<MemberVo> searchMember(String field, String keyword);
	
	public MemberVo searchMemberbyNric(String field, String keyword) ;
}