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
public class GetCarParkOwnerBl extends BusinessLogic<List<CarParkOwnerVo>>{

	
     
    	@Autowired 
    	PmprsCarParkOwnerRespository carparkownerRepository;
    
    	@Override
    	protected void execute(CommonVo vo) {
    		// TODO Auto-generated method stub
    		List<PmprsCarParkOwner> resultpmprs = carparkownerRepository.findAll();
    		setResult(new ArrayList<CarParkOwnerVo>());
    		for(PmprsCarParkOwner p : resultpmprs){
    				CarParkOwnerVo pp = new CarParkOwnerVo();
    				//pp.setCarparkownerId(pp.getCarparkownerId());
    				pp.setParkritemerchantid(p.getParkriteMerchantId());
    				pp.setName(p.getName());
    				pp.setCompany_name(p.getCompanyName());
    				pp.setCarparkownerId(p.getId());
    				System.out.println("Carpark owner BI =" + p.getId());
    				getResult().add(pp);
    		}
    		
    		 //setResult(carparkownerRepository.findAll());
    	}

    	@Override
    	protected void doValidation() {
    		// TODO Auto-generated method stub
    		
    	}


	}


