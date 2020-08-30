package com.hg.fsd.userservice.dtos;

public class UserRequestModel {
	private int id;
	private String userName;
	private String password;
	private String userType;
	private String email;
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
	public void setConfirmationStatus(boolean confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
	}
	public UserRequestModel(int id, String userName, String password, String userType, String email, String mobileNumber,
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
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", userType=" + userType
				+ ", email=" + email + ", mobileNumber=" + mobileNumber + ", confirmationStatus=" + confirmationStatus
				+ "]";
	}
	
	
	
	
	
}

