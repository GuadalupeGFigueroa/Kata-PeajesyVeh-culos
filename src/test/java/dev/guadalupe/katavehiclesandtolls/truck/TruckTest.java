package dev.guadalupe.katavehiclesandtolls.truck;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    public void testConstructorAndAttributes() {
      
        Truck truck = new Truck(1, "123ABC", 4);

        assertEquals(1, truck.getId(), "The ID of the truck does not match");
        assertEquals("123ABC", truck.getLicensePlate(), "The license plate of the truck does not match");
        assertEquals(4, truck.getAxles(), "The axles of the truck does not match");
        assertEquals(0, truck.getToll(), "The initial toll of the truck should be 0");
    }

    @Test
    public void testCalculateToll() {
     
        Truck truck = new Truck(1, "123ABC", 4);

        
        truck.calculateToll();

       
        assertEquals(200, truck.getToll(), "The calculated toll should be 200");
    }

    @Test
    public void testInvalidAxles() {
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Truck(1, "123ABC", 0); 
        });

        assertEquals("Axles must be greater than 0", exception.getMessage());
    }

    @Test
    public void testInvalidLicensePlate() {
   
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Truck(1, "", 4); 
        });
        assertEquals("License plate cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testInvalidId() {
      
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Truck(0, "123ABC", 4); 
        });
     
        assertEquals("ID must be greater than 0", exception.getMessage());
    }

    @Test
    public void testSetAxles() {
        Truck truck = new Truck(1, "123ABC", 4);
        truck.setAxles(6);

        assertEquals(6, truck.getAxles(), "The axles of the truck should be 6");
    }

    @Test
    public void testSetInvalidAxles() {
      
        Truck truck = new Truck(1, "123ABC", 4);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            truck.setAxles(0); 
        });

        assertEquals("Axles must be greater than 0", exception.getMessage());
    }
}
