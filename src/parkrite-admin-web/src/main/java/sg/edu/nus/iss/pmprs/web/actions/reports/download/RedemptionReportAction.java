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
import sg.edu.nus.iss.pmprs.service.RedemptionService;
import sg.edu.nus.iss.pmprs.vo.ticket.RedemptionVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.actions.reports.CommonReportAction;


@ParentPackage("jasperreports-default")
@Action(value="redemptionReport",results = {
		@Result(name = "success",type="jasper", params = {"location","/WEB-INF/jasper/redemptions.jasper","dataSource","list","format","PDF","reportParameters","parameters"}),
		@Result(name = "error", location = "/pages/Error.jsp"),

})
public class RedemptionReportAction extends CommonReportAction{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Autowired
	@Qualifier("redemptionServiceImpl")
	RedemptionService service;
	
	
	public void fillReportData()
	{
		setList(service.getAllRedemptions());
	}


	@Override
	public String getReportTemplate() {
		// TODO Auto-generated method stub
		return "redemptions";
	}

}
