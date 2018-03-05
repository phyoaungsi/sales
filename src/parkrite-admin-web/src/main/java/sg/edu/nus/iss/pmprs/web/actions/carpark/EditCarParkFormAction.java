package sg.edu.nus.iss.pmprs.web.actions.carpark;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.entity.PmprsBoookingFees;
import sg.edu.nus.iss.pmprs.entity.SalePrice;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.service.CarparkService;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.ProductForm;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

@Action(value = "editCarparkForm", results = { @Result(name = "success", location = "/content/carpark/maintaincarpark.jsp") })
public class EditCarParkFormAction extends CommonAction implements
		ScopedModelDriven<ProductForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1127337637515702797L;
	private String carparkId;
	private ProductForm model;

	@Autowired
	//@Qualifier("carparkServiceImpl")
	CarparkService carparkService;

	public String execute() {
		if (model.getId() != null) {
			int id = model.getId();
			ProductVo carpark = carparkService.getCarPark(id);
			ProductForm c =new ProductForm();
			c.convertVoToModel(carpark);
			setModel(c);  
		}
		return SUCCESS;
	}

	

	@Override
	public ProductForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	public String getCarparkId() {
		return carparkId;
	}

	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}

	@Override
	public void setModel(ProductForm model) {
		// TODO Auto-generated method stub
		this.model = model;

	}

}
