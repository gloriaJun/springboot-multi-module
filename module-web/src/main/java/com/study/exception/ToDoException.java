package com.study.exception;

public class ToDoException extends Exception {
    private String errMsg;

    public String getErrMsg() {
        return errMsg;
    }

    public ToDoException(String errMsg) {
        super(errMsg);
        this.errMsg = errMsg;
    }

    public ToDoException() {
        super();
    }
}
