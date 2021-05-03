package com.moiom.restfull.ui.model.response;

/**
 * 
 * @author MoioM
 * 
 * POJO class (Plain Old Java Object) that is used when
 * and an object is mapped to JSON/xml to create response.
 * This class does not contain any sensitive information.
 */

public class UserRest {
	
	private String userId; // randomly generated User Id (not auto-incremented). It protects from finding auto-generated user id in the database.
	private String firstName;
	private String lastName;
	private String email;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
}
