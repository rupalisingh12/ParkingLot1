package com.company.Entity;

/**
 * Created by Rupali on 2/19/2024.
 */
public class ParkingSlot {
    private int slotNumber;
    private Car car;

    public ParkingSlot(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public Car getCar() {
        return car;
    }

    public void parkCar(Car car) {
        this.car = car;
    }

    public void removeCar() {
        this.car = null;
    }
}
