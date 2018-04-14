package sg.edu.nus.iss.pmprs.entity.PaymentStatus;

public enum PaymentType {
    BANK_ACC("Transfer to Bank Acc"),PHONE_BILL("By Phone Bill"),CASH_ON_DELI("Cash on Delivery"),CASH("Cash");
    
    
    private String desc;
	PaymentType(String desc)
	{
		this.desc=desc;
	}
	
	public String getDesc() {
		return this.desc;
	}
}
