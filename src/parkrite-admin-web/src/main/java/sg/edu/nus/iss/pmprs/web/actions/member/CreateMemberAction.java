package sg.edu.nus.iss.pmprs.web.actions.member;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.MemberService;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.MemberForm;
import sg.edu.nus.iss.pmprs.web.utility.Validator;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "createMember", results = {
		@Result(name = "success", location = "/content/member/member.jsp"),
		@Result(name = "fail", location = "/content/member/member.jsp"),

})
public class CreateMemberAction extends CommonAction implements
		ScopedModelDriven<MemberForm> {

	/**
	 * 
	 */
	Logger logger = Logger.getLogger(this.getClass());
	private static final long serialVersionUID = 5317660498577483199L;

	@Autowired
	@Qualifier("memberServiceImpl")
	MemberService service;

	MemberForm model;

	public String execute() {

		// Server Side Validation ......
		boolean iserror = false;
		Collection<String> messages = new ArrayList<String>();

		if (model.getMemberUserId() == null
				|| model.getMemberUserId().trim().equals("")) {
			messages.add("Member User ID is required !");
			iserror = true;
		}

		if (model.getEmail() == null || model.getEmail().trim().equals("")) {
			messages.add("Email is required !");
			iserror = true;
		} else if (Validator.isValidEmailAddress(model.getEmail()) == false) {
			messages.add("Email is not valid ! abc@domain.com ");
			iserror = true;
		}
		if (model.getName() == null || model.getName().trim().equals("")) {
			messages.add("Name is required!");
		}

		if (model.getMobileNumber() == null
				|| model.getMobileNumber().trim().equals("")) {
			messages.add("Mobile Number is required !");
			iserror = true;
		} else if (Validator.isPhoneNumberValid(model.getMobileNumber()) == false) {
			messages.add("Mobile Number is invalid ! (123)456-7890, 123-456-7890, 94590234, (123)-456-789");
			iserror = true;
		}

		if (model.getPostalCode() != null
				&& model.getPostalCode().trim().equals("") == false) {
			if (Validator.validatePostal(model.getPostalCode()) == false) {
				messages.add("Postal Code is not valid ! Require 6 digits Singapore postal code.");
				iserror = true;
			}
		}

		// End of Validation

		if (iserror == true) {
			super.setActionErrors(messages);
			return "fail";
		} else { // if no error
			logger.info("CreateMember");
			MemberVo vo = new MemberVo();
			vo = (MemberVo) model.convertFormToVo(vo);
			service.createMmeber(vo);
			
			messages = new ArrayList<String>();
			messages.add("Successfully created the member.");

			setActionMessages(messages);
			this.model = new MemberForm();
			return SUCCESS;
		}
	}

	@Override
	public MemberForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public void setModel(MemberForm model) {
		// TODO Auto-generated method stub
		this.model = model;
	}

}
