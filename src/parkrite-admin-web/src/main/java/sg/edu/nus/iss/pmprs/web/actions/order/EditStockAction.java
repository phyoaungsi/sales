package sg.edu.nus.iss.pmprs.web.actions.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.ajax.CommonAjaxResponse;
import sg.edu.nus.iss.pmprs.web.ajax.order.SelectedStock;
import sg.edu.nus.iss.pmprs.web.common.SessionKeys;

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
		Map<String,Object> session=this.getSession();
		if(session==null)
		{
			session=new HashMap<String,Object>();
		}
		List <SelectedStock> list =(List <SelectedStock> )session.get( SessionKeys.STOCK_LIST.name());
	   
		if(data==null) return SUCCESS;
		if(list!=null && list.size()>0)
		{
			list.addAll(data);
			session.put(SessionKeys.STOCK_LIST.name(), list);
		}
		else
		{
			session.put(SessionKeys.STOCK_LIST.name(), data);
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
}
