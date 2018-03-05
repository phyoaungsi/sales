
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.entity.PmprsReason;
/**
 * PmprsRedemption is a mapping of pmprs_redemption Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_redemption" )
public class PmprsRedemption extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 504668651739251929L;	
    
	
    @Column(name="remarks")
	private String remarks;
    @Column(name="reason_id")
	private Integer reasonId;
    @Column(name="to_date")
	private java.util.Date toDate;
    @Column(name="from_date")
	private java.util.Date fromDate;
   
    @ManyToOne(fetch = FetchType.EAGER)
   	@JoinColumn(name = "car_park_id")
   	private Product carPark;
//	@Column(name = "car_park_id")
 //   private Integer carParkId;
    @Column(name="iu_number")
	private String iuNumber;
    @Column(name="vehicle_plate_number")
	private String vehiclePlateNumber;
    @Column(name="user_eamil")
	private String userEamil;
    @Column(name="member_id")
	private Integer memberId;
    @Column(name="amount")
	private double amount;
	
    @Column(name="redeemed")
   	private boolean redeemed;
    
    public double getAmount() {
		return amount;
	}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           	
	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public Integer getReasonId() {
		return reasonId;
	}


	public void setReasonId(Integer reasonId) {
		this.reasonId = reasonId;
	}


	public java.util.Date getToDate() {
		return toDate;
	}


	public void setToDate(java.util.Date toDate) {
		this.toDate = toDate;
	}


	public java.util.Date getFromDate() {
		return fromDate;
	}


	public void setFromDate(java.util.Date fromDate) {
		this.fromDate = fromDate;
	}





	public String getIuNumber() {
		return iuNumber;
	}


	public void setIuNumber(String iuNumber) {
		this.iuNumber = iuNumber;
	}


	public String getVehiclePlateNumber() {
		return vehiclePlateNumber;
	}


	public void setVehiclePlateNumber(String vehiclePlateNumber) {
		this.vehiclePlateNumber = vehiclePlateNumber;
	}


	public String getUserEamil() {
		return userEamil;
	}


	public void setUserEamil(String userEamil) {
		this.userEamil = userEamil;
	}


	public Integer getMemberId() {
		return memberId;
	}


	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}


	public boolean isRedeemed() {
		return redeemed;
	}


	public void setRedeemed(boolean redeemed) {
		this.redeemed = redeemed;
	}


//	public Integer getCarParkId() {
//		return carParkId;
//	}
//
//
//	public void setCarParkId(Integer carParkId) {
//		this.carParkId = carParkId;
//	}


	public Product getCarPark() {
		return carPark;
	}


	public void setCarPark(Product carPark) {
		this.carPark = carPark;
	}


	




}
