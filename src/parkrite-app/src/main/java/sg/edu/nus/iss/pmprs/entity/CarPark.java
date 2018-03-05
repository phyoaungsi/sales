package sg.edu.nus.iss.pmprs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

@Entity
@Table(name = "CARPARK" )
public class CarPark extends CommonEntity {
	@Column
	private String carparkId;
	@Column
	private String companyName;
	@Column
	private String carparkName;
	@Column
	private int  totalSlot;
	@Column
	private String occupiedSlot;
	public String getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCarparkName() {
		return carparkName;
	}
	public void setCarparkName(String carparkName) {
		this.carparkName = carparkName;
	}
	public int getTotalSlot() {
		return totalSlot;
	}
	public void setTotalSlot(int totalSlot) {
		this.totalSlot = totalSlot;
	}
	public String getOccupiedSlot() {
		return occupiedSlot;
	}
	public void setOccupiedSlot(String occupiedSlot) {
		this.occupiedSlot = occupiedSlot;
	}

}
