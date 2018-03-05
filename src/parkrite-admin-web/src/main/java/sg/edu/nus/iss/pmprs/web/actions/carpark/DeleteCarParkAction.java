package sg.edu.nus.iss.pmprs.web.actions.carpark;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataIntegrityViolationException;

import sg.edu.nus.iss.pmprs.service.CarparkService;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.ProductForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "deletecarpark", results = { 
		@Result(name = "success", location = "/content/carpark/maintaincarpark.jsp") ,
		@Result(name = "error", location = "/content/carpark/maintaincarpark.jsp")
})
public class DeleteCarParkAction extends CommonAction implements
		ScopedModelDriven<ProductForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8137066765363979330L;
	@Autowired
	@Qualifier("carparkServiceImpl")
	CarparkService service;
	ProductForm model;

	public String execute() {

		Collection<String> messages = new ArrayList<String>();
		
		if ( this.getModel().getId() == null ){
			messages.add("There is no such a existing carpark to delete!");
			setActionErrors(messages);
			return "fail";
		}
		else{
			try{
			Integer id=(this.getModel().getId());
		service.deleteCarpark(id);
			}catch(DataIntegrityViolationException e)
			{
				
				messages.add("There are pending bookings and payments. This car park could not be deleted.");
				this.setActionErrors(messages);
				return ERROR;
				
			}
		messages.add("Successfully Deleted the car park.");
		setActionMessages(messages);
		
		model = new ProductForm();
		return SUCCESS;
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
