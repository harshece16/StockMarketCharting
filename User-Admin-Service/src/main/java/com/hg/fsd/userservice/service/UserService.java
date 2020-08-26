package com.hg.fsd.userservice.service;

import com.hg.fsd.userservice.entity.User;

public interface UserService {

	User save(User user);

	Iterable<User> findAll();

	void deleteById(Integer id);
}
