package com.carrentalsystem.service;

import com.carrentalsystem.model.Bike;
import com.carrentalsystem.model.Car;
import com.carrentalsystem.model.CarType;
import com.carrentalsystem.model.Vehicle;
import com.carrentalsystem.repository.VehicleRepository;

public class VehicleService {
    static VehicleRepository vehicleRepository = new VehicleRepository();
    public Vehicle registerVehicle(String Command, int uniqueId, String manufacturer, String model, CarType type) {
        Vehicle vehicle = new Car(uniqueId, manufacturer,model, type);
        vehicleRepository.AddVehicle(vehicle);
        return vehicle;

    }

    public Vehicle registerVehicle(String Command, int uniqueId, String manufacturer, String model) {
        Vehicle vehicle = new Bike(uniqueId, manufacturer, model);
        vehicleRepository.AddVehicle(vehicle);
        return vehicle;
    }

}
