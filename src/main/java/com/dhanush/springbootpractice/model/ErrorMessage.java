package com.dhanush.springbootpractice.model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
    private String message;

    public String getMessage() {
        return message;
    }

    public ErrorMessage(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
