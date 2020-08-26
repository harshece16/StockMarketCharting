package com.hg.fsd.userservice.dao;

import org.springframework.stereotype.Repository;
import com.hg.fsd.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository("Users")
public interface UserDao extends JpaRepository<User,Integer> {

}
