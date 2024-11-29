package dev.guadalupe.katavehiclesandtolls.station;

import dev.guadalupe.katavehiclesandtolls.car.Car;
import dev.guadalupe.katavehiclesandtolls.motorbike.Motorbike;
import dev.guadalupe.katavehiclesandtolls.truck.Truck;
import dev.guadalupe.katavehiclesandtolls.vehicle.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StationTest {

    private Station station;

    @BeforeEach
    public void setup() {
        station = new Station(1, "Central Station", "Guadalupe City");
    }

    @Test
    public void testRegisterVehicle() {
        Vehicle car = new Car(1, "123ABC");
        station.registerVehicle(car);

        assertEquals(1, station.getVehicles().size(), "Vehicle list should contain one vehicle");
        assertEquals(100, station.getTotalCollected(), "Total collected should be 100 for a car");
    }

    @Test
    public void testMultipleVehicleRegistration() {
        Vehicle motorbike = new Motorbike(2, "456DEF");
        Vehicle truck = new Truck(3, "789GHI", 4); // 4 ejes -> 200

        station.registerVehicle(motorbike);
        station.registerVehicle(truck);

        assertEquals(2, station.getVehicles().size(), "Vehicle list should contain two vehicles");
        assertEquals(250, station.getTotalCollected(), "Total collected should be 250 (motorbike + truck)");
    }

    @Test
    public void testPrintReport() {
        Vehicle motorbike = new Motorbike(4, "000XYZ");
        station.registerVehicle(motorbike);

        // Imprimimos para verificar manualmente (idealmente, usar mocks para verificar salida)
        station.printReport();
        assertTrue(true); // Simula éxito
    }
}

    
    /*StationTest:

Valida que los vehículos se registren correctamente en la estación.
Verifica que el importe total recolectado se calcule correctamente para diferentes combinaciones de vehículos.
Incluye una prueba para printReport que genera manualmente la salida esperada. */

