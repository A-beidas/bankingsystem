package org.bank.exception;

public class IllegalJWTException extends AbstractJWTException {

    public IllegalJWTException(String message, String token) {
        super(message, token);
    }
}
