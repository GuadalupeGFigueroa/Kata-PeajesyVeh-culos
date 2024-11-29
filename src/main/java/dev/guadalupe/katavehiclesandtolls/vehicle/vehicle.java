package dev.guadalupe.katavehiclesandtolls.vehicle;

public abstract class Vehicle { 

   
    private long id;
    private String licensePlate;
    protected long toll; 

   
    public Vehicle(long id, String licensePlate) {
        setId(id);
        setLicensePlate(licensePlate);
        this.toll = 0; 
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        

        if (licensePlate == null || licensePlate.isEmpty()) {
            throw new IllegalArgumentException("License plate cannot be null or empty");
        }
        if (!licensePlate.matches("^[A-Z0-9-]+$")) { 
            throw new IllegalArgumentException("Invalid license plate format");
        }
        this.licensePlate = licensePlate;
    }

    public long getToll() {
        return toll;
    }

    
    public abstract void calculateToll();

    
    public boolean recordPayment() {
        return true; 
    }
}
    

