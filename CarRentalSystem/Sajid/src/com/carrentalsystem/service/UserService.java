package com.carrentalsystem.service;

import com.carrentalsystem.exception.BookingNotFoundException;
import com.carrentalsystem.exception.UserNotFoundException;
import com.carrentalsystem.model.Booking;
import com.carrentalsystem.model.User;
import com.carrentalsystem.repository.UserRepository;

public class UserService {

  private final UserRepository userRepository = new UserRepository();

  public void registerUser(User user) {
    boolean isRegistered = userRepository.addUser(user);

    if (isRegistered) {
      System.out.println("User Successfully Registered");
    } else System.out.println("User Registration Failed....Try again");
  }

  public User getByEmail(String email) throws UserNotFoundException {
   return userRepository.getByEmail(email);
  }

  public Booking getUserBookingByRegNum(User user, String regNum) throws BookingNotFoundException {
    return userRepository.getUserBookingByRegNum(user, regNum);
  }
}
