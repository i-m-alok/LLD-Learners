package com.carrentalsystem;

import com.carrentalsystem.exception.BookingNotFoundException;
import com.carrentalsystem.exception.CancellationNotAllowedException;
import com.carrentalsystem.exception.UserNotFoundException;
import com.carrentalsystem.exception.VehicleNotFoundException;
import com.carrentalsystem.model.Bike;
import com.carrentalsystem.model.Booking;
import com.carrentalsystem.model.Car;
import com.carrentalsystem.model.User;
import com.carrentalsystem.service.BookingService;
import com.carrentalsystem.service.UserService;
import com.carrentalsystem.service.VehicleService;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CarRentalApplication {

  private static final UserService userService = new UserService();
  private static final VehicleService vehicleService = new VehicleService();
  private static final BookingService bookingService = new BookingService();
  private static final SimpleDateFormat formatter =
      new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);

  public static void main(String[] args)
          throws FileNotFoundException, UserNotFoundException, VehicleNotFoundException,
          ParseException, BookingNotFoundException, CancellationNotAllowedException {
    File file =
        new File(
            "C:\\Users\\HP\\Desktop\\Mission SWITCH\\NAVI\\LLD Round\\LLD-Learners\\CarRentalSystem\\Sajid\\src\\com\\carrentalsystem\\commands.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));
    User user = null;
    String line;
    while (true) {
      try {
        if (!((line = br.readLine()) != null)) break;
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      String[] arguments = line.split(" ");
      switch (arguments[0]) {
        case "REGISTER_USER":
          user = new User(arguments[1], arguments[2], arguments[3]);
          userService.registerUser(user);
          break;
        case "REGISTER_CAR":
          vehicleService.registerVehicle(
              new Car(arguments[1], arguments[2], arguments[3], arguments[4]));
          break;
        case "REGISTER_BIKE":
          vehicleService.registerVehicle(new Bike(arguments[1], arguments[2], arguments[3]));
          break;
        case "BOOK_VEHICLE":
          Date bookingDate = formatter.parse(arguments[3]);
          Date expectedReturnDate = formatter.parse(arguments[4]);
          user = userService.getByEmail(arguments[1]);
          bookingService.bookVehicle(
              user,
              new Booking(
                  vehicleService.getByRegNum(arguments[2]), bookingDate, expectedReturnDate, user));
          break;
        case "CANCEL_BOOKING":
          user = userService.getByEmail(arguments[1]);
          Booking booking = userService.getUserBookingByRegNum(user, arguments[2]);
          bookingService.cancelBooking(booking, formatter.parse(arguments[3]));
          break;
        case "RETURN_VEHICLE":
          break;
        default:
          throw new IllegalArgumentException("Invalid Operation: " + arguments[0]);
      }
    }

    System.out.println(bookingService.getAll());
  }
}
