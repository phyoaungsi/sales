package sg.edu.nus.iss.pmprs.web.actions.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.OrderStock;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.OrderStatus;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.ajax.order.SelectedStock;
import sg.edu.nus.iss.pmprs.web.common.SessionKeys;
import sg.edu.nus.iss.pmprs.web.form.OrderForm;
import sg.edu.nus.iss.pmprs.web.utility.ConvertUtils;

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
   @Autowired
	PmprsBookingRepository orderRepo;
   
    @Autowired
	StockRepository stockRepo;
	public String execute() {
		
		List <SelectedStock> list =(List <SelectedStock> )this.retrieveSession( SessionKeys.STOCK_LIST);
		
		Order order=new Order();
		order.setDeliveryDate(getDate(model.getDeliverDate()));
		order.setDiscount(ConvertUtils.getAmount(model.getDiscount()).doubleValue());
		order.setId(newVal);
		order.setInvRef(newVal);
		order.setMember(member);
		order.setOrderStatus(OrderStatus.NEW);
		order.setOrderSubmitDatetime(new Date());
		order.setPaymentDate(paymentDate);
		order.setPaymentStatus(paymentStatus);
		order.setPaymentType(paymentType);
		order.setTotal(total);
		o
		List<OrderStock> items=new ArrayList<>();
		for(SelectedStock s:list){
			OrderStock os=new OrderStock();
		    Product stock=	stockRepo.getOne(Integer.parseInt(s.getId()));
			os.setProduct(stock);
			items.add(os);
			
		}
		order.setItems(items);
		orderRepo.save(order);
		
		this.addActionMessage("So Error Found");
		this.addActionError("No Error Found");
		this.addActionError("yES Error Found");
	return SUCCESS;
	}

	
}
