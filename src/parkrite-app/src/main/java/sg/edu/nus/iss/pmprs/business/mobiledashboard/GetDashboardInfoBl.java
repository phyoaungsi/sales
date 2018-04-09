package sg.edu.nus.iss.pmprs.business.mobiledashboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.ProductRepository;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.mobile.dashboard.CarPark;
import sg.edu.nus.iss.pmprs.mobile.dashboard.DashboardResponse;
import sg.edu.nus.iss.pmprs.vo.DashboardVo;

@Component
public class GetDashboardInfoBl extends BusinessLogic<DashboardResponse> {

	@Autowired ProductRepository repository;
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
         List<Product> carparks=repository.findAll();
         DashboardResponse response= new DashboardResponse();
         
         for(Product park:carparks)
         {
        	 CarPark c=new CarPark();
//        	 c.setTotalSlot(park.getParkingSlot());
//        	 c.setOccupied(park.getHoldingSlot());
//        	 c.setAddress(park.getAddress());
//        	 c.setName(park.getName());
//        	 c.setCarparkId(park.getId().toString());
//        	 c.setPostalCode(park.getPostalCode());
//        	 c.setBookingFees((float)park.getBookingfees());
//        	 c.setMinOccupyFees((float)park.getMinimumHourFees());
        	 c.setMinHour(1.5f);
        	 response.getCarParks().add(c);
         }
         this.setResult(response);       
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}

}
