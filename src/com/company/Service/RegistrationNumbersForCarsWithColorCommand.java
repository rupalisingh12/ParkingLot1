package com.company.Service;
import java.util.List;
import com.company.Entity.ParkingLot;
/**
 * Created by Rupali on 2/19/2024.
 */
public class RegistrationNumbersForCarsWithColorCommand implements Command {
    private ParkingLot parkingLot;

    public RegistrationNumbersForCarsWithColorCommand(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void execute(String... args) {
        String color = args[0];
        List<String> registrationNumbers = parkingLot.getRegistrationNumbersForColor(color);
        System.out.println(String.join(", ", registrationNumbers));
    }
}
