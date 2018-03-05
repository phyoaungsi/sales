package sg.edu.nus.iss.pmprs.web.actions.reports.download;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import net.sf.jasperreports.engine.JasperCompileManager;
import sg.edu.nus.iss.pmprs.service.MemberService;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.actions.reports.CommonReportAction;


@ParentPackage("jasperreports-default")
@Action(value="memberReport",results = {
		@Result(name = "success",type="jasper", params = {"location","/WEB-INF/jasper/members.jasper","dataSource","list","format","PDF","reportParameters","parameters"}),
		@Result(name = "error", location = "/pages/Error.jsp"),

})
public class MemberReportAction extends CommonReportAction{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Autowired
	@Qualifier("memberServiceImpl")
	MemberService service;
	
	
	public void fillReportData()
	{
		setList(service.getAllMembers());
	}


	@Override
	public String getReportTemplate() {
		// TODO Auto-generated method stub
		return "members";
	}

}
