package sg.edu.nus.iss.pmprs.web.actions.carpark;


import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.CarParkOwnerService;
import sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;
import sg.edu.nus.iss.pmprs.web.form.CarparkownersearchTable;

@Action(
		value="searchcarparkownerforcarpark", 
	    results={
					@Result(name="success", location="/content/carpark/searchcarparkowner.jsp")
				}
		)


public class SearchcarparkownerAction extends CommonAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1733643287818589399L;
	/**
	 * 
	 */
	
	@Autowired
	@Qualifier("carparkownerServiceImpl")
	CarParkOwnerService carparkownerService;
	//private CarparkownersearchTable model;
	

	//private String carparkId;
	
	private List<CarparkownersearchTable> cpolist;
	private String type;
	
	public String execute()
	{
		this.setCpolist(new ArrayList<CarparkownersearchTable>());
		List<CarParkOwnerVo> listvo=carparkownerService.getCarParkownerBlbyCompanyName("");
		for (CarParkOwnerVo vos : listvo){
			CarparkownersearchTable modelcpo = new CarparkownersearchTable();
			modelcpo.setParkritemerchantid(vos.getParkritemerchantid());
			modelcpo.setName(vos.getName());
			modelcpo.setCompanyname(vos.getCompany_name());
			modelcpo.setCarparkid(vos.getCarparkownerId());
			System.out.println("Carpark owner Search =" + vos.getCarparkownerId());
			getCpolist().add(modelcpo);
		}
	
		return SUCCESS;
	}

	public List<CarparkownersearchTable> getCpolist() {
		return cpolist;
	}

	public  void setCpolist(List<CarparkownersearchTable> cpolist) {
		this.cpolist = cpolist;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
