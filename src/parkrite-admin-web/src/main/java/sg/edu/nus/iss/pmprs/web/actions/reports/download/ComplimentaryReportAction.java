package sg.edu.nus.iss.pmprs.web.actions.reports.download;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import net.sf.jasperreports.engine.JasperCompileManager;
import sg.edu.nus.iss.pmprs.dao.PmprsComplimentaryRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsComplimentary;
import sg.edu.nus.iss.pmprs.service.ComplimentaryService;
import sg.edu.nus.iss.pmprs.vo.ticket.ComplimentaryReportVo;
import sg.edu.nus.iss.pmprs.vo.ticket.ComplimentaryVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.actions.reports.CommonReportAction;


@ParentPackage("jasperreports-default")
@Action(value="complimentaryReport",results = {
		@Result(name = "success",type="jasper", params = {"location","/WEB-INF/jasper/complimentaries.jasper","dataSource","list","format","PDF","reportParameters","parameters"}),
		@Result(name = "error", location = "/pages/Error.jsp"),

})
public class ComplimentaryReportAction extends CommonReportAction{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Autowired
	@Qualifier("complimentaryServiceImpl")
	ComplimentaryService service;
	
	@Autowired
	PmprsComplimentaryRepository complimentaryRepository;
	
	public void fillReportData()
	{
	//	setList(service.getAllComplimentaries());
		
		List<PmprsComplimentary> complimentaries = complimentaryRepository.findAll();
		List<ComplimentaryReportVo> vos = new ArrayList<ComplimentaryReportVo>();
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		for (PmprsComplimentary c : complimentaries) {
			ComplimentaryReportVo vo = new ComplimentaryReportVo();
			
			vo.setCarParkId(c.getCarParkId());
			vo.setFromDate(df.format(c.getFromDate()));
			vo.setIuNumber(c.getIuNumber());
			vo.setMemberId(c.getUserEmail());
			vo.setReasonId(c.getReasonId());
			vo.setRemarks(c.getRemarks());
			vo.setToDate(df.format(c.getToDate()));
			vo.setUserEmail(c.getUserEmail());
			vo.setVehiclePlateNumber(c.getVehiclePlateNumber());
			vo.setStatus("Pending");
		    if( c.getToDate().before(new Date())){
		    	vo.setStatus("Expired");
		    };
			vos.add(vo);
		}

		setList( vos);
	}


	@Override
	public String getReportTemplate() {
		// TODO Auto-generated method stub
		return "complimentaries";
	}

}
