package com.willams.restexceptiontest.exceptions;

public class SomeCustomClassException extends RuntimeException {
	private static final long serialVersionUID = 244536752534633872L;

	public SomeCustomClassException() {
		super();
	}

	public SomeCustomClassException(String message) {
		super(message);
	}

	public SomeCustomClassException(Throwable cause) {
		super(cause);
	}

	public SomeCustomClassException(String message, Throwable cause) {
		super(message, cause);
	}

	public SomeCustomClassException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}


}
