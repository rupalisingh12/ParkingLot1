package com.company;

import com.company.Entity.Car;
import com.company.Entity.ParkingLot;

import com.company.Entity.ParkingSlot;
import com.company.Service.*;


import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ParkingLotController controller = new ParkingLotController();
        ParkingLot parkingLot = null;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");
            String commandName = tokens[0].toLowerCase(); // Convert command name to lowercase for case insensitivity
            String[] commandArgs = Arrays.copyOfRange(tokens, 1, tokens.length);

            try {
                if ("exit".equalsIgnoreCase(commandName)) {
                    break;
                }

                if ("create_parking_lot".equalsIgnoreCase(commandName)) {
                    if (commandArgs.length != 1) {
                        throw new IllegalArgumentException("Usage: create_parking_lot <capacity>");
                    }
                    int capacity = Integer.parseInt(commandArgs[0]);
                    if (capacity <= 0) {
                        throw new IllegalArgumentException("Capacity must be a positive integer");
                    }
                    if (parkingLot != null) {
                        throw new IllegalStateException("Parking lot has already been created");
                    }
                    parkingLot = new ParkingLot(capacity);
                    controller.addCommand(commandName, new CreateParkingLotCommand(capacity));
                } else {
                    if (parkingLot == null) {
                        throw new IllegalStateException("Please create a parking lot first");
                    }
                    switch (commandName) {
                        case "park":
                            if (commandArgs.length != 2) {
                                throw new IllegalArgumentException("Usage: park <registrationNumber> <color>");
                            }
                            controller.addCommand(commandName, new ParkCommand(parkingLot));
                            break;
                        case "leave":
                            if (commandArgs.length != 1) {
                                throw new IllegalArgumentException("Usage: leave <slotNumber>");
                            }
                            controller.addCommand(commandName, new LeaveCommand(parkingLot));
                            break;
                        case "status":
                            if (commandArgs.length != 0) {
                                throw new IllegalArgumentException("Usage: status");
                            }
                            controller.addCommand(commandName, new StatusCommand(parkingLot));
                            break;
                        case "registration_numbers_for_cars_with_colour":
                            if (commandArgs.length != 1) {
                                throw new IllegalArgumentException("Usage: registration_numbers_for_cars_with_colour <color>");
                            }
                            controller.addCommand(commandName, new RegistrationNumbersForCarsWithColorCommand(parkingLot));
                            break;
                        case "slot_number_for_registration_number":
                            if (commandArgs.length != 1) {
                                throw new IllegalArgumentException("Usage: slot_number_for_registration_number <registrationNumber>");
                            }
                            controller.addCommand(commandName, new SlotNumberForRegistrationNumberCommand(parkingLot));
                            break;
                        case "slot_numbers_for_cars_with_colour":
                            if (commandArgs.length != 1) {
                                throw new IllegalArgumentException("Usage: slot_numbers_for_cars_with_colour <color>");
                            }
                            controller.addCommand(commandName, new SlotNumbersForCarsWithColorCommand(parkingLot));
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid command");
                    }
                }

                controller.executeCommand(commandName, commandArgs);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }

}

