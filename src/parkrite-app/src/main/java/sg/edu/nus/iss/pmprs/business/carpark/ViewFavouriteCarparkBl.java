package sg.edu.nus.iss.pmprs.business.carpark;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsFavouriteRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsFavoriteCarPark;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.mobile.dashboard.CarPark;
import sg.edu.nus.iss.pmprs.mobile.favouritecarpark.ViewFavouriteCarparksReponse;

@Component
public class ViewFavouriteCarparkBl extends
		BusinessLogic<ViewFavouriteCarparksReponse> {

	@Autowired
	PmprsMemberRepository memberRepository;
	@Autowired
	PmprsFavouriteRepository favouriteRepository;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
		ViewFavouriteCarparksReponse res = new ViewFavouriteCarparksReponse();
		PmprsMember member = memberRepository.findByMemberUserId(vo
				.getLoggedInUserId());
		List<PmprsFavoriteCarPark> list = favouriteRepository
				.findByMember(member);
		for (PmprsFavoriteCarPark f : list) {
			Product park = f.getCarPark();
			CarPark c = new CarPark();
//			c.setTotalSlot(park.getParkingSlot());
//			c.setOccupied(park.getOccupiedSlot());
//			c.setAddress(park.getAddress());
//			c.setName(park.getName());
//			c.setCarparkId(park.getId().toString());
//			c.setPostalCode(park.getPostalCode());
//			c.setBookingFees((float)park.getBookingfees());
//			c.setMinOccupyFees((float)park.getMinimumHourFees());
			// c.setMinHour(1.5f);
			res.getCarparks().add(c);

		}
		this.setResult(res);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}
}