
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import sg.edu.nus.iss.pmprs.entity.PmprsRoleFeature;
/**
 * PmprsFeature is a mapping of pmprs_feature Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_feature" )
public class PmprsFeature extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 512931067822672569L;	
    
	
    
	
    
	
    @Column(name="sorting_order_number")
	private Integer sortingOrderNumber;
    @Column(name="parent_feature_id")
	private Integer parentFeatureId;
    @Column(name="is_feature")
	private Boolean isFeature;
    @Column(name="is_menu")
	private Boolean isMenu;
    @Column(name="menu_name")
	private String menuName;
    @Column(name="feature_name")
	private String featureName;
    
	
    /**
     * Prefered methods to create a PmprsFeature is via the createPmprsFeature method in PmprsFeatureManager or
     * via the factory class PmprsFeatureFactory create method
     */
    public PmprsFeature()
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





	public Integer getSortingOrderNumber()
    {
        return sortingOrderNumber;
    }
	
 
   public void setSortingOrderNumber(Integer newVal)
    {
        sortingOrderNumber = newVal;
    }

    /**
     * Setter method for sortingOrderNumber.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to sortingOrderNumber
     */
    public void setSortingOrderNumber(int newVal)
    {
        setSortingOrderNumber(new Integer(newVal));
    }





	public Integer getParentFeatureId()
    {
        return parentFeatureId;
    }
	
 
   public void setParentFeatureId(Integer newVal)
    {
        parentFeatureId = newVal;
    }

    /**
     * Setter method for parentFeatureId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to parentFeatureId
     */
    public void setParentFeatureId(int newVal)
    {
        setParentFeatureId(new Integer(newVal));
    }





	public Boolean getIsFeature()
    {
        return isFeature;
    }
	
 
   public void setIsFeature(Boolean newVal)
    {
        isFeature = newVal;
    }

    /**
     * Setter method for isFeature.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to isFeature
     */
    public void setIsFeature(boolean newVal)
    {
        setIsFeature(new Boolean(newVal));
    }





	public Boolean getIsMenu()
    {
        return isMenu;
    }
	
 
   public void setIsMenu(Boolean newVal)
    {
        isMenu = newVal;
    }

    /**
     * Setter method for isMenu.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to isMenu
     */
    public void setIsMenu(boolean newVal)
    {
        setIsMenu(new Boolean(newVal));
    }





	public String getMenuName()
    {
        return menuName;
    }
	
 
   public void setMenuName(String newVal)
    {
        menuName = newVal;
    }





	public String getFeatureName()
    {
        return featureName;
    }
	
 
   public void setFeatureName(String newVal)
    {
        featureName = newVal;
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
