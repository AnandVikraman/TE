package com.te.lms.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.te.lms.exception.IdNotFoundException;
import com.te.lms.exception.MentorNotIdFoundException;
import com.te.lms.response.SuccessResponse;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(MentorNotIdFoundException.class)
	public ResponseEntity<SuccessResponse> mentorIdNotFound(MentorNotIdFoundException exception) {

		return new ResponseEntity<SuccessResponse>(
				SuccessResponse.builder().data(null).error(true).message(exception.getMessage()).build(),
				HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<SuccessResponse> batchIdNotFound(IdNotFoundException exception) {

		return new ResponseEntity<SuccessResponse>(
				SuccessResponse.builder().data(null).error(true).message(exception.getMessage()).build(),
				HttpStatus.BAD_REQUEST);

	}

}
