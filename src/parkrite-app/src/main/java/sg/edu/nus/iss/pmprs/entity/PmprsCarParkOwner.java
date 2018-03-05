
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import sg.edu.nus.iss.pmprs.entity.Product;
import sg.edu.nus.iss.pmprs.entity.PmprsUserstatus;
/**
 * PmprsCarParkOwner is a mapping of pmprs_car_park_owner Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_car_park_owner" )
public class PmprsCarParkOwner extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 522845971417744634L;	
    
	
    
	
    
	
    @Column(name="remarks")
	private String remarks;
    @Column(name="office_number")
	private String officeNumber;
    @Column(name="postal_code")
	private String postalCode;
    @Column(name="address")
	private String address;
    @Column(name="company_name")
	private String companyName;
    @Column(name="max_connection_car_park")
	private Integer maxConnectionCarPark;
    @Column(name="private_key")
	private String privateKey;
    @Column(name="public_key")
	private String publicKey;
    @Column(name="status_id")
	private Integer statusId;
    @Column(name="designation")
	private String designation;
    @Column(name="emaill")
	private String emaill;
    @Column(name="contact_number")
	private String contactNumber;
    @Column(name="gender")
	private Boolean gender;
    @Column(name="birth_date")
	private java.util.Date birthDate;
    @Column(name="nric")
	private String nric;
    @Column(name="name")
	private String name;
    @Column(name="parkrite_merchant_id")
	private String parkriteMerchantId;
    
	
    /**
     * Prefered methods to create a PmprsCarParkOwner is via the createPmprsCarParkOwner method in PmprsCarParkOwnerManager or
     * via the factory class PmprsCarParkOwnerFactory create method
     */
    public PmprsCarParkOwner()
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





	public String getRemarks()
    {
        return remarks;
    }
	
 
   public void setRemarks(String newVal)
    {
        remarks = newVal;
    }





	public String getOfficeNumber()
    {
        return officeNumber;
    }
	
 
   public void setOfficeNumber(String newVal)
    {
        officeNumber = newVal;
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





	public String getCompanyName()
    {
        return companyName;
    }
	
 
   public void setCompanyName(String newVal)
    {
        companyName = newVal;
    }





	public Integer getMaxConnectionCarPark()
    {
        return maxConnectionCarPark;
    }
	
 
   public void setMaxConnectionCarPark(Integer newVal)
    {
        maxConnectionCarPark = newVal;
    }

    /**
     * Setter method for maxConnectionCarPark.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to maxConnectionCarPark
     */
    public void setMaxConnectionCarPark(int newVal)
    {
        setMaxConnectionCarPark(new Integer(newVal));
    }





	public String getPrivateKey()
    {
        return privateKey;
    }
	
 
   public void setPrivateKey(String newVal)
    {
        privateKey = newVal;
    }





	public String getPublicKey()
    {
        return publicKey;
    }
	
 
   public void setPublicKey(String newVal)
    {
        publicKey = newVal;
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





	public String getDesignation()
    {
        return designation;
    }
	
 
   public void setDesignation(String newVal)
    {
        designation = newVal;
    }





	public String getEmaill()
    {
        return emaill;
    }
	
 
   public void setEmaill(String newVal)
    {
        emaill = newVal;
    }





	public String getContactNumber()
    {
        return contactNumber;
    }
	
 
   public void setContactNumber(String newVal)
    {
        contactNumber = newVal;
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





	public String getParkriteMerchantId()
    {
        return parkriteMerchantId;
    }
	
 
   public void setParkriteMerchantId(String newVal)
    {
        parkriteMerchantId = newVal;
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
