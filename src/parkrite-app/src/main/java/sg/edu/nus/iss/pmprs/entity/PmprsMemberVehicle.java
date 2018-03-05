
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.entity.Order;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
/**
 * PmprsMemberVehicle is a mapping of pmprs_member_vehicle Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_member_vehicle" )
public class PmprsMemberVehicle extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 514583555334323993L;	
    
	
    
	
    
	
    @Column(name="is_default")
	private Boolean isDefault;
    @Column(name="iu_number")
	private String iuNumber;
    @Column(name="vehicle_plate_number")
	private String vehiclePlateNumber;
    
    @ManyToOne
    @JoinColumn(name="member_id")
	private PmprsMember member;
    
	
    public PmprsMember getMember() {
		return member;
	}


	public void setMember(PmprsMember member) {
		this.member = member;
	}


	/**
     * Prefered methods to create a PmprsMemberVehicle is via the createPmprsMemberVehicle method in PmprsMemberVehicleManager or
     * via the factory class PmprsMemberVehicleFactory create method
     */
    public PmprsMemberVehicle()
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





	public Boolean getIsDefault()
    {
        return isDefault;
    }
	
 
   public void setIsDefault(Boolean newVal)
    {
        isDefault = newVal;
    }

    /**
     * Setter method for isDefault.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to isDefault
     */
    public void setIsDefault(boolean newVal)
    {
        setIsDefault(new Boolean(newVal));
    }





	public String getIuNumber()
    {
        return iuNumber;
    }
	
 
   public void setIuNumber(String newVal)
    {
        iuNumber = newVal;
    }





	public String getVehiclePlateNumber()
    {
        return vehiclePlateNumber;
    }
	
 
   public void setVehiclePlateNumber(String newVal)
    {
        vehiclePlateNumber = newVal;
    }


}
