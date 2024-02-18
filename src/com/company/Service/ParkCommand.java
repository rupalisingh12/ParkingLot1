package com.company.Service;
import com.company.Entity.ParkingLot;
import com.company.Entity.Car;
/**
 * Created by Rupali on 2/19/2024.
 */
public class ParkCommand implements Command {
    private ParkingLot parkingLot;

    public ParkCommand(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public void execute(String... args) {
        String registrationNumber = args[0];
        String color = args[1];
        Car car = new Car(registrationNumber, color);
        int slotNumber = parkingLot.parkCar(car);
        if (slotNumber == -1) {
            System.out.println("Sorry, parking lot is full");
        } else {
            System.out.println("Allocated slot number: " + slotNumber);
        }
    }
}
