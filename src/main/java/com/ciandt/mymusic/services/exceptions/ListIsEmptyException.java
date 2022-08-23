package com.ciandt.mymusic.services.exceptions;

public class ListIsEmptyException extends RuntimeException{
    public ListIsEmptyException() {
    }

    public ListIsEmptyException(String message) {
        super(message);
    }
}
