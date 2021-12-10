package com.systems.jwt.springsecurityjwt.model;

public class AuthenticationResponse {
	
	private final String jwtToken;
	
	
	public AuthenticationResponse(String jwtToken) {
		super();
		this.jwtToken = jwtToken;
	}


	public String getJwtToken() {
		return jwtToken;
	}
	
	

}
