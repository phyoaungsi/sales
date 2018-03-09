
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.entity.PmprsBoookingFees;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsMemberVehicle;
import sg.edu.nus.iss.pmprs.entity.PmprsUserstatus;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentStatus;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentType;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.OrderStatus;
/**
 * PmprsBooking is a mapping of pmprs_booking Table.
 * @author phyo
*/
@Entity
@Table(name = "order" )
public class Order extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 471618974520667480L;	
    
	@Enumerated(EnumType.STRING)
    @Column(name="order_staus")
	private OrderStatus orderStatus;

	@Enumerated(EnumType.STRING)
    @Column(name="payment_type")
	private PaymentType paymentType;

	@Enumerated(EnumType.STRING)
    @Column(name="payment_status")
	private PaymentStatus paymentStatus;
	
    @Column(name="total")
	private double total;
    
    @Column(name="discount")
  	private double discount;
    
    @Column(name="delivery_date")
	private java.util.Date deliveryDate;
    
    
    @Column(name="order_submit_datetime")
	private java.util.Date orderSubmitDatetime;
    
  
    @Column(name="payment_date")
	private java.util.Date paymentDate;
    
    @OneToOne
    @JoinColumn(name="member_id")
	private PmprsMember member;
    
    @Column(name="invoice_ref_number")
	private String invRef;
    
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "order")
	private List<OrderStock> items;
	
    /**
     * Prefered methods to create a PmprsBooking is via the createPmprsBooking method in PmprsBookingManager or
     * via the factory class PmprsBookingFactory create method
     */
    public Order()
    {
    }

	







  

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(OrderStatus status) {
		this.orderStatus=status;
	}



















	public PaymentType getPaymentType() {
		return paymentType;
	}











	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}











	public double getTotal() {
		return total;
	}











	public void setTotal(double total) {
		this.total = total;
	}











	public java.util.Date getDeliveryDate() {
		return deliveryDate;
	}











	public void setDeliveryDate(java.util.Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}











	public java.util.Date getOrderSubmitDatetime() {
		return orderSubmitDatetime;
	}











	public void setOrderSubmitDatetime(java.util.Date orderSubmitDatetime) {
		this.orderSubmitDatetime = orderSubmitDatetime;
	}











	public List<OrderStock> getItems() {
		return items;
	}











	public void setItems(List<OrderStock> items) {
		this.items = items;
	}











	public String getInvRef()
    {
        return invRef;
    }
	
 
   public void setInvRef(String newVal)
    {
        invRef = newVal;
    }



public PmprsMember getMember() {
	return member;
}


public void setMember(PmprsMember member) {
	this.member = member;
}











public PaymentStatus getPaymentStatus() {
	return paymentStatus;
}











public void setPaymentStatus(PaymentStatus paymentStatus) {
	this.paymentStatus = paymentStatus;
}











public double getDiscount() {
	return discount;
}











public void setDiscount(double discount) {
	this.discount = discount;
}











public java.util.Date getPaymentDate() {
	return paymentDate;
}











public void setPaymentDate(java.util.Date paymentDate) {
	this.paymentDate = paymentDate;
}





	
    



}
