package sg.edu.iss.nus.parkrite.service.sales;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.OrderStatus;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentStatus;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentType;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
@Transactional
@ContextConfiguration(locations = { "/META-INF/applicationContext.xml" })
public class CreateNewSaleTest {

	
	
	 @Autowired
	PmprsBookingRepository orderRepo;
	 
	 @Autowired
	 PmprsMemberRepository memberRepo;
	 @Test
	 public void createData()
	 {
		 
		 
	
		     try {
				Class.forName("com.mysql.jdbc.Driver" );
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		Order order=new Order();
		order.setId(2);
		order.setCreatedTime(new Date());
		order.setDeliveryDate(new Date());
		order.setDiscount(6.00);
		order.setInvRef("INV0001");
		PmprsMember m=memberRepo.getOne(1);
		order.setMember(m);
		//order.setItems(items);
		order.setOrderStatus(OrderStatus.NEW);
		order.setOrderSubmitDatetime(new Date());
		order.setPaymentDate(new Date());
		order.setPaymentStatus(PaymentStatus.NEW);
		order.setPaymentType(PaymentType.BANK_ACC);
		order.setTotal(90.00);
		order.setTxnRef("899098");
		orderRepo.save(order); 
		 
	 }
}
