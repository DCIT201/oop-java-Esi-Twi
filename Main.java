import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RentalAgency agency = new RentalAgency();

        agency.addVehicle(new Car(4,"F150", "Ford", 50.0));
        agency.addVehicle(new Car(4, "M1", "Honda", 30.0));
        agency.addVehicle(new Car(4,"T1", "Volvo H16", 41));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n --- Vehicle Rental System ---");
            System.out.println("1. Display Available Vehicles");
            System.out.println("2. Rent a Vehicle");
            System.out.println("3. Return a Vehicle");
            System.out.println("4. Exit");
            System.out.println("Choose an option");

            int choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    agency.displayAvailableVehicles();
                    break;
                case 2:
                    System.out.print("Enter vehicle ID: ");
                    String customerName = scanner.next();
                    System.out.print("Enter rental days: ");
                    int days = scanner.nextInt();
                    agency.processRental(vehicleId, new Customer(customerName, customerName), days);
                    break;
                case 3:
                    System.out.print("Enter vehicle ID to return: ");
                    String returnId = scanner.next();
                    agency.returnVehicle(returnId);
                    break;
                case 4: 
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;
                default: 
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
