import java.util.Scanner;

public class TollBoothBillGenerator {
    private String vehicleType;
    private int numAxles;
    private double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;
    
    public static void main(String[] args) {
        TollBoothBillGenerator tollBooth = new TollBoothBillGenerator();
        tollBooth.showMenu();
    }
    
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Toll Booth Bill Generator Menu");
            System.out.println("-----------------------------");
            System.out.println("1. Enter vehicle type");
            System.out.println("2. Enter number of axles");
            System.out.println("3. Enter distance traveled");
            System.out.println("4. Calculate toll fee");
            System.out.println("5. Generate bill");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type (car, van, bus, or truck): ");
                    vehicleType = scanner.next();
                    break;
                case 2:
                    System.out.print("Enter number of axles: ");
                    numAxles = scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Enter distance traveled (in miles): ");
                    distanceTraveled = scanner.nextDouble();
                    break;
                case 4:
                    calculateTollFee();
                    break;
                case 5:
                    generateBill();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);
        scanner.close();
    }
    
    private void calculateTollFee() {
        double baseRate = 0.0;
        if (vehicleType.equalsIgnoreCase("car") || vehicleType.equalsIgnoreCase("van") || vehicleType.equalsIgnoreCase("bus")) {
            baseRate = 0.25;
        } else if (vehicleType.equalsIgnoreCase("truck")) {
            baseRate = 0.50;
        } else {
            System.out.println("Invalid vehicle type.");
            return;
        }
        tollFee = baseRate * numAxles * distanceTraveled;
        System.out.printf("Toll fee for the vehicle: $%.2f\n", tollFee);
    }
    
    private void generateBill() {
        if (tollFee == 0.0) {
            System.out.println("Toll fee has not been calculated yet.");
            return;
        }
        totalAmountDue = tollFee + 2.00;
        System.out.println("Bill for the vehicle:");
        System.out.println("Type: " + vehicleType);
        System.out.println("Axles: " + numAxles);
        System.out.println("Distance: " + distanceTraveled + " miles");
        System.out.printf("Toll fee: $%.2f\n", tollFee);
        System.out.printf("Processing fee: $%.2f\n", 2.00);
        System.out.printf("Total amount due: $%.2f\n", totalAmountDue);
    }
}
