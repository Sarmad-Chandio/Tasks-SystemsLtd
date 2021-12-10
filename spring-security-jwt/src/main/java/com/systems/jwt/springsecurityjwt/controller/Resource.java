package com.systems.jwt.springsecurityjwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.systems.jwt.springsecurityjwt.model.AuthenticationRequest;
import com.systems.jwt.springsecurityjwt.model.AuthenticationResponse;
import com.systems.jwt.springsecurityjwt.util.JwtUtil;

@RestController
public class Resource {
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	JwtUtil jwtTockenUtil;
	
	@RequestMapping("/expose")
	public String exposeMethod() {
		return "Method inside controller is exposed";
	}
	@RequestMapping(value="/authenticate", method =RequestMethod.POST )
	//this method is parsing the request body to get user name and password from request body
	public ResponseEntity<?> createAuthenticationToken (@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authenticationRequest.getUserName(), authenticationRequest.getPassword())
					);
		} catch (BadCredentialsException e) {
			throw new Exception("incrorrect user name or password",e);
		}
		//fetching user details from user datails service 
		final UserDetails userDetails=userDetailsService.loadUserByUsername(authenticationRequest.getUserName());
		//fetching user details from JWTUtil which we created previously
		final String jwt=jwtTockenUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
		
	}

}
