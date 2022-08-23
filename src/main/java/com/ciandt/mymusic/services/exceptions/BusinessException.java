package com.ciandt.mymusic.services.exceptions;

public class BusinessException extends RuntimeException{
    public BusinessException() {
    }

    public BusinessException(String message) {
        super(message);
    }
}
