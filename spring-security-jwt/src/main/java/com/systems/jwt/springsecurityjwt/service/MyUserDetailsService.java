package com.systems.jwt.springsecurityjwt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class MyUserDetailsService implements UserDetailsService{
	@Autowired
	UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		//returning and using default user and arryList shows the authories
		com.systems.jwt.springsecurityjwt.entity.User user=userService.findByUserName(userName);
//		if(user==null) {
//			throw new UsernameNotFoundException(userName);
//		}
		//create user
		return new User("root","root",new ArrayList<>());
	}

}
