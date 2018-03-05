package sg.edu.nus.iss.pmprs.mobile.favouritecarpark;

import java.util.List;

import sg.edu.nus.iss.pmprs.mobile.CommonResponse;
import sg.edu.nus.iss.pmprs.mobile.dashboard.CarPark;

public class NearByCarParkResponse extends CommonResponse {
	
	public List<CarPark> carparks;

	public List<CarPark> getCarparks() {
		return carparks;
	}

	public void setCarparks(List<CarPark> carparks) {
		this.carparks = carparks;
	}

}
