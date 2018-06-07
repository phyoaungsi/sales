package sg.edu.nus.iss.pmprs.business.carpark;




//import org.jsoup.helper.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





import sg.edu.nus.iss.pmprs.core.business.BusinessLogic;
import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.core.webservice.google.GeoCode;
import sg.edu.nus.iss.pmprs.dao.StockRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsCarParkOwnerRespository;
import sg.edu.nus.iss.pmprs.dao.ProductRepository;
import sg.edu.nus.iss.pmprs.dao.PmprsParkingSlotRepository;
import sg.edu.nus.iss.pmprs.entity.CarPark;
import sg.edu.nus.iss.pmprs.entity.PmprsBoookingFees;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.SalePrice;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.entity.PmprsParkingSlot;
import sg.edu.nus.iss.pmprs.exceptions.NoCarparkIdException;
import sg.edu.nus.iss.pmprs.vo.product.ProductVo;

@Service
public class CreateCarParkBl extends BusinessLogic<ProductVo> {

	@Autowired 
	ProductRepository carparkRepository;
	
	@Autowired 
	PmprsCarParkOwnerRespository ownerRepository;
	
	@Autowired
	PmprsParkingSlotRepository slotRepository;
	private ProductVo carpark;
	
	GeoCode gc;
	@Override
	protected void execute(CommonVo vo) {
		// TODO Auto-generated method stub	
		
		Product p=new Product();
		
		
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
	    p.setSellPriceLocal(carpark.getSellPriceLocal());
	    p.setSellPrice(carpark.getSellPrice());
		p.setDeliveryPrice(carpark.getDeliveryPrice());
		p.setDeliveryPriceLocal(carpark.getDeliveryPriceLocal()); 
		p.setColor(carpark.getColor());
		p.setSize(carpark.getSize()); 
		p.setWeight(carpark.getWeight());
		carparkRepository.save(p);	
	
	}
	


	@Override
	protected void doValidation() {
		// TODO Auto-generated method stub
		if(this.getCarpark().getProductId()==null)
		throw new NoCarparkIdException();
	}

	
	@Override
	public ProductVo getResult() {
		// TODO Auto-generated method stub
		return carpark;
	}
	

	public void getResult(ProductVo v) {
		// TODO Auto-generated method stub
		this. carpark=v;
	}

	public ProductVo getCarpark() {
		return carpark;
	}

	public void setCarpark(ProductVo carpark) {
		this.carpark = carpark;
	}




}
