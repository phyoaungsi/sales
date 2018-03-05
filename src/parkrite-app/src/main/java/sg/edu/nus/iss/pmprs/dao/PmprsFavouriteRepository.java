package sg.edu.nus.iss.pmprs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsFavoriteCarPark;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;

public interface PmprsFavouriteRepository extends JpaRepository<PmprsFavoriteCarPark, Integer> {
	
 public List<PmprsFavoriteCarPark>	findByMember(PmprsMember member);
 public PmprsFavoriteCarPark findByMemberAndCarPark(PmprsMember member,Product carpark);
 public List<PmprsFavoriteCarPark> findByCarPark(Product carpark);

}
