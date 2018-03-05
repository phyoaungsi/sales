
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * PmprsGender is a mapping of pmprs_gender Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_gender" )
public class PmprsGender extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 511278584605988441L;	
    
	
    @Column(name="name")
	private String name;
    
	
    /**
     * Prefered methods to create a PmprsGender is via the createPmprsGender method in PmprsGenderManager or
     * via the factory class PmprsGenderFactory create method
     */
    public PmprsGender()
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
