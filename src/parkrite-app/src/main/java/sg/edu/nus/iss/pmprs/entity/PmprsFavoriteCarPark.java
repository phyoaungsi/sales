
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
/**
 * PmprsFavoriteCarPark is a mapping of pmprs_favorite_car_park Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_favorite_car_park" )
public class PmprsFavoriteCarPark extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 512931067822672569L;	
    
	
    
	
    
	
	@OneToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "car_park_id", nullable = false)
 	private Product carPark;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "member_park_id", nullable = false)
	private PmprsMember member;
	public Product getCarPark() {
		return carPark;
	}
	public void setCarPark(Product carPark) {
		this.carPark = carPark;
	}
	public PmprsMember getMember() {
		return member;
	}
	public void setMember(PmprsMember member) {
		this.member = member;
	}
   
}
