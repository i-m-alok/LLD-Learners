package com.carrentalsystem.service;

import com.carrentalsystem.model.Vehicle;
import com.carrentalsystem.repository.VehicleRepository;

public class VehicleService {
  static VehicleRepository vehicleRepository = new VehicleRepository();

  public void registerVehicle(Vehicle vehicle) {
    boolean isVehicleRegistered = vehicleRepository.addVehicle(vehicle);
    if (isVehicleRegistered) {
      System.out.println("Successfully Registered");
    } else System.out.println("User Registration Failed....Try again");
  }
}
