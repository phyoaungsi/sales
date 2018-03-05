package sg.edu.nus.iss.pmprs.web.actions.order;

import java.util.List;

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
		List <SelectedStock> list =(List <SelectedStock> )this.retrieveSession( SessionKeys.STOCK_LIST);
	   
		if(data==null) return SUCCESS;
		if(list!=null && list.size()>0)
		{
			list.addAll(data);
			this.saveSession(SessionKeys.STOCK_LIST, list);
		}
		else
		{
			this.saveSession(SessionKeys.STOCK_LIST, data);
		}
		
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
