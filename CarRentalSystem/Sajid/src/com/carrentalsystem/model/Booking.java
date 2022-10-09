package com.carrentalsystem.model;

import java.util.Date;
import java.util.UUID;

public class Booking {
  private UUID id;
  private Vehicle vehicle; // it will accept instances of all the child classes of Vehicle
  private Date bookingDate;
  private Date expectedReturnDate;

  //think about how we can create a bidirectional relationship between user and booking
  private  User user;

  public Booking(Vehicle vehicle, Date bookingDate, Date expectedReturnDate, User user) {
    this.id = UUID.randomUUID();
    this.vehicle = vehicle;
    this.bookingDate = bookingDate;
    this.expectedReturnDate = expectedReturnDate;
    this.user = user;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Date getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(Date bookingDate) {
    this.bookingDate = bookingDate;
  }

  public Date getExpectedReturnDate() {
    return expectedReturnDate;
  }

  public void setExpectedReturnDate(Date expectedReturnDate) {
    this.expectedReturnDate = expectedReturnDate;
  }

}
