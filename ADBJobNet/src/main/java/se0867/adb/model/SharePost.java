package se0867.adb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.taglibs.standard.extra.spath.Step;

@Entity
@Table(name = "sharepost")
public class SharePost {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "memberEmail")
	private String memberEmail;
	
	@Column(name = "jobId")
	int jobId;
	
	@Column(name = "timeShare")
	private Date timeShare;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "jobname")
	private String jobname;
	
	@Column(name = "jobDesciption")
	private String jobDesciption;
	
	@Column(name = "actMemberEmail")
	private String actMemberEmail;
	
	@Column(name = "isLike")
	private boolean isLike;
	
	@Column(name = "comment")
	private String comment;
	
	@Column(name = "totalLike")
	private int totalLike;
	
	public SharePost() {
		// TODO Auto-generated constructor stub
	}

	

	public SharePost(int id, String memberEmail, int jobId, Date timeShare,
			String description, String jobname, String jobDesciption,
			String actMemberEmail, boolean isLike, String comment, int totalLike) {
		super();
		this.id = id;
		this.memberEmail = memberEmail;
		this.jobId = jobId;
		this.timeShare = timeShare;
		this.description = description;
		this.jobname = jobname;
		this.jobDesciption = jobDesciption;
		this.actMemberEmail = actMemberEmail;
		this.isLike = isLike;
		this.comment = comment;
		this.totalLike = totalLike;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public Date getTimeShare() {
		return timeShare;
	}

	public void setTimeShare(Date timeShare) {
		this.timeShare = timeShare;
	}

	public String getJobname() {
		return jobname;
	}

	public void setJobname(String jobname) {
		this.jobname = jobname;
	}

	public String getJobDesciption() {
		return jobDesciption;
	}

	public void setJobDesciption(String jobDesciption) {
		this.jobDesciption = jobDesciption;
	}

	public String getActMemberEmail() {
		return actMemberEmail;
	}

	public void setActMemberEmail(String actMemberEmail) {
		this.actMemberEmail = actMemberEmail;
	}

	public boolean isLike() {
		return isLike;
	}

	public void setLike(boolean isLike) {
		this.isLike = isLike;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getTotalLike() {
		return totalLike;
	}

	public void setTotalLike(int totalLike) {
		this.totalLike = totalLike;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
