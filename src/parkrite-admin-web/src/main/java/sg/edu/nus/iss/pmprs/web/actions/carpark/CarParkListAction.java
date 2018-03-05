package sg.edu.nus.iss.pmprs.web.actions.carpark;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.CarparkService;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;

@Action(value = "carparkList", results = { @Result(name = "success", location = "/content/carpark/list.jsp") })
public class CarParkListAction extends CommonAction {

	/**
	 * 
	 */
	List<ProductVo> carparks;

	@Autowired
	@Qualifier("carparkServiceImpl")
	CarparkService service;

	private static final long serialVersionUID = -3643334708957881550L;

	public String execute() {
		carparks = service.getAllCarparks();
		return SUCCESS;
	}

	public List<ProductVo> getCarparks() {
		return carparks;
	}

	public void setCarparks(List<ProductVo> carparks) {
		this.carparks = carparks;
	}

}
