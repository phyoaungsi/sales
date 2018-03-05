package sg.edu.nus.iss.pmprs.ajax;

import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.FavouriteCarparkAddResponse;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.ViewFavouriteCarparksReponse;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.ViewFavouriteCarparksRequest;

import com.opensymphony.xwork2.ModelDriven;

public class ViewFavouritiesAction   extends JsonServiceAction<ViewFavouriteCarparksRequest, ViewFavouriteCarparksReponse> implements ModelDriven<ViewFavouriteCarparksReponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7106050010268297017L;

	@Override
	public String executeJson(ViewFavouriteCarparksRequest requestObj) {
		// TODO Auto-generated method stub
		String loginUser=(String)this.getSession().get("LOGIN_USER");
		ViewFavouriteCarparksReponse res=new ViewFavouriteCarparksReponse();
		if(loginUser==null){res.setStatusCode("FAIL");
		res.setStatusMessage("User have not log in");
		setModel(res);
		return SUCCESS;
		}
		this.setModel(service.viewFavouriteCarparks(loginUser));
		this.getModel().setStatusCode("SUCCESS");
		return SUCCESS;
	}

	@Override
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return ViewFavouriteCarparksRequest.class;
	}

}
