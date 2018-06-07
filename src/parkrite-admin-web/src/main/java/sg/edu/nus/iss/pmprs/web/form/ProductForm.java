package sg.edu.nus.iss.pmprs.web.form;

import java.util.ArrayList;
import java.util.List;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import sg.edu.nus.iss.pmprs.core.web.CommonForm;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;
import sg.edu.nus.iss.pmprs.web.utility.Validator;

public class ProductForm extends CommonForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7377976628494356953L;
	//public Map<String,String> carparkOwners;
	private Integer id;
	private  String name;
	private  String remarks;
	private double price;
	private double priceLocal;
	private Integer quantity;
	private double sellPriceLocal;
	private double sellPrice;
	private double deliveryPrice;
	private double deliveryPriceLocal;
	private String color;
	private String size;
	private String weight;
	private String productId;
	private String description;
	private String weblink;
	private String fblink;
	
	@Override
	public void convertFormToDao(CommonForm f) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void convertDaoToFrom(CommonEntity ent) {
		// TODO Auto-generated method stub
		
	}
	

	  List<Order> bookings;

	
	
	
	public List<Order> getBookings() {
		return bookings;
	}
	public void setBookings(List<Order> bookings) {
		this.bookings = bookings;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

//	public String getParkriteCarParkId() {
//		return parkriteCarParkId;
//	}
//	public void setParkriteCarParkId(String parkriteCarParkId) {
//		this.parkriteCarParkId = parkriteCarParkId;
//	}

	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public ProductVo modelToVo() {
	
		ProductVo vo = new ProductVo(getName(), getRemarks(), getPrice(),
				getPriceLocal(), getQuantity(), true,
				getProductId(), getDescription(), getWeblink(),
				getFblink(), getSellPriceLocal(), getSellPrice(),
				getDeliveryPrice(), getDeliveryPriceLocal(), getColor(),
				getSize(), getWeight());
	
		return vo;
	}

	
	public ProductForm convertVoToModel(ProductVo carpark) {
		ProductForm model=this;
		model.setId(carpark.getId());
		
		//PmprsCarParkBookingFees fee=new  PmprsCarParkBookingFees();
		//PmprsBoookingFees bookingFees=new  PmprsBoookingFees();
		//fee.setBookingFees(bookingFees);
		//model.setBookings(List<PmprsBooking>)
		//model.setCarparkBookingFees(carpark.getBookingFee());
		PmprsCarParkOwner owner=new PmprsCarParkOwner();
		
	
		//model.setCarParkOwnerId(int)
		//model.setCarParkOwnerId(Integer)
		
		//model.setFavouriteCarPark(PmprsFavoriteCarPark)
	
		model.setName(carpark.getName());
		;
		model.setRemarks(carpark.getRemarks());
		
		return model;
	}

	
	public void validate(ArrayList<String> errors)
	{

	//	Validator.isPhoneNumber(homeNumber,"Home Number", errors);
		
	//	Validator.isPhoneNumber(mobileNumber,"Mobile Number", errors);
		
		Validator.isEmpty(name, "Name", errors);
	
		Validator.isEmpty(this.weblink, "Weblink", errors);
	
	
	
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPriceLocal() {
		return priceLocal;
	}
	public void setPriceLocal(double priceLocal) {
		this.priceLocal = priceLocal;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getSellPriceLocal() {
		return sellPriceLocal;
	}
	public void setSellPriceLocal(double sellPriceLocal) {
		this.sellPriceLocal = sellPriceLocal;
	}
	public double getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}
	public double getDeliveryPrice() {
		return deliveryPrice;
	}
	public void setDeliveryPrice(double deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}
	public double getDeliveryPriceLocal() {
		return deliveryPriceLocal;
	}
	public void setDeliveryPriceLocal(double deliveryPriceLocal) {
		this.deliveryPriceLocal = deliveryPriceLocal;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getWeblink() {
		return weblink;
	}
	public void setWeblink(String weblink) {
		this.weblink = weblink;
	}
	public String getFblink() {
		return fblink;
	}
	public void setFblink(String fblink) {
		this.fblink = fblink;
	}

}