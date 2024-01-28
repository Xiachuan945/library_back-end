package com.example.library.constants;

public enum Rtncode {

	SUCCESS (200, "Success !") , // 
	PARAM_ERROR (400, "Param error !") , //	
	PHONE_NUMBER_ALREADY_REGISTERED (400, "Phone number already registered !") , //
	USER_NOT_FOUND (404, "User not found !"), //
	LOGIN_ERROR(400, "Login error !"), //
	PLEASE_LOGIN_FIRST(400, "Please Login First !"), //
	;
	
	private int code ;
	
	private String message ;

	private Rtncode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
}
