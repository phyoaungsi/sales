
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
import sg.edu.nus.iss.pmprs.entity.PmprsUser;
/**
 * PmprsStatusBean is a mapping of pmprs_status Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_status" )
public class PmprsStatus extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 8009317747714427885L;	
   
   
    @Column(name="name")
	private String name;
    @Column(name="status_id")
	private Integer statusId;
    /**
     * Prefered methods to create a PmprsStatusBean is via the createPmprsStatusBean method in PmprsStatusManager or
     * via the factory class PmprsStatusFactory create method
     */
    protected PmprsStatus()
    {
    }



    public void setIsDeleted(boolean newVal)
    {
        setIsDeleted(new Boolean(newVal));
    }


  
    /**
     * Setter method for lastUpdatedOn.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to lastUpdatedOn
     */
    public void setLastUpdatedOn(long newVal)
    {
        setLastUpdatedOn(new java.util.Date(newVal));
    }






 
 




	public String getName()
    {
        return name;
    }
	
 
   public void setName(String newVal)
    {
        name = newVal;
    }





	public Integer getStatusId()
    {
        return statusId;
    }
	
 
   public void setStatusId(Integer newVal)
    {
        statusId = newVal;
    }

    /**
     * Setter method for statusId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to statusId
     */
    public void setStatusId(int newVal)
    {
        setStatusId(new Integer(newVal));
    }





}
