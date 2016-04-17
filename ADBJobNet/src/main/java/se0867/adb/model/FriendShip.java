package se0867.adb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "friendship")
public class FriendShip implements Serializable {
	
	@Id
	@Column(name = "id")
	public int id;
	
	@Column(name = "memberEmail1")
	private String memberEmail1;
	
	@Column(name = "memberEmail2")
	private String memberEmail2;
	
	@Column(name = "requestDate")
	private Date requestDate;
	
	@Column(name = "actionUserEmail")
	private String actionUserEmail;
	
	@Column(name = "acceptDate")
	private Date acceptDate;
	
	@Column(name = "memberName1")
	private String memberName1;
	
	@Column(name = "memberName2")
	private String memberName2;
	public FriendShip(String memberEmail1, String memberEmail2,
			Date requestDate, String actionUserEmail, Date acceptDate,
			String memberName1, String memberName2) {
		super();
		this.memberEmail1 = memberEmail1;
		this.memberEmail2 = memberEmail2;
		this.requestDate = requestDate;
		this.actionUserEmail = actionUserEmail;
		this.acceptDate = acceptDate;
		this.memberName1 = memberName1;
		this.memberName2 = memberName2;
	}
	
	public FriendShip() {
		// TODO Auto-generated constructor stub
	}

	public String getMemberEmail1() {
		return memberEmail1;
	}

	public void setMemberEmail1(String memberEmail1) {
		this.memberEmail1 = memberEmail1;
	}

	public String getMemberEmail2() {
		return memberEmail2;
	}

	public void setMemberEmail2(String memberEmail2) {
		this.memberEmail2 = memberEmail2;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getActionUserEmail() {
		return actionUserEmail;
	}

	public void setActionUserEmail(String actionUserEmail) {
		this.actionUserEmail = actionUserEmail;
	}

	public Date getAcceptDate() {
		return acceptDate;
	}

	public void setAcceptDate(Date acceptDate) {
		this.acceptDate = acceptDate;
	}

	public String getMemberName1() {
		return memberName1;
	}

	public void setMemberName1(String memberName1) {
		this.memberName1 = memberName1;
	}

	public String getMemberName2() {
		return memberName2;
	}

	public void setMemberName2(String memberName2) {
		this.memberName2 = memberName2;
	}
	
	
}
