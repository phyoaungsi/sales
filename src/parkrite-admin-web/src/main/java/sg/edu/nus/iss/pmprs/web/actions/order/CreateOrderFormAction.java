package sg.edu.nus.iss.pmprs.web.actions.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.common.StringUtil;
import sg.edu.nus.iss.pmprs.web.form.OrderForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(
		value="createOrderForm", 
	    	results={@Result(name="success", location="/content/order/order.jsp")}
		)

public class CreateOrderFormAction  extends CommonAction implements
ScopedModelDriven<OrderForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 936404989499318420L;
	OrderForm form;
	@Override
	public OrderForm getModel() {
		// TODO Auto-generated method stub
		return form;
	}

	@Override
	public void setModel(OrderForm model) {
		// TODO Auto-generated method stub
		this.form=model;
	}

	@Autowired 
	StockRepository carparkRepository;
	
	@Autowired 
	PmprsMemberRepository memberRepository;;
	
	public String execute() {
	
		List<Product> products=carparkRepository.findAll();
		List<PmprsMember> memberList=memberRepository.findAll();
		Map<String, String> selectUsers=new HashMap<String,String>();
		for(PmprsMember member:memberList)
		{
			selectUsers.put(member.getId().toString(), member.getName());
		}
		form.setInvRef(StringUtil.getInvRef());
		form.setSelectUsers(selectUsers);
	    this.getModel().setStocks(products);
	    return SUCCESS;
	}
}
