package sg.edu.nus.iss.pmprs.web.actions.ticket;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.CarparkService;
import sg.edu.nus.iss.pmprs.service.PromotionReasonService;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;
import sg.edu.nus.iss.pmprs.vo.ticket.PromotionReasonVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.ComplimentaryForm;


@Action(
		value="createredemptionform", 
	    	results={@Result(name="success", location="/content/ticket/Redemption.jsp")}
		)

public class RedemptionFormAction extends CommonAction {


	/**
	 * 
	 */
	private static final long serialVersionUID = 4199497452749143786L;

	Logger logger = Logger.getLogger(this.getClass());


	@Autowired
	@Qualifier("promotionReasonServiceImpl")
	PromotionReasonService service;
	
	@Autowired
	CarparkService carparkservice;
	
	private List<PromotionReasonVo> reasons ;
	ComplimentaryForm model;
	private String name;
	private Integer id;
	private String carparkId;
	private String carparkName;

	
	public String execute()
	{	
		getReasons();
		getCarparks();
		return SUCCESS;
	}
	
	
	public ComplimentaryForm getModel() {
		return model;
	}

	public void setModel(ComplimentaryForm model) {
		this.model = model;
	}

	public List<PromotionReasonVo> getReasons() {
		reasons = service.getPromotionReasons();
		return reasons;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCarparkId() {
		return carparkId;
	}


	public void setCarparkId(String carparkId) {
		this.carparkId = carparkId;
	}


	public String getCarparkName() {
		return carparkName;
	}


	public void setCarparkName(String carparkName) {
		this.carparkName = carparkName;
	}
	
	public List<ProductVo> getCarparks() {
		List<ProductVo> carparks = carparkservice.getAllCarparks();
		return carparks;
	}
}
