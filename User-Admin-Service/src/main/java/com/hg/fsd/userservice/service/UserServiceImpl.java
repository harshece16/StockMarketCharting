package com.hg.fsd.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.hg.fsd.userservice.dao.UserDao;
import com.hg.fsd.userservice.entity.User;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao ; 
	
	@Override
	public User save(User user) {
		return userDao.save(user);
	}

	@Override
	public Iterable<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		userDao.deleteById(id);

	}

}
