package sg.edu.nus.iss.pmprs.business.carpark;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.mobile.dashboard.CarPark;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.NearByCarParkRequest;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.NearByCarParkResponse;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.ViewFavouriteCarparksReponse;

@Component
public class NearByCarparkBl extends
		BusinessLogic<NearByCarParkResponse> {

	NearByCarParkRequest request;
	
	@Autowired
	PmprsCarParkRepository carparkDao;

	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		NearByCarParkResponse res=new NearByCarParkResponse();
	    double area= 0.01000;
	    if(request.lattitude==0 && request.longitude==0) area=1000;
	    double upperLat=request.lattitude+area;
	    double lowerLat=request.lattitude-area;
	    double upperLng=request.longitude+area;
	    double lowerLng=request.longitude-area;
		List<Product> list = carparkDao.getCarParkByLocation(upperLat, lowerLat,upperLng ,lowerLng);
	
		res.carparks=new ArrayList<CarPark>();
		for(Product park: list)
		{
		
			CarPark c=new CarPark();
       	// c.setTotalSlot(park.getParkingSlot());
       	// c.setOccupied(park.getHoldingSlot());
       	// c.setAddress(park.getAddress());
       	 c.setName(park.getName());
       	 c.setCarparkId(park.getId().toString());
       	// c.setPostalCode(park.getPostalCode());
       //	 c.setBookingFees((float)park.getBookingfees());
       	// c.setMinOccupyFees((float)park.getMinimumHourFees());
       	 c.setMinHour(1.5f);
       	 res.carparks.add(c);
		}

		
		this.setResult(res);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}

	public void setRequest(NearByCarParkRequest request) {
		// TODO Auto-generated method stub
		this.request=request;
	}
}