package sg.edu.nus.iss.pmprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

@Entity
@Table(name = "BOOKING" )
public class BookCarPark extends CommonEntity  {
	
	
	public String getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}
	public String getPlateId() {
		return plateId;
	}
	public void setPlateId(String plateId) {
		this.plateId = plateId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBookinRefId() {
		return bookinRefId;
	}
	public void setBookinRefId(String bookinRefId) {
		this.bookinRefId = bookinRefId;
	}
	 @Column
	private String carparkId;
	 @Column
	private String plateId;
	 @Column
	private String userId;
	 @Column
	private String bookinRefId;
	 @Column
   private String bookinStatus;
	public String getBookinStatus() {
		return bookinStatus;
	}
	public void setBookinStatus(String bookinStatus) {
		this.bookinStatus = bookinStatus;
	}
	
	

}
