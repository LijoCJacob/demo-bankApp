package com.test.Demo.model;

public class RegistrationFailure {

	private String errorMessage;
	private String registered;

	public RegistrationFailure(String errorMessage, String registered) {
		super();
		this.errorMessage = errorMessage;
		this.registered = registered;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public String isRegistered() {
		return registered;
	}

}
