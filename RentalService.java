import java.util.Scanner;

public class RentalService {
    private Vehicle[] vehicles;

    public RentalService() {
        vehicles = new Vehicle[] {
                new Car("Toyota Corolla", "ABC123", 500, true),
                new SUV("Range Rover", "DEF456", 1000, true),
                new Truck("Volvo FH16", "GHI789", 800, 15),
                new Motorcycle("Harley Davidson", "JKL012", 300, false)
        };
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Välkommen till Jakobs Biluthyrning!");
        System.out.println("Tillgängliga fordon:");

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println((i + 1) + ". " + vehicles[i].getVehicleType() + " - " + vehicles[i].getModel());
        }

        System.out.print("Välj ett fordon (ange nummer): ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > vehicles.length) {
            System.out.println("Ogiltigt val!");
            return;
        }

        Vehicle selectedVehicle = vehicles[choice - 1];

        if (selectedVehicle.isRented()) {
            System.out.println("Detta fordon är redan uthyrt!");
            return;
        }

        System.out.print("Ange antal hyresdagar: ");
        int rentalDays = scanner.nextInt();

        double cost = selectedVehicle.calculateRentalCost(rentalDays);
        selectedVehicle.rent(rentalDays);

        System.out.println("Du har hyrt en " + selectedVehicle.getVehicleType() + " (" + selectedVehicle.getModel() + ").");
        System.out.println("Hyreskostnad: " + cost + " SEK.");
        System.out.println("Tack för du hyrde ett fordon hos oss!");
    }
}
