package com.carrentalsystem.repository;

import com.carrentalsystem.exception.UserNotFoundException;
import com.carrentalsystem.exception.VehicleNotFoundException;
import com.carrentalsystem.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleRepository {
    public static List<Vehicle> vehicles = new ArrayList<>();

    public boolean addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        return true;
    }

    //always try to implement find by primary or candidate keys
    public Vehicle getByRegNum(String regNum) throws VehicleNotFoundException {

        for(Vehicle vehicle : vehicles){
            if(vehicle.getRegNum().equals(regNum)){
                return vehicle;
            }
        }
        throw new VehicleNotFoundException("Vehicle Not Found");
    }
}
