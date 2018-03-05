package sg.edu.nus.iss.pmprs.web.actions.carparkowner;

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
			value="maintaincarparkownerform", 
		    	results={@Result(name="success", location="/content/carparkowner/maintaincarparkowner.jsp")}
			)

	public class MaintaincarparkownerformAction extends CommonAction implements ModelDriven<CarparkownerForm> {

		
		private static final long serialVersionUID = -6545359408835688481L;

		/**
		 * 
		 */
		
		@Autowired
		@Qualifier("carparkownerServiceImpl")
		CarParkOwnerService carparkownerService;
		private String merchantid;
		private CarparkownerForm model;
		public CarParkOwnerService getCarParkOwnerService() {
			return carparkownerService;
		}
		
		public void setCarParkOwnerService(CarParkOwnerService carparkOwnerService) {
			this.carparkownerService = carparkOwnerService;
		}


		public String execute()
		{
			
			System.out.println("CarparkOwner Action execute!");
			
			if (merchantid != null){
				System.out.println("Merchant ID" + merchantid);
				int parkid = Integer.parseInt(merchantid.trim()) ;
				CarParkOwnerVo vo = carparkownerService.getCarparkOwner(parkid);
				
				if (vo !=null){
					setModel(new CarparkownerForm());
					getModel().setCarparkOwnerId(vo.getCarparkownerId());
					getModel().setEmail(vo.getEmail());
					getModel().setName(vo.getName());
					getModel().setAddress(vo.getAddress());
					getModel().setDesignation(vo.getDesignation());
					getModel().setParkriteMerchantid(vo.getParkritemerchantid());
					getModel().setContactno(vo.getContact_number());
					getModel().setCompanyname(vo.getCompany_name());
					getModel().setOfficephoneno(vo.getOffice_number());
					getModel().setRemark(vo.getRemarks());
					getModel().setNric(vo.getNric());
					getModel().setPostalcode(vo.getPostal_code());
				}
			}
			
			return SUCCESS;
		}
		
	
		public String getMerchantid() {
			return merchantid;
		}

		public void setMerchantid(String merchantid) {
			this.merchantid = merchantid;
		}

		public CarparkownerForm getModel() {
			return model;
		}

		public void setModel(CarparkownerForm model) {
			this.model = model;
		}

}