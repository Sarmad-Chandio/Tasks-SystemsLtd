package com.systems.jwt.springsecurityjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systems.jwt.springsecurityjwt.entity.User;

public interface UserDao extends JpaRepository<User, Long> {
	//fetching user name from database
	public User findByUserName(String userName);
	
	//fetching user password from database
	//public List<User> findByPassword(String password);
	
}
