package com.management.user.exception;

/**
 * @author Ashwani Kumar
 * Created on 11/02/24.
 */
public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String message) {
        super(message);
    }
}