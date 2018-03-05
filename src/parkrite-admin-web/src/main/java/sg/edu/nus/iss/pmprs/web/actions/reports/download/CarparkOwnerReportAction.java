package sg.edu.nus.iss.pmprs.web.actions.reports.download;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.CarParkOwnerService;
import sg.edu.nus.iss.pmprs.web.actions.reports.CommonReportAction;

@ParentPackage("jasperreports-default")
@Action(value="carparkOwnerReport",results = {
		@Result(name = "success",type="jasper", params = {"location","/WEB-INF/jasper/carparkowners.jasper","dataSource","list","format","PDF","reportParameters","parameters"}),
		@Result(name = "error", location = "/pages/Error.jsp"),

})
public class CarparkOwnerReportAction extends CommonReportAction{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Autowired
	@Qualifier("carParkOwnerServiceImpl")
	CarParkOwnerService service;
	
	
	public void fillReportData()
	{
		setList(service.getAllCarparkOwners());
	}


	@Override
	public String getReportTemplate() {
		// TODO Auto-generated method stub
		return "carparkowners";
	}

}