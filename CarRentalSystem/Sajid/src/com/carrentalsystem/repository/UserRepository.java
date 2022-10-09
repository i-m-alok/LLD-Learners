package com.carrentalsystem.repository;

import com.carrentalsystem.exception.BookingNotFoundException;
import com.carrentalsystem.exception.UserNotFoundException;
import com.carrentalsystem.model.Booking;
import com.carrentalsystem.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
  public static List<User> users = new ArrayList<>();

  public boolean addUser(User user) {
    users.add(user);
    return true;
  }

  public void addBookingToUser(User user, Booking booking) {

    for (User u : users) {
      if (u.getId() == user.getId()) {
        u.addBooking(booking);
      }
    }
  }

  public User getByEmail(String email) throws UserNotFoundException {
    for(User user : users){
       if(user.getEmail().equals(email)){
         return user;
       }
    }
    throw new UserNotFoundException("UserNotFound...");
  }

  public Booking getUserBookingByRegNum(User user, String regNum) throws BookingNotFoundException {

      for(Booking booking : user.getBookings()){
        if(booking.getVehicle().getRegNum().equals(regNum)){
          return booking;
        }
      }
     throw new BookingNotFoundException("Booking Not Found");
  }

}
