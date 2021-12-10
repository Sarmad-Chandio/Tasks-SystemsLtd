package com.systems.jwt.springsecurityjwt.model;

//this authentication request is going to define the input aurgument to our authentication method
//user will send a data through post method and we have to define it's structure
public class AuthenticationRequest {
	private String userName;
	private String password;
	
	
	public AuthenticationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}


	public AuthenticationRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
