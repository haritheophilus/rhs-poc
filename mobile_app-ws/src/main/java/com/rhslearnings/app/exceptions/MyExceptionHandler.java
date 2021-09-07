package com.rhslearnings.app.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rhslearnings.app.ui.model.response.ErrorMessage;

import java.util.Date;

@ControllerAdvice
public class MyExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = {UserServiceException.class})
	public final ResponseEntity<ErrorMessage> handleSpecificExceptions(UserServiceException ex, WebRequest request) {
		
		ErrorMessage errorMessage = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(true));
		
		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(value = {Exception.class})
	public final ResponseEntity<ErrorMessage> handleOtherExceptions(Exception ex, WebRequest request) {
		
		ErrorMessage errorMessage = new ErrorMessage(new Date(), ex.getMessage(), request.getDescription(true));
		
		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
