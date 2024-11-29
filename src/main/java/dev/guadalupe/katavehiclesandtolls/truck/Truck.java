package dev.guadalupe.katavehiclesandtolls.truck;

import dev.guadalupe.katavehiclesandtolls.vehicle.Vehicle;

public class Truck extends Vehicle {
 private int axles;

    public Truck(long id, String licencePlate, int axles) {
        super(id, licencePlate);
        setAxles(axles);
    }

    public int getAxles() {
        return axles;
    }

    public void setAxles(int axles) {
        if (axles <= 0) {
            throw new IllegalArgumentException("Axles must be greater than 0");
        }
        this.axles = axles;
    }

    @Override 
    public void calculateToll() {
        this.toll = 50 * axles; 
    }
 
}
