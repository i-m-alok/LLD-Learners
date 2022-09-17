package com.parkinglot;

import com.parkinglot.exception.CarNotFoundException;
import com.parkinglot.exception.InvalidCommandException;
import com.parkinglot.exception.SlotNotAvailableException;
import com.parkinglot.model.Car;
import com.parkinglot.service.CommandService;

import java.util.Arrays;
import java.util.Scanner;

public class ParkingLotApplication {

  static CommandService commandService = new CommandService();

  // todo -- File Input without breaking the current flow
  // todo -- write code for implementing status command

  public static void main(String[] args)
      throws SlotNotAvailableException, CarNotFoundException, InvalidCommandException {

    Scanner kb = new Scanner(System.in);

    while (kb.hasNext()) {
      String command = kb.nextLine();

      String tokens[] = command.split(" ");
      System.out.println(Arrays.toString(tokens));

      switch (tokens[0]) {
        case "create_parking_lot":
          commandService.createCommand(Integer.parseInt(tokens[1]));
          break;

        case "park":
          commandService.parkCommand(new Car(tokens[1], tokens[2]));
          break;

        case "leave":
          commandService.leaveCommand(Integer.parseInt(tokens[1]));
          break;

        case "status":
          commandService.statusCommand();
          break;

        case "registration_numbers_for_cars_with_colour":
          commandService.registrationNumbersForCarsWithColourCommand(tokens[1]);
          break;

        case "slot_numbers_for_cars_with_colour":
          commandService.slotNumbersForCarWithColorCommand(tokens[1]);
          break;

        case "slot_number_for_registration_number":
          commandService.slotNumberForRegistrationNumberCommand(tokens[1]);
          break;

        default:
          throw new InvalidCommandException("Command Invalid..");
      }
    }
  }
}
