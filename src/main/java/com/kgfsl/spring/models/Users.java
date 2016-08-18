package com.kgfsl.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name="users")
public class Users {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="user_type")
	private int userType;
	
	@Column(name="name")
	private String name;
	
	@Column(name="username")
	private String userName;
	
	@Column(name="userpassword")
	private String userPassword;
	
	@Column(name="password_enc")
	private String passwordEnc;
	
	@Column(name="companyname")
	private String companyName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="website")
	private String website;
		
	@Column(name="uaddress")
	private String userAddress;
	
	@Column(name="logo")
	private int logo;
	
	@Column(name="status")
	private String status;
	
	@Column(name="approveddate")
	private DateTime approveddate;
	
	@Column(name="active")
	private String active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getPasswordEnc() {
		return passwordEnc;
	}

	public void setPasswordEnc(String passwordEnc) {
		this.passwordEnc = passwordEnc;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public int getLogo() {
		return logo;
	}

	public void setLogo(int logo) {
		this.logo = logo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DateTime getApproveddate() {
		return approveddate;
	}

	public void setApproveddate(DateTime approveddate) {
		this.approveddate = approveddate;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", userType=" + userType + ", name=" + name + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", passwordEnc=" + passwordEnc + ", companyName=" + companyName
				+ ", email=" + email + ", phone=" + phone + ", mobile=" + mobile + ", website=" + website
				+ ", userAddress=" + userAddress + ", logo=" + logo + ", status=" + status + ", approveddate="
				+ approveddate + ", active=" + active + ", getId()=" + getId() + ", getUserType()=" + getUserType()
				+ ", getName()=" + getName() + ", getUserName()=" + getUserName() + ", getUserPassword()="
				+ getUserPassword() + ", getPasswordEnc()=" + getPasswordEnc() + ", getCompanyName()="
				+ getCompanyName() + ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone() + ", getMobile()="
				+ getMobile() + ", getWebsite()=" + getWebsite() + ", getUserAddress()=" + getUserAddress()
				+ ", getLogo()=" + getLogo() + ", getStatus()=" + getStatus() + ", getApproveddate()="
				+ getApproveddate() + ", getActive()=" + getActive() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
