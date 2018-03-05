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
