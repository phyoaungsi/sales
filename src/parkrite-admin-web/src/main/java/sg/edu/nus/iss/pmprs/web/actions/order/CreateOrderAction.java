package sg.edu.nus.iss.pmprs.web.actions.order;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.ajax.order.SelectedStock;
import sg.edu.nus.iss.pmprs.web.common.SessionKeys;
import sg.edu.nus.iss.pmprs.web.form.OrderForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
@Action(
		value="createOrder", 
	    	results={@Result(name="success", location="/content/order/orderView.jsp")}
		)
public class CreateOrderAction  extends CommonAction implements ScopedModelDriven<OrderForm>  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6365436986570858068L;
    private OrderForm model;
	@Override
	public OrderForm getModel() {
		// TODO Auto-generated method stub
		return model ;
	}

	@Override
	public void setModel(OrderForm model) {
		// TODO Auto-generated method stub
		this.model=model;
	}

	public String execute() {
		
		List <SelectedStock> list =(List <SelectedStock> )this.retrieveSession( SessionKeys.STOCK_LIST);
		this.addActionMessage("So Error Found");
		this.addActionError("No Error Found");
		this.addActionError("yES Error Found");
	return SUCCESS;
	}
}
