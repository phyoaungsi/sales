package sg.edu.nus.iss.pmprs.web.actions.carparkowner;

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

@Action(value = "searchcarparkownerform", results = { @Result(name = "success", location = "/content/carparkowner/searchcarparkowner.jsp")

})
public class SearchcarparkownerAction extends CommonAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5876803136026235803L;
	@Autowired
	@Qualifier("carparkownerServiceImpl")
	CarParkOwnerService carparkownerService;
	// private CarparkownersearchTable model;

	// private String carparkId;

	private List<CarparkownersearchTable> cpolist;
	private String type;
	private Boolean search;
	private String searchBy;
	private String keyword;

	public String execute() {

		if (search == null) {

			this.setCpolist(new ArrayList<CarparkownersearchTable>());
			List<CarParkOwnerVo> listvo = carparkownerService
					.getCarParkownerBlbyCompanyName("");
			for (CarParkOwnerVo vos : listvo) {
				CarparkownersearchTable modelcpo = new CarparkownersearchTable();
				modelcpo.setParkritemerchantid(vos.getParkritemerchantid());
				modelcpo.setName(vos.getName());
				modelcpo.setCompanyname(vos.getCompany_name());
				modelcpo.setCarparkid(vos.getCarparkownerId());
				System.out.println("Carpark owner Search ="
						+ vos.getCarparkownerId());
				getCpolist().add(modelcpo);
			}
		} 
		
		else {
			System.out.println("Search is here =" + search.toString());
			System.out.println("Search By =" + searchBy);
			System.out.println("Key word =" + keyword);

			this.setCpolist(new ArrayList<CarparkownersearchTable>());
			
			List<CarParkOwnerVo> listvo;
			
			if (!keyword.equals("") ){
			if (searchBy.equals("01")){
				listvo = carparkownerService
						.searchCarparkOwner("parkriteMerchantId", keyword);
			}
			else if (searchBy.equals("02")){
				listvo = carparkownerService
						.searchCarparkOwner("companyName", keyword);
			}
			else{
				listvo = carparkownerService
					.searchCarparkOwner("name", keyword);
			}
			}
			else{
					listvo = carparkownerService
						.getCarParkownerBlbyCompanyName("");
			}
			
			for (CarParkOwnerVo vos : listvo) {
				CarparkownersearchTable modelcpo = new CarparkownersearchTable();
				modelcpo.setParkritemerchantid(vos.getParkritemerchantid());
				modelcpo.setName(vos.getName());
				modelcpo.setCompanyname(vos.getCompany_name());
				modelcpo.setCarparkid(vos.getCarparkownerId());
				System.out.println("Carpark owner Search ="
						+ vos.getCarparkownerId());
				getCpolist().add(modelcpo);
			}
		}

		return SUCCESS;
	}

	public List<CarparkownersearchTable> getCpolist() {
		return cpolist;
	}

	public void setCpolist(List<CarparkownersearchTable> cpolist) {
		this.cpolist = cpolist;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Boolean getSearch() {
		return search;
	}

	public void setSearch(Boolean search) {
		this.search = search;
	}

	public String getSearchBy() {
		return searchBy;
	}

	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

}
