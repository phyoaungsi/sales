package sg.edu.nus.iss.pmprs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;


public interface PmprsCarParkOwnerRespository  extends JpaRepository<PmprsCarParkOwner,Integer>{
	List<PmprsCarParkOwner> findByParkriteMerchantIdLike(String parkriteMerchantId);
	List<PmprsCarParkOwner> findByNameLike(String name);
	List<PmprsCarParkOwner> findByCompanyNameLike(String companyName);

}
