package com.parkinglot.exception;

public class CarNotFoundException extends Exception {

    private String msg;

    public CarNotFoundException(String msg){
        super(msg);
    }
}
