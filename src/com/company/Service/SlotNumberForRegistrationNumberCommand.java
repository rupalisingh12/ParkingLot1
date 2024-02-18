package com.company.Service;

import com.company.Entity.ParkingLot;

/**
 * Created by Rupali on 2/19/2024.
 */
public class SlotNumberForRegistrationNumberCommand implements Command {
    private ParkingLot parkingLot;

    public SlotNumberForRegistrationNumberCommand(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void execute(String... args) {
        String registrationNumber = args[0];
        int slotNumber = parkingLot.getSlotNumberForRegistrationNumber(registrationNumber);
        if (slotNumber != -1) {
            System.out.println(slotNumber);
        } else {
            System.out.println("Not found");
        }
    }
}
