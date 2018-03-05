
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.entity.Product;
/**
 * PmprsParkingSlot is a mapping of pmprs_parking_slot Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_parking_slot" )
public class PmprsParkingSlot extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 506321130660968761L;	
    
	
    @Column(name="holding_slot")
	private Integer holdingSlot;
    @Column(name="available_slot")
	private Integer availableSlot;
    @Column(name="total_slot")
	private Integer totalSlot;
   
    @OneToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "car_park_id", nullable = false)
 	private Product carPark;
    
	
    /**
     * Prefered methods to create a PmprsParkingSlot is via the createPmprsParkingSlot method in PmprsParkingSlotManager or
     * via the factory class PmprsParkingSlotFactory create method
     */
    public PmprsParkingSlot()
    {
    }

	
    public Integer getHoldingSlot()
    {
        return holdingSlot;
    }
	
 
   public void setHoldingSlot(Integer newVal)
    {
        holdingSlot = newVal;
    }

    /**
     * Setter method for holdingSlot.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to holdingSlot
     */
    public void setHoldingSlot(int newVal)
    {
        setHoldingSlot(new Integer(newVal));
    }





	public int getAvailableSlot()
    {
        return availableSlot;
    }
	
 
   public void setAvailableSlot(Integer newVal)
    {
        availableSlot = newVal;
    }

    /**
     * Setter method for availableSlot.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to availableSlot
     */
    public void setAvailableSlot(int newVal)
    {
        setAvailableSlot(new Integer(newVal));
    }





	public Integer getTotalSlot()
    {
        return totalSlot;
    }
	
 
   public void setTotalSlot(Integer newVal)
    {
        totalSlot = newVal;
    }

    /**
     * Setter method for totalSlot.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to totalSlot
     */
    public void setTotalSlot(int newVal)
    {
        setTotalSlot(new Integer(newVal));
    }






    /**
     * Setter method for carParkId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to carParkId
     */
    public void setCarParkId(int newVal)
    {
        setCarParkId(new Integer(newVal));
    }





	
    public Product getCarPark() {
		return carPark;
	}


	public void setCarPark(Product carPark) {
		this.carPark = carPark;
	}





}
