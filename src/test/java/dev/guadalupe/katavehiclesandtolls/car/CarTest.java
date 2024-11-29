package dev.guadalupe.katavehiclesandtolls.car;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarTest {
    @Test
    public void testConstructorAndAtributes() {
        Car car = new Car(1, "123ABC");
        assertEquals(1, car.getId(), "The ID should be 1");
        assertEquals("123ABC", car.getLicensePlate(), "The license plate should be 123ABC");
        assertEquals(0, car.getToll(), "The Toll should be 0");
    }
    @Test
    public void testCalculateToll() {
    Car car = new Car(1, "123ABC");
    car.calculateToll();
    assertEquals(100, car.getToll(), "The Toll should be 100");
    }

    @Test
    public void testInvalidLicensePlate() {
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Car(1, "ABC123");
        });
        assertEquals("Invalid license plate format", exception.getMessage());
    }

}