package sg.edu.nus.iss.pmprs.web.actions.carpark;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ModelDriven;

import sg.edu.nus.iss.pmprs.dao.PmprsCarParkOwnerRespository;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.entity.PmprsParkingSlot;
import sg.edu.nus.iss.pmprs.service.CarparkService;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.ProductForm;

@Action(value = "createcarpark", results = { @Result(name = "success", location = "/content/carpark/carpark.jsp"),
		@Result(name="fail", location="/content/carpark/carpark.jsp"), @Result(name="input", location="/content/carpark/carpark.jsp"),}

)
public class CreatecarparkAction extends CommonAction implements
		ModelDriven<ProductForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1842282057605921498L;
	/**
	 * 
	 */
	// private static final long serialVersionUID = -5255682672871822688L;
	CarparkService carparkService;
	@Autowired
	private PmprsCarParkOwnerRespository ownerDao;
	private ProductForm model;
	private Map<String,String> carparkOwners;
	private String merchantid;

	public String execute() {
		
		carparkOwners=new HashMap<String,String>();
		List<PmprsCarParkOwner> ons=ownerDao.findAll();
		for(PmprsCarParkOwner owner:ons){
			carparkOwners.put(owner.getId().toString(), owner.getCompanyName());
		}
		ArrayList<String> errors=new ArrayList();
	    getModel().validate(errors);
	    if(errors.size()>0)
	    {
	    	this.setActionErrors(errors);
	    	return "fail";
	    }
		
		//model.setCarparkOwners(new HashMap<String,String>());
		//List<PmprsCarParkOwner> owners=ownerDao.findAll();
		//for(PmprsCarParkOwner owner:owners){
		//	model.getCarparkOwners().put(owner.getId().toString(), owner.getCompanyName());
		//}
	//	carparkOwners=model.getCarparkOwners();
		ProductVo vo = model.modelToVo();
		carparkService.createCarpark(vo);
		Collection<String> messages=new ArrayList<String>();
		messages.add("Car Park "+vo.getId()+" is Created Successfully");
		this.setActionMessages(messages);
		return SUCCESS;
	}

	

	public CarparkService getCarparkService() {
		return carparkService;
	}

	public void setCarparkService(CarparkService carparkService) {
		this.carparkService = carparkService;
	}

	public ProductForm getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	public void setModel(ProductForm model) {
		this.model = model;
	}

	public String getMerchantid() {
		return merchantid;
	}

	public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	}



	public Map<String,String> getCarparkOwners() {
		return carparkOwners;
	}



	public void setCarparkOwners(Map<String,String> carparkOwners) {
		this.carparkOwners = carparkOwners;
	}

}
