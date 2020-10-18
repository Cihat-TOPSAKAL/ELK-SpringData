package com.elasticsearch.template.exception;

public class ExceptionRunTime extends RuntimeException {
    public ExceptionRunTime(String message) {
        super(message);
    }

    public ExceptionRunTime(String message, Throwable cause) {
        super(message, cause);
    }
}
