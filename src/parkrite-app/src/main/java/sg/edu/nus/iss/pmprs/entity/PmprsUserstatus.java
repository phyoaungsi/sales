
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.PmprsCarParkOwner;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
/**
 * PmprsUserstatus is a mapping of pmprs_userstatus Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_userstatus" )
public class PmprsUserstatus extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 507973618172620185L;	
    
	
    
	
    
	
    @Column(name="name")
	private String name;
    
	
    /**
     * Prefered methods to create a PmprsUserstatus is via the createPmprsUserstatus method in PmprsUserstatusManager or
     * via the factory class PmprsUserstatusFactory create method
     */
    public PmprsUserstatus()
    {
    }

	
    {
        
    }
	
 
   
    {
        
    }

    /**
     * Setter method for isDeleted.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to isDeleted
     */
   
    {
        
    }





	
    {
        
    }
	
 
   
    {
        
    }

    /**
     * Setter method for lastUpdatedOn.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to lastUpdatedOn
     */
    
    {
        
    }





	
    {
        
    }
	
 
   
    {
        
    }

    /**
     * Setter method for lastUpdatedBy.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to lastUpdatedBy
     */
    
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





	
    {
        
    }
	
 
   
    {
        
    }

    /**
     * Setter method for id.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to id
     */
    
    {
       
    }





}
