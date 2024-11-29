package dev.guadalupe.katavehiclesandtolls.station;
import java.util.ArrayList;
import java.util.List;

import dev.guadalupe.katavehiclesandtolls.vehicle.Vehicle;

public class Station {

    private long id;
    private String name;
    private String city;
    private long totalCollected;
    private List<Vehicle> vehicles;

    public Station(long id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
        this.vehicles = new ArrayList<>();
    }

    public void registerVehicle(Vehicle vehicle) {
        vehicle.calculateToll();
        vehicles.add(vehicle);
        totalCollected += vehicle.getToll();
    }

    public void printReport() {
        System.out.println("Station: " + name + " in " + city);
        System.out.println("Total Collected: $" + totalCollected);
        System.out.println("Vehicles:");
        for (Vehicle v : vehicles) {
            System.out.println("- " + v.getClass().getSimpleName() + " | Plate: " + v.getLicensePlate() + " | Toll: $" + v.getToll());
        }
    }
     // Getters and setters (optional)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getTotalCollected() {
        return totalCollected;
    }

    public void setTotalCollected(long totalCollected) {
        this.totalCollected = totalCollected;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

   
    

}
