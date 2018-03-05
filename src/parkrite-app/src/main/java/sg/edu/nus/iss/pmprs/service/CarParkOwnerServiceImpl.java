package sg.edu.nus.iss.pmprs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.business.carparkowner.CreateCarParkOwnerBl;
import sg.edu.nus.iss.pmprs.business.carparkowner.DeleteCarParkOwnerBl;
import sg.edu.nus.iss.pmprs.business.carparkowner.GetCarParkOwnerBl;
import sg.edu.nus.iss.pmprs.business.carparkowner.ModifyCarParkOwnerBl;
import sg.edu.nus.iss.pmprs.business.carparkowner.SearchCarParkOwnerBl;
import sg.edu.nus.iss.pmprs.constants.Gender;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkOwnerRespository;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo;



//public class CarParkOwnerServiceImpl extends Service implements CarParkOwnerService{
@org.springframework.stereotype.Service
public class CarParkOwnerServiceImpl implements CarParkOwnerService {
	
	@Autowired
	PmprsCarParkOwnerRespository carparkownerRepository;
	
	@Autowired 
	CreateCarParkOwnerBl  createCarparkOwnerBl;
	
	@Autowired 
	SearchCarParkOwnerBl  searchBl;
	
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#createCarparkOwner(sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo)
	 */
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#createCarparkOwner(sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo)
	 */
	public boolean createCarparkOwner(CarParkOwnerVo carparkowner)
	{
		//createCarparkOwnerBl = new CreateCarParkOwnerBl();
		createCarparkOwnerBl.setCarparkOwner(carparkowner);
		createCarparkOwnerBl.process();
		return createCarparkOwnerBl.getResult();
	}

	
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getCreateCarParkOwnerBl()
	 */
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getCreateCarParkOwnerBl()
	 */
	public CreateCarParkOwnerBl getCreateCarParkOwnerBl()
	{
		return createCarparkOwnerBl;
	}

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#setCreateCarparkBl(sg.edu.nus.iss.pmprs.business.carparkowner.CreateCarParkOwnerBl)
	 */
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#setCreateCarparkBl(sg.edu.nus.iss.pmprs.business.carparkowner.CreateCarParkOwnerBl)
	 */
	public void setCreateCarparkBl(CreateCarParkOwnerBl createCarparkownerBl) {
		this.createCarparkOwnerBl = createCarparkownerBl;
	}
	
	
	
	@Autowired 
	ModifyCarParkOwnerBl  modifyCarparkOwnerBl;
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#modifyCarparkOwner(sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo)
	 */
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#modifyCarparkOwner(sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo)
	 */
	@Transactional	
	public boolean modifyCarparkOwner(CarParkOwnerVo carparkowner)
	{
		modifyCarparkOwnerBl.setParamter(carparkowner);
		modifyCarparkOwnerBl.process();
		return modifyCarparkOwnerBl.getResult();
	}
	
	
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getModifyCarParkOwnerBl()
	 */
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getModifyCarParkOwnerBl()
	 */
	public ModifyCarParkOwnerBl getModifyCarParkOwnerBl()
	{
		return modifyCarparkOwnerBl;
	}

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#setModifyCarparkBl(sg.edu.nus.iss.pmprs.business.carparkowner.ModifyCarParkOwnerBl)
	 */
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#setModifyCarparkBl(sg.edu.nus.iss.pmprs.business.carparkowner.ModifyCarParkOwnerBl)
	 */
	public void setModifyCarparkBl(ModifyCarParkOwnerBl modifyCarparkownerBl) {
		this.modifyCarparkOwnerBl = modifyCarparkownerBl;
	}
	

