package sg.edu.nus.iss.pmprs.actions.welcome;



import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import sg.edu.nus.iss.pmprs.actions.CommonAction;


public class WelcomeAction extends CommonAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -56317338472291629L;

	@Action(
			value="welcome", 
		    results={@Result(name="success", location="/content/search/result-success.jsp")}
			
			)
	public String execute()
	{
		System.out.println("welcome");
		//this.setMovies(getMovieList());
		//CmsServices cms=new CmsServices();
		//setFeeds( cms.getRss());
		return SUCCESS;
	}

	public static void main(String[] args)
	{
		
		System.out.println("hk");
	}

	

}
