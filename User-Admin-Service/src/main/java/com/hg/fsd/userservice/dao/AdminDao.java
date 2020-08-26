package com.hg.fsd.userservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hg.fsd.userservice.entity.User;

@Repository("Admins")
public interface AdminDao extends JpaRepository<User,String>{
}
