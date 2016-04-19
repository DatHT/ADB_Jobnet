package se0867.adb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job")
public class Job implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "status")
	private int status;
	
	@Column(name = "numofHiring")
	private int numofHiring;
	
	@Column(name = "createDate")
	private Date createDate;
	
	@Column(name = "updateDate")
	private Date updateDate;
	
	@Column(name = "taxPayerNumber")
	private int taxPayerNumber;
	
	@Column(name = "numOfSearch")
	private int numOfSearch;
	
	@Column(name = "numOfShare")
	private int numOfShare;
	
	public Job() {
		// TODO Auto-generated constructor stub
	}

	public Job(String name, String description, int status,
			int numofHiring, Date createDate, Date updateDate,
			int taxPayerNumber, int numOfSearch, int numOfShare) {
		super();
		
		this.name = name;
		this.description = description;
		this.status = status;
		this.numofHiring = numofHiring;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.taxPayerNumber = taxPayerNumber;
		this.numOfSearch = numOfSearch;
		this.numOfShare = numOfShare;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getNumofHiring() {
		return numofHiring;
	}

	public void setNumofHiring(int numofHiring) {
		this.numofHiring = numofHiring;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getTaxPayerNumber() {
		return taxPayerNumber;
	}

	public void setTaxPayerNumber(int taxPayerNumber) {
		this.taxPayerNumber = taxPayerNumber;
	}

	public int getNumOfSearch() {
		return numOfSearch;
	}

	public void setNumOfSearch(int numOfSearch) {
		this.numOfSearch = numOfSearch;
	}

	public int getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(int numOfShare) {
		this.numOfShare = numOfShare;
	}
	
	
	
}
