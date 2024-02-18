package com.company.Service;
import com.company.Entity.ParkingLot;


/**
 * Created by Rupali on 2/19/2024.
 */
public class LeaveCommand implements Command {
    private ParkingLot parkingLot;

    public LeaveCommand(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void execute(String... args) {
        int slotNumber = Integer.parseInt(args[0]);
        parkingLot.removeCar(slotNumber);
        System.out.println("Slot number " + slotNumber + " is free");
    }
}
