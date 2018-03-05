package sg.edu.nus.iss.pmprs.web.actions.carpark;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import sg.edu.nus.iss.pmprs.dao.PmprsCarParkOwnerRespository;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;



@Action(
		value="carparkcreateform", 
	    results={@Result(name="success", location="/content/carpark/carpark.jsp")}
		
		)
public class CarparkcreateformAction extends CommonAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5255682672871822688L;
	@Autowired
	private PmprsCarParkOwnerRespository ownerDao;
	private String merchantid;
	private Map<String,String> carparkOwners;
	public String execute()
	{
//		carparkOwners=new HashMap<String,String>();
//		List<PmprsCarParkOwner> owners=ownerDao.findAll();
//		for(PmprsCarParkOwner owner:owners){
//			carparkOwners.put(owner.getId().toString(), owner.getCompanyName());
//		}
		return SUCCESS;
		
	}

	public String getMerchantid() {
		return merchantid;
	}

	public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	}

	public Map<String, String> getCarparkOwners() {
		return carparkOwners;
	}

	public void setCarparkOwners(Map<String, String> carparkOwners) {
		this.carparkOwners = carparkOwners;
	}

}
