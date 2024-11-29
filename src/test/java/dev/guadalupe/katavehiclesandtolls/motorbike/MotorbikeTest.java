package dev.guadalupe.katavehiclesandtolls.motorbike;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MotorbikeTest {

    @Test
    public void testConstructorAndAttributes() {
        // Crear una instancia de Motorbike
        Motorbike motorbike = new Motorbike(1, "123ABC");

        // Verificar que los atributos se asignan correctamente
        assertEquals(1, motorbike.getId(), "El ID de la moto no coincide");
        assertEquals("123ABC", motorbike.getLicensePlate(), "La matrícula de la moto no coincide");
        assertEquals(0, motorbike.getToll(), "El peaje inicial de la moto debe ser 0");
    }

    @Test
    public void testCalculateToll() {
        // Crear una instancia de Motorbike
        Motorbike motorbike = new Motorbike(1, "123ABC");

        // Calcular el peaje
        motorbike.calculateToll();

        // Verificar que el peaje es el correcto
        assertEquals(50, motorbike.getToll(), "El peaje calculado para la moto no es correcto");
    }

    @Test
    public void testInvalidLicensePlate() {
        // Verificar que se lanza una excepción al usar una matrícula inválida
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Motorbike(1, ""); // Matrícula vacía
        });

        // Comprobar el mensaje de la excepción
        assertEquals("License plate cannot be null or empty", exception.getMessage());
    }

    @Test
    public void testInvalidId() {
        // Verificar que se lanza una excepción al usar un ID inválido
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Motorbike(0, "123ABC"); // ID inválido
        });

        // Comprobar el mensaje de la excepción
        assertEquals("ID must be greater than 0", exception.getMessage());
    }
}
