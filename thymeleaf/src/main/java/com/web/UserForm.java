package com.web;

import javax.validation.constraints.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

// Cross-field validation - to read about:
//   http://stackoverflow.com/questions/1972933/cross-field-validation-with-hibernate-validator-jsr-303
//   @FieldMatch.List({@FieldMatch(first="password", second="password2", "The password fields must match")})
//   @FieldMatch.list

// Form for registration...
public class UserForm {
	@NotNull
	@Size(min=5, max=16, message="The field must be have 5...16 characters")
	private String username;

	@NotNull
	@Size(min=5, max=16, message="Password must be have 5...16 characters")
	private String password;
	
	@NotNull
	@Size(min=5, max=16, message="Password must be have 5...16 characters")
	private String password2;
	
	@NotNull
	@Size(min=5, max=32, message="Email must be have 5...32 characters")
	private String email;

	@NotNull
	@Size(min=5, max=32, message="Email must be have 5...32 characters")
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
	
	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this); 
	}
}
