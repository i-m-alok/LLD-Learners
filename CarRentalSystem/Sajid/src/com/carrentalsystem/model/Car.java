package com.carrentalsystem.model;

public class Car extends Vehicle {
    private CarType type;

    public Car(String regNum, String manufacturer, String model, String type) {
        super(regNum, manufacturer, model);
        this.type = CarType.valueOf(type);
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }
}
