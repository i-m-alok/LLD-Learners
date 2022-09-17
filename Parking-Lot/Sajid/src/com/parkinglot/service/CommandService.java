package com.parkinglot.service;

import com.parkinglot.exception.CarNotFoundException;
import com.parkinglot.exception.SlotNotAvailableException;
import com.parkinglot.model.Car;

import java.util.List;

public class CommandService {

  static ParkingLotService parkingLotService = new ParkingLotService();

  public void createCommand(int capacity) {

    parkingLotService.createParkingLot(capacity);
  }

  public void parkCommand(Car car) throws SlotNotAvailableException {

    int allocatedSlot = parkingLotService.park(car);
    if(allocatedSlot == -1){
      System.out.println("Sorry Parking Lot is Full");
      return;
    }

       System.out.println("Allocated slot number: " + allocatedSlot);
  }

  public void leaveCommand(int slotNumber) {

    parkingLotService.makeSlotFree(slotNumber);

  }

  public void registrationNumbersForCarsWithColourCommand(String color) {

    List<String> result = parkingLotService.registrationNosOfCarsWithColor(color);
    System.out.println(String.join(",", result));
  }

  public void slotNumbersForCarWithColorCommand(String color) {

    List<Integer> result = parkingLotService.slotsWithCarsOfColor(color);
    String res = result.toString();
    System.out.println(res.substring(1, res.length() - 1));
  }

  public void slotNumberForRegistrationNumberCommand(String registrationNumber) throws CarNotFoundException {

    System.out.println(parkingLotService.slotWithCarOfRegNum(registrationNumber));
  }

  public void statusCommand(){



  }
}
