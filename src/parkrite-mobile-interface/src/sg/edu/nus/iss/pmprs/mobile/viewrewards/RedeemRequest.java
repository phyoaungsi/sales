package sg.edu.nus.iss.pmprs.mobile.viewrewards;

import sg.edu.nus.iss.pmprs.mobile.CommonRequest;

public class RedeemRequest extends CommonRequest{
	private static final long serialVersionUID = -4130892654006530212L;
	public static String REQUEST_URL = "/redeem/redeem.do";
	private Integer memberId;
	private String redeemId;
	private String iUnumber;
	private double amount;
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getiUnumber() {
		return iUnumber;
	}
	public void setiUnumber(String iUnumber) {
		this.iUnumber = iUnumber;
	}
	public String getRedeemId() {
		return redeemId;
	}
	public void setRedeemId(String redeemId) {
		this.redeemId = redeemId;
	}

}
