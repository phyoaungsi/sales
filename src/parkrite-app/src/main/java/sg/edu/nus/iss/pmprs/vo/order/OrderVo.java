package sg.edu.nus.iss.pmprs.vo.order;

import java.util.List;

import sg.edu.nus.iss.pmprs.entity.OrderStock;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.OrderStatus;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentStatus;
import sg.edu.nus.iss.pmprs.entity.PaymentStatus.PaymentType;

public class OrderVo {

	private OrderStatus orderStatus;

	private PaymentType paymentType;

	private PaymentStatus paymentStatus;

	private double total;

	private double discount;

	private java.util.Date deliveryDate;

	private java.util.Date orderSubmitDatetime;

	private java.util.Date paymentDate;

	

	private String invRef;

	private List<OrderVo.SelectedStock> items;

	private Integer memberId;

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus status) {
		this.orderStatus = status;
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

	public List<OrderVo.SelectedStock> getItems() {
		return items;
	}

	public void setItems(List<OrderVo.SelectedStock> items) {
		this.items = items;
	}

	public String getInvRef() {
		return invRef;
	}

	public void setInvRef(String newVal) {
		invRef = newVal;
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

	public Integer getMemberId() {
		// TODO Auto-generated method stub
		return memberId;
	}

	public class SelectedStock {

		private String id;
		private String name;
		private double price;
		private int qty;

		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getQty() {
			return qty;
		}
		public void setQty(int qty) {
			this.qty = qty;
		}
	}

}
