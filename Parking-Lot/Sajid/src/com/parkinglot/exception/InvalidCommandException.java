package com.parkinglot.exception;

public class InvalidCommandException extends Exception {

    private String msg;

    public InvalidCommandException(String msg){
        super(msg);
    }
}
