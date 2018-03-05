package sg.edu.nus.iss.pmprs.ajax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import sg.edu.nus.iss.pmprs.actions.CommonAction;
import sg.edu.nus.iss.pmprs.ajax.model.ErrorResponse;
import sg.edu.nus.iss.pmprs.mobile.CommonRequest;
import sg.edu.nus.iss.pmprs.mobile.CommonResponse;
import sg.edu.nus.iss.pmprs.service.MobileClientService;
import uk.ltd.getahead.dwr.util.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



 public abstract class JsonServiceAction<T extends CommonRequest,R extends CommonResponse> extends CommonAction {

	/**
	 * 
	 */
	 
	
	 
	private static final long serialVersionUID = 6655317355911191717L;
	Logger logger=Logger.getLogger(this.getClass());
	private String request;
    @SuppressWarnings("unused")
	private Class<T> jsonClass;
    private R model;
    
	@Autowired
	@Qualifier("mobileClientServiceImpl")
	protected MobileClientService service;
	
   public String execute()
   {
	   
	   logger.info("Mobile client Request" +this.getRequest());;
	   try{
	   Gson gson = new GsonBuilder()
	   .setDateFormat("dd MMM yyyy HH:mm:ss").create();
	   @SuppressWarnings("unchecked")
	T requestObj = (T) gson.fromJson(this.getRequest(),getJsonClass());	
	   
	 
	   return executeJson(requestObj);
	   }
	   catch (Exception e){
		   e.printStackTrace();
		  ErrorResponse r=new ErrorResponse();
		   r.setFaultString(e.getLocalizedMessage()+" exception");
		   r.setStatusCode("FAIL");
		   setModel((R)r);
		   return SUCCESS;
		   
	   }
	   
   }
   
   public abstract String executeJson(T requestObj);
	

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	@SuppressWarnings("rawtypes")
	public abstract Class getJsonClass() ;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setJsonClass(Class jsonClass) {
		this.jsonClass = jsonClass;
	}

	/**
	 * @return the model
	 */
	public R getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(R model) {
		this.model = model;
	}

	protected String getLoginUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		return name;
	}
	
	
	

}
