package sg.edu.nus.iss.pmprs.web.ajax;


import java.util.UUID;

import sg.edu.nus.iss.pmprs.service.BookingService;
import com.opensymphony.xwork2.Action;

public class HelloAction {

	private String message; 
	private String version; 
	public String execute()
	{
	 this.setMessage("hello");
	 this.setVersion("parkrite v0.1");
	 BookingService bs=new BookingService();
	 try {
		//bs.book("BookingID:"+UUID.randomUUID().toString());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return Action.SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
