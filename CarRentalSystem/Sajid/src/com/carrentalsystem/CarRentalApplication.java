package com.carrentalsystem;

import java.io.*;

public class CarRentalApplication {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./src/com/carrentalsystem/commands.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while (true)
        {
            try {
                if (!((line = br.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(line);
            String[] arguments = line.split(" ");
            switch (arguments[0]){
                case "REGISTER_USER":
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
                    throw new IllegalArgumentException("Invalid Operation: "+arguments[0]);
            }
        }
    }
}
