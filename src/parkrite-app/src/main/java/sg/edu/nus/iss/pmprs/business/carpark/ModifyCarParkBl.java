package sg.edu.nus.iss.pmprs.business.carpark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkRepository;
import sg.edu.nus.iss.pmprs.entity.PmprsBoookingFees;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.SalePrice;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;

@Component
public class ModifyCarParkBl extends  BusinessLogic<ProductVo>  {
	
	@Autowired 
	PmprsCarParkRepository carparkRepository;

	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub
	Product p=new Product();
		ProductVo carpark=(ProductVo) vo;
		
		Integer id=(carpark.getId());
		p=carparkRepository.getOne(id);
		p.setName(carpark.getName());
		p.setDescription(carpark.getDescription());

		p.setFbLink(carpark.getFblink());
		p.setInStock(carpark.isInStock());
		p.setPrice(carpark.getPrice());
		p.setPriceLocal(carpark.getPriceLocal());
		p.setStockId(carpark.getProductId());
		p.setQuantity(carpark.getQuantity());
		p.setRemarks(carpark.getRemarks());
		p.setWebLink(carpark.getWeblink());
		p.setDeliveryDate(carpark.getDeliveryDate());
		p.setArrivalDate(carpark.getArrivalDate());
		carparkRepository.save(p);
	}

	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		
	}

}
