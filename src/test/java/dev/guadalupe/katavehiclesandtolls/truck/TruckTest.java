package dev.guadalupe.katavehiclesandtolls.truck;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    public void testConstructorAndAttributes() {
        // Crear una instancia de Truck
        Truck truck = new Truck(1, "123ABC", 4);

        // Verificar que los atributos se asignan correctamente
        assertEquals(1, truck.getId(), "The ID of the truck does not match");
        assertEquals("123ABC", truck.getLicensePlate(), "The license plate of the truck does not match");
        assertEquals(4, truck.getAxles(), "The axles of the truck does not match");
        assertEquals(0, truck.getToll(), "The initial toll of the truck should be 0");
    }

    @Test
    public void testCalculateToll() {
        // Crear una instancia de Truck
        Truck truck = new Truck(1, "123ABC", 4);

        // Calcular el peaje
        truck.calculateToll();

        // Verificar que el peaje es el correcto (50 * 4 = 200)
        assertEquals(200, truck.getToll(), "The calculated toll should be 200");
    }

    @Test
    public void testInvalidAxles() {
        // Verificar que se lanza una excepción al usar un número de ejes inválido
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Truck(1, "123ABC", 0); // Ejes inválidos
        });

        // Comprobar el mensaje de la excepción
        assertEquals("Axles must be greater than 0", exception.getMessage());
    }

    @Test
    public void testInvalidLicensePlate() {
        // Verificar que se lanza una excepción al usar una matrícula inválida
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Truck(1, "", 4); // Matrícula vacía
        });

        // Comprobar el mensaje de la excepción
        assertEquals("License plate cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testInvalidId() {
        // Verificar que se lanza una excepción al usar un ID inválido
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Truck(0, "123ABC", 4); // ID inválido
        });

        // Comprobar el mensaje de la excepción
        assertEquals("ID must be greater than 0", exception.getMessage());
    }

    @Test
    public void testSetAxles() {
        // Crear una instancia de Truck
        Truck truck = new Truck(1, "123ABC", 4);

        // Cambiar el número de ejes
        truck.setAxles(6);

        // Verificar que el número de ejes se actualizó correctamente
        assertEquals(6, truck.getAxles(), "The axles of the truck should be 6");
    }

    @Test
    public void testSetInvalidAxles() {
        // Crear una instancia de Truck
        Truck truck = new Truck(1, "123ABC", 4);

        // Verificar que se lanza una excepción al usar un número de ejes inválido
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            truck.setAxles(0); // Ejes inválidos
        });

        // Comprobar el mensaje de la excepción
        assertEquals("Axles must be greater than 0", exception.getMessage());
    }
}
