package sg.edu.nus.iss.pmprs.web.actions.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.ajax.CommonAjaxResponse;
import sg.edu.nus.iss.pmprs.web.ajax.order.SelectedStock;
import sg.edu.nus.iss.pmprs.web.common.SessionKeys;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class EditStockAction extends CommonAction  implements ModelDriven<CommonAjaxResponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5243558289627358186L;
	  private List <SelectedStock> data;
	private CommonAjaxResponse response;
	public String addStock()
	{
		
		session = ActionContext.getContext().getSession();
		if(session==null)
		{
			session=new HashMap<String,Object>();
		}
		Map <String,SelectedStock> list =(Map <String,SelectedStock> )session.get( SessionKeys.STOCK_LIST.name());
	   
		if(data==null) return SUCCESS;
		if(list!=null && list.size()>0)
		{
			for(SelectedStock s:data){
				if(list.containsKey(s.getId())){
					SelectedStock stk=list.get(s.getId());
					int qty=stk.getQty()+1;
				     stk.setQty(qty);
					
				}
				else
				{
					list.put(s.getId(), s);
				}
			}
			
			session.put(SessionKeys.STOCK_LIST.name(), list);
		}
		else
		{
			 list =new HashMap<String,SelectedStock> ();
			for(SelectedStock s:data){
				if(list.containsKey(s.getId())){
					SelectedStock stk=list.get(s.getId());
					int qty=stk.getQty()+1;
				     stk.setQty(qty);
					
				}
				else
				{
					list.put(s.getId(), s);
				}
			}
			session.put(SessionKeys.STOCK_LIST.name(), list);
		}
	    setSession(session);
		this.response=new CommonAjaxResponse();
		response.setStatus("NO_STATUS");
		return SUCCESS;
	}

	public List <SelectedStock> getData() {
		return data;
	}

	public void setData(List <SelectedStock> data) {
		this.data = data;
	}

	@Override
	public CommonAjaxResponse getModel() {
		// TODO Auto-generated method stub
		return response;
	}
	Map<String, Object> session;

	
	
	
	
}
