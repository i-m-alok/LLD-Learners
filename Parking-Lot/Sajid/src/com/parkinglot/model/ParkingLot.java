package com.parkinglot.model;

import com.parkinglot.exception.SlotNotAvailableException;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

  private int capacity;
  private Map<Integer, Car> slots;

  public ParkingLot(int capacity) {
    this.capacity = capacity;
    slots = new HashMap<>();
  }

  public int getCapacity() {
    return capacity;
  }

  public Map<Integer, Car> getSlots() {
    return slots;
  }

  public int assignSlot(Car car) throws SlotNotAvailableException {

    int nearestSlot = findNearestSlot();
    slots.put(nearestSlot, car);
    return nearestSlot;
  }

  public void freeSlot(int slotNumber) {

    if (slots.containsKey(slotNumber)) {
      slots.remove(slotNumber);
    }
  }

  public int findNearestSlot() {

    for (int slot = 1; slot <= capacity; slot++) {
      if (!slots.containsKey(slot)) {
        return slot;
      }
    }

    return -1;
  }
}
