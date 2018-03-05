package sg.edu.nus.iss.pmprs.business.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsRoleRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsUserRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsUserRoleRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsRole;
import sg.edu.nus.iss.pmprs.entity.PmprsUser;
import sg.edu.nus.iss.pmprs.entity.PmprsUserRole;
import sg.edu.nus.iss.pmprs.vo.PmprsUserVo;

@Component
public class UserMaintenanceBl extends BusinessLogic<Boolean> {

	@Autowired
	PmprsUserRepository userDao;
	
	@Autowired
	PmprsRoleRepository roleDao;
	
	@Autowired
	PmprsUserRoleRepository userRoleDao;

	private PmprsRole role;
	private PmprsUser user;
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub

		PmprsUserVo v=(PmprsUserVo) vo;
		 role=roleDao.findOne(v.getRoleId());
	    user=new PmprsUser();
		user.setId(v.getId());
		user.setAddress(v.getAddress());
		user.setBirthDate(v.getBirthDate());
		user.setCompany(v.getCompany());
		user.setDepartment(v.getDepartment());
		user.setDesignation(v.getDesignation());
		user.setEmail(v.getEmail());
		user.setGender(v.getGender());
		user.setHomeNumber(v.getHomeNumber());
		user.setMobileNumber(v.getMobileNumber());
		user.setName(v.getName());
		user.setNric(v.getNric());
		user.setPassword(v.getPassword());
		user.setPostcalCode(v.getPostalCode());

		//user.setRoles(List<PmprsRole>);
		user.setStatusId(1);
		user.setUserName(v.getUserName());
	    
	}
	
	
	public boolean create()
	{
		PmprsUser u=userDao.findByUserName(user.getUserName());
		if(u==null){
		PmprsUser usr=userDao.save(user);
		
		PmprsUserRole userRole=new PmprsUserRole();
		userRole.setUser(usr);
		userRole.setRole(role);
		userRoleDao.save(userRole);
		
		return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean update()
	{
		
		PmprsUser exisistingUser=userDao.getOne(user.getId());
		exisistingUser.setAddress(user.getAddress());
		exisistingUser.setBirthDate(user.getBirthDate());
		exisistingUser.setCompany(user.getCompany());
		exisistingUser.setDepartment(user.getDepartment());
		exisistingUser.setDesignation(user.getDesignation());
		exisistingUser.setEmail(user.getEmail());
		exisistingUser.setGender(user.getGender());
		exisistingUser.setHomeNumber(user.getHomeNumber());
		exisistingUser.setMobileNumber(user.getMobileNumber());
		exisistingUser.setName(user.getName());
		exisistingUser.setNric(user.getNric());
		exisistingUser.setPassword(user.getPassword());
		exisistingUser.setPostcalCode(user.getPostcalCode());
		exisistingUser.setUserName(user.getUserName());
		PmprsUser updated=userDao.save(exisistingUser);
		PmprsUserRole userRole=new PmprsUserRole();
		userRole.setUser(updated);
		userRole.setRole(role);
		
		PmprsUserRole ur=userRoleDao.findByUserAndRole(updated, role);
		if(ur==null){
		userRoleDao.save(userRole);
		}
		return true;
	}
	
	public boolean delete(int id)
	{
	
		//Integer id=-1;
		userDao.delete(id);
		return true;
	}
	
	public PmprsUser getUser(int id){
		PmprsUser user=userDao.getOne(id);
		logger.info(user.getEmail());
		return user;

	}
	
	public List<PmprsUser> getAllUsers(){
		
		return userDao.findAll();
	}

	public PmprsUser checkExist(Integer id){
		return userDao.getOne(id);
	}
	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub

	}
}
