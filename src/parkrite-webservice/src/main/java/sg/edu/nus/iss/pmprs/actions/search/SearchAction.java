package sg.edu.nus.iss.pmprs.actions.search;




import org.apache.struts2.convention.annotation.Action;




import sg.edu.nus.iss.pmprs.actions.CommonAction;
import sg.edu.nus.iss.pmprs.service.Service;


public class SearchAction extends CommonAction {
	
	private String keyword;
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 5073160958672989731L;
	
	
	@Action("search")
	public String search()
	{
		
		
		
		System.out.println("hk");
		return INPUT;
	}

	
	
	@Action("result")
	public String result()
	{
		
		
		//movies=getMovieList();
		System.out.println("showing results");
		return SUCCESS;
	}
	
public String execute() throws Exception {
		
		
		
		//call Service class to store personBean's state in database
		
		return SUCCESS;
		
	}

public String getKeyword() {
	return keyword;
}

public void setKeyword(String keyword) {
	this.keyword = keyword;
}

}
