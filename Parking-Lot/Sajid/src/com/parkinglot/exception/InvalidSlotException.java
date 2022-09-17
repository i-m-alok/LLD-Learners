package com.parkinglot.exception;

public class InvalidSlotException extends Exception{

    private String msg;

    public InvalidSlotException(String msg){
        super(msg);
    }
}
