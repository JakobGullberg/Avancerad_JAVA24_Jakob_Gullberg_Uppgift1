public class SUV extends Vehicle {
    private boolean isFourWheelDrive;

    public SUV(String model, String registrationNumber, double dailyRate, boolean isFourWheelDrive) {
        super(model, registrationNumber, dailyRate);
        this.isFourWheelDrive = isFourWheelDrive;
    }

    public boolean isFourWheelDrive() {
        return isFourWheelDrive;
    }

    @Override
    public String getVehicleType() {
        return "SUV";
    }
}
