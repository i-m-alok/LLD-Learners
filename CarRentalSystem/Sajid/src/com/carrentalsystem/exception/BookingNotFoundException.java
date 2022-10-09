package com.carrentalsystem.exception;

import com.carrentalsystem.model.Booking;

public class BookingNotFoundException extends Exception{
    public BookingNotFoundException(String msg){
        super(msg);
    }
}
