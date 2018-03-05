package sg.edu.nus.iss.pmprs.vo;

import sg.edu.nus.iss.pmprs.core.vo.CommonVo;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;

public class AddFavouriteCarparkVo extends CommonVo {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5167559190186187469L;
	PmprsMember member;
	Product carpark;
	public PmprsMember getMember() {
		return member;
	}
	public void setMember(PmprsMember member) {
		this.member = member;
	}
	public Product getCarpark() {
		return carpark;
	}
	public void setCarpark(Product carpark) {
		this.carpark = carpark;
	}

}
