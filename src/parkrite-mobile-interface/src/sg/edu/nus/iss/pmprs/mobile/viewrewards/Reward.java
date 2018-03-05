package sg.edu.nus.iss.pmprs.mobile.viewrewards;

public class Reward {

	private String id;
	private String type;
	private String amount;
	private String expire;
	private String carparkName;
	private String carParkAddress;
	private Boolean redeemed;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getExpire() {
		return expire;
	}
	public void setExpire(String expire) {
		this.expire = expire;
	}
	
	public String getCarparkName() {
		return carparkName;
	}
	public void setCarparkName(String carparkName) {
		this.carparkName = carparkName;
	}
	public Boolean isRedeemed() {
		return redeemed;
	}
	public void setRedeemed(Boolean isRedeemed) {
		this.redeemed = isRedeemed;
	}
	public Boolean getRedeemed(){
		return redeemed;
	}
	public String getCarParkAddress() {
		return carParkAddress;
	}
	public void setCarParkAddress(String carParkAddress) {
		this.carParkAddress = carParkAddress;
	}
}
