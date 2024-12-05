public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String model, String registrationNumber, double dailyRate, double loadCapacity) {
        super(model, registrationNumber, dailyRate);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }
}
