
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

import sg.edu.nus.iss.pmprs.entity.PmprsBoookingFees;
import sg.edu.nus.iss.pmprs.entity.Product;
/**
 * PmprsCarParkBookingFees is a mapping of pmprs_car_park_booking_fees Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_car_park_booking_fees" )
public class SalePrice extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 517888521767692250L;	
    
	
    
	
    
	
    @Column(name="end_date")
	private java.util.Date endDate;
    @Column(name="effective_date")
	private java.util.Date effectiveDate;
    
    @OneToOne
    @JoinColumn(name="booking_fees_id",nullable =false)
	private PmprsBoookingFees bookingFees;
    
    @OneToOne(fetch = FetchType.LAZY)
 	@JoinColumn(name = "car_park_id", nullable = false)
 	private Product carPark;
    
	
    /**
     * Prefered methods to create a PmprsCarParkBookingFees is via the createPmprsCarParkBookingFees method in PmprsCarParkBookingFeesManager or
     * via the factory class PmprsCarParkBookingFeesFactory create method
     */
    public SalePrice()
    {
    }

	
    public java.util.Date getEndDate()
    {
        return endDate;
    }
	
 
   public void setEndDate(java.util.Date newVal)
    {
        endDate = newVal;
    }

    /**
     * Setter method for endDate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to endDate
     */
    public void setEndDate(long newVal)
    {
        setEndDate(new java.util.Date(newVal));
    }





	public java.util.Date getEffectiveDate()
    {
        return effectiveDate;
    }
	
 
   public void setEffectiveDate(java.util.Date newVal)
    {
        effectiveDate = newVal;
    }

    /**
     * Setter method for effectiveDate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to effectiveDate
     */
    public void setEffectiveDate(long newVal)
    {
        setEffectiveDate(new java.util.Date(newVal));
    }






	
    public Product getCarPark() {
		return carPark;
	}


	public void setCarPark(Product carPark) {
		this.carPark = carPark;
	}


	public PmprsBoookingFees getBookingFees() {
		return bookingFees;
	}


	public void setBookingFees(PmprsBoookingFees bookingFees) {
		this.bookingFees = bookingFees;
	}





}
