package com.moiom.restfull.ui.model.request;

/**
 * 
 * @author MoioM
 * 
 * POJO class (Plain Old Java Object) that is used when
 * a request body (JSON/xml file) maps into an object
 * and an object is mapped to JSON/xml when creating response.
 */
public class UserDetailsRequestModel {
	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDetailsRequestModel [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + "]";
	}

}
