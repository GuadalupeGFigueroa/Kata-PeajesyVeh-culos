package dev.guadalupe.katavehiclesandtolls.motorbike;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MotorbikeTest {

    @Test
    public void testConstructorAndAttributes() {    
        Motorbike motorbike = new Motorbike(1, "123ABC");
  
        assertEquals(1, motorbike.getId(), "The motorbike ID does not match");
        assertEquals("123ABC", motorbike.getLicensePlate(), "The license plate of the motorbike does not match");
        assertEquals(0, motorbike.getToll(), "The initial toll of the motorbike should be 0");
    }

    @Test
    public void testCalculateToll() {
        Motorbike motorbike = new Motorbike(1, "123ABC");
  
        motorbike.calculateToll();

        assertEquals(50, motorbike.getToll(), "The toll of the motorbike should be 50");
    }

    @Test
    public void testInvalidLicensePlate() {
    
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Motorbike(1, ""); 
        });    
        assertEquals("License plate cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testInvalidId() {
       Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Motorbike(0, "123ABC");
        });
        assertEquals("ID must be greater than 0", exception.getMessage());
    }
}
