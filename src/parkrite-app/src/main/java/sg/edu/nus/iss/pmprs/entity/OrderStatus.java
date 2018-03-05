
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * PmprsBookingStatus is a mapping of pmprs_booking_status Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_booking_status" )
public class OrderStatus extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 474923936659068441L;	
    
	
    
	
    
	
    @Column(name="name")
	private String name;
    
	
    /**
     * Prefered methods to create a PmprsBookingStatus is via the createPmprsBookingStatus method in PmprsBookingStatusManager or
     * via the factory class PmprsBookingStatusFactory create method
     */
    public OrderStatus()
    {
    }

	
    public String getName()
    {
        return name;
    }
	
 
   public void setName(String newVal)
    {
        name = newVal;
    }





}
