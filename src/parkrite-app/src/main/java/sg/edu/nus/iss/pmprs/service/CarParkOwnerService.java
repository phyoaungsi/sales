package sg.edu.nus.iss.pmprs.service;

import java.util.List;

import sg.edu.nus.iss.pmprs.business.carparkowner.CreateCarParkOwnerBl;
import sg.edu.nus.iss.pmprs.business.carparkowner.DeleteCarParkOwnerBl;
import sg.edu.nus.iss.pmprs.business.carparkowner.ModifyCarParkOwnerBl;
import sg.edu.nus.iss.pmprs.vo.MemberVo;
import sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo;

public interface CarParkOwnerService {

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#createCarparkOwner(sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo)
	 */
	public abstract boolean createCarparkOwner(CarParkOwnerVo carparkowner);

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getCreateCarParkOwnerBl()
	 */
	public abstract CreateCarParkOwnerBl getCreateCarParkOwnerBl();

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#setCreateCarparkBl(sg.edu.nus.iss.pmprs.business.carparkowner.CreateCarParkOwnerBl)
	 */
	public abstract void setCreateCarparkBl(
			CreateCarParkOwnerBl createCarparkownerBl);

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#modifyCarparkOwner(sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo)
	 */
	public abstract boolean modifyCarparkOwner(CarParkOwnerVo carparkowner);

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getModifyCarParkOwnerBl()
	 */
	public abstract ModifyCarParkOwnerBl getModifyCarParkOwnerBl();

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#setModifyCarparkBl(sg.edu.nus.iss.pmprs.business.carparkowner.ModifyCarParkOwnerBl)
	 */
	public abstract void setModifyCarparkBl(
			ModifyCarParkOwnerBl modifyCarparkownerBl);

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#deleteCarparkOwner(sg.edu.nus.iss.pmprs.vo.carparkowner.CarParkOwnerVo)
	 */
	public abstract boolean deleteCarparkOwner(CarParkOwnerVo carparkowner);

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#getDeleteCarParkOwnerBl()
	 */
	public abstract DeleteCarParkOwnerBl getDeleteCarParkOwnerBl();

	/* (non-Javadoc)
	 * @see sg.edu.nus.iss.pmprs.service.CarParkOwnerService#setDeleteCarparkBl(sg.edu.nus.iss.pmprs.business.carparkowner.DeleteCarParkOwnerBl)
	 */
	public abstract void setDeleteCarparkBl(
			DeleteCarParkOwnerBl deleteCarparkownerBl);

	public abstract List<CarParkOwnerVo> getCarParkownerBlbyCompanyName(
			String companyName);
	
	public List<CarParkOwnerVo> getAllCarparkOwners();
	
	public abstract  CarParkOwnerVo getCarparkOwner(int merchantId) ;

	public abstract List<CarParkOwnerVo> searchCarparkOwner(String field, String keyword);
}