
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import sg.edu.nus.iss.pmprs.entity.PmprsComplimentary;
import sg.edu.nus.iss.pmprs.entity.PmprsRedemption;
/**
 * PmprsReason is a mapping of pmprs_reason Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_reason" )
public class PmprsReason extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 506321130660968761L;	
    
	
    
	
    
	
    @Column(name="name")
	private String name;
    
	
    /**
     * Prefered methods to create a PmprsReason is via the createPmprsReason method in PmprsReasonManager or
     * via the factory class PmprsReasonFactory create method
     */
    public PmprsReason()
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
