package sg.edu.nus.iss.pmprs.service;

import java.util.ArrayList;
import java.util.List;









import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.transaction.annotation.Transactional;

import sg.edu.nus.iss.pmprs.business.carpark.CreateCarParkBl;
import sg.edu.nus.iss.pmprs.business.carpark.ModifyCarParkBl;
import sg.edu.nus.iss.pmprs.dao.PmprsBookingRepository;
import sg.edu.nus.iss.pmprs.dao.ProductRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsFavouriteRepository;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.OrderStock;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsFavoriteCarPark;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;

@org.springframework.stereotype.Service
public class CarparkService {
	
	@Autowired 
	CreateCarParkBl createCarparkBl;
	
	@Autowired 
	ProductRepository cRespository;
	
	@Autowired 
	PmprsBookingRepository bookingRepository;
	
	@Autowired
	PmprsFavouriteRepository favouriteRepository;
	@Autowired
	ModifyCarParkBl updateBl;
	public ProductVo createCarpark(ProductVo carpark)
	{
		
		createCarparkBl.setCarpark(carpark);
		createCarparkBl.process();
		
		return createCarparkBl.getResult();
	}

	@Transactional
	public ProductVo updateCarpark(ProductVo carpark)
	{
		
		updateBl.setParamter(carpark);
		updateBl.process();
		
		return createCarparkBl.getResult();
	}

	
	public CreateCarParkBl getCreateCarparkBl() {
		return createCarparkBl;
	}

	public void setCreateCarparkBl(CreateCarParkBl createCarparkBl) {
		this.createCarparkBl = createCarparkBl;
	}

    @Transactional
	public ProductVo getCarPark(int id) {
		// TODO Auto-generated method stub
		Product carpark=cRespository.getOne(id);
		ProductVo vo=new ProductVo();
		vo.setId(carpark.getId());
		vo.setName(carpark.getName());
		vo.setDescription(carpark.getDescription());

		vo.setFblink(carpark.getFbLink());
		vo.setInStock(carpark.getInStock());
		vo.setPrice(carpark.getPrice());
		vo.setPriceLocal(carpark.getPriceLocal());
		vo.setProductId(carpark.getStockId());
		vo.setQuantity(carpark.getQuantity());
		vo.setRemarks(carpark.getRemarks());
		vo.setWeblink(carpark.getWebLink());
		vo.setDeliveryDate(carpark.getDeliveryDate());
		vo.setArrivalDate(carpark.getArrivalDate());
		return vo;
	}

@Transactional
	public void deleteCarpark(Integer id) {
		// TODO Auto-generated method stub
		
	    Product carpark=	cRespository.findOne(id);
	    List<OrderStock> bookings= carpark.getOrderStock();
	    List<PmprsFavoriteCarPark> fvc=  favouriteRepository.findByCarPark(carpark);
	    favouriteRepository.flush();
	    for(PmprsFavoriteCarPark f:fvc){ favouriteRepository.delete(f.getId());  }
	    favouriteRepository.flush();
	    for(OrderStock b:bookings){ bookingRepository.delete(b.getId());  }
		cRespository.delete(id);
	}


	public List<ProductVo> getAllCarparks() {
		// TODO Auto-generated method stub
		
		List<Product> carparks = cRespository.findAll();
		List<ProductVo> ProductVos = new ArrayList<ProductVo>();
		for (Product car : carparks){
			ProductVo vo = new ProductVo();
			if (car.getId() != null){
				vo.setId(car.getId());
			}
			vo.setName(car.getName());
			vo.setDescription(car.getDescription());
			ProductVos.add(vo);
		}
		
		return ProductVos;
	}


	public List<ProductVo> searchCarpark(String string, String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
