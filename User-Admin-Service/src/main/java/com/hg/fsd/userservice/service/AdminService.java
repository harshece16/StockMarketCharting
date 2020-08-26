package com.hg.fsd.userservice.service;
import com.hg.fsd.userservice.entity.User;

public interface AdminService  {
	
	public User findUser(String user_name, String password);

}
