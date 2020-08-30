package com.hg.fsd.userservice.dao;
import com.hg.fsd.userservice.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,String> {


}
