package sg.edu.nus.iss.pmprs.web.actions.user;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.entity.PmprsUser;
import sg.edu.nus.iss.pmprs.service.UserService;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;


@Action(
		value="searchuserform", 
	    	results={@Result(name="success", location="/content/user/search.jsp")}
		)
public class SearchFormAction extends CommonAction {
	
	List<PmprsUser> users;
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -6531097869673614221L;

		
		@Autowired
		@Qualifier("userServiceImpl")
		UserService service;
		
		// private CarparkownersearchTable model;

		// private String carparkId;

		private Boolean search;
		private String searchBy;
		private String keyword;

		public String execute() {

			if (getSearch() == null) {
				this.setUsers(new ArrayList<PmprsUser>());
				users = service.getAll();
			} 
			
			else {
				System.out.println("Search is here =" + getSearch().toString());
				System.out.println("Search By =" + getSearchBy());
				System.out.println("Key word =" + getKeyword());

				this.setUsers(new ArrayList<PmprsUser>());
				if (!getKeyword().equals("") ){
				if (getSearchBy().equals("01")){
				//	users = service.searchUser("userUserId", getKeyword());
							
				}
				else if (getSearchBy().equals("02")){
				//	users = service.searchUser("name", getKeyword());
				}
				else{
				//	users = service.searchUser("nric", getKeyword());
				}
				}
				else{
				//	users = service.getAllUsers();
				}
				
			
			}

			return SUCCESS;
	}

	public List<PmprsUser> getUsers() {
		return users;
	}

	public void setUsers(List<PmprsUser> users) {
		this.users = users;
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
