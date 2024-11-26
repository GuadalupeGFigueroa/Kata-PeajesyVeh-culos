package dev.guadalupe.katavehiclesandtolls.motorbike;

import dev.guadalupe.katavehiclesandtolls.vehicle.Vehicle;

public class Motorbike extends Vehicle {
    public Motorbike(long id, String licencePlate){
        super(id, licencePlate);
    }
    @Override
    //Aplicamos esta anotación a un método para indicar que el mismo sobreescribe el método heredado de una clase o interfaz
    public void calculateAmounth(){
        this.amounth = 50; //Peaje fijo para las motos
    }

}

    

