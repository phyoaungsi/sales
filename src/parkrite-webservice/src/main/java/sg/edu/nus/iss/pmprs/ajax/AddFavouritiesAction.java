package sg.edu.nus.iss.pmprs.ajax;

import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.FavouriteCarparkAddRequest;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.FavouriteCarparkAddResponse;

import com.opensymphony.xwork2.ModelDriven;

public class AddFavouritiesAction   extends JsonServiceAction<FavouriteCarparkAddRequest, FavouriteCarparkAddResponse> implements ModelDriven<FavouriteCarparkAddResponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1085738598229877916L;

	@Override
	public String executeJson(FavouriteCarparkAddRequest requestObj) {
		// TODO Auto-generated method stub
		String loginUser=(String)this.getSession().get("LOGIN_USER");
		FavouriteCarparkAddResponse res=new FavouriteCarparkAddResponse();
		if(loginUser==null){res.setStatusCode("FAIL");
		res.setStatusMessage("User have not log in");
		setModel(res);
		return SUCCESS;
		}
		res.setStatusCode("FAIL");
		if(service.addFavouriteCarpark(loginUser, requestObj)){
		   res.setStatusCode("SUCCESS");
		   if(requestObj.isDelete()){
			   res.setStatusMessage("Favouritie removed");
		   }
		   else
		   {
			   res.setStatusMessage("Favouritie added");   
		   }
		}
		setModel(res);
		return SUCCESS;
		
	}

	@Override
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return FavouriteCarparkAddRequest.class;
	}

}
