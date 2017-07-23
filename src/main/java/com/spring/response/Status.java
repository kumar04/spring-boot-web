package com.spring.response;

import org.springframework.http.HttpStatus;

public class Status {

	private String message;
	private HttpStatus code;
	public Status(String message, HttpStatus code) {
		super();
		this.message = message;
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the code
	 */
	public HttpStatus getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(HttpStatus code) {
		this.code = code;
	}
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
