package com.carrentalsystem.model;

public class Vehicle {
  private String regNum;
  private int fuelCapacity;
  private String manufacturer;
  private String model;

  public Vehicle(String regNum, String manufacturer, String model) {
    this.regNum = regNum;
    this.manufacturer = manufacturer;
    this.model = model;
  }

  public String getRegNum() {
    return regNum;
  }

  public void setRegNum(String regNum) {
    this.regNum = regNum;
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

  public int getFuelCapacity() {
    return fuelCapacity;
  }

  public void setFuelCapacity(int fuelCapacity) {
    this.fuelCapacity = fuelCapacity;
  }

}
