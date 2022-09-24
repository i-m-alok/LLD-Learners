package com.carrentalsystem.model;

public class Car extends Vehicle {
    private CarType type;

    public Car(int uniqueId, String manufacturer, String model, CarType type) {
        super(uniqueId, manufacturer, model);
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
