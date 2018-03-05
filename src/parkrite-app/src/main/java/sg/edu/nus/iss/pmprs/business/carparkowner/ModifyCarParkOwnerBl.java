package sg.edu.nus.iss.pmprs.business.carparkowner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkOwnerRespository;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo;



@Component
public class ModifyCarParkOwnerBl extends BusinessLogic<Boolean>{
	
	@Autowired 
	PmprsCarParkOwnerRespository carparkownerRespository;
	private CarParkOwnerVo carparkOwnervo;

	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub	
	
		CarParkOwnerVo carparkVo=(CarParkOwnerVo) vo;
		if(carparkVo.getCarparkownerId()==0)
		{
			throw new RuntimeException("Which car park owner  to update?");
		}
		
		System.out.println("BL" + carparkVo.getCarparkownerId());
		PmprsCarParkOwner p=  carparkownerRespository.getOne(carparkVo.getCarparkownerId());
		
		p.setParkriteMerchantId(carparkVo.getParkritemerchantid());
		p.setEmaill(carparkVo.getEmail());
		p.setName(carparkVo.getName());
		p.setNric(carparkVo.getNric());
		
		p.setAddress(carparkVo.getAddress());
		p.setCompanyName(carparkVo.getCompany_name());
	
		p.setContactNumber(carparkVo.getContact_number());
		p.setDesignation(carparkVo.getDesignation());
		p.setPostalCode(carparkVo.getPostal_code());
		p.setRemarks(carparkVo.getRemarks());
		p.setOfficeNumber(carparkVo.getOffice_number());
		//p.setGender(this.getCarparkOwner().getGender());
		
		
		carparkownerRespository.save(p);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		//CarParkOwnerVo carparkVo=(CarParkOwnerVo) getParameter();
		//if(this.getCarparkOwner().getEmail()==null)
		//throw new NoCarparkIdException();
	}

	@Override
	public Boolean getResult() {
		// TODO Auto-generated method stub
		return true;
	}


	public void setCarparkOwner(CarParkOwnerVo carparkowner) {
		this.carparkOwnervo = carparkowner;
	}
	
	public CarParkOwnerVo  getCarparkOwner(){
		return carparkOwnervo;
	}
	
	
}
