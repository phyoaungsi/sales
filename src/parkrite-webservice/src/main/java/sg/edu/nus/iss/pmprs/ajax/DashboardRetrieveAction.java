package sg.edu.nus.iss.pmprs.ajax;

import com.opensymphony.xwork2.ModelDriven;

import sg.edu.nus.iss.pmprs.mobile.dashboard.DashboardRequest;
import sg.edu.nus.iss.pmprs.mobile.dashboard.DashboardResponse;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.NearByCarParkRequest;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.NearByCarParkResponse;
import sg.edu.nus.iss.pmprs.vo.DashboardRequestVo;

public class DashboardRetrieveAction extends JsonServiceAction<DashboardRequest, DashboardResponse> implements ModelDriven<DashboardResponse> {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1097799770376175951L;

	@SuppressWarnings("rawtypes")
	@Override
	public Class getJsonClass() {
		// TODO Auto-generated method stub
		return DashboardRequest.class;
	}

	@Override
	public String executeJson(DashboardRequest requestObj) {
		
		DashboardRequestVo vo=new DashboardRequestVo();
		vo.setLatitude(requestObj.getLatitude());
		vo.setLongitude(requestObj.getLongitude());
		//vo.setUserId(getLoginUser());
		NearByCarParkRequest request=new NearByCarParkRequest() ;
		request.lattitude=requestObj.getLatitude();
		request.longitude=requestObj.getLongitude();
		NearByCarParkResponse nbcs= service.nearByCarPark(request);
		
		DashboardResponse res=service.getDashboard(vo);
		res.setCarParks(nbcs.carparks);
		setModel(res);
		return SUCCESS;
	}

}
