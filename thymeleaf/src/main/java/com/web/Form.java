package com.web;

// Form for registration...
public class Form {
	private String username;
	private String password;
	private String password2;
	private String email;
	private String email2;
	
	// TODO Add setters for all of the stuff.
	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}	
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getPassword2() {
		return password2;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getEmail2() {
		return email2;
	}
}
