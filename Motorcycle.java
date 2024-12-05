public class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    public Motorcycle(String model, String registrationNumber, double dailyRate, boolean hasSideCar) {
        super(model, registrationNumber, dailyRate);
        this.hasSideCar = hasSideCar;
    }

    public boolean hasSideCar() {
        return hasSideCar;
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }
}
