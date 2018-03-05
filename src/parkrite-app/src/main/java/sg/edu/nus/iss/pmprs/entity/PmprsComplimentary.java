
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
import sg.edu.nus.iss.pmprs.entity.PmprsReason;
/**
 * PmprsComplimentary is a mapping of pmprs_complimentary Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_complimentary" )
public class PmprsComplimentary extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 521193492496027802L;	
    
    @Column(name="remarks")
	private String remarks;
    @Column(name="reason_id")
	private Integer reasonId;
    @Column(name="to_date")
	private java.util.Date toDate;
    @Column(name="from_date")
	private java.util.Date fromDate;
    @Column(name="car_park_id")
	private Integer carParkId;
    @Column(name="iu_number")
	private String iuNumber;
    @Column(name="vehicle_plate_number")
	private String vehiclePlateNumber;
    @Column(name="user_email")
	private String userEmail;
    @Column(name="member_id")
	private Integer memberId;
    
	
    /**
     * Prefered methods to create a PmprsComplimentary is via the createPmprsComplimentary method in PmprsComplimentaryManager or
     * via the factory class PmprsComplimentaryFactory create method
     */
    public PmprsComplimentary()
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





	public Integer getReasonId()
    {
        return reasonId;
    }
	
 
   public void setReasonId(Integer newVal)
    {
        reasonId = newVal;
    }

    /**
     * Setter method for reasonId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to reasonId
     */
    public void setReasonId(int newVal)
    {
        setReasonId(new Integer(newVal));
    }





	public java.util.Date getToDate()
    {
        return toDate;
    }
	
 
   public void setToDate(java.util.Date newVal)
    {
        toDate = newVal;
    }

    /**
     * Setter method for toDate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to toDate
     */
    public void setToDate(long newVal)
    {
        setToDate(new java.util.Date(newVal));
    }





	public java.util.Date getFromDate()
    {
        return fromDate;
    }
	
 
   public void setFromDate(java.util.Date newVal)
    {
        fromDate = newVal;
    }

    /**
     * Setter method for fromDate.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to fromDate
     */
    public void setFromDate(long newVal)
    {
        setFromDate(new java.util.Date(newVal));
    }





	public Integer getCarParkId()
    {
        return carParkId;
    }
	
 
   public void setCarParkId(Integer newVal)
    {
        carParkId = newVal;
    }

    /**
     * Setter method for carParkId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to carParkId
     */
    public void setCarParkId(int newVal)
    {
        setCarParkId(new Integer(newVal));
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





	public String getUserEmail()
    {
        return userEmail;
    }
	
 
   public void setUserEmail(String newVal)
    {
        userEmail = newVal;
    }





	public Integer getMemberId()
    {
        return memberId;
    }
	
 
   public void setMemberId(Integer newVal)
    {
        memberId = newVal;
    }

    /**
     * Setter method for memberId.
     * <br>
     * Convenient for those who do not want to deal with Objects for primary types.
     *
     * @param newVal the new value to be assigned to memberId
     */
    public void setMemberId(int newVal)
    {
        setMemberId(new Integer(newVal));
    }





}
