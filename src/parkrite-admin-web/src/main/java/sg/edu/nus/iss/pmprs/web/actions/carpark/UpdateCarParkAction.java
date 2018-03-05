package sg.edu.nus.iss.pmprs.web.actions.carpark;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.entity.PmprsBoookingFees;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.SalePrice;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.service.CarparkService;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.ProductForm;
import sg.edu.nus.iss.pmprs.web.utility.Validator;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "updatecarpark", results = {
		@Result(name = "success", location = "/content/carpark/maintaincarpark.jsp") ,
		@Result(name = "fail", location = "/content/carpark/maintaincarpark.jsp")
})
public class UpdateCarParkAction extends CommonAction implements
		ScopedModelDriven<ProductForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6835776536596277046L;
	@Autowired
	CarparkService carparkService;
	ProductForm model;

	public String execute() {
		// Server Side Validation ......
		
		ArrayList<String> errors=new ArrayList();
	    getModel().validate(errors);
	    if(errors.size()>0)
	    {
	    	this.setActionErrors(errors);
	    	return "fail";
	    }
		boolean iserror = false;
		
		
		Collection<String> messages = new ArrayList<String>();
		ProductForm carpark =this.getModel();
//		CarParkVo p=new CarParkVo();
		// End of Validation

		if (iserror == true) {
			super.setActionErrors(messages);
			return "fail";
		} else { // if no error

			if ( this.getModel().getId() == null ){
				messages.add("There is no such a existing carpark to update!");
				setActionErrors(messages);
				return "fail";
			}
			else{
//			CarParkVo vo = new CarParkVo();
//			vo = (CarParkVo) getModel().convertFormToVo(vo);
//			vo.setCarparkId(this.getModel().getCarparkId());
				carparkService.updateCarpark(carpark.modelToVo());
			
			messages.add("Car Park  is updated Successfully");
				
			setActionMessages(messages);
			
			return SUCCESS;
			}
		}
	}

	@Override
	public ProductForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public void setModel(ProductForm model) {
		// TODO Auto-generated method stub
		this.model = model;
	}

}
