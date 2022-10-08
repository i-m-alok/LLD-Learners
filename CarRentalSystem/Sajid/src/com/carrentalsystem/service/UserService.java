package com.carrentalsystem.service;

import com.carrentalsystem.model.User;
import com.carrentalsystem.repository.UserRepository;

public class UserService {

  private final UserRepository userRepository = new UserRepository();

  public void registerUser(User user) {
    boolean isRegistered = userRepository.addUser(user);

    if (isRegistered) {
      System.out.println("Successfully Registered");
    } else System.out.println("User Registration Failed....Try again");
  }
}
