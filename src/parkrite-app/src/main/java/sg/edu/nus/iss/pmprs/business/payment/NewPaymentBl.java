package sg.edu.nus.iss.pmprs.business.payment;

import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.business.inbox.InboxMessageBl;
import sg.edu.nus.iss.pmprs.core.amazon.mq.QueueMessageSender;
import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.paypal.TransactionVerifiable;
import sg.edu.nus.iss.pmprs.core.paypal.TrxStatus;
import sg.edu.nus.iss.pmprs.core.paypal.VerifiyPaypalTrx;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsInboxMessageRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsPaymentRepository;
import sg.edu.nus.iss.pmprs.dao.ProductRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsVehicleRepository;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.PmprsPayment;
import sg.edu.nus.iss.pmprs.entity.PmprsBoookingFees;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PmprsMemberVehicle;
import sg.edu.nus.iss.pmprs.mobile.booking.PaymentResponse;
import sg.edu.nus.iss.pmprs.utils.DateUtils;
import sg.edu.nus.iss.pmprs.vo.booking.PaymentVo;


@Component
public class NewPaymentBl extends BusinessLogic<sg.edu.nus.iss.pmprs.mobile.booking.PaymentResponse> {

	@Autowired PmprsPaymentRepository paymentRepository;
	@Autowired ProductRepository carparkRepository;
	@Autowired PmprsVehicleRepository memberVehicleRepository;
	@Autowired PmprsInboxMessageRepository inboxRepository;
	@Autowired InboxMessageBl inbox;
	@Autowired PmprsBookingRepository bookingDao;
	private Order booking;
	@Override
	protected void execute(CommonVo vo) {
	    // TODO Auto-generated method stub
		
	   PaymentVo bvo=(PaymentVo) vo;
	   PmprsPayment payment=new PmprsPayment();
	   booking= bookingDao.findByInvRef(bvo.getRequest().getBookingRefId());
	   
	  // payment.setOrder(booking);
	   payment.setPaymentAmount(bvo.getRequest().getBookingFee());
	   payment.setPaymentDate(new Date());
	   payment.setPaymentRefNumber(bvo.getRequest().getPaymentRefId());
	   paymentRepository.save(payment);
//	   TransactionVerifiable verify=new VerifiyPaypalTrx();
//	   TrxStatus s= verify.checkTransaction("AAA");
	   
		try{
		QueueMessageSender sender=new QueueMessageSender();
    	sender.setQueueId("CARPARK_QUEUE");
    	sender.send(booking);
		}catch(Exception e)
		{
			logger.error("Queue connection is not successful",e);
		}
		
	  // booking.setStatusId(3);
	   
	   
	   bookingDao.save(booking);
	  
	  String message="Your booking for carpark:"+booking.getInvRef()+" has been confirmed";
	 //  inbox.createMessage("Booking Confirm", message, booking.getMemberVehicle().getMember().getId());
	   PaymentResponse result1=new PaymentResponse();
	   result1.setStatusCode("SUCCESS");
	   result1.setStatusMessage("Payment Success");
	   setResult(result1);
      
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
        
	}
	
}
