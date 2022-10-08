package com.carrentalsystem;

import com.carrentalsystem.model.User;
import com.carrentalsystem.service.UserService;
import com.carrentalsystem.service.VehicleService;

import java.io.*;

public class CarRentalApplication {

  private final UserService userService= new UserService();
  private final VehicleService vehicleService = new VehicleService();

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("./src/com/carrentalsystem/commands.txt");

    BufferedReader br = new BufferedReader(new FileReader(file));

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
          User user = new User(arguments[1], arguments[2], arguments[3]);

          System.out.println("User Registerd...");
          break;
        case "REGISTER_CAR":
          System.out.println("Car Registered...");
          break;
        case "REGISTER_BIKE":
          System.out.println("Bike Registered...");
          break;
        case "BOOK_VEHICLE":
          System.out.println("Booked");
          break;
        case "CANCEL_VEHICLE":
          System.out.println("Cancle");
          break;
        case "RETURN_VEHICLE":
          System.out.println("Return");
          break;
        default:
          throw new IllegalArgumentException("Invalid Operation: " + arguments[0]);
      }
    }
  }
}
