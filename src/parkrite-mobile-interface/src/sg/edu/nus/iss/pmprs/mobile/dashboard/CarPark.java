package sg.edu.nus.iss.pmprs.mobile.dashboard;

public class CarPark {
	
	public String carparkId;
	public int totalSlot;
	public int occupied;
	public String name;
	public String address;
	public String postalCode;
	public float lattitude;
	public float longitude;
	
	public String getCarparkId() {
		return carparkId;
	}
	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public int getTotalSlot() {
		return totalSlot;
	}
	public void setTotalSlot(int totalSlot) {
		this.totalSlot = totalSlot;
	}
	public int getOccupied() {
		return occupied;
	}
	public void setOccupied(int occupied) {
		this.occupied = occupied;
	}
	private float bookingFees;
	private float minOccupyFees;
	private float minHour;

	public float getBookingFees() {
		return bookingFees;
	}
	public void setBookingFees(float bookingFees) {
		this.bookingFees = bookingFees;
	}
	public float getMinOccupyFees() {
		return minOccupyFees;
	}
	public void setMinOccupyFees(float minOccupyFees) {
		this.minOccupyFees = minOccupyFees;
	}
	public float getMinHour() {
		return minHour;
	}
	public void setMinHour(float minHour) {
		this.minHour = minHour;
	}
	

}
