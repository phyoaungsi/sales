package sg.edu.nus.iss.pmprs.web.actions.reports.download;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

@ParentPackage("jasperreports-default")
@Action(value="bookingDetailReport",results = {
		@Result(name = "success",type="jasper", params = {"location","/WEB-INF/jasper/bookingdetails.jasper","dataSource","list","format","PDF","reportParameters","parameters"}),
		@Result(name = "error", location = "/pages/Error.jsp"),

})
public class BookingDetailReportAction {

}
