package com.carrentalsystem.model;

import java.util.UUID;

public class Vehicle {
    private int uniqueId;
    private int fuelCapacity;
    private String manufacturer;
    private String model;

    public Vehicle(int uniqueId, String manufacturer, String model) {
        this.uniqueId = uniqueId;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    private String registrationNumber;

    public int getUniqueId() {
        return uniqueId;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
