package dev.guadalupe.katavehiclesandtolls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dev.guadalupe.katavehiclesandtolls.car.Car;
import dev.guadalupe.katavehiclesandtolls.motorbike.Motorbike;
import dev.guadalupe.katavehiclesandtolls.truck.Truck;
import dev.guadalupe.katavehiclesandtolls.vehicle.Vehicle;

@SpringBootApplication
public class KatavehiclesandtollsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KatavehiclesandtollsApplication.class, args);
     
        runApplication();
    }

   
    public static void runApplication() {
    
        Vehicle motorbike = new Motorbike(1, "123ABC");
        Vehicle car = new Car(2, "456DEF");
        Vehicle truck = new Truck(3, "789GHI", 4);

     
        motorbike.calculateToll();
        car.calculateToll();
        truck.calculateToll();

     
        System.out.println("Motorbike - Toll: $" + motorbike.getToll());
        System.out.println("Car - Toll: $" + car.getToll());
        System.out.println("Truck - Toll: $" + truck.getToll());
    }
   
}
