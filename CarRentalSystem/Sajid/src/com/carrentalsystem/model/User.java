package com.carrentalsystem.model;

import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String drivingLicense;
    private String email;

    private List<Booking> bookings;

    public User(String name, String drivingLicense, String email) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.drivingLicense = drivingLicense;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking booking){
        this.bookings.add(booking);
    }
}
