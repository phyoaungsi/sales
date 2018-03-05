package sg.edu.nus.iss.pmprs.web.actions.member;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import sg.edu.nus.iss.pmprs.service.MemberService;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.web.actions.CommonAction;


@Action(
		value="searchmemberform", 
	    	results={@Result(name="success", location="/content/member/search.jsp")}
		)
public class SearchFormAction extends CommonAction {
	
	List<MemberVo> members;
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = -6531097869673614221L;

		
		@Autowired
		@Qualifier("memberServiceImpl")
		MemberService service;
		
		// private CarparkownersearchTable model;

		// private String carparkId;

		private Boolean search;
		private String searchBy;
		private String keyword;

		public String execute() {

			if (getSearch() == null) {
				this.setMembers(new ArrayList<MemberVo>());
				members = service.getAllMembers();
			} 
			
			else {
				System.out.println("Search is here =" + getSearch().toString());
				System.out.println("Search By =" + getSearchBy());
				System.out.println("Key word =" + getKeyword());

				this.setMembers(new ArrayList<MemberVo>());
				if (!getKeyword().equals("") ){
				if (getSearchBy().equals("01")){
					members = service.searchMember("memberUserId", getKeyword());
							
				}
				else if (getSearchBy().equals("02")){
					members = service.searchMember("name", getKeyword());
				}
				else{
					members = service.searchMember("nric", getKeyword());
				}
				}
				else{
					members = service.getAllMembers();
				}
				
			
			}

			return SUCCESS;
	}

	public List<MemberVo> getMembers() {
		return members;
	}

	public void setMembers(List<MemberVo> members) {
		this.members = members;
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
