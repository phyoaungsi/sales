package sg.edu.nus.iss.pmprs.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sg.edu.nus.iss.pmprs.entity.CarPark;
import sg.edu.nus.iss.pmprs.entity.Product;

public interface StockRepository extends JpaRepository<Product ,Integer>{
}