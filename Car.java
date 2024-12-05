public class Car extends Vehicle {
    private boolean hasAirConditioning;

    public Car(String model, String registrationNumber, double dailyRate, boolean hasAirConditioning) {
        super(model, registrationNumber, dailyRate);
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean hasAirConditioning() {
        return hasAirConditioning;
    }

    @Override
    public String getVehicleType() {
        return "Car";
    }
}
