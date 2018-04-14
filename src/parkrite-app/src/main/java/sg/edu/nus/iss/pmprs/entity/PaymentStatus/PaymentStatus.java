package sg.edu.nus.iss.pmprs.entity.PaymentStatus;

public enum PaymentStatus {

	NEW("New"),PENDING("Payment Wating"),RECEIVED("Payment Received"), REFUND("Refund to Customer");
	
	private String desc;
	PaymentStatus(String desc)
	{
		this.desc=desc;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
}
