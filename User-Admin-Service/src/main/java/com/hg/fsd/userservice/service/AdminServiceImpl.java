package com.hg.fsd.userservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hg.fsd.userservice.dao.AdminDao;
import com.hg.fsd.userservice.entity.User;

@Service("AdminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao adminDao ; 
	
	public AdminServiceImpl(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

	@Override
	public User findUser(String user_name, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
