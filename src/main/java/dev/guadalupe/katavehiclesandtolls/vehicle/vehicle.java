package dev.guadalupe.katavehiclesandtolls.vehicle;

public abstract class Vehicle { // Clase abstracta

    // Atributos comunes a todos los vehículos
    private long id;
    private String licensePlate;
    protected long toll; // Se puede modificar por las subclases

    // Constructor
    public Vehicle(long id, String licensePlate) {
        setId(id);
        setLicensePlate(licensePlate);
        this.toll = 0; // Inicializado a 0, será calculado en las subclases
    }

    // Métodos getter y setter
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
        //Añadimos lógica para garantizar que el valor de la matrícula no pueda ser nulo

        if (licensePlate == null || licensePlate.isEmpty()) {
            throw new IllegalArgumentException("License plate cannot be null or empty");
        }
        if (!licensePlate.matches("^[A-Z0-9-]+$")) { 
            //La expresión regular /[a-z0-9-]/ significa una cadena que contiene cualquier letra minúscula o número o un - .
            throw new IllegalArgumentException("Invalid license plate format");
        }
        this.licensePlate = licensePlate;
    }

    public long getToll() {
        return toll;
    }

    // Método abstracto: las subclases deberán implementarlo
    public abstract void calculateToll();

    // Método opcional para registrar el pago
    public boolean recordPayment() {
        // Aquí se puede simular un registro exitoso o fallido
        return true; // Por defecto, siempre se registra el pago
    }
}
    

