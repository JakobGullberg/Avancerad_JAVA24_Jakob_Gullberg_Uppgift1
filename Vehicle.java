// Abstrakt basklass som implementerar Rentable
public abstract class Vehicle implements Rentable {

    private String model; // Fordonsmodell
    private String registrationNumber; // Registreringsnummer


    private double dailyRate; // Hyrespris per dag
    private boolean rented; // Indikerar om fordonet är uthyrt

    private int rentalDays; // Antal hyresdagar

    // Konstruktor
    public Vehicle(String model, String registrationNumber, double dailyRate) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
        this.rented = false;
        this.rentalDays = 0;
    }

    // Getter för modellnamnet
    public String getModel() {
        return model;
    }

    // Getter för registreringsnumret
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Getter för hyrespris per dag
    public double getDailyRate() {
        return dailyRate;
    }

    // Abstrakt metod som implementeras av subklasser
    public abstract String getVehicleType();

    // Implementering av Rentable interface
    @Override
    public void rent(int days) {
        if (!rented) {
            this.rented = true;
            this.rentalDays = days;
        } else {
            System.out.println("Fordonet är redan uthyrt!");
        }
    }

    @Override
    public void returnVehicle() {
        if (rented) {
            this.rented = false;
            this.rentalDays = 0;
        } else {
            System.out.println("Fordonet är inte uthyrt!");
        }
    }

    @Override
    public boolean isRented() {
        return rented;
    }

    @Override
    public double getRentalCost() {
        return rentalDays * dailyRate;
    }

    @Override
    public double calculateRentalCost(int rentalDays) {
        return rentalDays * dailyRate;
    }
}
