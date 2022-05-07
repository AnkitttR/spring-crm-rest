package com.luv2code.springdemo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerRestExceptionHandler {

	// Add an exception handler for CustomerNotFoundException
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponse> handleException(CustomerNotFoundException exc) {
		
		// create CustomerErrorResponse
		
		// return ResponseEntity
		
		
		
		return null;
		
		
	}
	
	
	// Add another exception handler ... to catch any exception (catch all)
}
