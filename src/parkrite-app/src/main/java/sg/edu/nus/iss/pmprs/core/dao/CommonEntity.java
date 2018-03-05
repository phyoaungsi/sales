package sg.edu.nus.iss.pmprs.core.dao;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class CommonEntity {

	@Column(nullable = false, length = 64)
	private String txnRef;

	@Temporal(TemporalType.TIMESTAMP)
	@Column
	private Date createdTime;

	@Column
	private String tags;

	@Column
	private String metadata;

	@Column
	private String json;

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	@PrePersist
	private void setUp() {
		this.createdTime = new Date();
		if (this.txnRef == null) {
			this.txnRef = UUID.randomUUID().toString();
		}
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getJson() {
		return json;
	}

	public void setJson(String json) {
		this.json = json;
	}

	@Column(name = "is_deleted")
	private Boolean isDeleted;
	@Column(name = "last_updated_on")
	private java.util.Date lastUpdatedOn;
	@Column(name = "last_updated_by")
	private Integer lastUpdatedBy;
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/**
	 * Prefered methods to create a PmprsBookingBean is via the
	 * createPmprsBookingBean method in PmprsBookingManager or via the factory
	 * class PmprsBookingFactory create method
	 */

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean newVal) {
		isDeleted = newVal;
	}

	public java.util.Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(java.util.Date newVal) {
		lastUpdatedOn = newVal;
	}

	public Integer getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer newVal) {
		lastUpdatedBy = newVal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer newVal) {
		id = newVal;
	}

	public String getTxnRef() {
		return txnRef;
	}

	public void setTxnRef(String txnRef) {
		this.txnRef = txnRef;
	}
}
