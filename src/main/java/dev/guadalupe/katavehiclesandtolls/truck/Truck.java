package dev.guadalupe.katavehiclesandtolls.truck;

import dev.guadalupe.katavehiclesandtolls.vehicle.Vehicle;

public class Truck extends Vehicle {
 private int axles;

    public Truck(long id, String licencePlate, int axles) {
        super(id, licencePlate);
        this.axles = axles;
    }

    public int getAxles() {
        return axles;
    }

    public void setAxles(int axles) {
        this.axles = axles;
    }

    @Override //sobre escribe el valor 
    public void calculateAmounth() {
        this.amounth = 50 * axles; // Calculamos el peaje según el número de ejes
    }
 
}
