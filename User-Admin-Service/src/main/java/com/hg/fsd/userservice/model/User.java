package com.hg.fsd.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "UserName")
	private String userName;
	@Column(name = "Password")
	private String password;
	@Column(name = "UserType")
	private String userType;
	@Column(name = "email")
	private String email;
	@Column(name = "MobileNumber")
	private String mobileNumber;
	private boolean confirmationStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public boolean getConfirmationStatus() {
		return confirmationStatus;
	}
	public User(int id, String userName, String password, String userType, String email, String mobileNumber,
			boolean confirmationStatus) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.userType = userType;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.confirmationStatus = confirmationStatus;
	}
	public void setConfirmationStatus(boolean confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
	}
	
}
