package com.BikkadIT.PhoneBookApplication.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiErrorOrResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		
		String message=ex.getMessage();
		
		ApiErrorOrResponse apiErrorOrResponse=new ApiErrorOrResponse(message, false, new Date());
		
		return new ResponseEntity<ApiErrorOrResponse>(apiErrorOrResponse,HttpStatus.NOT_FOUND);
		
	}
}
