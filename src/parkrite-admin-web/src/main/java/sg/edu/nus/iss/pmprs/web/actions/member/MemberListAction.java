package sg.edu.nus.iss.pmprs.web.actions.member;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.MemberService;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;

@Action(value = "memberList", results = { @Result(name = "success", location = "/content/member/list.jsp") })
public class MemberListAction extends CommonAction {

	/**
	 * 
	 */
	List<MemberVo> members;

	@Autowired
	@Qualifier("memberServiceImpl")
	MemberService service;

	private static final long serialVersionUID = -3643334708957881550L;

	public String execute() {
		members = service.getAllMembers();
		return SUCCESS;
	}

	public List<MemberVo> getMembers() {
		return members;
	}

	public void setMembers(List<MemberVo> members) {
		this.members = members;
	}

}
