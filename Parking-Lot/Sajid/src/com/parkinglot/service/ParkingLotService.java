package com.parkinglot.service;

import com.parkinglot.exception.CarNotFoundException;
import com.parkinglot.exception.SlotNotAvailableException;
import com.parkinglot.model.Car;
import com.parkinglot.model.ParkingLot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingLotService {

  private ParkingLot parkingLot;

  public void createParkingLot(int capacity) {

    parkingLot = new ParkingLot(capacity);
  }

  public int park(Car car) throws SlotNotAvailableException {
    return parkingLot.assignSlot(car);
  }

  public void makeSlotFree(int slotNumber) {
    parkingLot.freeSlot(slotNumber);
  }

  public void status() {}

  // todo -- implement this function using java stream api
  public List<String> registrationNosOfCarsWithColor(String color) {

    List<String> registrationNumbers = new ArrayList<>();

    for (Map.Entry<Integer, Car> entry : parkingLot.getSlots().entrySet()) {
      if (entry.getValue().getColor().equals(color)) {
        registrationNumbers.add(entry.getValue().getRegistrationNumber());
      }
    }
    return registrationNumbers;
  }

  public List<Integer> slotsWithCarsOfColor(String color) {

    List<Integer> slots = new ArrayList<>();

    for (Map.Entry<Integer, Car> entry : parkingLot.getSlots().entrySet()) {
      if (entry.getValue().getColor().equals(color)) {
        slots.add(entry.getKey());
      }
    }
    return slots;
  }

  public Integer slotWithCarOfRegNum(String registrationNumber) throws CarNotFoundException {

    for (Map.Entry<Integer, Car> entry : parkingLot.getSlots().entrySet()) {
      if (entry.getValue().getRegistrationNumber().equals(registrationNumber)) {
        entry.getKey();
      }
    }
    throw new CarNotFoundException("Car is not parked in the lot......");
  }
}
