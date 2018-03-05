package sg.edu.nus.iss.pmprs.web.actions.carparkowner;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.CarParkOwnerService;
import sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.CarparkownerForm;




import sg.edu.nus.iss.pmprs.web.utility.Validator;

import com.opensymphony.xwork2.ModelDriven;



@Action(
		value="createcarparkowner", 
	    	results={
				@Result(name="success", location="/content/carparkowner/carparkowner.jsp"),
				@Result(name="fail", location="/content/carparkowner/carparkowner.jsp"),
		}
		)


public class CreateCarparkOwnerAction extends CommonAction implements ModelDriven<CarparkownerForm> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1436123061686696966L;
	@Autowired
	@Qualifier("carparkownerServiceImpl")
	CarParkOwnerService carparkownerService;
	private CarparkownerForm model;
	private String parkriteid;
	private String type;
	private String status;
	private String formtype;
	

	public String execute()
	{
		//Server Side Validation ......
		boolean iserror = false;
		Collection<String> messages = new ArrayList<String>();
		
		
		if (model.getParkriteMerchantid() == null ||  model.getParkriteMerchantid().trim().equals("")){
			messages.add("Merchant ID is required !");
			iserror = true;
		}
		
		if (model.getEmail() == null ||  model.getEmail().trim().equals("")){
			messages.add("CPO Email is required !");
			iserror = true;
		}
		else if (Validator.isValidEmailAddress(model.getEmail())==false){
			messages.add("CPO Email is not valid ! abc@domain.com ");
			iserror = true;
		}
		if (model.getName() == null || model.getName().trim().equals("")){
			messages.add("CPO Name is required!");
		}
		if (model.getCompanyname() == null || model.getCompanyname().trim().equals("")){
			messages.add("Company Name is required !");
			iserror = true;
		}
		if (model.getPostalcode() == null || model.getPostalcode().trim().equals("")){
			messages.add("Postal Code is required !");
			iserror = true;
		}
		else if (Validator.validatePostal(model.getPostalcode())== false){
			messages.add("Postal Code is not valid ! Require 6 digits Singapore postal code.");
			iserror = true;
		}
		
		if (model.getOfficephoneno() == null || model.getOfficephoneno().trim().equals("")){
			messages.add("Office Phone Number is required !");
			iserror = true;
		}
		else if (Validator.isPhoneNumberValid(model.getOfficephoneno())==false){
			messages.add("Office Phone Number is invalid ! (123)456-7890, 123-456-7890, 94590234, (123)-456-789");
			iserror = true;
		}
		
		if (model.getAddress() == null || model.getAddress().trim().equals("")){
			messages.add("Company Address is required !");
			iserror = true;
		}
		
		if (model.getContactno() != null &&  model.getContactno().trim().equals("") == false){
			if (Validator.isPhoneNumberValid(model.getContactno())==false){
				messages.add("Contact Phone Number is invalid ! (123)456-7890, 123-456-7890, 65400012, 94590234, (123)-456-789 ");
				iserror = true;}
		}
		
		
		
		//End of Validation
		
		
		if (iserror == true){
			setModel(model);
			super.setActionErrors(messages);
			return "fail";
		}
		else{ // if no error
		CarParkOwnerVo vo =new CarParkOwnerVo();
		//vo.setCarparkownerId(model.getCarparkOwnerId());
		vo.setParkritemerchantid(model.getParkriteMerchantid());
		vo.setEmail(model.getEmail());
		vo.setName(model.getName());
		vo.setNric(model.getNric());
		vo.setContact_number(model.getContactno());
		vo.setDesignation(model.getDesignation());
		vo.setAddress(model.getAddress());
		vo.setCompany_name(model.getCompanyname());
		vo.setPostal_code(model.getPostalcode());
		vo.setOffice_number(model.getOfficephoneno());
		vo.setRemarks(model.getRemark());
		
		try{
			carparkownerService.createCarparkOwner(vo);
		}
		catch(Exception ex){
			messages.add("CarPark Owner can not create succcessfully! Please input valid format or this CarpPark Owner id has been used in other forms.");
			setActionErrors(messages);
			return "fail";
		}
		messages.add("Successfully created the car park owner.");
		setActionMessages(messages);
		this.model = new CarparkownerForm();
		return SUCCESS;
		}
	}
	
	
	public CarparkownerForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}
	
	public void setModel(CarparkownerForm model) {
		this.model = model;
	}


	public String getParkriteid() {
		return parkriteid;
	}


	public void setParkriteid(String parkriteid) {
		this.parkriteid = parkriteid;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getFormtype() {
		return formtype;
	}


	public void setFormtype(String formtype) {
		this.formtype = formtype;
	}
	
	
}
