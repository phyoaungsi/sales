package sg.edu.nus.iss.pmprs.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sg.edu.nus.iss.pmprs.entity.Product;

public interface ProductRepository extends JpaRepository<Product ,Integer>  {
   
	@Query("select p From Product p where id>?4")
	List<Product> getCarParkByLocation(double upperLattitude,double lowerLattitude,double upperLongitude,double lowerLongitude);
}
