package com.example.SpringRevisionGothrough.ErrorHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerAdvise {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ResponseEntity<String> handlingMetodArgu(MethodArgumentNotValidException ex) {

		String errory = ex.getBindingResult().getFieldErrors().stream().map(error -> error.getDefaultMessage())
				.findFirst().orElse("validation Error");
		return new ResponseEntity<>(errory, HttpStatus.BAD_REQUEST);

	}
}
