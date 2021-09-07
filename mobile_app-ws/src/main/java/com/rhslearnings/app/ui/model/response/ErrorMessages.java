package com.rhslearnings.app.ui.model.response;

public enum ErrorMessages {
	
	MISSING_REQUIRED_FIELDS("Missing reqired field. Please refer to the documentation"), 
	RECORD_ALREADY_EXISTS("The record already exists"),
	INTERNAL_SERVER_ERROR("Internal Server Error"),
	NO_RECORD_FOUND("Record with the given details is not found"),
	AUTHENTICATION_FALED("Authentication failed"),
	COULD_NOT_UPDATE("Could not update the record"),
	COULD_NOT_DELETE("Could not delete the record"),
	EMAIL_ADDRESS_CANNOT_BE_VERIFIED("Email address could not be verified");

	String errorMessage;
	
	private ErrorMessages(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
