
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;		
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.SalePrice;
import sg.edu.nus.iss.pmprs.entity.PmprsFavoriteCarPark;
import sg.edu.nus.iss.pmprs.entity.PmprsParkingSlot;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
/**
 * PmprsCarPark is a mapping of pmprs_car_park Table.
 * @author phyo
*/
@Entity
@Table(name = "stock" )
public class Product extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 519541004984376378L;	
    
	
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product",orphanRemoval=true,cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private List<OrderStock> orders;
    
  
    
    /*
    @OneToOne(mappedBy="carPark")
    private PmprsParkingSlot parkingSlot;
    @OneToOne
    @JoinColumn(name="car_park_id")
	private PmprsFavoriteCarPark favouriteCarPark;
    */
	

    @Column(name="remarks")
	private String remarks;

    @Column(name="name")
	private String name;
    @Column(name="description")
  	private String description;
    @Column(name="stockId")
	private String stockId;
    
    @Column(name="fblink")
	private String fbLink;
    
    @Column(name="weblink")
  	private String webLink;
    
    @Column(name="price")
 	private double price;
    
    @Column(name="priceLocal")
 	private double priceLocal;

    @Column(name="quantity")
	private Integer quantity;

    
    @Column(name="inStock")
  	private Boolean inStock;

    
    @Column(name="ETA")
  	private Date arrivalDate;
    
    @Column(name="ETD")
  	private Date deliveryDate;
    
    @Column(name="salePrice")
  	private double salePrice;
    
    @Column(name="exchangeRate")
  	private double exchangeRate;


    @Column(name="deliveryPriceLocal")
	private double deliveryPriceLocal;


    @Column(name="color")
	private String color;


    @Column(name="weight")
	private String weight;


    @Column(name="size")
	private String size;


    @Column(name="sellPriceLocal")
	private double sellPriceLocal;


    @Column(name="sellPrice")
	private double sellPrice;


    @Column(name="deliveryPrice")
	private double deliveryPrice;
    
    
	public Date getArrivalDate() {
		return arrivalDate;
	}





	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}





	public Date getDeliveryDate() {
		return deliveryDate;
	}





	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}





	/**
     * Prefered methods to create a PmprsCarPark is via the createPmprsCarPark method in PmprsCarParkManager or
     * via the factory class PmprsCarParkFactory create method
     */
    public Product()
    {
    }

	



	public String getRemarks()
    {
        return remarks;
    }
	
 
   public void setRemarks(String newVal)
    {
        remarks = newVal;
    }










	public String getName()
    {
        return name;
    }
	
 
   public void setName(String newVal)
    {
        name = newVal;
    }












	
    public List<OrderStock> getOrderStock() {
	return orders;
}


public void setOrderStock(List<OrderStock> bookings) {
	this.orders = bookings;
}





public String getDescription() {
	return description;
}





public void setDescription(String description) {
	this.description = description;
}





public String getStockId() {
	return stockId;
}





public void setStockId(String productId) {
	this.stockId = productId;
}





public String getFbLink() {
	return fbLink;
}





public void setFbLink(String fbLink) {
	this.fbLink = fbLink;
}





public String getWebLink() {
	return webLink;
}





public void setWebLink(String webLink) {
	this.webLink = webLink;
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





public Boolean getInStock() {
	return inStock;
}





public void setInStock(Boolean inStock) {
	this.inStock = inStock;
}





public void setSellPriceLocal(double sellPriceLocal) {
	// TODO Auto-generated method stub
	this.sellPriceLocal=sellPriceLocal;
}





public void setSellPrice(double sellPrice) {
	// TODO Auto-generated method stub
	this.sellPrice=sellPrice;
}





public void setDeliveryPriceLocal(double deliveryPriceLocal) {
	this.deliveryPriceLocal=deliveryPriceLocal;
	
}





public void setDeliveryPrice(double deliveryPrice) {
	this.deliveryPrice=deliveryPrice;
	
}





public void setColor(String color) {
	this.color=color;
	
}





public void setSize(String size) {
	this.size=size;
	
}





public void setWeight(String weight) {
	// TODO Auto-generated method stub
	this.weight=weight;
}




}
