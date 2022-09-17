package com.parkinglot.exception;

public class SlotNotAvailableException extends  Exception {

    private String msg;

    public SlotNotAvailableException(String msg){
        super(msg);
    }
}
