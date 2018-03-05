package sg.edu.nus.iss.pmprs.ajax;

import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.NearByCarParkRequest;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.NearByCarParkResponse;
import sg.edu.nus.iss.pmprs.mobile.updatemember.UpdateMemberRequest;
import sg.edu.nus.iss.pmprs.mobile.updatemember.UpdateMemberResponse;

import com.opensymphony.xwork2.ModelDriven;

public class NearByCarParkAction  extends
JsonServiceAction<NearByCarParkRequest, NearByCarParkResponse> implements ModelDriven<NearByCarParkResponse>{

/**
	 * 
	 */
	private static final long serialVersionUID = 6723047442947269352L;



@Override
public String executeJson(NearByCarParkRequest requestObj) {
	// TODO Auto-generated method stub
	NearByCarParkResponse res=service.nearByCarPark(requestObj);
    setModel(res);
	return SUCCESS;
}

@Override
public Class getJsonClass() {
	// TODO Auto-generated method stub
	return NearByCarParkRequest.class;
}
}
