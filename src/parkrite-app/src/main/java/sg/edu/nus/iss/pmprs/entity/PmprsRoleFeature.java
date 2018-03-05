
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import sg.edu.nus.iss.pmprs.entity.PmprsFeature;
import sg.edu.nus.iss.pmprs.entity.PmprsRole;
/**
 * PmprsRoleFeature is a mapping of pmprs_role_feature Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_role_feature" )
public class PmprsRoleFeature extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 509626101389304313L;	
    
    @Column(name="is_read_only")
	private Boolean isReadOnly;
    @Column(name="feature_id")
	private Integer featureId;
    @Column(name="role_id")
	private Integer roleId;
    
	
    /**
     * Prefered methods to create a PmprsRoleFeature is via the createPmprsRoleFeature method in PmprsRoleFeatureManager or
     * via the factory class PmprsRoleFeatureFactory create method
     */
    public PmprsRoleFeature()
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





	public Boolean getIsReadOnly()
    {
        return isReadOnly;
    }
	
 
   public void setIsReadOnly(Boolean newVal)
    {
        isReadOnly = newVal;
    }

    /**
     * Setter method for isReadOnly.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to isReadOnly
     */
    public void setIsReadOnly(boolean newVal)
    {
        setIsReadOnly(new Boolean(newVal));
    }





	public Integer getFeatureId()
    {
        return featureId;
    }
	
 
   public void setFeatureId(Integer newVal)
    {
        featureId = newVal;
    }

    /**
     * Setter method for featureId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to featureId
     */
    public void setFeatureId(int newVal)
    {
        setFeatureId(new Integer(newVal));
    }





	public Integer getRoleId()
    {
        return roleId;
    }
	
 
   public void setRoleId(Integer newVal)
    {
        roleId = newVal;
    }

    /**
     * Setter method for roleId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to roleId
     */
    public void setRoleId(int newVal)
    {
        setRoleId(new Integer(newVal));
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
