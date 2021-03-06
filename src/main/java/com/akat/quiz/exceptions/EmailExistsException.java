package com.akat.quiz.exceptions;

public class EmailExistsException extends RuntimeException {

    public EmailExistsException(String email) {
        super("There is an account with that email address: " + email);
    }
}