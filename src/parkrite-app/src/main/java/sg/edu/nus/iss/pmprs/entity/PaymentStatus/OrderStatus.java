package sg.edu.nus.iss.pmprs.entity.PaymentStatus;

public enum OrderStatus {
   NEW("New Order"),CONFIM("Order Confirmed"),PAYMENT_WAITING("Payment Waiting"),DELIVERED("Delivered"),CANCELLED("Cancelled"),
   CLOSED("Closed"),CANCEL_CLOSED("Order cancelled and closed");
   
   private String desc;
   OrderStatus(String desc)
   {
	   this.desc=desc;
   }
   public String getDesc() {
	   return desc;
   }
}
