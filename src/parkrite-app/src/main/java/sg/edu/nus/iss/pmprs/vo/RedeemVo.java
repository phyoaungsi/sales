package sg.edu.nus.iss.pmprs.vo;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

public class RedeemVo extends CommonVo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4130892654006530212L;
	private String memberId;
	private String redeemId;
	private double amount;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getRedeemId() {
		return redeemId;
	}
	public void setRedeemId(String redeemId) {
		this.redeemId = redeemId;
	}

}
