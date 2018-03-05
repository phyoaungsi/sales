package sg.edu.nus.iss.pmprs.web.actions.member;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.MemberService;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.MemberForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "editMemberForm", results = { @Result(name = "success", location = "/content/member/maintainmember.jsp") })
public class EditMemberFormAction extends CommonAction implements
		ScopedModelDriven<MemberForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1127337637515702797L;
	private String memberId;
	private MemberForm model;

	@Autowired
	@Qualifier("memberServiceImpl")
	MemberService service;

	public String execute() {
		if (memberId != null) {
			int id = Integer.parseInt(memberId.trim());
			MemberVo vo = service.getMember(id);
			model = new MemberForm();
			model.setMemberUserId(vo.getMemberUserId());
			model.setEmail(vo.getEmail());
			model.setId(vo.getId());
			model.setNric(vo.getNric());
			model.setName(vo.getName());
			model.setHomeNumber(vo.getHomeNumber());
			model.setAddress(vo.getAddress());
			// model.setBirthDate(vo.getBirthDate());
			model.setGender(vo.getGender());
			model.setMobileNumber(vo.getMobileNumber());
			model.setPostalCode(vo.getPostalCode());

			// messages.add("Successfully created the member.");
			// setActionMessages(messages);
		}
		return SUCCESS;
	}

	@Override
	public MemberForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Override
	public void setModel(MemberForm model) {
		// TODO Auto-generated method stub
		this.model = model;

	}

}
