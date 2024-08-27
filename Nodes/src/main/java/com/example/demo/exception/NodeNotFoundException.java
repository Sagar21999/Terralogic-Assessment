package com.example.demo.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NodeNotFoundException extends RuntimeException{
	
	public NodeNotFoundException() {
		super();
	}
	public NodeNotFoundException(String exception) {
		super(exception);
	}

}
