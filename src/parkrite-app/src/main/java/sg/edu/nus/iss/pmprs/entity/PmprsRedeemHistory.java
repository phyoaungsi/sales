package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

@Entity
@Table(name = "pmprs_redeemhistory" )
public class PmprsRedeemHistory  extends CommonEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7438527961352599864L;

	@Column(name="redemption_id")
	private Integer redeemId;
	
	@Column(name="member_id")
	private Integer memberId;
	
	@Column(name="redeem_amount")
	private double redeemAmount ;

	public Integer getRedeemId() {
		return redeemId;
	}

	public void setRedeemId(Integer redeemId) {
		this.redeemId = redeemId;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public double getRedeemAmount() {
		return redeemAmount;
	}

	public void setRedeemAmount(double redeemAmount) {
		this.redeemAmount = redeemAmount;
	}
	
	
	
	
}
