package com.hilti.quiz.api.model;

public class Success {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Success(String message) {
		super();
		this.message = message;
	}

}
