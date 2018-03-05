
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.entity.PmprsComplimentary;
import sg.edu.nus.iss.pmprs.entity.PmprsFavoriteCarPark;
import sg.edu.nus.iss.pmprs.entity.PmprsInboxMessage;
import sg.edu.nus.iss.pmprs.entity.PmprsMemberVehicle;
import sg.edu.nus.iss.pmprs.entity.PmprsUserstatus;
/**
 * PmprsMember is a mapping of pmprs_member Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_member" )
public class PmprsMember extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 516236038551008122L;	
    
	
    
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "member")
	private List<PmprsMemberVehicle> memberVehicle;
    
	
    @Column(name="status_id")
	private Integer statusId;
    @Column(name="email",unique=true)
	private String email;
    @Column(name="member_user_id",unique=true)
	private String memberUserId;
    @Column(name="mobile_number")
	private String mobileNumber;
    @Column(name="home_number")
	private String homeNumber;
    @Column(name="postal_code")
	private String postalCode;
    @Column(name="address")
	private String address;
    @Column(name="gender")
	private Boolean gender;
    @Column(name="birth_date")
	private java.util.Date birthDate;
    @Column(name="nric")
	private String nric;
    @Column(name="name")
	private String name;
    @Column(name="password")
   	private String password;
    
	
    /**
     * Prefered methods to create a PmprsMember is via the createPmprsMember method in PmprsMemberManager or
     * via the factory class PmprsMemberFactory create method
     */
    public PmprsMember()
    {
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





	public String getEmail()
    {
        return email;
    }
	
 
   public void setEmail(String newVal)
    {
        email = newVal;
    }





	public String getMemberUserId()
    {
        return memberUserId;
    }
	
 
   public void setMemberUserId(String newVal)
    {
        memberUserId = newVal;
    }





	public String getMobileNumber()
    {
        return mobileNumber;
    }
	
 
   public void setMobileNumber(String newVal)
    {
        mobileNumber = newVal;
    }





	public String getHomeNumber()
    {
        return homeNumber;
    }
	
 
   public void setHomeNumber(String newVal)
    {
        homeNumber = newVal;
    }





	public String getPostalCode()
    {
        return postalCode;
    }
	
 
   public void setPostalCode(String newVal)
    {
        postalCode = newVal;
    }





	public String getAddress()
    {
        return address;
    }
	
 
   public void setAddress(String newVal)
    {
        address = newVal;
    }





	public Boolean getGender()
    {
        return gender;
    }
	
 
   public void setGender(Boolean newVal)
    {
        gender = newVal;
    }

    /**
     * Setter method for gender.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to gender
     */
    public void setGender(boolean newVal)
    {
        setGender(new Boolean(newVal));
    }





	public java.util.Date getBirthDate()
    {
        return birthDate;
    }
	
 
   public void setBirthDate(java.util.Date newVal)
    {
        birthDate = newVal;
    }

    /**
     * Setter method for birthDate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to birthDate
     */
    public void setBirthDate(long newVal)
    {
        setBirthDate(new java.util.Date(newVal));
    }





	public String getNric()
    {
        return nric;
    }
	
 
   public void setNric(String newVal)
    {
        nric = newVal;
    }





	public String getName()
    {
        return name;
    }
	
 
   public void setName(String newVal)
    {
        name = newVal;
    }


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public List<PmprsMemberVehicle> getMemberVehicle() {
	return memberVehicle;
}


public void setMemberVehicle(List<PmprsMemberVehicle> memberVehicle) {
	this.memberVehicle = memberVehicle;
}





}
