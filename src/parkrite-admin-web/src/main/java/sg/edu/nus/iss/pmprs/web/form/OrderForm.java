package sg.edu.nus.iss.pmprs.web.form;

import java.util.List;
import java.util.Map;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import sg.edu.nus.iss.pmprs.core.web.CommonForm;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.web.ajax.order.SelectedStock;

public class OrderForm extends CommonForm {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8336666023116275825L;
	private Map<String,String> selectUsers;
	private Map<String,String> orderStatusList;
	private List<Product> stocks;
	private List <SelectedStock> selectedStock;
	private String id;
	public List<Product> getStocks() {
		return stocks;
	}
	public void setStocks(List<Product> stocks) {
		this.stocks = stocks;
	}
	public Map<String, String> getSelectUsers() {
		return selectUsers;
	}
	public void setSelectUsers(Map<String, String> selectUsers) {
		this.selectUsers = selectUsers;
	}
	public Map<String, String> getOrderStatusList() {
		return orderStatusList;
	}
	public void setOrderStatusList(Map<String, String> orderStatusList) {
		this.orderStatusList = orderStatusList;
	}
	public Map<String, String> getPaymentTypeList() {
		return paymentTypeList;
	}
	public void setPaymentTypeList(Map<String, String> paymentTypeList) {
		this.paymentTypeList = paymentTypeList;
	}
	public Map<String, String> getPaymentStatusList() {
		return paymentStatusList;
	}
	public void setPaymentStatusList(Map<String, String> paymentStatusList) {
		this.paymentStatusList = paymentStatusList;
	}
	public int getSelectedUser() {
		return selectedUser;
	}
	public void setSelectedUser(int selectedUser) {
		this.selectedUser = selectedUser;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInvRef() {
		return invRef;
	}
	public void setInvRef(String invRef) {
		this.invRef = invRef;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String[] getStocksId() {
		return stocksId;
	}
	public void setStocksId(String[] stocksId) {
		this.stocksId = stocksId;
	}
	public String[] getQuantity() {
		return quantity;
	}
	public void setQuantity(String[] quantity) {
		this.quantity = quantity;
	}
	public String[] getPrice() {
		return price;
	}
	public void setPrice(String[] price) {
		this.price = price;
	}
	private Map<String,String> paymentTypeList;
	private Map<String,String> paymentStatusList;
	private int selectedUser;
	private String address;
	private String invRef;
	private String paymentMode;
	private String paymentType;
	private String orderStatus;
	private String[] stocksId;
	private String[] quantity;
	private String[] price;
	private String total;
	private String remarks;
	private String buyer;
	private String discount;
	private String deliverDate;
	private String paymentStatus;
	@Override
	public void convertFormToDao(CommonForm f) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void convertDaoToFrom(CommonEntity ent) {
		// TODO Auto-generated method stub
		
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<SelectedStock> getSelectedStock() {
		return selectedStock;
	}
	public void setSelectedStock(List<SelectedStock> selectedStock) {
		this.selectedStock = selectedStock;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getDeliverDate() {
		return deliverDate;
	}
	public void setDeliverDate(String deliverDate) {
		this.deliverDate = deliverDate;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	
	
}
