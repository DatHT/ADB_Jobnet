package se0867.adb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member implements Serializable{

	@Id
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "birthday")
	private Date birthday;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "university")
	private String university;
	
	@Column(name = "phone")
	private int phone;
	
	@Column(name = "gender")
	private int gender;
	
	@Column(name = "volunteer")
	private String volunteer;
	
	@Column(name = "skill")
	private String skill;
	
	@Column(name = "certification")
	private String certification;
	
	@Column(name = "experience")
	private String experience;
	
	@Column(name = "createDate")
	private Date createDate;
	
	@Column(name = "updateDate")
	private Date updateDate;
	
	@Column(name = "profilePath")
	private String profilePath;
	
	@Column(name = "coverPath")
	private String coverPath;
	
	@Column(name = "taxPayerNumber", nullable = true)
	private int taxPayerNumber;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getVolunteer() {
		return volunteer;
	}

	public void setVolunteer(String volunteer) {
		this.volunteer = volunteer;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getCertification() {
		return certification;
	}
	
	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
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

	public String getProfilePath() {
		return profilePath;
	}

	public void setProfilePath(String profilePath) {
		this.profilePath = profilePath;
	}

	public String getCoverPath() {
		return coverPath;
	}

	public void setCoverPath(String coverPath) {
		this.coverPath = coverPath;
	}

	public int getTaxPayerNumber() {
		return taxPayerNumber;
	}

	public void setTaxPayerNumber(int taxPayerNumber) {
		this.taxPayerNumber = taxPayerNumber;
	}
	
	
	
	
}
