package dev.guadalupe.katavehiclesandtolls.truck;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    public void testConstructorAndAttributes() {
        // Crear una instancia de Truck
        Truck truck = new Truck(1, "123ABC", 4);

        // Verificar que los atributos se asignan correctamente
        assertEquals(1, truck.getId(), "El ID del camión no coincide");
        assertEquals("123ABC", truck.getLicensePlate(), "La matrícula del camión no coincide");
        assertEquals(4, truck.getAxles(), "El número de ejes del camión no coincide");
        assertEquals(0, truck.getToll(), "El peaje inicial del camión debe ser 0");
    }

    @Test
    public void testCalculateToll() {
        // Crear una instancia de Truck
        Truck truck = new Truck(1, "123ABC", 4);

        // Calcular el peaje
        truck.calculateToll();

        // Verificar que el peaje es el correcto (50 * 4 = 200)
        assertEquals(200, truck.getToll(), "El peaje calculado para el camión no es correcto");
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
        assertEquals(6, truck.getAxles(), "El número de ejes del camión no se actualizó correctamente");
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
