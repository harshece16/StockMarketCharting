package com.hg.fsd.userservice.dtos;

public class UserResponseModel {
	private String userName;
    private String userType; 
    private String email;
    private boolean confirmationStatus;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public boolean isConfirmationStatus() {
		return confirmationStatus;
	}
	public void setConfirmationStatus(boolean confirmationStatus) {
		this.confirmationStatus = confirmationStatus;
	}
	public UserResponseModel(String userName, String userType, String email, boolean confirmationStatus) {
		super();
		this.userName = userName;
		this.userType = userType;
		this.email = email;
		this.confirmationStatus = confirmationStatus;
	}
	@Override
	public String toString() {
		return "UserResponseModel [userName=" + userName + ", userType=" + userType + ", email=" + email
				+ ", confirmationStatus=" + confirmationStatus + "]";
	}
    
}
