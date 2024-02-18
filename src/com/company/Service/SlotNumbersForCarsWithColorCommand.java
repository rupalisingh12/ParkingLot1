package com.company.Service;

import com.company.Entity.ParkingLot;

import java.util.List;

/**
 * Created by Rupali on 2/19/2024.
 */
public class SlotNumbersForCarsWithColorCommand implements Command {
    private ParkingLot parkingLot;

    public SlotNumbersForCarsWithColorCommand(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void execute(String... args) {
        String color = args[0];
        List<Integer> slotNumbers = parkingLot.getSlotNumbersForColor(color);
        System.out.println(slotNumbers.isEmpty() ? "Not found" : String.join(", ", slotNumbers.toString()));
    }
}
