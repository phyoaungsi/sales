package sg.edu.nus.iss.pmprs.web.actions.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.OrderStock;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.OrderStatus;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentStatus;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentType;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.ajax.order.SelectedStock;
import sg.edu.nus.iss.pmprs.web.common.SessionKeys;
import sg.edu.nus.iss.pmprs.web.form.OrderForm;
import sg.edu.nus.iss.pmprs.web.utility.ConvertUtils;

import com.google.gson.Gson;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
@Action(
		value="createOrder", 
	    	results={@Result(name="success", location="/content/order/orderView.jsp")}
		)
public class CreateOrderAction  extends CommonAction implements ScopedModelDriven<OrderForm>,SessionAware  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6365436986570858068L;
    private OrderForm model;
    Gson gson;
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
   @Autowired
	PmprsBookingRepository orderRepo;
   
   @Autowired
  	PmprsMemberRepository memberRepo;
    @Autowired
	StockRepository stockRepo;
	public String execute() {
		
		List <SelectedStock> list =(List <SelectedStock> )getSession().get( SessionKeys.STOCK_LIST.name());
		
		Order order=new Order();
		order.setDeliveryDate(ConvertUtils.getDate(model.getDeliverDate()));
		order.setDiscount(ConvertUtils.getAmount(model.getDiscount(),this,"discount").doubleValue());
		//order.setId(model.get);
		PmprsMember member=memberRepo.getOne(model.getSelectedUser());
		order.setInvRef("");
		order.setMember(member);
		order.setOrderStatus(OrderStatus.valueOf(model.getOrderStatus()));
		order.setOrderSubmitDatetime(new Date());
		order.setPaymentDate(null);
		order.setPaymentStatus(PaymentStatus.NEW);
		order.setPaymentType(PaymentType.valueOf(model.getPaymentType()));
		order.setTotal(ConvertUtils.getAmount(model.getTotal(),this,"total").doubleValue());
		
		List<OrderStock> items=new ArrayList<>();
		for(SelectedStock s:list){
			OrderStock os=new OrderStock();
		    Product stock=	stockRepo.getOne(Integer.parseInt(s.getId()));
			os.setProduct(stock);
			items.add(os);
			
		}
		order.setItems(items);
		orderRepo.save(order);
		gson=new Gson();
		this.addActionMessage(getText("create.order.success"));
	    this.getModel().setJsonString(gson.toJson(list));
	return SUCCESS;
	}


	
}
