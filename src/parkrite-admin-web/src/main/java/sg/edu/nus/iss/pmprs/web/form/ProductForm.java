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
		ProductForm model=this;
		ProductVo vo = new ProductVo();
		
		vo.setId(model.getId());
		
		vo.setName(model.getName());
		

		vo.setRemarks(model.getRemarks());
	
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

}