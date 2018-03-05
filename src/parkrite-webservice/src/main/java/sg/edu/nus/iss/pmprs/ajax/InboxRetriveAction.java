package sg.edu.nus.iss.pmprs.ajax;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ModelDriven;

import sg.edu.nus.iss.pmprs.entity.PmprsInboxMessage;
import sg.edu.nus.iss.pmprs.mobile.inbox.InboxRequest;
import sg.edu.nus.iss.pmprs.mobile.inbox.InboxResponse;
import sg.edu.nus.iss.pmprs.mobile.inbox.Message;
import uk.ltd.getahead.dwr.util.Logger;

public class InboxRetriveAction extends JsonServiceAction<InboxRequest,InboxResponse> implements ModelDriven<InboxResponse>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3376703050022097658L;
	Logger logger=Logger.getLogger(this.getClass());
	@Override
	public String executeJson(InboxRequest requestObj) {
	
		//String name = getLoginUser();
		String name=(String)this.getSession().get("LOGIN_USER");
		logger.info("Login user id:"+name+" Sessiong ID"+ServletActionContext.getRequest().getSession().getId());
		List<PmprsInboxMessage> messages=service.getInboxMessage(name);
		InboxResponse response =new InboxResponse();
		List<Message> messageList=new ArrayList<Message>();
		for(PmprsInboxMessage inboxMessage:messages)
		{
			Message m=new Message();
			m.setMessage(inboxMessage.getMessage());
			m.setMessageId(inboxMessage.getId().toString());
			m.setTitle(inboxMessage.getTitle());
			messageList.add(m);
		}
		response.setMessages(messageList);
        response.setStatusCode(SUCCESS);
        setModel(response);
		return SUCCESS;
	}

	@SuppressWarnings("rawtypes")
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return InboxRequest.class;
	}

}
