package sg.edu.nus.iss.pmprs.service;

import java.util.List;

import sg.edu.nus.iss.pmprs.entity.PmprsUser;
import sg.edu.nus.iss.pmprs.vo.PmprsUserVo;

public interface UserService {

	public  PmprsUser getUserByUserName(String userName);
	public  PmprsUser getUserByUserId(Integer id);
	public  void create(PmprsUserVo userVo);
	public  void update(PmprsUserVo userVo);
	public  void delete(int id);
	public  List<PmprsUser> getAll();

}