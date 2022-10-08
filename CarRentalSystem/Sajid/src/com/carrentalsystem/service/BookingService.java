package com.carrentalsystem.service;

/*
 * we can make booking class singleton, if we need only one instance
 */

import com.carrentalsystem.model.Booking;
import com.carrentalsystem.model.User;
import com.carrentalsystem.repository.BookingRepository;
import com.carrentalsystem.repository.UserRepository;

public class BookingService {

  private final BookingRepository bookingRepository = new BookingRepository();
  private final UserRepository userRepository = new UserRepository();

  public void bookVehicle(User user, Booking booking) {

    boolean isBooked = bookingRepository.createBooking(booking);
    if(isBooked){
      userRepository.addBookingToUser(user, booking);
      System.out.println("Booking Successful");
    } else System.out.println("Booking Unsuccessful......");
  }

  public void returnVehicle() {}

  public void cancelVehicle() {}
}
