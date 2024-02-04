package com.spring.playerapi.util;

import com.spring.playerapi.exception.PlayerException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.playerapi.model.*;

@ControllerAdvice
public class ControllerException {

	@ExceptionHandler
	public ResponseEntity<PlayerError> getExceptionNotFound(PlayerException se){
		PlayerError playerError = new PlayerError();
		playerError.setStatusCode(HttpStatus.NOT_FOUND.value());
		playerError.setMessage(se.getMessage());
		playerError.setTimeStamp(String.valueOf(System.currentTimeMillis()));
		return new ResponseEntity<>(playerError,HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler
	public ResponseEntity<PlayerError> getExceptionBadRequest(PlayerException se){
		PlayerError playerError = new PlayerError();
		playerError.setStatusCode(HttpStatus.BAD_REQUEST.value());
		playerError.setMessage(se.getMessage());
		playerError.setTimeStamp(String.valueOf(System.currentTimeMillis()));
		return new ResponseEntity<>(playerError,HttpStatus.BAD_REQUEST);
	}
	
}

