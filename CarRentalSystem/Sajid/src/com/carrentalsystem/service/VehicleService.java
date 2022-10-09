package com.carrentalsystem.service;

import com.carrentalsystem.exception.VehicleNotFoundException;
import com.carrentalsystem.model.Vehicle;
import com.carrentalsystem.repository.VehicleRepository;

public class VehicleService {
  static VehicleRepository vehicleRepository = new VehicleRepository();

  // since we are in vehicle service, it will only register vehicles
  // following the SOLID principles, register is a more valid name
  public void registerVehicle(Vehicle vehicle) {
    boolean isVehicleRegistered = vehicleRepository.addVehicle(vehicle);
    if (isVehicleRegistered) {
      System.out.println(vehicle.getClass().toString()+" Successfully Registered");
    } else System.out.println(vehicle.getClass().toString()+" Registration Failed....Try again");
  }

  public Vehicle getByRegNum(String regNum) throws VehicleNotFoundException {
    return vehicleRepository.getByRegNum(regNum);
  }
}
