package sg.edu.nus.iss.pmprs.web.actions.carpark;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.CarparkService;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.carpark.CarParkVo;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;


@Action(
		value="searchcarparkform", 
	    	results={@Result(name="success", location="/content/carpark/list.jsp")}
		)
public class SearchFormAction extends CommonAction {
	
	List<ProductVo> carparks;
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -6531097869673614221L;

		
		@Autowired
	//	@Qualifier("carparkServiceImpl")
		CarparkService carparkService;
		
		// private CarparkownersearchTable model;

		// private String carparkId;

		private Boolean search;
		private String searchBy;
		private String keyword;

		public String execute() {

			if (getSearch() == null) {
				this.setCarparks(new ArrayList<ProductVo>());
				carparks = carparkService.getAllCarparks();
			} 
			
			else {
				System.out.println("Search is here =" + getSearch().toString());
				System.out.println("Search By =" + getSearchBy());
				System.out.println("Key word =" + getKeyword());


				this.setCarparks(new ArrayList<ProductVo>());

				if (!getKeyword().equals("") ){
				if (getSearchBy().equals("01")){

					carparks = carparkService.searchCarpark("carparkUserId", getKeyword());

							
					}
				else if (getSearchBy().equals("02")){

					carparks = carparkService.searchCarpark("name", getKeyword());

				}
				else{

					carparks = carparkService.searchCarpark("nric", getKeyword());

				}
				}
				else{
					carparks = carparkService.getAllCarparks();
				}
				
			
			}

			return SUCCESS;
	}

	public List<ProductVo> getCarparks() {
		return carparks;
	}

	public void setCarparks(List<ProductVo> carparks) {
		this.carparks = carparks;
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
