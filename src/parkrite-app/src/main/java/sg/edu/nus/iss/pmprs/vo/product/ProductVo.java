package sg.edu.nus.iss.pmprs.vo.product;

import java.util.Date;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;

public class ProductVo extends CommonVo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4161875369775978148L;
	public Integer id;
	public  String name;
	public  String remarks;
	public double price;
	public double priceLocal;
	public Integer quantity;
	public boolean inStock;
	public String productId;
	public String description;
	public String weblink;
	public String fblink;
	
	
	public double sellPriceLocal;
	public double sellPrice;
	
	public double deliveryPrice;
	public double deliveryPriceLocal;
	private String color;
	private String size;
	private String weight;
	
	
	public ProductVo(String name, String remarks, double price,
			double priceLocal, Integer quantity, boolean inStock,
			String productId, String description, String weblink,
			String fblink, double sellPriceLocal, double sellPrice,
			double deliveryPrice, double deliveryPriceLocal, String color,
			String size, String weight) {
		super();
		this.name = name;
		this.remarks = remarks;
		this.price = price;
		this.priceLocal = priceLocal;
		this.quantity = quantity;
		this.inStock = inStock;
		this.productId = productId;
		this.description = description;
		this.weblink = weblink;
		this.fblink = fblink;
		this.sellPriceLocal = sellPriceLocal;
		this.sellPrice = sellPrice;
		this.deliveryPrice = deliveryPrice;
		this.deliveryPriceLocal = deliveryPriceLocal;
		this.color = color;
		this.size = size;
		this.weight = weight;
	}
	public ProductVo() {
		// TODO Auto-generated constructor stub
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
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
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
	public Date getDeliveryDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public Date getArrivalDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDeliveryDate(Date deliveryDate) {
		// TODO Auto-generated method stub
		
	}
	public void setArrivalDate(Date arrivalDate) {
		// TODO Auto-generated method stub
		
	}
	public void setFbLink(String fbLink2) {
		// TODO Auto-generated method stub
		
	}

	
}
