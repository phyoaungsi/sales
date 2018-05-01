package sg.edu.nus.iss.pmprs.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.dao.ProductRepository;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.OrderStock;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentStatus;
import sg.edu.nus.iss.pmprs.vo.order.OrderVo;


@Service
public class SaleService {

	@Autowired
	PmprsBookingRepository orderRepo;

	@Autowired
	PmprsMemberRepository memberRepo;

	@Autowired
	ProductRepository productRepo;

	public void createNewOrder(OrderVo vo) {
		
		
		
		
		Order order=new Order();
		order.setDeliveryDate(vo.getDeliveryDate());
		order.setDiscount(vo.getDiscount());
		//order.setId(model.get);
		order.setInvRef(vo.getInvRef());
		PmprsMember member=memberRepo.getOne(vo.getMemberId());
	
		order.setMember(member);
		order.setOrderStatus(vo.getOrderStatus());
		order.setOrderSubmitDatetime(new Date());
		order.setPaymentDate(null);
		order.setPaymentStatus(PaymentStatus.NEW);
		order.setPaymentType(vo.getPaymentType());
		order.setTotal(vo.getTotal());
		
		List<OrderStock> items=new ArrayList<>();
		for(OrderVo.SelectedStock s:vo.getItems()){
			OrderStock os=new OrderStock();
			os.setOrder(order);
		    Product stock=	productRepo.getOne(Integer.parseInt(s.getId()));
			os.setProduct(stock);
			os.setQuantity(s.getQty());
			BigDecimal totalPrice=new BigDecimal(s.getQty()*stock.getPrice());
			os.setSalePrice(totalPrice);
			items.add(os);
			
		}
		order.setItems(items);
		orderRepo.save(order);
	}
}
