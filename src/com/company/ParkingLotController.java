package com.company;

import com.company.Service.Command;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rupali on 2/19/2024.
 */
public class ParkingLotController {
    private Map<String, Command> commands;

    public ParkingLotController() {
        commands = new HashMap<>();
    }

    public void addCommand(String commandName, Command command) {
        commands.put(commandName, command);
    }

    public void executeCommand(String commandName, String... args) {
        Command command = commands.get(commandName);
        if (command != null) {
            command.execute(args);
        } else {
            System.out.println("Invalid command");
        }
    }
}
