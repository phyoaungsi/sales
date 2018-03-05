package sg.edu.nus.iss.pmprs.ajax;

import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.FavouriteCarparkAddRequest;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.FavouriteCarparkAddResponse;
import sg.edu.nus.iss.pmprs.mobile.updatemember.AddVehicleRequest;
import sg.edu.nus.iss.pmprs.mobile.updatemember.AddVehicleResponse;

import com.opensymphony.xwork2.ModelDriven;

public class AddVehicleAction   extends JsonServiceAction<AddVehicleRequest, AddVehicleResponse> implements ModelDriven<AddVehicleResponse> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4479751594148169740L;

	@Override
	public String executeJson(AddVehicleRequest requestObj) {
		// TODO Auto-generated method stub
		String loginUser=(String)this.getSession().get("LOGIN_USER");
		AddVehicleResponse res=new AddVehicleResponse();
		if(loginUser==null){res.setStatusCode("FAIL");
		res.setStatusMessage("User have not log in");
		setModel(res);
		return SUCCESS;
		}
		res=service.addVehicle(requestObj,loginUser);
		res.setStatusCode("SUCCESS");
	    setModel(res);
		return SUCCESS;
	}

	@Override
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return AddVehicleRequest.class;
	}


}
