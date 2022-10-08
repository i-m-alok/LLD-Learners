package com.carrentalsystem.repository;

import com.carrentalsystem.model.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingRepository {
  public static List<Booking> bookings = new ArrayList<>();

  public boolean createBooking(Booking booking) {

    boolean inserted = bookings.add(booking); // simulating db behavior here, when we save a record we get a response, we relay the response, i.e variable inserted here

    return true;
  }
}
