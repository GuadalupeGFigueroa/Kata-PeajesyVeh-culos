package dev.guadalupe.katavehiclesandtolls.vehicle;

import dev.guadalupe.katavehiclesandtolls.car.Car;
import dev.guadalupe.katavehiclesandtolls.motorbike.Motorbike;
import dev.guadalupe.katavehiclesandtolls.truck.Truck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testCarTollCalculation() {
        Vehicle car = new Car(1, "123ABC");
        car.calculateToll();

        assertEquals(100, car.getToll(), "Car toll should be 100");
    }

    @Test
    public void testMotorbikeTollCalculation() {
        Vehicle motorbike = new Motorbike(2, "456DEF");
        motorbike.calculateToll();

        assertEquals(50, motorbike.getToll(), "Motorbike toll should be 50");
    }

    @Test
    public void testTruckTollCalculation() {
        Vehicle truck = new Truck(3, "789GHI", 3); // 3 ejes -> 150
        truck.calculateToll();

        assertEquals(150, truck.getToll(), "Truck toll should be calculated as 50 * number of axles");
    }

    @Test
    public void testLicensePlateValidation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Car(4, "");
        });
        assertEquals("License plate cannot be null or empty", exception.getMessage());

        exception = assertThrows(IllegalArgumentException.class, () -> {
            new Car(5, "INVALID PLATE");
        });
        assertEquals("Invalid license plate format", exception.getMessage());
    }

    @Test
    public void testVehicleIdValidation() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Motorbike(-1, "123ABC");
        });
        assertEquals("ID must be greater than 0", exception.getMessage());
    }
/*VehicleTest:

Prueba que el cálculo del peaje sea correcto en cada subclase (Car, Motorbike, y Truck).
Valida que las restricciones sobre el ID y la matrícula de los vehículos funcionen correctamente, 
arrojando excepciones para entradas inválidas. */

}
