package com.carrentalsystem.repository;

import com.carrentalsystem.model.Vehicle;

import java.util.List;

public class VehicleRepository {
    private List<Vehicle> vehicles;


    public void AddVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
