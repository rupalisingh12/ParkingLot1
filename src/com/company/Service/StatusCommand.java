package com.company.Service;
import com.company.Entity.ParkingLot;

/**
 * Created by Rupali on 2/19/2024.
 */
public class StatusCommand implements Command {
    private ParkingLot parkingLot;

    public StatusCommand(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void execute(String... args) {
        parkingLot.printStatus();
    }
}
