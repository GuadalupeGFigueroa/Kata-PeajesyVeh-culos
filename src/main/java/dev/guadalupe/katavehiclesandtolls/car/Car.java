package dev.guadalupe.katavehiclesandtolls.car;

import dev.guadalupe.katavehiclesandtolls.vehicle.Vehicle;

public class Car extends Vehicle {
    
    public Car(long id, String licencePlate) {
        super(id, licencePlate);
    }   

    @Override
    // Aplicamos esta anotación a un método para indicar que el mismo sobreescribe el método heredado de una clase o interfaz.
    public void calculateAmounth() {
        this.amounth = 100; // Peaje fijo para coche
    }
        
}
    

