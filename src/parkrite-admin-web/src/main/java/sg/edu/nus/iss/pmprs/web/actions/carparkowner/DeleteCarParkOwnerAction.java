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

import com.opensymphony.xwork2.ModelDriven;

@Action(
		value="deletecarparkowner", 
	    results={
				@Result(name="success", location="/content/carparkowner/maintaincarparkowner.jsp"),
				@Result(name="fail", location="/content/carparkowner/maintaincarparkowner.jsp")
		}
		)
public class DeleteCarParkOwnerAction extends CommonAction implements ModelDriven<CarparkownerForm> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9029662280296080517L;

	@Autowired
	@Qualifier("carparkownerServiceImpl")
	CarParkOwnerService carparkownerService;
	
	private CarparkownerForm model;
	public CarParkOwnerService getCarParkOwnerService() {
		return carparkownerService;
	}
	
	public void setCarParkOwnerService(CarParkOwnerService carparkOwnerService) {
		this.carparkownerService = carparkOwnerService;
	}

	public String execute()
	{
		Collection<String> messages = new ArrayList<String>();
		if ( model.getCarparkOwnerId() == 0 ){
			messages.add("There is no such a existing car park owner to delete!");
			setActionErrors(messages);
			return "fail";
		}
		else{
		
		System.out.println("CarparkOwner Action execute!");
		CarParkOwnerVo vo =new CarParkOwnerVo();
		vo.setParkritemerchantid(model.getParkriteMerchantid());
		vo.setCarparkownerId(model.getCarparkOwnerId());
		vo.setName(model.getName());
		vo.setEmail(model.getEmail());
		vo.setNric(model.getNric());
		vo.setDesignation(model.getDesignation());
		vo.setCompany_name(model.getCompanyname());
		vo.setContact_number(model.getContactno());
		vo.setRemarks(model.getRemark());
		vo.setAddress(model.getAddress());
		vo.setPostal_code(model.getPostalcode());
		
		System.out.println("Name" + model.getName());
		try{
			carparkownerService.deleteCarparkOwner(vo);
		}
		catch(Exception ex){
			messages.add("CarPark Owner can not delete succcessfully! This CarpPark Owner id has been used in other forms.");
			setActionErrors(messages);
			return "fail";
		}
		
		model = new CarparkownerForm();
		
		messages.add("Successfully deleted the car park owner.");
		setActionMessages(messages);
		
				
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
}
