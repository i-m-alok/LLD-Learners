package com.carrentalsystem.repository;

import com.carrentalsystem.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    public static List<Vehicle> vehicles = new ArrayList<>();

    public boolean addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        return true;
    }
}
