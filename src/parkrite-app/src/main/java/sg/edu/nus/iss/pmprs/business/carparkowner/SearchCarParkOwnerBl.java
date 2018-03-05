package sg.edu.nus.iss.pmprs.business.carparkowner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkOwnerRespository;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo;
@Component
public class SearchCarParkOwnerBl extends BusinessLogic<List<CarParkOwnerVo>>{

	
	private static final String PARKRITEMERCHANTID = "parkriteMerchantId";
	private static final String NAME = "name";
	private static final String COMPANYNAME = "companyName";
	
	@Autowired PmprsCarParkOwnerRespository carparkownerRespository;
	@Override
	protected void execute(CommonVo v) {
		// TODO Auto-generated method stub
		
	//	memberRepository.find
		String field=getStringParam()[0];
		String keyword=getStringParam()[1];
		
		List<PmprsCarParkOwner> cpos=	new ArrayList<PmprsCarParkOwner>();
		
		keyword = "%" + keyword +"%";
		if(field.equals(PARKRITEMERCHANTID)){
			 
			 cpos=	carparkownerRespository.findByParkriteMerchantIdLike(keyword);
		}
		
		else if(field.equals(NAME)){
			cpos=	carparkownerRespository.findByNameLike(keyword);
		}
        else if(field.equals(COMPANYNAME)){
        	cpos=	carparkownerRespository.findByCompanyNameLike(keyword);
		}
		
		
		  List<CarParkOwnerVo> vos=new ArrayList<CarParkOwnerVo>();
		  for(PmprsCarParkOwner p: cpos)
		  {
			
			  CarParkOwnerVo vo =new CarParkOwnerVo();
			  	vo.setParkritemerchantid(p.getParkriteMerchantId());
				vo.setName(p.getName());
				vo.setCompany_name(p.getCompanyName());
				vo.setCarparkownerId(p.getId());
			  
			 vos.add(vo);
	 
		  }
		setResult(vos);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}
}
