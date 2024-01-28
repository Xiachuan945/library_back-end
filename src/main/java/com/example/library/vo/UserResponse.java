package com.example.library.vo;

import com.example.library.constants.Rtncode;
import com.example.library.entity.User;

public class UserResponse {
	
	private User user;
	
	private Rtncode rtnCode ;

	public UserResponse() {
		super();
	}

	public UserResponse(User user, Rtncode rtnCode) {
		super();
		this.user = user;
		this.rtnCode = rtnCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Rtncode getRtnCode() {
		return rtnCode;
	}

	public void setRtnCode(Rtncode rtnCode) {
		this.rtnCode = rtnCode;
	}
	
}
