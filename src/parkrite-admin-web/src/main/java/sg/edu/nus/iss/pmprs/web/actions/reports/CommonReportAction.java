package sg.edu.nus.iss.pmprs.web.actions.reports;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;

import org.apache.struts2.ServletActionContext;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.utility.ParkriteProperties;

public abstract class CommonReportAction extends CommonAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2691721523682580384L;
    
	
	private Map parameters=new HashMap();
	public String execute() {
		if (getReportTemplate() == null)
			throw new RuntimeException("Please set the report template name");
		fillReportData();
		//String base=ParkriteProperties.getTemplateBasePath();
		String templatePath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/jasper/" + getReportTemplate()+ ".jrxml");
		String binaryPath = ServletActionContext.getServletContext().getRealPath("/WEB-INF/jasper/" + getReportTemplate()+ ".jasper");
//		if(base!=null)
//		{
//			templatePath=base+"/"+ getReportTemplate()+ ".jrxml";
//			binaryPath=base+"/"+ getReportTemplate()+ ".jasper";
//		}
		try {
			
			JasperCompileManager.compileReportToFile(
					templatePath,
					binaryPath);
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

	public abstract void fillReportData();

	public abstract String getReportTemplate();
	protected List list;
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}

	public Map getParameters() {
		return parameters;
	}

	public void setParameters(Map parameters) {
		this.parameters = parameters;
	}
}
