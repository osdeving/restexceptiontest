package com.willams.restexceptiontest.exceptions.dto;

public enum StatusError {
	NOT_FOUND("NOT_FOUND","The specified resource is not found."),
	INVALID_ARGUMENT("INVALID_ARGUMENT","Client specified an invalid argument, request body or query param.");
	
	private String type;
	private String message;
	
	private StatusError(String type, String message) {
		this.type = type;
		this.message = message;
	}

	public String getCode() {
		return type;
	}

	public String getMessage() {
		return message;
	}

}
