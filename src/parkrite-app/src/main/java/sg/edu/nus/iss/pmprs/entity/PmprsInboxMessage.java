
package sg.edu.nus.iss.pmprs.entity;

import java.io.Serializable;
import java.util.Map;
import java.util.HashMap;
import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import sg.edu.nus.iss.pmprs.entity.PmprsMember;
/**
 * PmprsInboxMessage is a mapping of pmprs_inbox_message Table.
 * @author phyo
*/
@Entity
@Table(name = "pmprs_inbox_message" )
public class PmprsInboxMessage extends CommonEntity   implements Serializable
{
	private static final long serialVersionUID = 516236038551008122L;	
    
	
    
	
    
	
    @Column(name="message")
	private String message;
    @Column(name="member_id")
	private Integer memberId;
    
    @Column(name="title")
   	private String title;
    /**
     * Prefered methods to create a PmprsInboxMessage is via the createPmprsInboxMessage method in PmprsInboxMessageManager or
     * via the factory class PmprsInboxMessageFactory create method
     */
    public PmprsInboxMessage()
    {
    }

	




	public String getMessage()
    {
        return message;
    }
	
 
   public void setMessage(String newVal)
    {
        message = newVal;
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





	
    public String getTitle() {
		return title;
	}






	public void setTitle(String title) {
		this.title = title;
	}





}
