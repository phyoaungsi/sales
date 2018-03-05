package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentStatus;

@Entity
@Table(name = "pmprs_payment" )
public class PmprsPayment extends CommonEntity   implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4941555979371161956L;
	@Column(name="payment_ref")
	private String paymentRefNumber;
	@ManyToOne
	@JoinColumn(name="booking_id")
	private Order order;
	
	@Column(name="payment_amount")
	private float paymentAmount;
	@Column(name="payment_status")
	private  PaymentStatus status;
	@Column(name="payment_date")
	private Date paymentDate;
	@Column(name="payment_method")
	private PaymentMethod paymentMethod;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order booking) {
		this.order = booking;
	}
	public float getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public PaymentStatus getStatus() {
		return status;
	}
	public void setStatus(PaymentStatus status) {
		this.status = status;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentRefNumber() {
		return paymentRefNumber;
	}
	public void setPaymentRefNumber(String paymentRefNumber) {
		this.paymentRefNumber = paymentRefNumber;
	}

}
