package com.moiom.restfull.shared.dto;

import java.io.Serializable;

/**
 * 
 * @author MoioM
 * DTO - Data Transfer Object. 
 * 
 */
public class UserDto implements Serializable{
	private static final long serialVersionUID = 6744406845133371696L;
	private long id;
	private String userId; // public User Id (not the auto-incremented)
	private String firstName;
	private String lastname;
	private String email;
	private String password;
	private String encryptedPassword; // password to be stored in DB 9It must be encrypted
	private String emailVerificationToken;
	private Boolean emailVerificationStatus;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}
	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}
	public Boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}
	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