	@Autowired 
	DeleteCarParkOwnerBl  deleteCarparkOwnerBl;
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#deleteCarparkOwner(sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo)
	 */
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#deleteCarparkOwner(sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo)
	 */
	public boolean deleteCarparkOwner(CarParkOwnerVo carparkowner)
	{
		deleteCarparkOwnerBl.setCarparkOwner(carparkowner);
		deleteCarparkOwnerBl.process();
		return deleteCarparkOwnerBl.getResult();
	}
	

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getDeleteCarParkOwnerBl()
	 */
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getDeleteCarParkOwnerBl()
	 */
	public DeleteCarParkOwnerBl getDeleteCarParkOwnerBl()
	{
		return deleteCarparkOwnerBl;
	}

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#setDeleteCarparkBl(sg.edu.nus.iss.pmprs.business.carparkowner.DeleteCarParkOwnerBl)
	 */
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#setDeleteCarparkBl(sg.edu.nus.iss.pmprs.business.carparkowner.DeleteCarParkOwnerBl)
	 */
	public void setDeleteCarparkBl(DeleteCarParkOwnerBl deleteCarparkownerBl) {
		this.deleteCarparkOwnerBl = deleteCarparkownerBl;
	}


	@Autowired
	GetCarParkOwnerBl getCarparkOwnerBl;
	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getCarParkownerBlbyCompanyName(java.lang.String)
	 */
	public List<CarParkOwnerVo> getCarParkownerBlbyCompanyName(String companyName){
		getCarparkOwnerBl.process();
		return getCarparkOwnerBl.getResult();
	}
	
	
	
	@Transactional	
	public CarParkOwnerVo getCarparkOwner(int merchantid) {
			System.out.println("Sevice merchant id =" + merchantid);
			int id = merchantid;
		   PmprsCarParkOwner m=  carparkownerRepository.getOne(id);
		   CarParkOwnerVo vo=new CarParkOwnerVo();
		   vo.setCarparkownerId(m.getId());
		   vo.setParkritemerchantid(m.getParkriteMerchantId());
		   vo.setName(m.getName());
		   vo.setEmail(m.getEmaill());
		   vo.setNric(m.getNric());
		   vo.setContact_number(m.getContactNumber());
		   vo.setDesignation(m.getDesignation());
		   vo.setCompany_name(m.getCompanyName());
		   vo.setContact_number(m.getContactNumber());
		   vo.setOffice_number(m.getOfficeNumber());
		   vo.setRemarks(m.getRemarks());
		   vo.setPostal_code(m.getPostalCode());
		   vo.setAddress(m.getAddress());
			System.out.println("Sevice merchant name =" + m.getName());
		   return vo;
		}

	/*
	 * (non-Javadoc)
	 * 
	 * @see sg.edu.nus.iss.pmprs.service.MemberService#getAllMembers()
	 */
	public List<CarParkOwnerVo> getAllCarparkOwners() {

		List<PmprsCarParkOwner> carParkOwners = carparkownerRepository.findAll();
		List<CarParkOwnerVo> vos = new ArrayList<CarParkOwnerVo>();
		for (PmprsCarParkOwner m : carParkOwners) {
			CarParkOwnerVo vo = new CarParkOwnerVo();
			vo.setCarparkownerId(m.getId());
			vo.setParkritemerchantid(m.getParkriteMerchantId());
			vo.setName(m.getName());
			vo.setEmail(m.getEmaill());
			vo.setNric(m.getNric());
			vo.setContact_number(m.getContactNumber());
			vo.setDesignation(m.getDesignation());
			vo.setCompany_name(m.getCompanyName());
			vo.setContact_number(m.getContactNumber());
			vo.setOffice_number(m.getOfficeNumber());
			vo.setRemarks(m.getRemarks());
			vo.setPostal_code(m.getPostalCode());
			vo.setAddress(m.getAddress());
			
			vos.add(vo);
		}
		return vos;
	}

	public List<CarParkOwnerVo> searchCarparkOwner(String field, String keyword)
	{
		searchBl.setStringParam(field,keyword);
		searchBl.process();
		return searchBl.getResult();
	
	}
}
