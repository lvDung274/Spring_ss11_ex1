package com.example.patient.exceptions;

public class HttpNotFoundException extends RuntimeException {
    public HttpNotFoundException(String message) {
        super(message);
    }
}
