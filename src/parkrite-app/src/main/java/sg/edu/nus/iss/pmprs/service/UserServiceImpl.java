package sg.edu.nus.iss.pmprs.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.business.user.UserMaintenanceBl;
import sg.edu.nus.iss.pmprs.dao.PmprsUserRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsUser;
import sg.edu.nus.iss.pmprs.vo.PmprsUserVo;
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

	Logger logger=Logger.getLogger(this.getClass());
	@Autowired PmprsUserRepository userDao;
	@Autowired UserMaintenanceBl userbl;
	public PmprsUser getUserByUserName(String userName) {
		// TODO Auto-generated method stub
		PmprsUser u= userDao.findByUserName(userName);
		return u;
	}

	public PmprsUser getUserByUserId(Integer id) {
		// TODO Auto-generated method stub
	
		PmprsUser exissiting=userbl.getUser(id);
		logger.info(exissiting.getEmail());
		return exissiting; 
	}

	

	public void create(PmprsUserVo userVo) {
		// TODO Auto-generated method stub
		userbl.setParamter(userVo);
		userbl.process();
		userbl.create();
		
	}

	@Transactional
	public void update(PmprsUserVo userVo) {
		// TODO Auto-generated method stub
		userbl.setParamter(userVo);
		userbl.process();
		userbl.update();
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
   
		userDao.delete(id);
	}

	public List<PmprsUser> getAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
