package dev.guadalupe.katavehiclesandtolls.car;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CarTest {
    @Test
    public void testConstructorAndAtributes() {
        Car car = new Car(1, "123ABC");
        assertEquals(1, car.getId(), "El ID del coche no coindide");
        assertEquals(0, car.getToll(), "El peaje del coche no es 0");
    }
    @Test
    public void testCalculateToll() {
    //Crear una instancia de la clase Car.
    Car car = new Car(1, "123ABC");
    //Llamar al método calculateToll() para calcular el peaje.
    car.calculateToll();
    //Verificar que el peaje calculado sea 100.
    assertEquals(100, car.getToll(), "El peaje calculado debe ser 100");
    }

    @Test
    public void testInvalidLicensePlate() {
        //Verificar que se lanza una excepción si la matrícula es inválida.
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Car(1, "ABC123");
        });
        assertEquals("Invalid license plate format", exception.getMessage());
    }

}