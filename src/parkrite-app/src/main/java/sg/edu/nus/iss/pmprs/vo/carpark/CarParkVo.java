package sg.edu.nus.iss.pmprs.vo.carpark;

import java.util.List;

import javax.persistence.Column;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.SalePrice;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.entity.PmprsFavoriteCarPark;
import sg.edu.nus.iss.pmprs.entity.PmprsParkingSlot;

public class CarParkVo extends CommonVo {
	
	public Integer id;
	public double bookingFee;
	public double minimumHourFee;
	public String getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}
	public String getCarparkName() {
		return carparkName;
	}
	public void setCarparkName(String carparkName) {
		this.carparkName = carparkName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String carparkId;
	public String carparkName;
	public String companyName;
	
	
	 String address;
	  List<Order> bookings;
	  SalePrice carparkBookingFees;
	  PmprsCarParkOwner carParkOwner;
	  Integer carParkOwnerId;
	  String contactNo;
	
	  double lattitude;
      double 	longitude;
	  String ltaMerchantId;
	  String name;
	  String netsMerchantId;
	  Integer parkingSlot;
	 // String parkriteCarParkId;
	  String postalCode;
	  String remarks;
	  String supervisorName;
	  

	 private double bookingfees;
	private double minimumHour;
//	private double minimumHourFees;
	  
	  
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Order> getBookings() {
		return bookings;
	}
	public void setBookings(List<Order> bookings) {
		this.bookings = bookings;
	}
	public SalePrice getCarparkBookingFees() {
		return carparkBookingFees;
	}
	public void setCarparkBookingFees(SalePrice carparkBookingFees) {
		this.carparkBookingFees = carparkBookingFees;
	}
	public PmprsCarParkOwner getCarParkOwner() {
		return carParkOwner;
	}
	public void setCarParkOwner(PmprsCarParkOwner carParkOwner) {
		this.carParkOwner = carParkOwner;
	}
	public Integer getCarParkOwnerId() {
		return carParkOwnerId;
	}
	public void setCarParkOwnerId(Integer carParkOwnerId) {
		this.carParkOwnerId = carParkOwnerId;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public double getLattitude() {
		return lattitude;
	}
	public void setLattitude(double lattitude) {
		this.lattitude = lattitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getLtaMerchantId() {
		return ltaMerchantId;
	}
	public void setLtaMerchantId(String ltaMerchantId) {
		this.ltaMerchantId = ltaMerchantId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNetsMerchantId() {
		return netsMerchantId;
	}
	public void setNetsMerchantId(String netsMerchantId) {
		this.netsMerchantId = netsMerchantId;
	}
	public Integer getParkingSlot() {
		return parkingSlot;
	}
	public void setParkingSlot(Integer parkingSlot) {
		this.parkingSlot = parkingSlot;
	}
//	public String getParkriteCarParkId() {
//		return parkriteCarParkId;
//	}
//	public void setParkriteCarParkId(String parkriteCarParkId) {
//		this.parkriteCarParkId = parkriteCarParkId;
//	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public double getBookingfees() {
		return bookingfees;
	}
	public void setBookingfees(double bookingfees) {
		this.bookingfees = bookingfees;
	}
	public double getMinimumHour() {
		return minimumHour;
	}
	public void setMinimumHour(double minimumHour) {
		this.minimumHour = minimumHour;
	}
//	public double getMinimumHourFees() {
//		return minimumHourFees;
//	}
//	public void setMinimumHourFees(double minimumHourFees) {
//		this.minimumHourFees = minimumHourFees;
//	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getBookingFee() {
		return bookingFee;
	}
	public void setBookingFee(double bookingFee) {
		this.bookingFee = bookingFee;
	}
	public double getMinimumHourFee() {
		return minimumHourFee;
	}
	public void setMinimumHourFee(double minimumHourFee) {
		this.minimumHourFee = minimumHourFee;
	}

}
