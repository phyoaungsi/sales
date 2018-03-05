
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import sg.edu.nus.iss.pmprs.entity.PmprsRoleFeature;
/**
 * PmprsRole is a mapping of pmprs_role Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_role" )
public class PmprsRole extends CommonEntity   implements Serializable, GrantedAuthority
{
	private static final long serialVersionUID = 504668651739251929L;	
    
	
    
	
    
	
    @Column(name="is_system_default")
	private Boolean isSystemDefault;
    @Column(name="parent_role_id")
	private Integer parentRoleId;
    @Column(name="created_by")
	private Integer createdBy;
    @Column(name="description")
	private String description;
    @Column(name="name")
	private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	private List<PmprsUserRole> userRoles;
    
    public List<PmprsUserRole> getUserRoles() {
		return userRoles;
	}


	public void setUserRoles(List<PmprsUserRole> userRoles) {
		this.userRoles = userRoles;
	}


	/**
     * Prefered methods to create a PmprsRole is via the createPmprsRole method in PmprsRoleManager or
     * via the factory class PmprsRoleFactory create method
     */
  

	
    public Boolean getIsSystemDefault()
    {
        return isSystemDefault;
    }
	
 
   public void setIsSystemDefault(Boolean newVal)
    {
        isSystemDefault = newVal;
    }

    /**
     * Setter method for isSystemDefault.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to isSystemDefault
     */
    public void setIsSystemDefault(boolean newVal)
    {
        setIsSystemDefault(new Boolean(newVal));
    }





	public Integer getParentRoleId()
    {
        return parentRoleId;
    }
	
 
   public void setParentRoleId(Integer newVal)
    {
        parentRoleId = newVal;
    }

    /**
     * Setter method for parentRoleId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to parentRoleId
     */
    public void setParentRoleId(int newVal)
    {
        setParentRoleId(new Integer(newVal));
    }





	public Integer getCreatedBy()
    {
        return createdBy;
    }
	
 
   public void setCreatedBy(Integer newVal)
    {
        createdBy = newVal;
    }

    /**
     * Setter method for createdBy.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to createdBy
     */
    public void setCreatedBy(int newVal)
    {
        setCreatedBy(new Integer(newVal));
    }





	public String getDescription()
    {
        return description;
    }
	
 
   public void setDescription(String newVal)
    {
        description = newVal;
    }





	public String getName()
    {
        return name;
    }
	
 
   public void setName(String newVal)
    {
        name = newVal;
    }





	
    public String getAuthority() {
		// TODO Auto-generated method stub
		return getName();
	}








}
