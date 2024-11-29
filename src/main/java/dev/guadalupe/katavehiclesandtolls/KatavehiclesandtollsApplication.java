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
        // Inicia Spring Boot
        SpringApplication.run(KatavehiclesandtollsApplication.class, args);
        
        // Llama al método con la lógica principal
        runApplication();
    }

    /**
     * Método separado con la lógica de la aplicación.
     * Puede ser llamado por el main o directamente en pruebas unitarias.
     */
    public static void runApplication() {
        // Crear y manejar vehículos
        Vehicle motorbike = new Motorbike(1, "123ABC");
        Vehicle car = new Car(2, "456DEF");
        Vehicle truck = new Truck(3, "789GHI", 4);

        // Calcular el importe para cada vehículo
        motorbike.calculateToll();
        car.calculateToll();
        truck.calculateToll();

        // Mostrar los resultados
        System.out.println("Motorbike - Toll: $" + motorbike.getToll());
        System.out.println("Car - Toll: $" + car.getToll());
        System.out.println("Truck - Toll: $" + truck.getToll());
    }
    /*
     * Cambio el código para extraer la lógica de main y meterla en una clase estática a parte.
     * ¿Por qué hacerlo así?
Separación de responsabilidades:
El método main se encarga únicamente de iniciar la aplicación.
La lógica de tu programa está en un método independiente (runApplication).

Facilidad para testear:
Ahora puedes probar directamente runApplication sin ejecutar el main. Esto es útil porque probar el main directamente suele ser complicado.

Reutilización:
Si necesitas ejecutar la misma lógica en otro contexto (por ejemplo, desde otro método o al realizar una prueba), solo llamas a runApplication.
     */
}
