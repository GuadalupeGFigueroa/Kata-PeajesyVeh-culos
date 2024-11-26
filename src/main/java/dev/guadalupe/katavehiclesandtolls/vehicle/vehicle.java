package dev.guadalupe.katavehiclesandtolls.vehicle;

public abstract class Vehicle {

    // Clase abstracta

    // Atributos comunes a todos los vehículos
    private long id;
    private String licencePlate;
    protected long amounth; // Se puede modificar por las subclases

    // Constructor
    public Vehicle(long id, String licencePlate) {
        this.id = id;
        this.licencePlate = licencePlate;
        this.amounth = 0; // Inicializado a 0, será calculado en las subclases
    }

    // Métodos getter y setter
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getlicencePlate() {
        return licencePlate;
    }

    public void setlicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public long getamounth() {
        return amounth;
    }

    // Método abstracto: las subclases deberán implementarlo
    public abstract void calculateAmounth();

    // Método opcional para registrar el pago
    public boolean recordPayment() {
        // Aquí se puede simular un registro exitoso o fallido
        return true; // Por defecto, siempre se registra el pago
    }
}
    

