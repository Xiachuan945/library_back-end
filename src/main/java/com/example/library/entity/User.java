package com.example.library.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "user")
public class User {

	@Id
	@Column( name = "user_id")
	private int userId ;
	
	@Column( name = "phone_number")
	private String phoneNumber ;
	
	@Column( name = "password")
	private String pwd ;
	
	@Column( name = "user_name")
	private String userName ;
	
	@Column ( name = "registration_time")
	private LocalDateTime registrationTime ;
	
	@Column ( name = "last_login_time")
	private LocalDateTime lastLoginTime ;

	public User() {
		super();
	}

	public User(int userId, String phoneNumber, String pwd, String userName, LocalDateTime registrationTime,
			LocalDateTime lastLoginTime) {
		super();
		this.userId = userId;
		this.phoneNumber = phoneNumber;
		this.pwd = pwd;
		this.userName = userName;
		this.registrationTime = registrationTime;
		this.lastLoginTime = lastLoginTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getRegistrationTime() {
		return registrationTime;
	}

	public void setRegistrationTime(LocalDateTime registrationTime) {
		this.registrationTime = registrationTime;
	}

	public LocalDateTime getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(LocalDateTime lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
}
