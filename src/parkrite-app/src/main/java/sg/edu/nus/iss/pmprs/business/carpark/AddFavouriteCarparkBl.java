package sg.edu.nus.iss.pmprs.business.carpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsFavouriteRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsMemberRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsFavoriteCarPark;
import sg.edu.nus.iss.pmprs.vo.AddFavouriteCarparkVo;

@Component
public class AddFavouriteCarparkBl extends BusinessLogic<Boolean> { 

	@Autowired
	PmprsMemberRepository memberRepository;

	@Autowired
	PmprsFavouriteRepository favouriteRepository;
	@Autowired 
	StockRepository carparkRepository;
	
@Override
protected void execute(CommonVo vo) {
	// TODO Auto-generated method stub
	
	AddFavouriteCarparkVo addVo=(AddFavouriteCarparkVo) vo;
	PmprsFavoriteCarPark exits=favouriteRepository.findByMemberAndCarPark(addVo.getMember(),addVo.getCarpark());
	if(exits!=null && delete==true)
	{
		favouriteRepository.delete(exits);
	}else if(exits==null && delete==false){
	PmprsFavoriteCarPark favourit=new PmprsFavoriteCarPark();
	favourit.setCarPark(addVo.getCarpark());
	favourit.setMember(addVo.getMember());
	favouriteRepository.save(favourit);
	}
	setResult(true);
}

@Override
protected void doValidation() {
	// TODO Auto-generated method stub
	
}
private boolean delete;
public void setDelete(boolean delete) {
	// TODO Auto-generated method stub
	this.delete=delete;
}
}
