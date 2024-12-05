// Interface för uthyrning av fordon
public interface Rentable {

    void rent(int days); // Metod för att hyra ett fordon
    void returnVehicle(); // Metod för att returnera ett fordon

    boolean isRented(); // Kontrollera om fordonet är uthyrt


    double getRentalCost(); // Hämtar totalkostnad för uthyrning
    double calculateRentalCost(int rentalDays); // Beräkna hyreskostnad baserat på dagar
}
