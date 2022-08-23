package com.ciandt.mymusic.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class ListIsEmptyException extends RuntimeException{
    public ListIsEmptyException() {
    }

    public ListIsEmptyException(String message) {
        super(message);
    }
}
