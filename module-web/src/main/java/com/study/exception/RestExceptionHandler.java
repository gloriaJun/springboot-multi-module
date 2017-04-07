package com.study.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(ToDoException.class)
    public ResponseEntity<ErrorResponse> exceptionToDoHandler(Exception ex) {
        ErrorResponse err = new ErrorResponse();
        err.setErrorCode(HttpStatus.NOT_FOUND.value());
        err.setMessage(ex.getMessage());
        return new ResponseEntity<ErrorResponse>(err, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex) {
        ErrorResponse err = new ErrorResponse();
        err.setErrorCode(HttpStatus.BAD_REQUEST.value());
        err.setMessage("bad request");
        return new ResponseEntity<ErrorResponse>(err, HttpStatus.BAD_REQUEST);
    }
}
