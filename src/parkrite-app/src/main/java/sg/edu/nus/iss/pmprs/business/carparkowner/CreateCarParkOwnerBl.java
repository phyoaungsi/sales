package sg.edu.nus.iss.pmprs.business.carparkowner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkOwnerRespository;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.exceptions.NoCarparkIdException;
import sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo;

@Component
public class CreateCarParkOwnerBl extends BusinessLogic<Boolean>  {
	
	@Autowired 
	PmprsCarParkOwnerRespository carparkownerRespository;
	private CarParkOwnerVo carparkOwnervo;

	
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub	
		PmprsCarParkOwner p = new PmprsCarParkOwner();

		p.setParkriteMerchantId(this.getCarparkOwner().getParkritemerchantid());
		p.setEmaill(this.getCarparkOwner().getEmail());
		p.setName(this.getCarparkOwner().getName());
		p.setNric(this.getCarparkOwner().getNric());
		p.setAddress(this.getCarparkOwner().getAddress());
		p.setCompanyName(this.getCarparkOwner().getCompany_name());
	
		p.setContactNumber(this.getCarparkOwner().getContact_number());
		p.setDesignation(this.getCarparkOwner().getDesignation());
		p.setPostalCode(this.getCarparkOwner().getPostal_code());
		p.setRemarks(this.getCarparkOwner().getRemarks());
		p.setOfficeNumber(this.getCarparkOwner().getOffice_number());
		
		
		//p.setGender(this.getCarparkOwner().getGender());
		
		
		carparkownerRespository.save(p);
		//carparkownerRespository.flush();;
	
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		if(this.getCarparkOwner().getEmail()==null)
		throw new NoCarparkIdException();
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
