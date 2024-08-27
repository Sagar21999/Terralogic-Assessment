package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.NodeNotFoundException;

@RestControllerAdvice
public class RestExceptionHandlerAdvice {

	@ExceptionHandler(NodeNotFoundException.class)
    ProblemDetail handleNotFoundException(NodeNotFoundException e) {
		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.NOT_FOUND, e.getMessage());
		problemDetail.setTitle("Node Not Found");
		return problemDetail;
    }
}
