package sg.edu.nus.iss.pmprs.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import sg.edu.nus.iss.pmprs.core.dao.CommonEntity;


@Entity
@Table(name = "pmprs_user_role" )
public class PmprsUserRole extends CommonEntity {
	
	public PmprsRole getRole() {
		return role;
	}

	public void setRole(PmprsRole role) {
		this.role = role;
	}

	public PmprsUser getUser() {
		return user;
	}

	public void setUser(PmprsUser user) {
		this.user = user;
	}

	@ManyToOne
    @JoinColumn(name="role_id")
	private PmprsRole role;
	
	@ManyToOne
    @JoinColumn(name="user_id")
	private PmprsUser user;

}
