package com.company.Service;

import com.company.Entity.ParkingLot;



/**
 * Created by Rupali on 2/19/2024.
 */
public class CreateParkingLotCommand implements Command {
    private ParkingLot parkingLot;

    public CreateParkingLotCommand(int capacity) {
        this.parkingLot = new ParkingLot(capacity);
    }

    @Override
    public void execute(String... args) {
        System.out.println("Created a parking lot with " + parkingLot.getCapacity() + " slots");
    }
}
