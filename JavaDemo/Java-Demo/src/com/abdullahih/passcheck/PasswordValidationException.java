package com.abdullahih.passcheck;

public class PasswordValidationException extends Exception{
    public PasswordValidationException() {
        super();
    }

    public PasswordValidationException(String message) {
        super(message + "So, Invalid Password");
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
