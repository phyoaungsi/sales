package sg.edu.nus.iss.pmprs.web.ajax.order;

import java.io.Serializable;

public class SelectedStock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7264694043865897098L;
	private String id;
	private String name;
	private double price;
	private int qty;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}
