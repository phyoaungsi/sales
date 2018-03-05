
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.SalePrice;
/**
 * PmprsBoookingFees is a mapping of pmprs_boooking_fees Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_boooking_fees" )
public class PmprsBoookingFees extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 519541004984376378L;	
    
	
    
	
    
	
    @Column(name="booking_fees")
	private Float bookingFees;
    
    @OneToOne(mappedBy="bookingFees")
    private SalePrice carparkBookingFees;
    
	
   
    
    /**
     * Prefered methods to create a PmprsBoookingFees is via the createPmprsBoookingFees method in PmprsBoookingFeesManager or
     * via the factory class PmprsBoookingFeesFactory create method
     */
    public PmprsBoookingFees()
    {
    }

	
 






	public Float getBookingFees()
    {
        return bookingFees;
    }
	
 
   public void setBookingFees(Float newVal)
    {
        bookingFees = newVal;
    }









public SalePrice getCarparkBookingFees() {
	return carparkBookingFees;
}









public void setCarparkBookingFees(SalePrice carparkBookingFees) {
	this.carparkBookingFees = carparkBookingFees;
}












}
