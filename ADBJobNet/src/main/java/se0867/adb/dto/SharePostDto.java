package se0867.adb.dto;

import java.io.Serializable;

public class SharePostDto implements Serializable {

	private String status;
	private String jobName;
	private String jobDes;
	private int numOfHire;
	
	public SharePostDto() {
		// TODO Auto-generated constructor stub
	}

	public SharePostDto(String status, String jobName, String jobDes,
			int numOfHire) {
		super();
		this.status = status;
		this.jobName = jobName;
		this.jobDes = jobDes;
		this.numOfHire = numOfHire;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobDes() {
		return jobDes;
	}

	public void setJobDes(String jobDes) {
		this.jobDes = jobDes;
	}

	public int getNumOfHire() {
		return numOfHire;
	}

	public void setNumOfHire(int numOfHire) {
		this.numOfHire = numOfHire;
	}
	
	
}
